package RMI;
import java.rmi.*;
import java.util.*;
// une interface RMI doit herité d une classe qui s'apelle REMOT
// Etape 1: creer l interface de lobjet ditsnat : interface remote 
public interface IBanqueRemote  extends Remote {
    public double conversion(double mt) throws RemoteException;
    public String test() throws RemoteException;
    public Compte consulter (int code) throws RemoteException;
    public List<Compte> listeComptes() throws RemoteException;
}
