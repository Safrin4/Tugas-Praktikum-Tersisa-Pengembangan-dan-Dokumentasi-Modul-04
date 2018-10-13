/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package praktikum;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class PacketSendDemo {
    public static void main(String[] args) {
        System.out.println("Packet send\n=============");
        String hostname="localhost";
        System.out.println("Binding to a local port");
        try{
            DatagramSocket socket= new DatagramSocket();
            System.out.println("Bound to a local port"+ socket.getLocalPort());
            ByteArrayOutputStream bout=new ByteArrayOutputStream();
            PrintStream pout= new PrintStream(bout);
            pout.print("assalamualaikum");
            byte[]barray=bout.toByteArray();
            DatagramPacket packet=new DatagramPacket (barray, barray.length);
            System.out.println("Locking up hostname"+hostname);
            InetAddress remote_addr=InetAddress.getByName(hostname);
            System.out.println("Hostname received as "+ remote_addr.getHostAddress());
            packet.setAddress(remote_addr);
            packet.setPort(2000);
            socket.send(packet);
            System.out.println("Packet sent!");

        }catch(SocketException ex){
            System.err.println("Error: "+ex.getMessage());
        }catch(IOException ex){
            System.err.println("Error : "+ex.getMessage());
        }
    }

}
