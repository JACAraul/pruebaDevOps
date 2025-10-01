/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tareadevops;

import java.util.Scanner;

/**
 *
 * @author daw2
 */
public class TareaDevops {

    public static void main(String[] args) {
      
        Scanner teclado = new Scanner(System.in);
        int opcion;
        
        do{
             System.out.println("Puedes hacer estas funcionalidades con las tareas");
             System.out.println("\n1- Registrar nueva tarea");
             System.out.println("\n2- Marcar una tarea completada");
             System.out.println("\n3- Listar las tareas");
             System.out.println("\n4- Eliminar tarea");
             
             System.out.println("Cual quieres hacer?");
             opcion = teclado.nextInt();
             
             switch(opcion){
                 case 1:
                     
             }
        }while(opcion != 4);
       
        
        
        
    }
}
