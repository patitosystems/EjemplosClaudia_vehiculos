/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vehiculos;

/**
 *
 * @author PatitoSystems
 */
public class Motos extends Automotor {
    
    public boolean cascos;
    
    public Motos(){
        super();
    }
    
    public Motos(Automotor automotor, boolean cascos){
        super(automotor.marca, automotor.modelo);
        this.cascos = cascos;
    }

    @Override
    public String toString() {
        return "Motos{" + "cascos=" + cascos + " " + marca + " " + modelo +"} ";
    }   
}
