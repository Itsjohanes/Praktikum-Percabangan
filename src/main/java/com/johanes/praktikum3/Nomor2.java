/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.johanes.praktikum3;

import java.util.*;
/**
 *
 * @author Johannes Alexander Putra,CSCU.
 */
public class Nomor2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double T = sc.nextDouble();
        double fungsi =  (3 * T * T) + 5 * T + 200;
        double sebenarnya = sc.nextDouble();
        if(sebenarnya - fungsi > 0.5 && sebenarnya > fungsi){
            System.out.println("di atas estimasi");
        }else if(sebenarnya < fungsi && fungsi-sebenarnya > 0.5){
            System.out.println("di bawah estimasi");
        }else if(Math.abs(sebenarnya-fungsi) <= 0.5){
            System.out.println("Sesuai Estimasi");
        }
        
    }
    
}
