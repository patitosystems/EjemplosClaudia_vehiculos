package vehiculos;

/**
 *
 * @author PatitoSystems
 */
public class Vehiculos {
 
    public static void main(String[] args) {
        
//        electrodomestico.insertar('434556&Nevera&24243&234234');
//        if (electromediasto.tipo == "Nevera "){
//            Nevera n1 = new Nevera(electromedistoc.marca, sdfsef.modelo, ersedwe.efiwerwe)
//        }
        Automotor a1 = new Automotor("BMW", "2002");
        Automotor a2 = new Automotor("Honda", "2022");
        
        
        Motos m1 = new Motos(a2, true);
        Carros c1 = new Carros(a1, 5);
        System.out.println("carro 1 = " + c1);
        System.out.println("moto 1 = " + m1);
    }    
}
