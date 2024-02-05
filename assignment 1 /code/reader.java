import java.io.*;
//Name :Abhiroop Kaur
// Ucid: 30152829

public class reader extends Thread{
    
    /**
	 * Constructor to initialize the class.
	 * 
	 * @param filey	remote server name
	 * @param socketInputStream	remote server port number
	 * @param bufferSize	buffer size used for read/write
	 */
    private FileOutputStream filey;
    private InputStream  socketInputStream;
    private int bufferSize
;
    public reader(FileOutputStream filey, InputStream  socketInputStream,int bufferSize){
        this.filey = filey;
        this.socketInputStream= socketInputStream;
        this.bufferSize=bufferSize;
    }
    public void run(){
    // InputStream input <-- socket input stream
    // OutputStream output <-- socket output stream;

    int numBytes=0;
    byte[] buff = new byte[this.bufferSize];     
    // while not EOF from client side
    try{
        while ( (numBytes = socketInputStream.read(buff)) != -1) {
            // process data in buff ...
            filey.write(buff, 0, numBytes);
            System.out.println("R"+ numBytes);
            filey.flush(); // not needed, but a good practice
        }
    }  
    // handle exception
    catch(Exception e) {
        System.out.println("ERROR");
    }
    }

}
        

