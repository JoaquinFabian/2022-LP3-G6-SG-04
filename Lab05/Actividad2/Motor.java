package Lab05.Actividad2;

public class Motor {

    // -------------- atributos -------------------

    private int numMotor;
    private int revPorMin;

    // -------------- Constructor -------------------

    public Motor(int numMotor, int revPorMin) {
        this.numMotor = numMotor;
        this.revPorMin = revPorMin;
    }

    // -------------- gets y sets -------------------

    public int getNumMotor() {
        return numMotor;
    }

    public void setNumMotor(int numMotor) {
        this.numMotor = numMotor;
    }

    public int getRevPorMin() {
        return revPorMin;
    }

    public void setRevPorMin(int revPorMin) {
        this.revPorMin = revPorMin;
    }

    // -------------- método String -------------------

    @Override
    public String toString() {
        String s = String.format("%10s%2s %10s%2s", this.numMotor, "|", this.revPorMin);
        return s;
    }
}
