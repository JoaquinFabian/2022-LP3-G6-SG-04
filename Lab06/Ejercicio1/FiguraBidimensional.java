package Lab06.Ejercicio1;

public abstract class FiguraBidimensional implements Figura{
    
    public String tipoFiguraBi;
    public String tipoCuerpoBi;

    // -------------Constructor----------------------

    public FiguraBidimensional(String FiguraBi, String CuerpoBi){
        tipoFiguraBi = FiguraBi;
        tipoCuerpoBi = CuerpoBi;
    }

   // ----------------gets y sets ---------------------- 

    public String getTipoFiguraBi(){
        return tipoFiguraBi;
    }

    public String getTipoCuerpoBi(){
        return tipoCuerpoBi;
    }

    public void setTipoFiguraBi(String tipoFiguraBi){
        this.tipoFiguraBi = tipoFiguraBi;
    }

    public void setTipoCuerpoBi(String tipoCuerpoBi){
        this.tipoCuerpoBi = tipoCuerpoBi;
    }

}
