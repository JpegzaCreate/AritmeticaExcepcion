/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import static Aritmetica.Aritmetica.division;

/**
 *
 * @author javip
 */
public class Test {
    
    public static void main(String[] args) {
        
        int res = 0;
    
        try {
            res = division(10,0);
            
        } catch (Exception e){            
            e.printStackTrace(System.out);
            
        } finally {
            System.out.println("Siempre estoy!");
        }
        
    }
        
    }
    
    

