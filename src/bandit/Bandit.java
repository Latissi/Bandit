/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bandit;

import bandit.View.Fenster;
import bandit.controller.Adapter;
import bandit.controller.Controller;
import bandit.model.Application;

/**
 * Builder Class
 * @author nobody
 */
public class Bandit
{
  public Bandit()
  {
      Fenster frm = new Fenster();
      Application app = new Application();
      Adapter adp = new Adapter(app, frm);
      Controller cntrl = new Controller(app,frm);
      adp.registerEvents();
      cntrl.registerEvents();
      frm.setVisible(true);
      

  }

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) 
  {
    new Bandit();
  }
}
