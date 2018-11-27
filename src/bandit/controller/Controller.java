/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bandit.controller;

import bandit.model.Application;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import bandit.View.Fenster;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author nobody
 */
public class Controller implements ActionListener {

    private Application model;
    private Fenster view;

    public Controller(Application model, Fenster view) {
        this.view = view;
        this.model = model;
    }

    public void registerEvents() {
        view.getBtnStart().addActionListener(this);
        view.getBtnStopp().addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object src = e.getSource();

        if (src == view.getBtnStart()) {
            try {
                model.setStart();
            } catch (InterruptedException ex) {
                Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
        if (src == view.getBtnStopp()) {
            model.setStopp();

        }
    }
}
