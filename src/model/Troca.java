package model;

import javax.swing.JPanel;

public class Troca {
    
      protected JPanel raiz;
      protected JPanel ramos;
      
      public Troca(JPanel raiz, JPanel ramos){
          this.raiz = raiz;
          this.ramos = ramos;
          this.raiz.removeAll();
          this.raiz.revalidate();
          this.raiz.repaint();
          
          this.raiz.add(this.ramos);
          this.raiz.revalidate();
          this.raiz.repaint();
      
      }
    
}
