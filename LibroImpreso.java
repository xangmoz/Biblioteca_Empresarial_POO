public class LibroImpreso extends MaterialBibliografico{
    int numeroPaginas;
    String isbn;
    @Override // en esta clase tambien usamos override como en la anterior en este caso con libro impreso
    public String obtenerTipo(){
        return "Libro Impreso";
    }
    
    public LibroImpreso (String titulo,String autor,int anioPublicacion, int numeroPaginas, String isbn){
        super(titulo, autor, anioPublicacion);
        this.numeroPaginas = numeroPaginas;
        this.isbn = isbn;
        
    }
    
    public void mostrarInformacion(){
       System.out.println("Titulo del material: " + this.titulo);
        System.out.println("Autor del material: " + this.autor);
        System.out.println("Año de publicacion del material: " + this.anioPublicacion);}

    public void abrirLibro(){
        System.out.println("Abriendo el libro: " + this.titulo);}
}


