import java.util.List;

public class Cliente {
    private String Cpf;
    private String Nome;
    private Endereco Endereco;
    private List<Telefone> Telefones;
  
    public Cliente(String Cpf, String Nome, Endereco Endereco, List<Telefone> Telefones) {
      this.Cpf = Cpf;
      this.Nome = Nome;
      this.Endereco = Endereco;
      this.Telefones = Telefones;
  
    }
  
    public String getCpf() {
      return Cpf;
    }
  
    public void setCpf(String Cpf) {
      this.Cpf = Cpf;
    }
  
    public String getNome() {
      return Nome;
    }
  
    public void setNome(String Nome) {
      this.Nome = Nome;
    }

    public List<Telefone> getTelefone() {
        return Telefones;
    }

    public void setTelefones(List<Telefone> Telefones) {
      this.Telefones = Telefones;
  }

    public Endereco getEndereco() {
        return Endereco;
    }

    
    
    

    @Override
      public String toString() {
          return "CPF: " +  Cpf + ", Nome: " + Nome + ", Endereço: " + Endereco + ", Telefone: " + Telefones;
      }
  }
  
