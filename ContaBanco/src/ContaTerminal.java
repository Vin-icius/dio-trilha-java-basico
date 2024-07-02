import java.util.Scanner;

public class ContaTerminal {
    private int numero;
    private String agencia;
    private String nomeCliente;
    private double saldo;

    public ContaTerminal(int numero, String agencia, String nomeCliente, double saldo) {
        this.numero = numero;
        this.agencia = agencia;
        this.nomeCliente = nomeCliente;
        this.saldo = saldo;
    }

    public ContaTerminal() {
        this(0,"","",0L);
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void inputTerminal(){
        int numb;
        double sald;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Deseja iniciar? (S|N)");
        String input = scanner.nextLine();

        while(input.toUpperCase().charAt(0)!='N' && input.toUpperCase().charAt(0)=='S'){

            System.out.print("Por favor, digite o número da Agência: ");
            input = scanner.nextLine();
            setAgencia(input);

            System.out.print("Por favor, digite o número da Conta: ");
            input = scanner.nextLine();
            numb = Integer.parseInt(input);
            setNumero(numb);

            System.out.println("Por favor, digite o Nome: ");
            input = scanner.nextLine();
            setNomeCliente(input);

            System.out.println("Por favor, digite o Saldo: ");
            input = scanner.nextLine();
            sald = Double.parseDouble(input);
            setSaldo(sald);

            exibeDados();

            System.out.println("Deseja continuar? (S|N)");
            input = scanner.nextLine();
        }


        // Fecha o scanner
        scanner.close();
    }

    public void exibeDados(){
        System.out.println("\n");
        System.out.println("----------------------------------------------------------------------------------------------------");
        System.out.println("Olá "+getNomeCliente()+", obrigado por criar uma conta em nosso banco," +
                "sua agência é ["+getAgencia()+"], conta ["+getNumero()+"] e seu saldo ["+getSaldo()+
                "] já está disponível para saque.");
        System.out.println("----------------------------------------------------------------------------------------------------");
        System.out.println("\n");
    }
}
