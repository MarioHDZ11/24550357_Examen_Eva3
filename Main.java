/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg24550357_examen3;

import java.util.Scanner;

/**
 * // 85 90 78 88 92
 * @author invitado
 */
public class Main {
    public static Scanner cap = new Scanner(System.in);

    public static int NumEst ;
    public static final double CALIF[] = new double[NumEst];
    public static double PROM ;
    public static double CALIFMAY ; 
    public static double CALIFA ; 
    public static double CALIFB ; 
    
    public static void main(String[] args) {
        System.out.println("Ingrese la cantidad de alumnos: ");
        NumEst = cap.nextInt();
        double calif;
        

            for(int i = 1; i <= NumEst ;){
                System.out.println("Ingrese a calificacion del estudiante #" + i );
                calif = cap.nextInt();
                if(calif > 0 && calif <=100){
                    for (int j = 0; j < CALIF.length;) {
                        CALIF[j] = calif;
                        j++;
                    }
                    i++;
                }else
                    i = i;
            
        }
        calcularPromedio("Promedio de calificaciones: ");
        contarCalificacionesMayores("Número de calificaciones mayores o iguales al promedio: ");
        obtenerCalificacionMasAlta("Calificación más alta: ");
        obtenerCalificacionMasBaja("Calificación más baja: ");
        
    }
    public static void calcularPromedio(String mensaje){
        System.out.println(mensaje);
        double acum = 0;
        for (int j = 0; j < CALIF.length; j++){
            acum = acum + CALIF[j];
        }
        PROM = (NumEst*acum)/100 ;
        System.out.println(PROM); 
    }
    public static void contarCalificacionesMayores(String mensaje){
        System.out.println(mensaje);
        double acum = 0;
        for (int j = 0; j < CALIF.length; j++){
            if(CALIF[j] > 69){
              acum = acum + 1;
            }
        }
        System.out.println(CALIFMAY); 
        
        
    }
    public static void obtenerCalificacionMasAlta(String mensaje){
        System.out.println(mensaje);
        for (int j = 0; j < CALIF.length; j++){
            double acum = 0;
            if(acum < CALIF[j]){
                CALIFA = acum;
            }
        }
        System.out.println(CALIFA); 
    }
    public static void obtenerCalificacionMasBaja(String mensaje){
        System.out.println(mensaje);
        for (int j = 0; j < CALIF.length; j++){
            double acum = 100;
            if(acum > CALIF[j]){
                CALIFB = acum;
            }
        }
        System.out.println(CALIFB); 
    }
}
