public class Conta{
    private String NumeroConta;
      private String Agencia;
      private double SaldoAtual;
      private Cliente Cliente;
    
      public Conta(String NumeroConta, String Agencia, double SaldoAtual,Cliente Cliente) {
          this.NumeroConta = NumeroConta;
          this.Agencia = Agencia;
          this.SaldoAtual = SaldoAtual;
          this.Cliente = Cliente;
  
      }
  
      public String getNumeroConta() {
          return NumeroConta;
      }
  
      public void setNumeroConta(String NumeroConta) {
          this.NumeroConta = NumeroConta;
      }
  
      public String getAgencia() {
          return Agencia;
      }
  
      public void setAgencia(String Agencia) {
          this.Agencia = Agencia;
      }
  
      public double getSaldoAtual() {
          return SaldoAtual;
      }
  
      public void setSaldoAtual(double SaldoAtual) {
          this.SaldoAtual = SaldoAtual;
      }

      public Cliente getCliente() {
          return Cliente;
      }
  
    public void Extrato(){
      System.out.println("Extrato da conta " + NumeroConta + " - Agência: " + Agencia);
          System.out.println("Saldo atual: R$" + SaldoAtual);
    }
  
    public void Deposito(Double Quantia){
      SaldoAtual += Quantia;
      System.out.println("Você realizou um depósito de " +Quantia + "na sua conta");
      System.out.println("Saldo atual é de : "+SaldoAtual);
    }
  
    public void Saque(Double Quantia){
      
      if (Quantia <= SaldoAtual){
        SaldoAtual -= Quantia;
        System.out.println("Um saque de "+Quantia + "foi feito na sua conta");
        System.out.println("Saldo atual é de : "+SaldoAtual);
    }else{
        System.out.println("Saque indisponivel, tente retirar menos que a quantia que você possui na sua conta que é de :" +SaldoAtual);
      }
      
      }
    @Override
      public String toString() {
          return "Conta: " + NumeroConta + ", Agência: " + Agencia + ", Saldo: " + SaldoAtual + ", Cliente: " + Cliente;
      }
    }
    
