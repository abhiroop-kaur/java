import java.io.*;
import java.net.Socket;
//Name :Abhiroop Kaur
// Ucid: 30152829

public class writer extends Thread{
    
    /**
	 * Constructor to initialize the class.
	 * 
	 * @param filex	remote server name
	 * @param socketOutputStream	remote server port number
	 * @param bufferSize	buffer size used for read/write
	 */

    private FileInputStream filex;
    private OutputStream socketOutputStream;
    private int bufferSize;
    Socket socket;
;
    public writer(FileInputStream filex, OutputStream socketOutputStream,int bufferSize, Socket socket){
        this.filex = filex;
        this.socketOutputStream= socketOutputStream;
        this.bufferSize=bufferSize;;
        this.socket = socket;
    }
    public void run(){
    // InputStream input <-- socket input stream
    // OutputStream output <-- socket output stream;

    int numBytes=0;
    byte[] buff = new byte[this.bufferSize];     
    // while not EOF from client side
    try{
        while ( (numBytes = filex.read(buff)) != -1) {
            // process data in buff ...
            socketOutputStream.write(buff, 0, numBytes);
            System.out.println(""+ numBytes);
            socketOutputStream.flush(); // not needed, but a good practice
        }
        socket.shutdownOutput();

    }  
    //handle exception
    catch(Exception e) {
        System.out.println("ERROR");
    }

}
        
}

