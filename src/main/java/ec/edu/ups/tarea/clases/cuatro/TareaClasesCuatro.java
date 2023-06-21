/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ec.edu.ups.tarea.clases.cuatro;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author LENOVO
 */
public class TareaClasesCuatro {

    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa la cadena de signos: ");
        String cadena = scanner.nextLine();
        
        Stack<Character> pila = new Stack<>();
        
        for (int i = 0; i < cadena.length(); i++) {
            char caracter = cadena.charAt(i);
            
            if (caracter == '{' || caracter == '[' || caracter == '(') {
                pila.push(caracter);
                imprimirPila(pila);
            } else if (caracter == '}' || caracter == ']' || caracter == ')') {
                if (!pila.isEmpty()) {
                    char ultimoCaracter = pila.peek();
                    if ((caracter == '}' && ultimoCaracter == '{') ||
                        (caracter == ']' && ultimoCaracter == '[') ||
                        (caracter == ')' && ultimoCaracter == '(')) {
                        pila.pop();
                        imprimirPila(pila);
                    } else {
                        System.out.println("La cadena no está balanceada");
                        return;
                    }
                } else {
                    System.out.println("La cadena no está balanceada");
                    return;
                }
            }
        }
        
        if (pila.isEmpty()) {
            System.out.println("La cadena está balanceada");
        } else {
            System.out.println("La cadena no está balanceada");
        }
    }
    
    public static void imprimirPila(Stack<Character> pila) {
        for (char c : pila) {
            System.out.print(c + ", ");
        }
        System.out.println();
    }
    }
         
    
    
    
    

        
    
        
    
        
        
    
