
package indicedemasacorporal;
import java.lang.Math;
import javax.swing.JOptionPane;

public class IndiceDeMasaCorporal {


    public static void main(String[] args) {
        double peso, estatura ,pesoIdeal;
        String categoria, mensaje = "";
        
        
        peso = Double.parseDouble(JOptionPane.showInputDialog("Introduce el peso en kg"));
        estatura = Double.parseDouble(JOptionPane.showInputDialog("Introduce la estatura en m"));
        
        double imc = IndexOfCorporalMass(peso,estatura);
        
        pesoIdeal = 22.0 * Math.pow(estatura,2);
        double pesoIdeal1 = Math.round(peso - pesoIdeal);
        double pesoIdeal2 = Math.round(pesoIdeal - peso);
        
        if(pesoIdeal1 < 0 ){
           pesoIdeal1 *= -1;
        }else if(pesoIdeal2 < 0){
            pesoIdeal2 *= -1;
        }
        
        
        if(imc < 18.5){
            categoria = "bajo peso";
            mensaje = " Necesitas subir "+pesoIdeal1+" kg";
            
        }
        else if(imc >= 18.5 && imc < 25){
            categoria = "peso normal";
        }
        else if(imc >= 25 && imc < 30){
            categoria = "sobrepeso";
            mensaje = " Necesitas bajar "+pesoIdeal2+" kg";
        }
        else{
            categoria = "obesidad";
            mensaje = " Necesitas bajar "+pesoIdeal2+" kg";
        }
        
        JOptionPane.showMessageDialog(null, "Tu IMC es "+imc+" y tienes "
                +categoria+mensaje);
      
    }
    
    public static double IndexOfCorporalMass(double peso,double estatura){
        double imc = peso / Math.pow(estatura, 2);
        imc = Math.round( imc * 100.0)/100.0;
        return imc;
    }

}
