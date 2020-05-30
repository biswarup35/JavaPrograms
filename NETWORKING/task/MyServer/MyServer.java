import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * MyServer calculates factorial
 */
public class MyServer {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(5000);
            Socket socket = serverSocket.accept();
            DataInputStream dataIN = new DataInputStream(socket.getInputStream());
            DataOutputStream dataOUT = new DataOutputStream(socket.getOutputStream());

            while(true) {
                
                String str = dataIN.readUTF();
                int num = Integer.parseInt(str);
                int fact = fact(num);
                String str2 = Integer.toString(fact);
                dataOUT.writeUTF(str2);
                dataOUT.flush();
                if (str.equals("0")) {
                    break;
                }
            }
            serverSocket.close();
        } catch (Exception e) {
            System.out.println("Server error: "+e.getMessage());
        }
    }
    public static int fact(int num) {
        int num1 = 1;
        for(int i = 1; i<= num; i++ ){
            num1 *= i;
        }
        return num1;
    }

    
}