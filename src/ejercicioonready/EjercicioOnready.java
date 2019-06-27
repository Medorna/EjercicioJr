package ejercicioonready;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;

public class EjercicioOnready {

    public static void main(String[] args) {

        Autos peugeot206 = new Autos("Peugeot", "206", 4, 200000);
        Motos titan125 = new Motos("Honda", "Titan", 125, 60000);
        Autos peugeot208 = new Autos("Peugeot", "208", 5, 250000);
        Motos yamahaYbr = new Motos("Yamaha", "YBR", 160, 80500);
        
        List<Vehiculo> vehiculoLista = new ArrayList<>();
        
        vehiculoLista.add(peugeot206);
        vehiculoLista.add(titan125);
        vehiculoLista.add(peugeot208);
        vehiculoLista.add(yamahaYbr);
        
        //enhanced for-loop :D
        for(Vehiculo v: vehiculoLista){
        
            System.out.println(v.toString());
            
        }
        
        System.out.println("=============================");
        
        System.out.println("Vehículo más caro: " + Collections.max(vehiculoLista).getMarca()+ " " + Collections.max(vehiculoLista).getModelo());
        System.out.println("Vehículo más barato: " + Collections.min(vehiculoLista).getMarca()+ " " + Collections.min(vehiculoLista).getModelo());
        
        //Bonus Track
        System.out.println("============================= \nVehículos ordenados por precio de mayor a menor:");
        
        Comparator<Vehiculo> comparar = Collections.reverseOrder();
        Collections.sort(vehiculoLista, comparar);
        
       for(Vehiculo v: vehiculoLista){
        
            System.out.println(v.getMarca() + " " +v.getModelo());
            
        }
    }
}
