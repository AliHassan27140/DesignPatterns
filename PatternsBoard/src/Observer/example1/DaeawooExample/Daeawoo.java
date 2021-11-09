/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Observer.example1.DaeawooExample;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author fa18-bse-105
 */
public class Daeawoo implements Subject{
    public List<Observer> observers = new ArrayList();
    Date busDepartureTIme;

    public Date getDepartureTime(){
    return this.busDepartureTIme;
    }
    public void setDepartureTime(Date newDepT){
    this.busDepartureTIme = newDepT;
    notifyObserver();
    }
    
    @Override
    public void attach(Observer o) {
        observers.add(o);
    }

    @Override
    public void detach(Observer o ) {
        observers.remove(o);
    }

    @Override
    public void notifyObserver() {
        for(Observer o:observers){
        o.update(this);
        }
        
    }
    
}
