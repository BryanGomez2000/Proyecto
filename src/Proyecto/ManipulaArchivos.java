package Proyecto;



import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ManipulaArchivos {
    
    
    public static void guarda(Nodo r, String na) {
        try {
            FileOutputStream fos = new FileOutputStream(na);
            ObjectOutputStream arch = new ObjectOutputStream(fos);
            arch.writeObject(r);
        } catch (FileNotFoundException ex) {
            System.out.println("Archivo no encontrado");
        } catch (Exception ex) {
            System.out.println("Error... " + ex.getClass());
        }
    }
     public static Nodo carga(String na) {
        try {
            FileInputStream fis = new FileInputStream(na);
            ObjectInputStream arch = new ObjectInputStream(fis);

            return (Nodo) arch.readObject();
        } catch (FileNotFoundException ex) {
            System.out.println("No se encontró el archivo");
        } catch (IOException ex) {
            System.out.println("Error... " +ex.getClass());
        } catch (ClassNotFoundException ex) {
            System.out.println("No se pudo leer el archivo");
        }
        return null;
    }
}
