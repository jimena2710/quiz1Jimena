
package quiz1jimenasanchez;
import javax.swing.JOptionPane;

public class Quiz1JimenaSanchez {

   
    public static void main(String[] args) {
        //Ingresar la información solicitada
      String empleados= JOptionPane.showInputDialog("Digite la cantidad de empleados: ");
    
       //Convertir los valores
       int empleado= Integer.parseInt(empleados);

       //monto
       double seguro= 0.0925;
       double IVM= 0.0508;
       //Acumular variable
       double SEM=0;
       double ivm=0;
       
        //Hacerlo por todos los empleados
        for (int i=1; i<= empleado; i++) {
           String salarios= JOptionPane.showInputDialog("Digite el monto del salario: "+i);
            double salario =Double.parseDouble(salarios);
        
        // Calcular el monto del seguro e IVM para el empleado
            double mSeguro =  salario * seguro;
            double montoIVM =  salario * IVM;
        }
        // Calcular el monto total a pagar 
        double montoFinal =  + ivm;

        // Mostrar el resultado mediante JOptionPane
        JOptionPane.showMessageDialog(null, "La empresa deberá abonar a la CCSS el monto de"+montoFinal+ "por concepto de SEM y IVM.");
    }
}
