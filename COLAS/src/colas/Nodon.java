package colas;
public class Nodon {
    public Nodon sig;
    public int dato;
    
    public Nodon(int dato){
    this.dato = dato;
    sig = null;
    }

    public int getDato() {
        return dato;
    }

    public void setDato(int dato) {
        this.dato = dato; 
    }
    }
