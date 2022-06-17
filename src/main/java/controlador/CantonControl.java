/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.util.List;
import modelo.Canton;
import servicio.CantonServicio;

/**
 *
 * @author ASUS
 */
public class CantonControl {
    private final CantonServicio cantonServicio = new CantonServicio();
    
    public Canton crear(String[] args){
        
        var canton = new Canton(args[0],Integer.valueOf(args[1]),args[2],args[3]);
        this.cantonServicio.crear(canton);
        return canton;
    }
    
    public List<Canton> listar(){
        return this.cantonServicio.listar();
    }
    
}
