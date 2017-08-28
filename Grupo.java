public class Grupo
{
    private String nomMateria;
    private Estudiante[] estudiantes;
    
    public Grupo(int totalEstudiantes, String nomMateria)
    {
        estudiantes = new Estudiante[totalEstudiantes];
        this.nomMateria = nomMateria;
    }
    
    // Terminar este método de tarea
    public void inscribir(Estudiante unEstudiante)
    {
        if (estudiantes[0] == null) {
            estudiantes[0] = unEstudiante;
        }
    }
    
    // Terminar este método de tarea
    public void darBaja(int claveEstudiante)
    {
        // Buscar el estudiante con la clave dada
        // y asignarle un null
    }
}


