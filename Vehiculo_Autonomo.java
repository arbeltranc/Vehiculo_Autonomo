/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vehiculo_autonomo;

/**
 *
 * @author ALEX BELTRAN
 */
import java.util.Scanner;
public class Vehiculo_Autonomo {

public static String Determinar_ambiente_industrial(){
   Scanner objeto=new Scanner(System.in);
   String rugosidad_piso;
   int inclinacion_suelo;
   System.out.println("Ingrese la rugosidad del piso, considere minima, regular y notable"
   + " como sus únicas alternativas de respuesta:");
   rugosidad_piso=objeto.nextLine();
   System.out.println("Ingrese al ángulo de inclinación del suelo:");
   inclinacion_suelo=objeto.nextInt();
   return "La rugosidad del piso en donde el vehículo trabajará será "+rugosidad_piso+
           " con una inclinación de "+inclinacion_suelo+" grados.\n";
}    

   
public static String Identificar_variables(){
   Scanner objeto=new Scanner(System.in);
   int trayectorias;
   int numero_estacion_carga;
   int numero_estacion_descarga;
   System.out.println("Ingrese el número de trayectorias definidas para el vehículo:");
   trayectorias=objeto.nextInt();
   System.out.println("Ingrese el número de estaciones de carga definidas para el vehículo:");
   numero_estacion_carga=objeto.nextInt();
   System.out.println("Ingrese el número de estaciones de descarga definidas para el vehículo:");
   numero_estacion_descarga=objeto.nextInt();
   String enrutamiento_vehiculo="sensor LIDAR";
   return "\nEl vehiculo recorrerrá "+trayectorias+" trayectorias, el enrutamiento será posible"
           + " por un "
           +enrutamiento_vehiculo+".\nEl vehículo tendrá "+numero_estacion_carga+
           " estaciones de carga y "
           +numero_estacion_descarga+" estaciones de descarga.";
}

public static String Especificar_componentes_mecanicos(){
   Scanner objeto=new Scanner(System.in);
   String tipo_bateria="recargable";
   String arduino="RC";
   String tipo_camara="Rexing";
   int cantidad_camara=1;
   String tipo_llantas="poliuretano";
   return "\nEn cuanto a sus componentes mecánicos podemos nombrar:\nEl vehiculo contará con una batería "
           +tipo_bateria+".\nEstará integrado por un arduino "+arduino+".\nEl vehículo contara con "
           +cantidad_camara+" camaras de "+tipo_camara+".\nEl vehículo tendrá llantas de "+tipo_llantas;
}

public static String Integrar_sensores(){
   Scanner objeto=new Scanner(System.in);
   String sensor_infrarrojo="SHARP Y Line Tracking";  
   int cantidad_sensor_infrarrojo=2;
   String sensor_lidar="LITE de Garmen";
   String sensor_ultrasonico="HC-SR04";
   return "\nEl vehículo contará con varios sensores, entre ellos:\n"+cantidad_sensor_infrarrojo+
           " sensor infrarrojo, "+sensor_infrarrojo+".\n1 sensor LIDAR tipo "+sensor_lidar+
           "\n1 sensor ultrasónico "+sensor_ultrasonico;
}

public static String Comprobar_funcionamiento(){
   Scanner objeto=new Scanner(System.in);
   String tipos_movimiento; 
   int duracion_movimiento;
   System.out.println("\nIngrese los tipos de movimientos que realizará el vehículo:");
   tipos_movimiento=objeto.nextLine();
   System.out.println("Ingrese el tiempo en segundos que durará el movimiento realizado:");
   duracion_movimiento=objeto.nextInt();
   return "El vehículo describirá movimientos "+tipos_movimiento+" durante "+duracion_movimiento+" segundos.";
}

    public static void main(String[] args) {
     
    System.out.println(Determinar_ambiente_industrial()); 
    System.out.println(Identificar_variables());
    System.out.println(Especificar_componentes_mecanicos());
    System.out.println(Integrar_sensores());
    System.out.println(Comprobar_funcionamiento());
    
}}

