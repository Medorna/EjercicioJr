package ejercicioonready;


public class Motos extends Vehiculo{
    
    private final int cilindradas;

    
    public Motos(String marca, String modelo, int cilindradas, int precio) {
        super(marca, modelo, precio);
        this.cilindradas = cilindradas;
        
    }
//sobreescritura metodo toString
    @Override
    public String toString(){
        
        return "Marca: " + marca + " // " + "Modelo: " + modelo + " // " + "Cilindrada: "+ cilindradas + "c" + "//" + " Precio: $"+precio;
        
    }
}
