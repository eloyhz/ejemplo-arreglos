public class Grupo
{
    private String nomMateria;
    private Estudiante[] estudiantes;
    
    public Grupo(int totalEstudiantes, String nomMateria)
    {
        estudiantes = new Estudiante[totalEstudiantes];
        
        this.nomMateria = nomMateria;
        
    }
    
    /**
     * Busca un estudiante por medio de su clave.
     * @param claveEstudiante Parametro que representa la clave del estudiante a buscar.
     * @return Regresa la posicion del estudiante en el arreglo o -1 si no existe.
     */
    private int buscarEstudiante(int claveEstudiante)
    {
        for(int i = 0; i < estudiantes.length; i++)   {
            if (estudiantes[i] != null && estudiantes[i].dimeClave() == claveEstudiante) {
                return i;
            }
        }
        return -1;
    }
    
    /**
     * Busca un espacio disponible en el arreglo.
     * @return Regresa la primer posicion nula dentro del arreglo o -1 si está lleno.
     */
    private int buscarEspacioDisponible()
    {
        for (int i = 0; i < estudiantes.length; i++)
        {
            if (estudiantes[i] == null)    {
                return i;
            }
        }
        return -1;
    }
    
    /**
     * Inscribe un estudiante nuevo en el grupo.
     * @param unEstudiante Es el objeto estudiante a inscribir en el grupo.
     * @return Regresa verdadero si el estudiante fue inscrito o falso en caso de que
     *          no se pudiera inscribir.
     */
    public boolean inscribir(Estudiante unEstudiante)
    {
        int existe = this.buscarEstudiante(unEstudiante.dimeClave());
        if (existe != -1) { 
            return false; // el estudiante ya está inscrito
        }
        int posDisponible  = this.buscarEspacioDisponible();
        if (posDisponible == -1) {
            return false;   // el arreglo está lleno
        }
        estudiantes[posDisponible] = unEstudiante; // inscribe al estudiante
        return true;  // el estudiante fue inscrito
    }
    
    /**
     * Realiza la baja de un estudiante del grupo.
     * @param claveEstudiante Es la clave del estudiante que será dado de baja.
     * @return Regresa verdadero en caso de que el estudiante haya sido dado de baja 
     *  correctamente o falso en caso de que el estudiante no fue dado de baja.
     */
    public boolean darBaja(int claveEstudiante)
    {
        int posEstudiante = this.buscarEstudiante(claveEstudiante);
        if (posEstudiante != -1)    {  // si existe el estudiante
            estudiantes[posEstudiante] = null;
            return true;
        }
        return false;
    }
}


