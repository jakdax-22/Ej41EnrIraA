package ej41enriraa;
import java.util.*;
import java.io.*;


/**
 *
 * @author enriq
 */
public class Ej41EnrIraA {

    public static void main(String[] args) {
        boolean repite = false;
        do{
            try {
                InputStreamReader via=new InputStreamReader(System.in);
                BufferedReader teclado=new BufferedReader(via);

                System.out.println ("Dime el nombre del primer empleado");
                String nombre = teclado.readLine();
                System.out.println ("Dime la edad del primer empleado");
                String edads = teclado.readLine();
                int edad = Integer.parseInt(edads);
                System.out.println("Dime el sueldo del primer empleado");
                String sueldos = teclado.readLine();
                int sueldo = Integer.parseInt(sueldos);
                EmpNomA e1 = new EmpNomA (nombre,edad,sueldo);

                System.out.println ("Dime el nombre del segundo empleado");
                nombre = teclado.readLine();
                System.out.println ("Dime la edad del segundo empleado");
                edads = teclado.readLine();
                edad = Integer.parseInt(edads);
                System.out.println("Dime el sueldo del segundo empleado");
                sueldos = teclado.readLine();
                sueldo = Integer.parseInt(sueldos);
                EmpNomA e2 = new EmpNomA (nombre,edad,sueldo);
                System.out.println("El empleado más joven es:");
                System.out.println(e1.compararEmpleados(e1,e2));
            } 
            catch (NumberFormatException nfe){
                System.out.println("Todos los datos deben de ser numéricos");
                repite = true;
            } 
            catch (NomException ne){
                System.out.println(ne.getMessage());
                repite = true;
            } 
            catch (EdadException ee){
                System.out.println(ee.getMessage());
                repite = true;
            } 
            catch (IOException ex) {
                System.out.println(ex.getMessage());
                repite = true;
            }
        }
        while (repite);    
    }
    
}
