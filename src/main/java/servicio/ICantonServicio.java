/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package servicio;

import java.util.List;
import modelo.Canton;

/**
 *
 * @author ASUS
 */
public interface ICantonServicio {
    
    public Canton crear(Canton canton);
    public List<Canton> listar();
    
}
