package vehiculos;

/**
 *
 * @author PatitoSystems
 */
public class Automotor {
    
    public String marca;
    public String modelo;
    
    public Automotor(){        
    }
    
    public Automotor(String marca, String modelo){
        this.marca = marca;
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return "Automotor{" + "marca=" + marca + ", modelo=" + modelo + '}';
    }
    
//    insertar() {
//        String salir = 'Salir';
//        
//        Scanner sc = new Scanner();
//        String comando = sc.nextLine();
//        
//        while (comando = salir){
//            // logica de coger la cadena y meter las partecitas en el atributo correspondiente
//        }
//    }
    
    
}
