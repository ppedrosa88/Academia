package Managers;

import Entities.Alumno;
import org.hibernate.Session;
import org.hibernate.query.Query;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AlumnoManager {
    public void insertarAlumno() {
        Alumno alumno = createUser();
        Session session = PrincipalManager.sessionFactory.openSession();
        session.beginTransaction();
        session.persist(alumno);
        session.getTransaction().commit();
        session.close();
    }

    public Alumno read(long id) {
        Session session = PrincipalManager.sessionFactory.openSession();
        Alumno alumno = session.get(Alumno.class, id);
        session.close();
        return alumno;
    }

    public void listarAlumnos() {
        List<Alumno> listaAlumnos = new ArrayList<>();
        Session session = PrincipalManager.sessionFactory.openSession();
        session.beginTransaction();
        Query query = session.createQuery("from Alumno");
        listaAlumnos = query.list();
        for(Alumno alumno: listaAlumnos){
            System.out.println(alumno.toString());
        }
    }

    private Alumno createUser() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca nombre: ");
        String name = sc.nextLine();
        System.out.println("Introduzca apellidos: ");
        String surname = sc.nextLine();
        System.out.println("Introduzca curso: ");
        String course = sc.nextLine();
        System.out.println("Introduzca numero de asignaturas: ");
        int subjectsQuantity = sc.nextInt();
        System.out.println("Introduzca edad: ");
        int age = sc.nextInt();

        Alumno alumno = new Alumno(name, surname, course, subjectsQuantity, age);

        return alumno;
    }
}
