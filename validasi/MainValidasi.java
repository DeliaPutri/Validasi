/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package validasi;

/**
 *
 * @author ASUS
 */

import java.util.Scanner; 

public class MainValidasi {
    public static void main(String[] args) {
        
        Validasi<String> Stack = new Validasi<>(15);
        String input = "f(x)=(x-3)(x+9)";
        Scanner scn = new Scanner(input);
        
        scn.useDelimiter("");
        
        for (int i = 0; i < 15; i++) {
            String karakter = scn.next();
            
            //pengecekan tanda kurung
            if(karakter.equals("(")){
                Stack.push("(");
            }else if (karakter.equals(")")) {
                Stack.pop();
            }
            }   
        //pengecekan valid atau tidak
    if(Stack.isEmpty()) {
           System.out.println("VALID!");
        } else {
           System.out.println("IT'S NOT VALID");  
        }
    } 
}
    
    

