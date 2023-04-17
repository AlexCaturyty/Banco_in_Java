public class Endereco{
    private String Cep;
    private String Logradouro;
    private String Numero;
  
    public Endereco(String Cep, String Logradouro, String Numero){
      this.Cep = Cep;
      this.Logradouro = Logradouro;
      this.Numero = Numero;
    }
  
    public String getCep() {
      return Cep;
  }
    public void setCep(String Cep){
      this.Cep = Cep;
    }
    public String getLogradouro() {
      return Logradouro;
  }
    public void setLogradouro(String Logradouro){
      this.Logradouro = Logradouro;
    }
    public String getNumero() {
      return Numero;
  }
    public void setNumero(String Numero){
      this.Numero = Numero;
    }
    @Override
      public String toString() {
          return "CEP: " + Cep + ", Logradouro: " + Logradouro + ", Número: " + Numero;}
  }
  