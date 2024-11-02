package RMI;
import java.rmi.*;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;
import java.util.ArrayList;

public class BanqueServiceImpl extends UnicastRemoteObject  implements IBanqueRemote{

    protected BanqueServiceImpl() throws RemoteException {
        super();
        
    }

    @Override
    public double conversion(double mt) throws RemoteException {
       
       
        return mt*11.3;
    }

    @Override
    public String test() throws RemoteException {
      
        return "test";
        
    }

    @Override
    public Compte consulter(int code) throws RemoteException {
       
      
        return new Compte(code,Math.random()*7000);
    }

    @Override
    public List<Compte> listeComptes() throws RemoteException {
       
       List <Compte> cptes = new ArrayList<Compte>();
       cptes.add(new Compte(1,Math.random()*7000));
    return cptes;
    }
    
}
