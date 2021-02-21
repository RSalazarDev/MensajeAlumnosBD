package modelo;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class Utilidades {

    public static ArrayList<Alumnos> getAlumnos(String grupo) throws FileNotFoundException, IOException{
          EntityManagerFactory factory = Persistence.createEntityManagerFactory("com.mycompany_MensajeAlumnos_war_1.0-SNAPSHOTPU");
        EntityManager manager = factory.createEntityManager();
        String sql = "SELECT * FROM alumnos where grupo = " + "'"+grupo+"'";
        Query q = manager.createNativeQuery(sql, Alumnos.class);
        ArrayList<Alumnos> alumnos = (ArrayList<Alumnos>) q.getResultList();

        return alumnos;
    }
}
