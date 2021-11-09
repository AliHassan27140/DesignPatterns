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
public class Passenger implements Observer {

    Date myDepartureTime;
    
    
    @Override
    public void update(Subject s) {
        System.out.println("Passenger Notified with the change");
        if(myDepartureTime != ((Daeawoo)s).getDepartureTime())
            System.out.println("Passenger Notified with the change");
    }
    
    
}
