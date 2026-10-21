public class RecursoDigital extends MaterialBibliografico{
    String formato;
    Double tamañoMB;
    @Override // se investiga acerca del metodo override para sobre escribir de la super clase en este caso con recurso digital
    public String obtenerTipo(){
        return "Recurso digital";
    }
   
    public RecursoDigital (String titulo, String autor,int anioPublicacion, String formato, Double tamañoMB){
        super(titulo, autor, anioPublicacion);
        this.formato = formato;
        this.tamañoMB = tamañoMB;
    }
    
    public void mostrarInformacion(){
        System.out.println("Titulo del material: " + this.titulo);
        System.out.println("Autor del material: " + this.autor);
        System.out.println("Año de publicacion del material: " + this.anioPublicacion);}

    public void descargar(){
    System.out.println("Descargando " + this.titulo + " en formato " + this.formato);}
}