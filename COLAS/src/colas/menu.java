package colas;
import javax.swing.JOptionPane;
public class menu {
    
    public static void main(String[] args) {
        int opción = 0;
        int elemento = 0;
      
        Cola Cola1 = new Cola();
        Cola Cola2 = new Cola();
        Cola Cola3 = new Cola();
        Cola Cola4 = new Cola();
        
        do {
       try {
                opción = Integer.parseInt(JOptionPane.showInputDialog(null,
                        "1. Insertar Elemento \n"
                        + "2. Eliminar Elemento \n"
                        + "3. ¿La cola está Vacia? \n"
                        + "4. Inicio de la cola \n"
                        + "5. Tamaño de la cola \n"
                        + "6. Salir del Menú", "Menú", JOptionPane.QUESTION_MESSAGE));
                switch (opción) {
                    case 1:
                        elemento = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un Elemento",
                                "Insertar", JOptionPane.QUESTION_MESSAGE));
                        Cola1.insertar(elemento);
                        break;
                    case 2:
                        if (!Cola1.estaVacia()) {
                            JOptionPane.showMessageDialog(null, "Eliminar Elemto: " + Cola1.eliminar(),
                                    "Eliminar", JOptionPane.INFORMATION_MESSAGE);
                        } else {
                            JOptionPane.showMessageDialog(null, "La cola está Vacia", "Cola Vacia",
                                    JOptionPane.INFORMATION_MESSAGE);
                        }
                        break;
                    case 3:
                        if (Cola1.estaVacia()) {
                            JOptionPane.showMessageDialog(null, "La cola está Vacia", "Cola Vacia",
                                    JOptionPane.INFORMATION_MESSAGE);
                        } else {
                            JOptionPane.showMessageDialog(null, "La cola NO está Vacia", "Cola Llena",
                                    JOptionPane.INFORMATION_MESSAGE);
                        }
                        break;
                    case 4:
                        if (!Cola1.estaVacia()) {
                            JOptionPane.showMessageDialog(null, "Inicio de Cola:  " + Cola1.inicioCola(),
                                    "Inicio Cola", JOptionPane.INFORMATION_MESSAGE);
                        } else {
                            JOptionPane.showMessageDialog(null, "La cola está Vacia", "Cola Vacia",
                                    JOptionPane.INFORMATION_MESSAGE);
                        }
                        break;
                    case 5:
                        JOptionPane.showMessageDialog(null, "Tamaño de Cola:  " + Cola1.tamañoCola(), "Tamaño Cola",
                                JOptionPane.INFORMATION_MESSAGE);
                        break;
                    case 6:
                        JOptionPane.showMessageDialog(null, "Fin Menú", "Fin",
                                JOptionPane.INFORMATION_MESSAGE);
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Opción Incorrecta!!!", "Error",
                                JOptionPane.INFORMATION_MESSAGE);
                        break;
            }
            } catch (NumberFormatException n) {
                JOptionPane.showMessageDialog(null, n.getMessage());
            }
        } while (opción != 6);
    }
    }
