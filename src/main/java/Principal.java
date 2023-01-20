import Managers.AlumnoManager;
import Managers.PrincipalManager;

public class Principal {
    public static void main(String[] args) {

        PrincipalManager.setup();

        AlumnoManager alumnoManager = new AlumnoManager();
        alumnoManager.insertarAlumno();
        alumnoManager.insertarAlumno();
        alumnoManager.listarAlumnos();

        PrincipalManager.exit();
    }
}
