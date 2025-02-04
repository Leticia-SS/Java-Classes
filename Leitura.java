import java.util.Scanner;
class Leitura {
    public static void main(String [] args){
        int nota = 0;
        double altura = 0D; 
        Scanner leitor = new Scanner(System.in);
        System.out.print("Digite o valor da nota: ");
        nota = leitor.nextInt();

        System.out.print("Digite a altura: ");
        altura = leitor.nextDouble();
        System.out.printf("O valor de nota é %d e altura %f", nota, altura);
    }
}