
package controller;

import java.util.ArrayList;
import models.Funcionario;

public class ControleFuncionario {
    
    private ArrayList<Funcionario> listaFuncionarios;
    
    public ControleFuncionario() {
        this.listaFuncionarios = new ArrayList<Funcionario>();
    }
    
    public void adicionar(Funcionario umFuncionario) {
        listaFuncionarios.add(umFuncionario);
    }
    
   public void remover(Funcionario umFuncionario) {
        listaFuncionarios.remove(umFuncionario);
    }
    
   public Funcionario pesquisar(String nome){
       for(Funcionario umNome: listaFuncionarios){
           if(umNome.getNome().equalsIgnoreCase(nome)) 
               return umNome;
       }
       return null;
   }
}
