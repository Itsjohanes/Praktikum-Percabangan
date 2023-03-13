/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.johanes.praktikum3;

import static java.lang.Math.abs;
import java.util.Scanner;
/**
 *
 * @author Johannes Alexander Putra,CSCU.
 */
public class Nomor1 {
    public static void main(String[] args){
    Scanner sc = new  Scanner (System.in);
    String kata = sc.nextLine();
    char hurufDepan = kata.charAt(0);
    char hurufTerakhir = kata.charAt(kata.length()-1);
    int jarak =  hurufTerakhir - hurufDepan;
    
    
    if(!kata.equals(kata.toLowerCase())){
        System.out.println("Program mengandung huruf besar");
    }else{
         if(hurufDepan == hurufTerakhir)
    {
        System.out.println("magical");
    }else if(jarak == 1){
        System.out.println("magical");
    }else if(jarak == -1){
        System.out.println("magical");
    }else{
        System.out.println("tidak magical");
    }
    }
   
    
    
    }
    
    
    
    
}
