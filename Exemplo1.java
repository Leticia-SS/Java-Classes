import java.util.Scanner;

class Exemplo1{
    public static void main(String[] args) {
        Scanner reading = new Scanner(System.in);
        int num = reading.nextInt();
        
        //  EXEMPLO DE CONDICIONAL
        // if(num==1){
        //     System.out.println("Soma");
        // } else if (num == 2) {
        //     System.out.println("Subtração");
        // } else if (num == 3) {
        //     System.out.println("Multiplicação");
        // } else if (num == 4) {
        //     System.out.println("Divisão");
        // } else {
        //     System.out.println("Opção inválida");
        // }

        switch(num){
            case 1:
                System.out.println("Soma");
                break;
            case 2:
                System.out.println("Subtração");
                break;
            case 3:
                System.out.println("Multiplicação");
                break;
            case 4:
                System.out.println("Divisão");
                break;
            default:
                System.out.println("Opção Inválida");
        }


        // EXEMPLO DE CONDICIONAL
        // if (num == 0 || num == 1 || num == 2){
        //     System.out.println("");
        // } else if(num == 3 || num == 4 ){
        //     System.out.println("");
        // }
    
        switch(num){
            case 0:
            case 1:
            case 2:
                System.out.println("Soma");
                break;
            case 3:
            case 4:
                System.out.println("Subtração");
                break;
            default:
                System.out.println("Opção Inválida");
        }
    
        char letter = reading.next().charAt(0);

        switch (letter) {
            case 'a':
                System.out.println("Você diigtou a letra a");
                break;
            default:
                System.out.println("");
        }

    }
}
