/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cajas;

import java.time.LocalDate;
import java.time.Month;
import java.time.MonthDay;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.time.temporal.ChronoUnit;
import java.util.Locale;

/**
 *
 * @author guerig
 */
public class EjemplosFechas {

    public static void main(String[] args) {
        // Clase que guarda fechas
        LocalDate fechaHoy = LocalDate.now(); // se está usando un método estatico
        System.out.println("Año: " + fechaHoy.getYear());
        System.out.println("Mes: " + fechaHoy.getMonth());
        System.out.println("Día: " + fechaHoy.getDayOfMonth());
        
        // Clase que guarda mes
        Month mesActual = fechaHoy.getMonth();
        System.out.println("Month: " + mesActual);
        
        // Fechas concretas
        LocalDate fecha = LocalDate.of(2000, 11, 21);
        LocalDate fecha2 = LocalDate.of(2022, Month.NOVEMBER, 10);
        
        System.out.println("Fecha: " + fecha);
        
        // ¿Son iguales?
        // equals para comparar equals
        if(fecha.equals(fecha2)){
            System.out.println("Son iguales");
        }else{
            System.out.println("Son distintas");
        }
        
        // Anterior y posterior
        if(fecha.isBefore(fecha2)){
            System.out.println("Fecha es anterior a fecha2");
        }
        
        if(fecha.isAfter(fecha2)){
            System.out.println("Fecha es posterior a fecha2");
        }
        
        // Clase para guardar mes y día(no el año)
        MonthDay nocheVieja = MonthDay.of(12,31);
        
        YearMonth añoMes = YearMonth.of(2023, 2);
        
        // Operaciones con fechas
        System.out.println("Hoy: " + fechaHoy);
        System.out.println("Después de 100 días: " + fechaHoy.plusDays(100));
        System.out.println("Hoy" + fechaHoy);
        LocalDate sumarDias = fechaHoy.plusDays(100);
        
        LocalDate sumarMeses = fechaHoy.plusMonths(13);
        System.out.println("Después de 13 meses" + sumarMeses);
        
        LocalDate dosSiglosDespues = sumarMeses.plus(1, ChronoUnit.CENTURIES); // Chrono es un enum
        System.out.println(dosSiglosDespues);
        
        long diferenciaDias = ChronoUnit.DAYS.between( fecha, fecha2);
        System.out.println("Dias entre fechas: " + diferenciaDias);
        
        long years = ChronoUnit.YEARS.between(fecha, fecha2);
        System.out.println("Años entre fechas: " + years);
        
        
        // Devuelve si el año es bisiesto
        boolean esBisiesto = fechaHoy.isLeapYear();
        
        // Devuelve en número de días que tiene el mes
        System.out.println("Días del mes actual: " + fechaHoy.lengthOfMonth());
        
        Locale configLocal = Locale.getDefault();
        /*
        TextStyle como se va a mostrar el día
        configLocal coge la configuración local del sistema, si el equipo esta en español, el día se mostrará en español
        locale.idioma para que se me muestre en el idioma que queremos
        */
        System.out.println("Fecha hoy día: " + 
                fechaHoy.getDayOfWeek().getDisplayName(TextStyle.FULL, configLocal)); 
        
        // dd día con dos numeritos
        // MM mes con dos numeritos
        // yyyy año
        DateTimeFormatter formatoFechas = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String fechaFormateada = fechaHoy.format(formatoFechas);
        System.out.println("Fecha formateada: " + fechaFormateada);
        
    }






















































    
}
