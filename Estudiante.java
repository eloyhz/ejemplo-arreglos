public class Estudiante
{
    private String nombre;
    private int clave;
    
    public Estudiante(int claveIni, String nombreIni)
    {
        nombre = nombreIni;
        clave = claveIni;
    }
    
    /**
     * Accede a la información del estudiante.
     */
    public String dimeDetalles()
    {
        return "Clave: " + clave + ", Nombre: " + nombre;
    }
    
    public int dimeClave()
    {
        return clave;
    }
}