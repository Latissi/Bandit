/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bandit.controller;

import bandit.model.Application;
import java.util.Observable;
import java.util.Observer;
import bandit.View.Fenster;


/**
 *
 * @author nobody
 */
public class Adapter implements Observer {

    private Application model;
    private Fenster view;

    public Adapter(Application model, Fenster view) {
        this.view = view;
        this.model = model;
    }

    public void registerEvents() {
        this.model.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        String[] zahlen = new String[3];
        for (int i = 0; i<3; i++){
            zahlen[i] = Integer.toString(model.getZahlen()[i]);
        }
        view.getLblNumber1().setText(zahlen[0]);
        view.getLblNumber2().setText(zahlen[1]);
        view.getLblNumber3().setText(zahlen[2]);
    }
}
