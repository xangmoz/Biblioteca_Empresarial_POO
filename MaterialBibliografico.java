public abstract class  MaterialBibliografico {// se aplica clase abstracta
    String titulo;
    String autor;
    int anioPublicacion;
    
    public abstract String obtenerTipo(); // se investigo acerca de la clase abstracta y se implemtenta para el tipo de material

    public String getTitulo(){// se investiga acerca de strings publicas para el uso en el lector
        return titulo;}


    public MaterialBibliografico(String titulo, String autor, int anioPublicacion){
        this.titulo = titulo;
        this.autor = autor;
        this.anioPublicacion = anioPublicacion;
    }
    
    public void mostrarInformacion(){
        System.out.println(" estos son los datos del libro: " + this.titulo + this.autor + this.anioPublicacion  );
    }
}