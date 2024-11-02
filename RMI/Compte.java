package RMI;
import java.io.Serializable;

public class Compte  implements Serializable{ // la serialization : je prends lobjet de la mémoire je le convertit en onctet et on le envoi a lautre machine
private int code;
private double solde;
public Compte() {
}

// Constructor with parameters
public Compte(int code, double solde) {
    this.code = code;
    this.solde = solde;
}

// Getter for code
public int getCode() {
    return code;
}

// Setter for code
public void setCode(int code) {
    this.code = code;
}

// Getter for solde
public double getSolde() {
    return solde;
}

// Setter for solde
public void setSolde(double solde) {
    this.solde = solde;
}
}
