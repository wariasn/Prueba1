/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicio;

import java.util.ArrayList;
import java.util.List;
import modelo.Canton;

/**
 *
 * @author ASUS
 */
public class CantonServicio implements ICantonServicio{
    
    private static List<Canton> cantonList = new ArrayList<>();

    @Override
    public Canton crear(Canton canton) {
        this.cantonList.add(canton);
        return canton;
    
    }

    @Override
    public List<Canton> listar() {
        return this.cantonList;
    }
    
}
