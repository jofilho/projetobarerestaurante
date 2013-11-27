package controller;

import java.util.ArrayList;
import models.Mercadoria;

public class ControleMercadoria {
    
    private ArrayList<Mercadoria> listaMercadorias;

   public ControleMercadoria() {
        this.listaMercadorias = new ArrayList<Mercadoria>();
    }
   
   public void adicionar(Mercadoria umaMercadoria) {
        listaMercadorias.add(umaMercadoria);
    }
    
   public void remover(Mercadoria umaMercadoria) {
        listaMercadorias.remove(umaMercadoria);
    }
   
    
}

