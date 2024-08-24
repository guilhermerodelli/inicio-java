import java.util.ArrayList;
import java.util.Scanner;

class Contas {
    private String conta;
    private double valor;
    private String vencimento;

    public Contas(String conta, double valor, String vencimento) {
        this.conta = conta;
        this.valor = valor;
        this.vencimento = vencimento;
    }

    public String getconta() {
        return conta;
    }

    public double getvalor() {
        return valor;
    }

    public String getvencimento() {
        return vencimento;
    }

    public String toString() {
        return "Conta: " + conta + " / Valor: $" + String.format("%.2f", valor) + " / Vencimento: " + vencimento; 
    }
}

public class LembreteDeContas {
    public static void main(String[] args) {
        ArrayList<Contas> contas = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String continuar;

        do {
            System.out.print("Nome da conta: ");
            String nome = scanner.nextLine();

            System.out.print("Valor da conta: ");
            double valor = scanner.nextDouble();
            scanner.nextLine();

            System.out.print("Data do vencimento (dd/mm/aaaa): ");
            String vencimento = scanner.nextLine();

            contas.add(new Contas(nome, valor, vencimento));

            System.out.println("Adicionar outra conta (s/n)?: ");
            continuar = scanner.nextLine();
        } while (continuar.equalsIgnoreCase("s"));

        System.out.print("Suas contas pendentes:");
        for (Contas conta : contas) {
            System.out.println(conta);
        }

        scanner.close();
    }
}

