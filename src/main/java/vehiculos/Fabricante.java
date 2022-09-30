package vehiculos;
import java.util.ArrayList;

public class Fabricante {
    
    private String nombre;
    private Pais pais;
    private static ArrayList<Fabricante> fabricantes = new ArrayList<>();
    
    public Fabricante(String nombre, Pais pais){
        this.nombre = nombre;
        this. pais = pais;
        fabricantes.add(this);
    }
    
    public static Fabricante fabricaMayorVentas(){
        Fabricante fabricante = null;
        int ventas = 0;
        for (Fabricante f: fabricantes){
            int contador = 0;
            for (Vehiculo v: Vehiculo.getVehiculos()){
                if(v.getFabricante()==f){
                    contador+=v.getPrecio();
                }
            }
            if (contador>ventas){
                ventas = contador;
                fabricante = f;
            }
        }
        return fabricante;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public void setPais(Pais pais){
        this.pais = pais;
    }
    
    public Pais getPais(){
        return pais;
    }
    
}
