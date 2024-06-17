import java.util.Scanner;

public class SimulacaoBancaria {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float saldo = 0;
        boolean continuar = true;
        float saque = 0;
        float aporte = 0;

        System.out.println("Seja bem vindo ao nosso banco.Escolha uma das opções\r\n"+
                            "1.Depositar\r\n" + //
                            "2.Sacar\r\n" + //
                            "3.Consultar Saldo\r\n" + //
                            "0.Encerrar");
        while (continuar) {
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                  System.out.println("Digite o quanto quer depositar");
                  aporte = scanner.nextFloat();
                  try{ 
                    if(aporte<0){
                      throw new Exception();
                      //caso o valor seja negativo eu chamo a exceção para que o código execute o catch
                    } 
                    saldo = saldo + aporte;       
                    System.out.format("Saldo atual:R$ %.2f \n",saldo);
                  }catch(Exception erro){
                    System.out.format("Valor inválido.\n");
                  }
                    break;
                case 2:
                System.out.println("Digite o quanto deseja sacar");
                    saque = scanner.nextFloat();
                    try{ 
                      if(saldo<saque){
                        throw new Exception();    
                        //caso o valor desejado para sacar for maior que o saldo disponivel eu chamo
                        //a exceção para que o código execute o catch
                      }
                      saldo = saldo - saque;
                      System.out.format("Saldo atual:R$ %.2f \n",saldo);
                    }catch(Exception erro){
                      System.out.format("Saldo insuficiente.\n");
                    }
                    break;
                case 3:
                    System.out.format("Saldo atual: %.2f \n",saldo);
                    break;
                case 0:
                    System.out.println("Programa encerrado.\n");
                    continuar = false;  // Atualiza a variável de controle para encerrar o loop
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.\n");
            }
        }
        scanner.close();
    }
}