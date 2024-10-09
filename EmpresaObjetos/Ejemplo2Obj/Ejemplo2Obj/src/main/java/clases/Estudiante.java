/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author APRENDIZ
 */
public class Estudiante {
    private String nombre;
    private float notaParcial1, notaParcial2, notaFinal;

    public Estudiante(String nombre) {
        this.nombre = nombre;
    }

    public Estudiante(String nombre, float notaParcial1, float notaParcial2) {
        this.nombre = nombre;
        this.notaParcial1 = notaParcial1;
        this.notaParcial2 = notaParcial2;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNotaParcial1(float notaParcial1) {
        this.notaParcial1 = notaParcial1;
    }

    public void setNotaParcial2(float notaParcial2) {
        this.notaParcial2 = notaParcial2;
    }

    public void setNotaFinal(float notaFinal) {
        this.notaFinal = notaFinal;
    }

    public String getNombre() {
        return nombre;
    }

    public float getNotaParcial1() {
        return notaParcial1;
    }

    public float getNotaParcial2() {
        return notaParcial2;
    }

    public float getNotaFinal() {
        return notaFinal;
    }

    public void calcularNotaFinal() {
        notaFinal = (notaParcial1 + notaParcial2) /2;
    }
    
    public String obtenerMensaje() {
        if(notaFinal > 3) {
            return "El estufiante" + nombre + "Aprobo";
        } else {
            return "El estufiante" + nombre + "Reprobo";
        }
    } 
    
    
    
}
