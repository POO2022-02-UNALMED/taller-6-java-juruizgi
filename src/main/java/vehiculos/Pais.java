package vehiculos;
import java.util.ArrayList;

public class Pais {
    
    private String nombre;
    private static ArrayList<Pais> paises = new ArrayList<>();
    
    public Pais(String nombre){
        this.nombre = nombre;
        paises.add(this);
    }
    
    public static Pais paisMasVendedor(){
        Pais pais=null;
        int contador=0;
        for(Pais p: paises){
            int c=0;
            for(Vehiculo v: Vehiculo.getVehiculos()){
                if(v.getFabricante().getPais()==p){
                    c++;
                }
            }
            if(c>contador){
                contador=c;
                pais = p;
            }
        }
        return pais;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public String getNombre(){
        return nombre;
    }
    
}
