/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Input;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author DANYAV
 */
 class DemoInput {
     public static void main(String[] args) throws Exception {
         System.out.println("Masukkan Karakter");
         char ch;
         InputStreamReader isr = new InputStreamReader(System.in);
         BufferedReader br = new BufferedReader(isr);
         ch = (char) br.read();
         System.out.println("Karakter yang dimasukkan adalah \'" + ch + "\'");
         
     }
     
    
}
