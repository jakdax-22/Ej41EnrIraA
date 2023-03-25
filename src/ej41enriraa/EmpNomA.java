package ej41enriraa;

import java.util.regex.Pattern;


public class EmpNomA {
    private String nombre;
    private int edad, sueldo;


    public EmpNomA () {

    }

    public EmpNomA (String nombre, int edad, int sueldo) throws NomException,EdadException{
            this.nombre = validarNombre(nombre);
            this.edad = validarEdad (edad);            
            this.sueldo = sueldo;
    }
        
        /**
         * 
         * @return 
         */

    public String getNombre () {
        return this.nombre;
    }


    public int getEdad () {
        return this.edad;
    }

    public int getSueldo () {
        return this.sueldo;
    }    
    
    public void setNombre (String nombre){
        try{
            this.nombre = validarNombre(nombre);
            }
        catch (NomException NE){
            System.out.println(NE.getMessage());
            }
    }

    public void setEdad (int edad){
        try{
            this.edad = validarEdad(edad);
        }
        catch (EdadException EE){
            System.out.println(EE.getMessage());
        }
    }

    public void setSueldo (int sueldo){
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        return "EmpNomA{" + "nombre=" + nombre + ", edad=" + edad + ", sueldo=" + sueldo + '}';
    }

    public String compararEmpleados (EmpNomA a, EmpNomA b){
        if (a.getEdad () > b.getEdad ())
            return b.toString();
        
        else if (a.getEdad () < b.getEdad ())
            return a.toString();
        
        else
            return (a.toString()+ "\n" + b.toString());
    }
    
    public static int validarEdad(int edad) throws EdadException{
        if (edad < 18 || edad > 65){
             throw  new EdadException ("La edad debe de estar entre 18 y 65");            
        }
        return edad;

            }

    public static String validarNombre(String nombre) throws NomException {
               if (!Pattern.matches("[A-Z][a-z]{1,}", nombre)){
                    throw  new NomException ("El nombre debe comenzar por mayúscula, seguido de minúsculas");     
               }
              return nombre;
    }
}

