/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package schule.aufgabe;

import java.util.HashMap;

/**
 *
 * @author henri
 */
public class App {
    private static HashMap technik;
    
    public static void main(String[] args) throws Exception{
        technik = new HashMap();
        
        Boxen b1 = new Boxen(20,"Eine Box", 10, "Kaputt");
        
        getTechnik().put(b1, 10);
        
        System.out.println(getTechnik().get(b1));
        
        getTechnik().put(b1, getTechnik().get(b1));
        
        System.out.println(getTechnik().get(b1));
    
        }
    
        
        public static void setTechnik(HashMap technik){
            App.technik = technik;
        }
        
        public static HashMap getTechnik(){
            return technik;
        }
    }
