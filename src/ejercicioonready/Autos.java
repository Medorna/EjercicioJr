package ejercicioonready;


public class Autos extends Vehiculo{

    public Autos(String marca, String modelo, int puertas, int precio) {
        super(marca, modelo, precio);
    }
        
        //sobreescritura metodo toString
        @Override
        public String toString(){
        
            return "Marca: " + marca + " // " + "Modelo: " + modelo +" // " + "Puertas: " + "//" + " Precio: "+ precio+"$";
        }
}
