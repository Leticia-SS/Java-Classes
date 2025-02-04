import java.util.Scanner;
class MediaNotas {
    public static void main(String [] args){
        double nota1 = 0;
        double nota2 = 0;
        double nota3 = 0;

        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite a primeira nota: ");
        nota1 = leitor.nextDouble();
        System.out.println("Digite a primeira nota: ");
        nota2 = leitor.nextDouble();
        System.out.println("Digite a primeira nota: ");
        nota3 = leitor.nextDouble();

        boolean validaMedia = ((nota1 <=10 && nota1 >= 0) || (nota2 <=10 && nota2 >= 0) || (nota3 <=10 && nota3 >= 0));
        
        if (validaMedia){
            double media = ((nota1) + nota2 + nota3) / 3;
            double mediaPonderada = (nota1*0.5) + (nota2*0.3) + (nota3*0.2);
            System.out.printf("Média aritmética das notas é: %.2f \n Média Ponderada é: %.2f", media, mediaPonderada);
            
            if(media >= 9){
                System.out.println("Nota final: A");
            } else if(media >=8){
                System.out.println("Nota final: B");
            } else if(media >=6){
                System.out.println("Nota final: C");
            } else if(media >= 5){
                System.out.println("Nota final: D");
            }else if(media >= 4){
                System.out.println("Nota final: E");
            } else{
                System.out.println("Nota final: F");
            }
        }
    }
}
