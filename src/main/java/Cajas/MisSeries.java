/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cajas;

/**
 *
 * @author guerig
 */
public class MisSeries {

    public static void main(String[] args) {
        Serie simpson = new Serie("Los simpson", "Comedia", "...", "Fox", 0,  1000);
        System.out.println(simpson);
        
        Serie house = new Serie();
        System.out.println(house);
        
        
        Serie prisonBreak = new Serie("Prison Break", "Acción", "...", "AMC", 5, 120000);
        System.out.println(prisonBreak);
        
        // Crear un objeto serie leyendo los datos por teclado
        Serie peakeBlinders = ServicioSerie.leerTecladoSerie();
        System.out.println(peakeBlinders);
        
        ServicioSerie.darLike(prisonBreak);
        System.out.println(prisonBreak);
        ServicioSerie.darLike(peakeBlinders);
        System.out.println(peakeBlinders);
        
    }

    
    
    
    
    
    
    
    
    
    
    
    
}
