/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cajas;

import java.util.Random;
import org.apache.commons.lang3.RandomStringUtils;

/**
 *
 * @author guerig
 */
public class Cuenta {
    /* CLASE CUENTA
        ATRIBUTOS
            Nº CUENTA (20 DIGITOS)
            NIF CLIENTE
            NOMBRE CLIENTE
            SALDO ACTUAL
            INTERES % (ENTRE 0.1 Y 3)
        METODOS
            CONSTRUCTOR POR DEFECTO Nº CUENTA ALEATORIO
            CONSTRUCTOR PARAMETRIZADO Nº CUENTA ALEATORIO
            GETTER Y SETTER NO HAY SET PARA EL NÚMERO CUENTA
            TOSTRING
    
    CLASE CALCULOSCUENTA
        METODOS
        ingresaInteres(Cuenta cuenta) Aumenta el saldo de la cuenta
            saldo = saldo + saldo*interes
    
        ingresarDinero(Cuenta cuenta, double cantidad)
        retirarEfectivo(Cuenta cuenta, double cantidad) Hay que tener en cuenta que no se puede retirar más del saldo actual
    
    CLASE MAIN
        Creamos un par de objetos y probamos los métodos de CALCULOSCUENTA
    */
    
    // Atributos de instancia
    private String cuenta = generarCuenta(); // tipo String porque no se va a realizar operaciones con el
    private String nif;
    private String nombre;
    private double saldoActual;
    private final double INTERES_MINIMO = 0.1;
    private final double INTERES_MAXIMO = 3;


    // Constructor

    // Método constructor 
    public Cuenta() {
    }

    // Método constructor que inicializa los atributos
    public Cuenta(String cuenta, String nif, String nombre, double saldoActual) {
        this.cuenta = cuenta;
        this.nif = nif;
        this.nombre = nombre;
        this.saldoActual = saldoActual;
    }

    // Getters
    public double getINTERES_MINIMO() {
        return INTERES_MINIMO;
    }

    public double getINTERES_MAXIMO() {
        return INTERES_MAXIMO;
    }

    public String getCuenta() {
        return cuenta;
    }

    public String getNif() {
        return nif;
    }

    public String getNombre() {
        return nombre;
    }

    public double getSaldoActual() {
        return saldoActual;
    }
    
    // Setters

    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setSaldoActual(double saldoActual) {
        this.saldoActual = saldoActual;
    }

    @Override
    public String toString() {
        return "Cuenta{" + "cuenta=" + cuenta + ", nif=" + nif + ", nombre=" + nombre + ", saldoActual=" + saldoActual + ", INTERES_MINIMO=" + INTERES_MINIMO + ", INTERES_MAXIMO=" + INTERES_MAXIMO + '}';
    }
    

    public String generarCuenta(){
        
        String numeroCuenta = RandomStringUtils.randomNumeric(20);
        
        return numeroCuenta;
    }
    


































    
}

