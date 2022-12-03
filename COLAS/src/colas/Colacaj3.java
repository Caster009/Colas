package colas;
public class Colacaj3 {
    
       public class Cola3 {
   public Nodon inicio,fin;
   public int tam;

    public Cola3() {
        this.inicio = null;
        this.fin = null;
        this.tam = 0;
    }
    //Método estaVacia
   public boolean estaVacia(){
       return inicio == null;
   }
   
   // insertar
   public void insertar(int elem){
     Nodon nodo = new Nodon(elem);
     if(estaVacia()){
        inicio = nodo; 
     }else{
         fin.sig = nodo;   
     }
         fin = nodo;
         tam++;
   }
   
   //Método eliminar
   public int eliminar(){
       int aux = inicio.dato;
       inicio = inicio.sig;
       tam--;
       return aux;
   }
   
   //Método inicio Cola
   public int inicioCola(){
       return inicio.dato;
   }
   
   //Método tamaño Cola
   public int tamañoCola(){
       return tam;
   }}}
    

