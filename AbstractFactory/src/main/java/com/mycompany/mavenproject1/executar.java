/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;
import java.util.Scanner;
/**
 *
 * @author FATEC ZONA LESTE
 */
public class executar {
    public static void main(String [] args){
        quadrado quadrado = new quadrado();
        Scanner sc = new Scanner(System.in);
        int side = sc.nextInt();
        System.out.println(quadrado.getNomeFigura());
        quadrado.setLado(side);
        System.out.println("lado: " + quadrado.getLado() + "\narea: " + quadrado.getArea());
      
    }
}
