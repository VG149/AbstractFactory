/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author FATEC ZONA LESTE
 */
public class quadrado implements figura_geometrica {
    public int lado;

    public int getLado() {
        return lado;
    }

    public void setLado(int lado) {
        this.lado = lado;
    }

    @Override
    public String getNomeFigura() {
        return "quadrado"; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getArea() {
        //int area = 0;
        //area = lado*lado;
        //return area;
        return lado*lado; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getPerimetro() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
