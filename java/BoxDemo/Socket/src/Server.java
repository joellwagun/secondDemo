import java.net.*;
import java.io.*;

class Server{
    public static void main(String[] args) throws Exception{

        ServerSocket ss = new ServerSocket(4000);
        Socket s = ss.accept();

        DataInputStream dis = new DataInputStream(s.getInputStream());
        DataOutputStream dos = new DataOutputStream(s.getOutputStream());

        int num = dis.readInt();
        int sq = num*num;
        dos.writeInt(sq);

        dis.close();
        dos.close();
        s.close();
    }
}
