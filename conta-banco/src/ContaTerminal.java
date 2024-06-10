import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        System.out.println("Por favor, digite o número da Agência !");
        Scanner teclado = new Scanner(System.in);
        int numero = teclado.nextInt();
        teclado.nextLine();//consome a linha excedente evitando erros
        
        System.out.println("Por favor, digite a Agência !");
        String agencia = teclado.nextLine();
       
        System.out.println("Por favor, digite o seu nome !");
        String nome = teclado.nextLine();
        
        System.out.println("Por favor, digite o seu Saldo !");
        float saldo = teclado.nextFloat();
        
        System.out.println("Olá " +nome+ ", obrigado por criar uma conta em nosso banco, sua agência é " +agencia+ ", conta " +numero+ " e seu saldo " +saldo+ " já está disponível para saque");
    }
}
