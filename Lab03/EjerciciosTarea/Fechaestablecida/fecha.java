package Lab03.EjerciciosTarea.Fechaestablecida;

import java.util.*;

public class Fecha{ 

    /////////////// Atributos //////////////////

    private int day, month, year;

    ////////////// Constructores ////////////////

    public Fecha(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
        this.valida();
    }
    
    public Fecha() {
        this(1, 1, 1900);
    }


    ////////////// Ingreso de Fecha////////////////

    public void leer() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresar Day (1-31): ");
        int day = sc.nextInt();
        this.day = day;
        System.out.print("Ingresar Month (1-12): ");
        int month = sc.nextInt();
        this.month = month;
        System.out.print("Ingresar Year (1900-2050): ");
        int year = sc.nextInt();
        this.year = year;
        this.valida();
        
    }
    
    //////////// Método de año bisiesto ////////////
    public boolean bisiesto() {
        if ((this.year % 4 == 0) && ((this.year % 100 != 0) || (this.year % 400 == 0)))
            return true;
        return false;
    }

    //////////// Método para especificar cuantos dias tiene un mes en específico ////////////

    public int diasMes(int month) {
        switch (month) {
            case 1:
                return 31;
            case 2:
                if (this.bisiesto() == true)
                    return 29;
                else
                    return 28;
            case 3:
                return 31;
            case 4:
                return 30;
            case 5:
                return 31;
            case 6:
                return 30;
            case 7:
                return 31;
            case 8:
                return 31;
            case 9:
                return 30;
            case 10:
                return 31;
            case 11:
                return 30;
            case 12:
                return 31;
        }
        return 0;
    }

    //////////// Validar la fecha siempre y cuando este dentro del rango ////////////

    private void valida() {
        if (this.year >= 2051 || this.year <= 1899)
            setYear(1900);
        if (this.month >= 13 || this.month <= 0)
            setMonth(1);
        if (this.day >= 32 || this.day <= 0)
            setDay(1);
        else {
            if (this.day > diasMes(this.month))
                setDay(1);
        }
    }


    //////////// Método para devolver la fecha de forma numerica ////////////

    public String corta() {
        String cadDay = String.format("%02d", this.day);
        String cadMonth = String.format("%02d", this.month);
        return (cadDay + "-" + cadMonth + "-" + this.year);
    }

    //////////// Aumento de dias a la fecha ////////////

    public int diasTranscurridos() {
        Fecha count = new Fecha();
        int countDays = 0;
        while (count.day != this.day || count.month != count.month || count.year != this.year) {
            count.fechaTras(1);
            countDays++;
        }
        return countDays;
    }

    //////////// Muestra el dia el cual cayo la fecha ////////////
    public int diaSemana() {
        int transDays = (this.diasTranscurridos() % 7);
        switch (transDays) {
            case 0:
                return 0;
            case 1:
                return 1;
            case 2:
                return 2;
            case 3:
                return 3;
            case 4:
                return 4;
            case 5:
                return 5;
            case 6:
                return 6;
        }

        return 0;
    }
    
    //////////// Método para devolver la fecha de manera escrita ////////////

    public String larga() {
        int nDay = this.diaSemana();
        String sDay = " ";
        String sMonth = " ";
        switch (nDay) {
            case 0:
                sDay = "Domingo";
            case 1:
                sDay = "Lunes";
            case 2:
                sDay = "Martes";
            case 3:
                sDay = "Miercoles";
            case 4:
                sDay = "Jueves";
            case 5:
                sDay = "Viernes";
            case 6:
                sDay = "Sabado";
        }
        switch (this.month) {
            case 1:
                sMonth = "Enero";
            case 2:
                sMonth = "Febrero";
            case 3:
                sMonth = "Marzo";
            case 4:
                sMonth = "Abril";
            case 5:
                sMonth = "Mayo";
            case 6:
                sMonth = "Junio";
            case 7:
                sMonth = "Julio";
            case 8:
                sMonth = "Agosto";
            case 9:
                sMonth = "Septiembre";
            case 10:
                sMonth = "Octubre";
            case 11:
                sMonth = "Noviembre";
            case 12:
                sMonth = "Diciembre";
        }
        return (sDay + " " + this.day + " de " + sMonth + " de " + this.year);
    }
    //////////// fecha origen 1900 con respecto al aumento de un dias mas ////////////
    
    public void fechaTras(long a) {
        this.day = 1;
        this.month = 1;
        this.year = 1900;
        for (int i = 0; i < a; i++) {
            this.siguiente();
        }
    }

    //////////// dias transcurridos entre 2 fechas ////////////

    public int diasEntre(Fecha f1) {
        return (this.diasTranscurridos() - f1.diasTranscurridos());
    }

    //////////// un dia mas de la fecha ////////////

    public void siguiente() {
        if (this.day == this.diasMes(this.month)) {
            if (this.month == 12) {
                this.month = 1;
                this.day = 1;
                this.setYear(++year);
            } else {
                this.day = 1;
                this.setMonth(++month);
            }
        } else
            this.setDay(++day);
    }

    //////////// un dia menos de la fecha ////////////

    public void anterior() {
        if (this.day == 1) {
            if (this.month == 1) {
                this.month = 12;
                this.day = 31;
                this.year -= 1;
            } else {
                this.month -= 1;
                this.day = this.diasMes(this.month);
            }
        }
        this.day -= 1;
    }

    //////////// envio de fecha enviada 2022 con respecto al aumento de un dias mas ////////////

    public void fechaFutura(int nDay) {
        for (int i = 0; i < nDay; i++) {
            this.siguiente();
        }
    }

    ////////////// Método para clonar la fecha ///////

    public Fecha copia() {
        return this;
    }

    ///////////////// Métodos para Comparar feachas /////////////

    public static boolean igualQue(Fecha f1, Fecha f2) {
        if (f1.day == f2.day && f1.month == f2.month && f1.year == f2.year)
            return true;
        return false;
    }

    public static boolean menorQue(Fecha f1, Fecha f2) {
        if (f1.year <= f2.year)
            if (f1.month <= f2.month)
                if (f1.day <= f2.day)
                    return true;
        return false;
    }

    public static boolean mayorQue(Fecha f1, Fecha f2) {
        if (f1.year >= f2.year)
            if (f1.month >= f2.month)
                if (f1.day >= f2.day)
                    return true;
        return false;
    }

    
    ///////////// Gets y Sets ////////////////////

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    ////////////// Metodo toStrign ///////////////////

    @Override
    public String toString() {
        return "Fecha [ " + this.corta() + "]";
    }
    
    
}