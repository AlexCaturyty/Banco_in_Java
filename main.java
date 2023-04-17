import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main {

  static Scanner scanner = new Scanner(System.in);
  static List<Conta> contas = new ArrayList<Conta>();

  public static void main(String[] args) {
    boolean sair = false;
    while (!sair) {
      exibirMenu();
      int opcao = scanner.nextInt();
      scanner.nextLine();
      switch (opcao) {
        case 1:
          cadastrarCliente();
          break;
        case 2:
          listarClientes(contas);
          break;
        case 3:
          removerCliente();
        case 4:
          sair = true;
          System.out.println("Saindo...");
          break;
        default:
          System.out.println("Opção inválida, tente novamente!");
          break;
      }
    }
  }

  public static void exibirMenu() {
    System.out.println("---- Menu ----");
    System.out.println("1. Cadastrar Cliente");
    System.out.println("2. Listar Clientes");
    System.out.println("3. Excluir Cliente");
    System.out.println("4. Sair");
    System.out.println("Escolha a opção: ");
  }

  public static void cadastrarCliente() {
    System.out.println("---- Cadastro de Cliente ----");
    System.out.println("Digite o CPF do cliente:");
    String cpf = scanner.nextLine();
    System.out.println("Digite o nome do cliente:");
    String nome = scanner.nextLine();
    System.out.println("Digite o CEP do cliente:");
    String cep = scanner.nextLine();
    System.out.println("Digite o logradouro do cliente:");
    String logradouro = scanner.nextLine();
    System.out.println("Digite o número do logradouro do cliente:");
    String numeroLogradouro = scanner.nextLine();

    List<Telefone> telefones = new ArrayList<>();
    boolean adicionarTelefone = true;
    while (adicionarTelefone) {
      System.out.println("Digite o DDD do telefone do cliente:");
      String ddd = scanner.nextLine();
      System.out.println("Digite o número do telefone do cliente:");
      String numeroTelefone = scanner.nextLine();
      telefones.add(new Telefone(ddd, numeroTelefone));
      System.out.println("Deseja adicionar outro telefone? (S/N)");
      String opcao = scanner.nextLine();
      if (!opcao.equalsIgnoreCase("S")) {
        adicionarTelefone = false;
      }
    }

    Endereco endereco = new Endereco(cep, logradouro, numeroLogradouro);
    Cliente cliente = new Cliente(cpf, nome, endereco, telefones); // passa a lista de telefones para o construtor do
                                                                   // Cliente
    contas.add(new Conta("", "", 0.0, cliente));
    System.out.println("Cliente cadastrado com sucesso!");
  }

  public static void listarClientes(List<Conta> contas) {
    System.out.println("---- Lista de Clientes ----");
    for (Conta conta : contas) {
      Cliente cliente = conta.getCliente();
      System.out.println("CPF: " + cliente.getCpf());
      System.out.println("Nome: " + cliente.getNome());
      System.out.println("CEP: " + cliente.getEndereco().getCep());
      System.out.println("Logradouro: " + cliente.getEndereco().getLogradouro() + " N° "
          + cliente.getEndereco().getNumero());
      System.out.println("Número: " + cliente.getEndereco().getNumero());

      List<Telefone> telefones = cliente.getTelefone(); // Corrigido para getTelefone()

      if (telefones != null && !telefones.isEmpty()) {
        System.out.println("Telefones:");
        for (Telefone telefone : telefones) {
          System.out.println("    - (" + telefone.getDdd() + ") " + telefone.getNumeroTelefone());
        }
      } else {
        System.out.println("Telefone: N/A");
      }

      System.out.println("---------------");
    }
  }

  public static void removerCliente() {
    System.out.println("---- Remover Cliente ----");
    System.out.println("Digite o CPF do cliente que deseja remover:");
    String cpf = scanner.nextLine();
    Conta contaRemover = null;
    for (Conta conta : contas) {
      if (conta.getCliente().getCpf().equals(cpf)) {
        contaRemover = conta;
        break;
      }
    }
    if (contaRemover != null) {
      contas.remove(contaRemover);
      System.out.println("Cliente removido com sucesso!");
    } else {
      System.out.println("Cliente não encontrado!");
    }

    exibirMenu();
  }

}
