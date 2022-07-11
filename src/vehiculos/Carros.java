package vehiculos;

/**
 *
 * @author PatitoSystems
 */
public class Carros extends Automotor{
    public int cantidadSillas;
    
    public Carros(){
        super();
    }
    
    public Carros(Automotor automotor, int cantidadSillas){
        super(automotor.marca,automotor.modelo);
        this.cantidadSillas = cantidadSillas;
    }
    
    @Override
    public String toString() {
        return "Carros{" + "Sillas =" + cantidadSillas + " " + marca + " " + modelo +"} ";
    }
}
