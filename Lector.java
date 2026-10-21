public class Lector {
    String nombre;
    String direccion;
    int telefono;
    String email;
    
    public Lector (String nombre, String direccion, int telefono, String email ){ //Cosntructor de los datos del lector
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.email = email;
        
        
    }
    
    public void reservar(MaterialBibliografico material){
        System.out.println(nombre + " reservo: " + material.getTitulo());// trae la informacion de la super clase 
    }
     public void entregar(MaterialBibliografico material){
        System.out.println(nombre + " entrego: " + material.getTitulo());// trae la informacion de la super clase
     }
    public void mostrarInformacion(){// imprime la informacion del lector
        System.out.println("Nombre del Lector: " + this.nombre);
        System.out.println("Direccion del Lector: " + this.direccion);
        System.out.println("Telefono del Lector: " + this.telefono);
        System.out.println("Email del Lector: " + this.email);
    }
    
    
}