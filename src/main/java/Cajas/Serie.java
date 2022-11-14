/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cajas;

/**
 *  Titulo, Genero("Acción", "Comedia", "Scifi", "Drama"), sinopsis, num temporadas, 
 *  productor
 *  
 *  
 *  
 */

// Declaración de la clase
public class Serie {
    // Atributos de clase (static)
    
    // Atributos de instancia (no static)
    private String titulo;
    private String genero;
    private String sinopsis;
    private String productor;
    private int numeroTemporada;
    private int numLikes;
    
    public Serie() {
        // Los atributos quedan inicializados con valores por defecto
        
        
        
        
    }

    public Serie(String titulo, String genero, String sinopsis, String productor, int numeroTemporada, int numLikes) {
        this.titulo = titulo;
        this.genero = genero;
        this.sinopsis = sinopsis;
        this.productor = productor;
        this.numeroTemporada = numeroTemporada;
        this.numLikes = numLikes;
    }

    public int getNumeroTemporada() {
        return numeroTemporada;
    }

    public void setNumeroTemporada(int numeroTemporada) {
        this.numeroTemporada = numeroTemporada;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getSinopsis() {
        return sinopsis;
    }

    public void setSinopsis(String sinopsis) {
        this.sinopsis = sinopsis;
    }

    public String getProductor() {
        return productor;
    }

    public void setProductor(String productor) {
        this.productor = productor;
    }
    
    public int getNumLikes() {
        return numLikes;
    }

    public void setNumLikes(int numLikes) {
        this.numLikes = numLikes;
    }

    

    @Override
    public String toString() {
        return "Serie{" + "titulo=" + titulo + ", genero=" + genero + ", productor=" + productor + ", numeroTemporada=" + numeroTemporada + ", numLikes=" + numLikes + '}';
    }

    // this da error con static
    public void darLike(){
        this.numLikes++; // this no es obligatorio ponerlo, pero por convención se suele colocar
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
