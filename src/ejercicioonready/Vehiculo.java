package ejercicioonready;

public abstract class Vehiculo implements Comparable<Vehiculo>{
    
    protected int precio;
    protected String marca;
    protected String modelo;
    
public Vehiculo(String marca, String modelo,int precio){

    this.precio = precio;
    this.marca = marca;
    this.modelo = modelo;

    }

    public String getMarca(){
        
        return marca;
    
    }
    
    public String getModelo(){
        
        return modelo;
        
    }
    
    public int getPrecio(){
        
        return precio;
        
    }
    
    @Override
    public int compareTo(Vehiculo t) {
        if (t.getPrecio() < this.getPrecio()) {
            return 1;
        } else if (t.getPrecio() > this.getPrecio()) {
            return -1;
        } else {
            return 0;
        }
        
    }
}
    
