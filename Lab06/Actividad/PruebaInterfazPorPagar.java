package Lab06.Actividad;

public class PruebaInterfazPorPagar {

    public static void main(String[] args) {

        Porpagar[] objetosPorPagar = new Porpagar[6];

        objetosPorPagar[0] = new Factura("01234", "Asiento",2,375.00);
        objetosPorPagar[1] = new Factura("56789", "Llanta",4,79.00);
        objetosPorPagar[2] = new EmpleadoAsalariado("John", "Smith", "111-11-1111", 800.00);
        objetosPorPagar[3] = new EmpleadoAsalariado("Lisa", "Barnes", "888-88-8888", 1200.00);
        objetosPorPagar[4] = new Prestamo(5, 286);
        objetosPorPagar[5] = new Prestamo(12, 750);

        System.out.println("Facturas, Empleados y Prestamos procesados en forma polimorfica: \n");

        for(Porpagar porPagarActual : objetosPorPagar) 
        {
            System.out.printf( porPagarActual.toString());
        }
    }
    
}

/* SALIDA DE PANTALLA 1:

Facturas y Empleados procesados en forma polimorfica: 


--------------- Factura ---------------
Numero de piezas: 01234 (Asiento)
Cantidad: 2
Precio por articulo: 375.0
Pago vencido: 750.0

--------------- Factura ---------------
Numero de piezas: 56789 (Llanta)
Cantidad: 4
Precio por articulo: 79.0
Pago vencido: 316.0

--------------- Datos del empleado Asalariado ---------------
Primer Nombre: John
Apellido Paterno: Smith
Numero de seguro social: 111-11-1111
Salario Semanal: 800.0
Pago vencido: 800.0

--------------- Datos del empleado Asalariado ---------------
Primer Nombre: Lisa
Apellido Paterno: Barnes
Numero de seguro social: 888-88-8888
Salario Semanal: 1200.0
Pago vencido: 1200.0
*/



//----------------------------------------------------------------//

/* SALIDA DE PANTALLA 2:
Facturas, Empleados y Prestamos procesados en forma polimorfica: 


--------------- Factura ---------------
Numero de piezas: 01234 (Asiento)
Cantidad: 2
Precio por articulo: 375.0
Pago vencido: 750.0

--------------- Factura ---------------
Numero de piezas: 56789 (Llanta)
Cantidad: 4
Precio por articulo: 79.0
Pago vencido: 316.0

--------------- Datos del empleado Asalariado ---------------
Primer Nombre: John
Apellido Paterno: Smith
Numero de seguro social: 111-11-1111
Salario Semanal: 800.0
Pago vencido: 800.0

--------------- Datos del empleado Asalariado ---------------
Primer Nombre: Lisa
Apellido Paterno: Barnes
Numero de seguro social: 888-88-8888
Salario Semanal: 1200.0
Pago vencido: 1200.0

--------------- Datos del Prestamo ---------------
Numero de cuotas: 5.0
Monto por couta (Unidad): 286.0
Pago vencido: 1430.0

--------------- Datos del Prestamo ---------------
Numero de cuotas: 12.0
Monto por couta (Unidad): 750.0
Pago vencido: 9000.0
*/
