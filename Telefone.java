public class Telefone{
    private String Ddd;
    private String NumeroTelefone;
  
    public Telefone(String Ddd, String NumeroTelefone){
      this.Ddd = Ddd;
      this.NumeroTelefone = NumeroTelefone;
    }
  
    public String getDdd() {
      return Ddd;
  }
    public void setddd(String Ddd) {
      this.Ddd = Ddd;
  }
  
    public String getNumeroTelefone() {
      return NumeroTelefone;
  }
  
  

    public void setNumeroTelefone(String NumeroTelefone) {
    this.NumeroTelefone = NumeroTelefone;
  }
  
  

    @Override
  public String toString() {
      return "DDD: " + Ddd + ", Telefone: " + NumeroTelefone;
  }
  }