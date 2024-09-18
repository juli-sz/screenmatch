public class Pelicula {
    public String nombre;
    public String genero;
    public String incluidoEn; //para que tipo de plan esta incluida la pelicula
    public double duracion;
    public int fechaDeLanzamiento;
    public double puntuacion;
    public Pelicula( String nombre, String genero, String plan, double duracion, int anioEstreno, double puntuacion) {
        this.nombre = nombre;
        this.genero = genero;
        this.incluidoEn = plan;
        this.duracion = duracion;
        this.fechaDeLanzamiento = anioEstreno;
        this.puntuacion = puntuacion;
    }


}
