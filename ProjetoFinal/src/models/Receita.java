package models;

public class Receita {

    private double valorTotalVendido;
    private int totalVendas;
    private double valorRealRecebido;

    
    public double getValorTotalVendido() {
        return valorTotalVendido;
    }

  
    public void setValorTotalVendido(double valorTotalVendido) {
        this.valorTotalVendido = valorTotalVendido;
    }

    
    public int getTotalVendas() {
        return totalVendas;
    }

   
    public void setTotalVendas(int totalVendas) {
        this.totalVendas = totalVendas;
    }

   
    public double getValorRealRecebido() {
        return valorRealRecebido;
    }

    
    public void setValorRealRecebido(double valorRealRecebido) {
        this.valorRealRecebido = valorRealRecebido;
    }
    
}
