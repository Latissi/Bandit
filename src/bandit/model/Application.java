/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bandit.model;

import bandit.Utility.OhmLogger;
import static java.lang.Thread.State.TERMINATED;
import java.util.Observable;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Fabian
 */
public class Application extends Observable implements Runnable {

    private Thread thd1;
    private Thread thd2;
    private Thread thd3;
    private int[] zahlen;
    private boolean gestoppt;
    private static Logger lg;
    

    public Application() {
        zahlen = new int[3];
        zahlen[0] = 0;
        zahlen[1] = 0;
        zahlen[2] = 0;
        thd1 = null;
        thd2 = null;
        thd3 = null;
        gestoppt = false;
        lg = OhmLogger.getLogger();

    }

    public void starteBerechnung() throws InterruptedException {
        if (thd1 == null || thd1.getState() == TERMINATED) {
            thd1 = new Thread(this);
            thd1.start();
            lg.info("thd1 initialisiert");
        }
        if (thd2 == null || thd2.getState() == TERMINATED){
            thd2 = new Thread(this);
            thd2.start();
            lg.info("thd2 initialisiert");
        }
        if(thd3 == null || thd3.getState() == TERMINATED){
            thd3 = new Thread(this);
            thd3.start();
            lg.info("thd3 initialisiert");
        }
    }

    @Override
    public void run() {
        for(int i = 0; i < 25; i++)
        {
            berechneZahl();
            try {
                Thread.sleep((long) (i*i));
            } catch (InterruptedException ix) {
                System.err.println(ix);
                lg.severe("InterrupteException");
            }
            this.setChanged();
            this.notifyObservers();
        }
        try {
            checkWin();
        } catch (InterruptedException ex) {
            Logger.getLogger(Application.class.getName()).log(Level.SEVERE, null, ex);
            lg.severe("InterruptedException");
        }
    }

    private synchronized void berechneZahl() {
        int zahl = 0;
        if (Thread.currentThread() == thd1)
            zahl = 0;
        else if (Thread.currentThread() == thd2)
            zahl = 1;
        else if (Thread.currentThread() == thd3)
            zahl = 2;
        zahlen[zahl] = 1 + (int) (Math.random() * 6);
        while (gestoppt) {
            try {
                lg.info(Thread.currentThread().getName() + " wartet");
                wait();
                lg.info(Thread.currentThread().getName() + " läuft weiter!");
            } catch (InterruptedException ex) {
                Logger.getLogger(Application.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
        
    }


    public int[] getZahlen() {
        return this.zahlen;
    }

    public void setStopp() {
        gestoppt = true;
    }

    public synchronized void setStart() throws InterruptedException {
        gestoppt = false;
        if (! threadsRunning()) {
            starteBerechnung();
        }
        else {
            notifyAll();
            lg.info("Notify All Threads");
        }

    }
    
    private boolean threadsRunning()
    {
        if(thd1 == null || thd2 == null || thd3 == null)
            return false;
        else if(thd1.getState() == TERMINATED || thd2.getState() == TERMINATED 
                || thd3.getState() == TERMINATED)
            return false;
        else 
            return true;
    }
    
    private void checkWin() throws InterruptedException{

        if (Thread.currentThread() == thd3){
            thd1.join();
            thd2.join();
            System.out.println("Spiel beendet.");
            System.out.format("Ergebnis: %d-%d-%d\n",zahlen[0],zahlen[1],zahlen[2]);
            if(gewonnen())
                System.out.println("Glückwunsch! Sie haben gewonnen!");
            else
                System.out.println("Verloren...Versuchen Sie es noch einmal!\n");
        }
    }
    
    private boolean gewonnen()
    {
        if(zahlen[0] == zahlen[1] && zahlen[0] == zahlen[2])
            return true;
        else
            return false;
    }

}
