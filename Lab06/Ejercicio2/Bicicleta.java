package Lab06.Ejercicio2;

public class Bicicleta implements ImpactoEcologico {

    String TipoBicicleta;
    double Gases;
    double Emision_energia;
    double Salud_personal;
    double factor_emision = 0.05;

    // -------------Constructor----------------------

    public Bicicleta(String Bicy, double Gas, double Energia, double salud) {
        TipoBicicleta = Bicy;
        Gases = Gas;
        Emision_energia = Energia;
        Salud_personal = salud;
    }

    // ----------------gets y sets ----------------------

    public String getTipoBicicleta() {
        return TipoBicicleta;
    }

    public double getGases() {
        return Gases;
    }

    public double getEmision_energia() {
        return Emision_energia;
    }

    public double getSalud_personal() {
        return Salud_personal;
    }

    public void setTipoBicicleta(String Bicy) {
        TipoBicicleta = Bicy;
    }

    public void setGases(double Gas) {
        Gases = Gas;
    }

    public void setEmision_energia(double Energia) {
        Emision_energia = Energia;
    }

    public void setSalud_personal(double Salud) {
        Salud_personal = Salud;
    }

    // ------------- Método para hallar el dato de actividad -------------

    public double Dato_actividad(){
        return ((getSalud_personal()/100) * (getEmision_energia()/100)) - getEmision_energia();
    }

    // ------------- Método de implementacion de la interfaz -------------

    @Override
    public double ObtenerImpactoEcologico() {
        return Dato_actividad() * factor_emision;
    }

    // ------------- Método de ToString -------------

    @Override
    public String toString() {
        String s;
        s = "\n" +
                "--------------- Datos Ecologicos de la"+ this.TipoBicicleta +" ---------------" + "\n" +
                "Categoria Contaminante: " + this.TipoBicicleta+ "\n" +
                "Gases Desprendidos: " + this.Gases+ "\n" +
                "Consumo energetico: " + this.Emision_energia+ "\n"+
                "Consumo de agua: " + this.Salud_personal + "\n" +
                "Impacto Ecologico: " + this.ObtenerImpactoEcologico() +" GEI" +"\n";
        return s;
    }

}
