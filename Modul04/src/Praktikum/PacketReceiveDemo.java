/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package praktikum;

/**
 *
 * @author LAB_TI
 */
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class PacketReceiveDemo {
    public static void main(String[] args) {
        System.out.println ("Packet Receive\n==========");
        System.out.println("Binding to local port 200");
        try{
          DatagramSocket socket=new DatagramSocket(2000);
            System.out.println("Bound to local port "+socket.getLocalPort());
            DatagramPacket packet= new DatagramPacket(new byte [256],256);
            socket.receive(packet);
            System.out.println("Packet Received!");
            InetAddress remote_addr=packet.getAddress();
            System.out.println("Sent by : "+remote_addr.getHostAddress());
            System.out.println("Sent from : "+packet.getPort());
            ByteArrayInputStream bin= new ByteArrayInputStream(packet.getData());
            BufferedReader br= new BufferedReader (new InputStreamReader(bin));
            System.out.println("Message : "+br.readLine());

        }catch(IOException ex){
            System.out.println("Error : "+ex.getMessage());
        }
    }


}
