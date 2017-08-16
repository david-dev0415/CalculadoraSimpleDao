
package controller;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
/**
 *
 * @author DavidP
 */
public class controllerCalculadora {
    
    private boolean estadoNumero;
    private double resultado;
    private double num1;
    private double num2;
     private String numero1 = "";
    private String numero2 = "";
    
//Begin: btn_numeros
    
    private double btnNum1;
    private double btnNum2;
    private double btnNum3;
    private double btnNum4;
    private double btnNum5;
    private double btnNum6;
    private double btnNum7;
    private double btnNum8;
    private double btnNum9;
    private double btnNum0;
    
    
//End: btn_numeros

    public void setEstadoNumero(boolean estadoNumero) {
        this.estadoNumero = estadoNumero;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }

    public void setBtnNum1(double btnNum1) {
        this.btnNum1 = btnNum1;
    }

    public void setBtnNum2(double btnNum2) {
        this.btnNum2 = btnNum2;
    }

    public void setBtnNum3(double btnNum3) {
        this.btnNum3 = btnNum3;
    }

    public void setBtnNum4(double btnNum4) {
        this.btnNum4 = btnNum4;
    }

    public void setBtnNum5(double btnNum5) {
        this.btnNum5 = btnNum5;
    }

    public void setBtnNum6(double btnNum6) {
        this.btnNum6 = btnNum6;
    }

    public void setBtnNum7(double btnNum7) {
        this.btnNum7 = btnNum7;
    }

    public void setBtnNum8(double btnNum8) {
        this.btnNum8 = btnNum8;
    }

    public void setBtnNum9(double btnNum9) {
        this.btnNum9 = btnNum9;
    }

    public void setBtnNum0(double btnNum0) {
        this.btnNum0 = btnNum0;
    }
    
    /*public void setEstado(boolean estado){
        this.estadoNumero = estado; 
    }
    
    public void getEstadoNumero() {
        if(estadoNumero){
            numero1 += 1;
            
        }else {
           numero2 = numero2 +1;
           
        }
    
    }*/
    
    
    
    /*Begin:Operaciones*/
    
    public void suma (double num1, double num2) {
        resultado = num1 + num2;
    }
    
    public double sumaResultado() {
        return resultado;
    }
    
    public void resta(double num1, double num2){
        resultado = num1 - num2;
    }

    public double restaResultado(){
        return resultado;
    }
    
    public void  multiplicacion(double num1, double num2){
        resultado = num1 * num2;
    }
    
    public double multiplicacionResultado () {
        return resultado;
    }
    
    public void division(double num1, double num2){
        resultado = (num1 / num2);
        if(num2 == 0){
            mensajeErrorDivision();
            resultado = 0;
        }       
    }
    
    public double divisionResultado() {
        return resultado;
    }
    
    public void mensajeErrorDivision(){
        
        JFrame frame = new JFrame("JOptionPane");
        JOptionPane.showMessageDialog(frame, "Mensaje de error", 
        "La división por cero no puede ser. ¡Math Error!", 
        JOptionPane.INFORMATION_MESSAGE);
    }
    
    
    /*End: Operaciones*/
    
}
