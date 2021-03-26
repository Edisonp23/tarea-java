package actividad_2_class;
import static java.lang.System.in;
import static java.lang.System.out;
import java.util.Scanner;


public class Actividad_2_class {
    
    String nombre= "";
    String apellido= "";
    String genero= "";
    String listagenero="";
    int edad =0;
    String listanombres ="";
    String listaapellido ="";
    int conthombres= 0, contmujeres=0;
    int sumaedad =0;
    double promedio =0;
    String datos =""; //almacenar lo digitado
    
    Scanner ingreso = new Scanner(System.in);  //vble para leer
    public void leer_edad(){
        System.out.println("Ingresar edad");        
        edad = ingreso.nextInt();
        sumaedad = sumaedad +edad;
    }
    
    public void leer(){
        System.out.println("Por favor ingrese el nombre :");
        nombre = ingreso.next();
        listanombres = listanombres +nombre+"\n";

        
        
        System.out.println("Por favor ingrese el apellido :");
        nombre = ingreso.next();
        listaapellido = listaapellido +apellido +"\n";

       
        
        
        System.out.println("Ingresar Genero M masculino o F femenino :");
        genero = ingreso.next();
        listagenero = listagenero + genero + "\n";
        
        if(genero.equals("m") || genero.equals("M") ){
            conthombres = conthombres + 1;
        }
        else if (genero.equals("f") || genero.equals("F")){
                       contmujeres = contmujeres + 1;
             }
        } // fin leer
    
    
    public void mostrar(){
      
        
    }
    
    public void actividad_2_class(){ //contructor por defecto
        
    }
    
    
    public static void main(String[] args) {
     System.out.println("Bienvenido ");
     
     Actividad_2_class leo = new Actividad_2_class();
     
     for(int i=1; i<=5; i++){
         leo.leer();
         leo.leer_edad();
         
         
     
                  
     }
     
     String nombres= leo.listanombres;
      System.out.println("Los nombres ingresados son: " + nombres + "\n");
      
      String gender= leo.listagenero;
      System.out.println("Los generos ingresados son: " + gender);
     
     int prom = leo.sumaedad/5;
      System.out.println("El promedio de edades es: " + prom);
      
      int masc = leo.conthombres;
      System.out.println("La cantidad de hombres ingresados es: " + masc);
      
      int fem = leo.contmujeres;
      System.out.println("La cantidad de mujeres ingresadas es: " + fem);
      
   
    }
    
    
}
