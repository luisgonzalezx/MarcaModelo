
package marcamodelo;

import javax.swing.JOptionPane;


public class MarcaModelo {

    
    public static void main(String[] args) {
        
         //Carga de Vectres 
       String [] marcas = {"  ","Ford","Fiat", "Renault"};
       String [] Ford = {"Fiesta","Falcon","Ka","Focus"};
       String [] Fiat = {"1500","Palio","Punto","Cubo"};
       String [] Renault = {"Clio","Sandero","12","Kwind"};
       //Seleccion de marca
       Object opcion = JOptionPane.showInputDialog(null,"Seleccione una marca de vehiculo", "Mi coche",JOptionPane.QUESTION_MESSAGE,null, marcas,marcas[0]);
       
        combomodelos(Ford,Fiat,Renault,opcion);
        
        }
        //mostrar el combo de los modelos seguin la marca
    
        private static void combomodelos(String[] Ford,String[] Fiat,String[] Renault,Object opcion){
        
      if (opcion == "Ford"){
      Object fordmodelo = JOptionPane.showInputDialog(null,"Los modelos para la marca  " + opcion + "Seleccione el modelo que le guste","Modelos de  Autos",JOptionPane.QUESTION_MESSAGE,null,Ford,Ford[1]);
      System.out.println("Su veiculo es de la marca " + opcion + " modelo " + fordmodelo);
       }
    
      else if(opcion=="Fiat"){
      Object fiatmodelo = JOptionPane.showInputDialog(null,"Los modelos para la marca  " + opcion + "Seleccione el modelo que le guste","Modelos de  Autos",JOptionPane.QUESTION_MESSAGE,null,Ford,Ford[2]);
      System.out.println("Su veiculo es de la marca " + opcion + " modelo " + fiatmodelo);
       }
        
      else if(opcion=="Renault"){
      Object renaultmodelo = JOptionPane.showInputDialog(null,"Los modelos para la marca  " + opcion + "Seleccione el modelo que le guste","Modelos de  Autos",JOptionPane.QUESTION_MESSAGE,null,Ford,Ford[3]);
      System.out.println("Su veiculo es de la marca " + opcion + " modelo " + renaultmodelo);
       }
        
      
}
}