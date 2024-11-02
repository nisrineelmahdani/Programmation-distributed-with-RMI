package RMI;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.List;
public class ClientRMI {
    public static void main(String[] args) {
        
        try {
            IBanqueRemote stub = (IBanqueRemote) Naming.lookup("rmi//localhost;1099/BANQUE");// RECUPERER LA réfernce de lobjet distnat
            System.out.println(stub.conversion(90));
            System.out.println(stub.test());
           Compte cp = stub.consulter(9);
           System.out.println("code"+cp.getCode());
           System.out.println("solde:"+cp.getSolde());
           List<Compte> cptes = stub.listeComptes();
           for(Compte c: cptes){
            System.err.println("solde:"+cp.getSolde());
           }

        }  catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
