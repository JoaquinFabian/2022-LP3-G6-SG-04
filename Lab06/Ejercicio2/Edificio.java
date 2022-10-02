package Lab06.Ejercicio2;

public class Edificio implements ImpactoEcologico {

    String TipoEdificio;
    double ResiduosSolidos;
    double ConsumoEnergetico;
    double CosumoAgua;
    double factor_emision = 0.5;

    // -------------Constructor----------------------

    public Edificio(String Edificio, double Residuos, double Energia, double Agua) {
        TipoEdificio = Edificio;
        ResiduosSolidos = Residuos;
        ConsumoEnergetico = Energia;
        CosumoAgua = Agua;
    }

    // ----------------gets y sets ----------------------

    public String getTipoEdificio() {
        return TipoEdificio;
    }

    public double getResiduosSolidos() {
        return ResiduosSolidos;
    }

    public double getConsumoEnergetico() {
        return ConsumoEnergetico;
    }

    public double getCosumoAgua() {
        return CosumoAgua;
    }

    public void setTipoEdificio(String Edificio) {
        TipoEdificio = Edificio;
    }

    public void setResiduosSolidos(double Residuos) {
        ResiduosSolidos = Residuos;
    }

    public void setConsumoEnergetico(double Energia) {
        ConsumoEnergetico = Energia;
    }

    public void setCosumoAgua(double Agua) {
        CosumoAgua = Agua;
    }

    // ------------- Método para hallar el dato de actividad -------------

    public double Dato_actividad(){
        return (getCosumoAgua() * getResiduosSolidos()) + getConsumoEnergetico();
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
                "--------------- Datos Ecologicos del "+ this.TipoEdificio +" ---------------" + "\n" +
                "Categoria Contaminante: " + this.TipoEdificio+ "\n" +
                "Cantidad de Residuos Solidos: " + this.ResiduosSolidos+ "\n" +
                "Consumo energetico: " + this.ConsumoEnergetico + "\n"+
                "Consumo de agua: " + this.CosumoAgua + "\n" +
                "Impacto Ecologico: " + this.ObtenerImpactoEcologico() + "\n";
        return s;
    }

}
