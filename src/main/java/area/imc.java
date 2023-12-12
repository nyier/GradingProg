/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package area;

/**
 *
 * @author nyierre
 */
public class imc {
    private int idCali;
    private String Profesor;
    private int iduser;
    private double cal1;
    private double cal2;
    private double cal3;
    private double cal4;
    private double por1;
    private double por2;
    private double por3;
    private double por4;
    
    public imc(){
    
    }
    
    public imc(int idCali, String Profesor, double cal1, double cal2, double cal3, double cal4, double por1, double por2, double por3, double por4){
        this.idCali = idCali;
        this.Profesor = Profesor;
        this.cal1 = cal1;
        this.cal2 = cal2;
        this.cal3 = cal3;
        this.cal4 = cal4;
        this.por1 = por1;
        this.por2 = por2;
        this.por3 = por3;
        this.por4 = por4;
        
    }

    public void setIdCali(int idCali) {
        this.idCali = idCali;
    }

    public void setPor1(double por1) {
        this.por1 = por1;
    }

    public void setPor2(double por2) {
        this.por2 = por2;
    }

    public void setPor3(double por3) {
        this.por3 = por3;
    }

    public void setPor4(double por4) {
        this.por4 = por4;
    }

    public double getIdCali() {
        return idCali;
    }

    public double getPor1() {
        return por1;
    }

    public double getPor2() {
        return por2;
    }

    public double getPor3() {
        return por3;
    }

    public double getPor4() {
        return por4;
    }

    public void setCal1(double cal1) {
        this.cal1 = cal1;
    }

    public void setCal2(double cal2) {
        this.cal2 = cal2;
    }

    public void setCal3(double cal3) {
        this.cal3 = cal3;
    }

    public double getCal4() {
        return cal4;
    }

    public void setCal4(double cal4) {
        this.cal4 = cal4;
    }

    public double getCal1() {
        return cal1;
    }

    public double getCal2() {
        return cal2;
    }

    public double getCal3() {
        return cal3;
    }
    
    public String getProfesor(){
        return Profesor;
    }
    
    public void setProfesor(String Profesor){
        this.Profesor = Profesor;
    }

    public double calcularCali(double cal1, double cal2, double cal3, double cal4, double por1, double por2, double por3, double por4) {
        double result;
        result = (cal1*por1/100)+(cal2*por2/100)+(cal3*por3/100)+(cal4*por4/100);
        return result;
    }
}

