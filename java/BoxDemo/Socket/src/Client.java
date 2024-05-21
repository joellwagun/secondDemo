import java.net.*;
import java.io.*;
import java.util.Scanner;
public class Client {
    public static void main(String[] args) throws Exception{

        Scanner scan = new Scanner(System.in);
        Socket s = new Socket("localhost",4000);

        System.out.println("Enter a number");
        int num = scan.nextInt();

        DataInputStream dis = new DataInputStream(s.getInputStream());
        DataOutputStream dos = new DataOutputStream(s.getOutputStream());

        dos.writeInt(num);
        int ans = dis.readInt();
        System.out.println("Square ="+ans);

        dos.close();
        dis.close();
        scan.close();
        s.close();
    }
}
