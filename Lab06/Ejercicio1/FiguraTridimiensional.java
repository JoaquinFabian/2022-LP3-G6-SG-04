package Lab06.Ejercicio1;

public abstract class FiguraTridimiensional implements Figura{

    public String tipoFiguraTri;
    public String tipoCuerpoTri;

    // -------------Constructor----------------------
    
    public FiguraTridimiensional(String FiguraTri, String CuerpoTri) {
        tipoFiguraTri = FiguraTri;
        tipoCuerpoTri = CuerpoTri;
    }

    // ----------------gets y sets ----------------------

    public String getTipoFiguraTri() {
        return tipoFiguraTri;
    }

    public String getTipoCuerpoTri() {
        return tipoCuerpoTri;
    }

    public void setTipoFiguraTri(String tipoFiguraTri) {
        this.tipoFiguraTri = tipoFiguraTri;
    }

    public void setTipoCuerpoTri(String tipoCuerpoTri) {
        this.tipoCuerpoTri = tipoCuerpoTri;
    }

}
