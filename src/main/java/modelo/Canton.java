/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author ASUS
 */
public class Canton {
    private String nombre;
    private int numHabitantes;
    private String parroquia;
    private String provincia;

    public Canton(String nombre, int numHabitantes, String parroquia, String provincia) {
        this.nombre = nombre;
        this.numHabitantes = numHabitantes;
        this.parroquia = parroquia;
        this.provincia = provincia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumHabitantes() {
        return numHabitantes;
    }

    public void setNumHabitantes(int numHabitantes) {
        this.numHabitantes = numHabitantes;
    }

    public String getParroquia() {
        return parroquia;
    }

    public void setParroquia(String parroquia) {
        this.parroquia = parroquia;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    @Override
    public String toString() {
        return "Canton{" + "nombre=" + nombre + ", numHabitantes=" +
               numHabitantes + ", parroquia=" + parroquia + ", provincia=" +
                provincia + '}';
    }
    
    
}
