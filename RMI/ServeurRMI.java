package RMI;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.net.MalformedURLException;
import java.rmi.Naming;

public class ServeurRMI {
    public static void main(String[] args) throws MalformedURLException {

        try {
            // partie serveur tu doi:
                    //  1= creer lobjet distant 
            BanqueServiceImpl  od = new BanqueServiceImpl();
           // System.out.println(od.toString());// la reference d elobjet 
            LocateRegistry.createRegistry(1099);// faire l annuir creer le registre 
                //  2=  publier la refernce de lobjet
            Naming.rebind("rmi://localhost:1099/BANQUE ", od);// BANQUE CETS LE NOM DE LOBJET (lié l objet avec registre) 
        } catch (RemoteException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

      
}
