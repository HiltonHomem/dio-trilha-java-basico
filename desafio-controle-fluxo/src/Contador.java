import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
		Scanner terminal = new Scanner(System.in);
		
        System.out.println("Digite o primeiro parâmetro");
		int parametroUm = terminal.nextInt();
		
        System.out.println("Digite o segundo parâmetro");
		int parametroDois = terminal.nextInt();
		
		try {
			//chamando o método contendo a lógica de contagem
			contar(parametroUm, parametroDois);
		
		}catch (ParametrosInvalidosException erro) {
            System.out.println("O segundo parâmetro deve ser maior que o primeiro");
		}
		
	}
	static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
		//validar se parametroUm é MAIOR que parametroDois e lançar a exceção
		if (parametroUm >= parametroDois) {
            throw new ParametrosInvalidosException("O primeiro parâmetro deve ser menor que o segundo");
        }
        
        int contagem = parametroDois - parametroUm;

		//realizar o for para imprimir os números com base na variável contagem
        int i =0;
        for (i=0; i<contagem; i++){
            int numero = i+ parametroUm;
            System.out.format("Imprimindo o número %d\n",numero);
        }
    }
}
