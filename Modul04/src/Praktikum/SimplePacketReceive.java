/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package praktikum;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
public class SimplePacketReceive {
    public static void main(String[] args) throws IOException{
        DatagramSocket socket= new DatagramSocket(2000);
        DatagramPacket packet= new DatagramPacket(new byte[256],256);
        socket.receive(packet);
         String message= new String (packet.getData(),0,packet.getLength());
         System.out.println(message);
    }


}
