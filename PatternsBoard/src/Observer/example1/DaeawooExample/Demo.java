/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Observer.example1.DaeawooExample;

import java.util.Date;

/**
 *
 * @author fa18-bse-105
 */
public class Demo {
    public static void main (String arg[]){
        Daeawoo dawoo = new Daeawoo();
         
        Passenger ali = new Passenger();
        
        dawoo.setDepartureTime(new Date());
        
        dawoo.attach(ali);
    }
    
}
