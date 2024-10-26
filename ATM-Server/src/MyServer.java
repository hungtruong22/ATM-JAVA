/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



import java.net.InetAddress;
import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;
import java.rmi.server.UnicastRemoteObject;

/**
 *
 * @author Admin
 */
public class MyServer {
    public static void main(String [] args){
        try {
            TinhToan tt = new TinhToan();
            //Quang ba doi tuong tt de may khach co the goi phuong thuc trong tt
//            UnicastRemoteObject.exportObject(tt);
            LocateRegistry.createRegistry(1099);
            InetAddress ip=InetAddress.getLocalHost();
            //Dang ky 1 dia chi de may khach truy cap vao doi tuong tt
            Naming.bind("rmi://172.20.10.8/TinhToan",tt);
            System.out.print("Da cho may khach goi den:\n");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
