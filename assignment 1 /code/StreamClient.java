
/**
 * StreamClient Class
 * 
 * CPSC 441
 * Assignment 1
 * Name :Abhiroop Kaur
 * Ucid: 30152829
 */
/**
 *  Open a TCP socket to communicate with the server
2: Open the input and output files
3: Send the requested service code to the server
4: Read the input file and write to the socket
5: Read from the socket and write to the output file 6: Clean up (e.g., close the streams and socket)
 */


import java.net.Socket;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;


public class StreamClient {

	//class variables
	private static final Logger logger = Logger.getLogger("StreamClient"); // global logger
	private String serverName; // server name
	private int serverPort; // server port number
	private int bufferSize;// buffer size

	/**
	 * Constructor to initialize the class.
	 * 
	 * @param serverName	remote server name
	 * @param serverPort	remote server port number
	 * @param bufferSize	buffer size used for read/write
	 */


	//initialising server details
	public StreamClient(String serverName, int serverPort, int bufferSize){
		this.serverName = serverName;
        this.serverPort = serverPort;
        this.bufferSize = bufferSize;
	}

	
	/**
	 * Compress the specified file via the remote server.
	 * 
	 * @param inName		name of the input file to be processed
	 * @param outName		name of the output file
	 */
	
	public void getService(int serviceCode, String inName, String outName){
		 // Check if the input file exists
        File inputFile = new File(inName);
        if (!inputFile.exists()) {
            System.err.println("Input file name does not exist: " + inName);
			return;
        }

		try {

			//Open a TCP socket to communicate with the server
			Socket socket =new Socket(serverName,serverPort);

			// opening socket streams for input and output
			InputStream socketInputStream = socket.getInputStream();
            OutputStream socketOutputStream = socket.getOutputStream();
			
			// 2: Open the input and output files
			FileInputStream filex =new FileInputStream(inName);
			FileOutputStream filey= new FileOutputStream(outName);
		
			// 3: Send the requested service code to the server
			socketOutputStream.write(serviceCode);
			socketOutputStream.flush();

			// 4: Read the input file and write to the socket(Read and write operations on the socket must be implemented in separate threads to operate concurrently.)
			writer writethread = new writer(filex,socketOutputStream,bufferSize,socket);
			// 5: Read from the socket and write to the output file 
			reader readthread = new reader(filey,socketInputStream,bufferSize);
        	
			writethread.start(); // Start the thread
			readthread.start(); // Start the thread

			//Joining thread with catching error 
			try {
				writethread.join();
				readthread.join();
			} catch (Exception e) {
				//  handle exception
				logger.log(Level.SEVERE,"Error dedected", e);
			}
			//6: Clean up (e.g., close the streams and socket)

			socketInputStream.close();
			socketOutputStream.close();
			socket.close();
		} 
			//  handle exception
			catch (IOException e) {
                    logger.log(Level.SEVERE,"Error during file transfer", e);
		}
	}

	}