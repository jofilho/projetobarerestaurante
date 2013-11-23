
package projetofinal;

public class Funcionario {

   private String nome;
   private String sobrenome;
   private String telefone;
   private String cpf; 
   private String rg;
   private double salario;
   private double valeTransporte;
   private double valeRefeicao;
   
    public Funcionario(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }
   
    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    
     public double getValeRefeicao() {
        return valeRefeicao;
    }

    public void setValeRefeicao(double valeRefeicao) {
        this.valeRefeicao = valeRefeicao;
    }

    public double getValeTransporte() {
        return valeTransporte;
    }

    public void setValeTransporte(double valeTransporte) {
        this.valeTransporte = valeTransporte;
    }
   
    public double calculaFerias(){
        return this.getSalario()*0.11;
    }
    
    public double calculaDecimoTerceiro(){
        return this.getSalario()*0.08;
    }
    
    public double calculaFGTS(){
        return this.getSalario()*0.09;
    }
    
    public double calculaMultaRecisao(){
        return this.getSalario()*0.09;
    }
    
    public double calculaINSS(){
        return this.getSalario()*0.29;
    }
    
    public double calculaEntidades(){
        return this.getSalario()*0.02;
    }
    
    public double calculaSalarioEducacao(){
        return this.getSalario()*0.03;
    }
    
    public double totalEncargos(){
        return calculaFerias() + calculaDecimoTerceiro() + calculaFGTS() + calculaMultaRecisao() + calculaMultaRecisao() + calculaINSS() + calculaEntidades() + calculaSalarioEducacao(); 
    }
    
    public double descontoFGTS(){
        if (salario <= 375.00){
            return 7.65;
        }
        else if(salario < 410.00){
            return 8.65;
        }
        else if(salario <= 625.00){
            return 9.00;
        }
        else{
            return 11.00;
        }
    }
    
    public double salarioLiquido(){
        return salario - descontoFGTS() + valeTransporte + valeRefeicao;
    }
    
    public double custoTotalEmpresa(){
        return salarioLiquido() + totalEncargos();
    }
}
