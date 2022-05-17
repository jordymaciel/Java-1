import java.util.Scanner;

public class Calculodeidade {


    public static void main(String[]args){
        Scanner ano = new Scanner(System.in);
        //Criando a variavel "ano" que ira receber o ano que o usuario digitou.
        System.out.println("Digite o ano de nascimento para calcular a idade: ");
        //Criando outra variavel que ira subtrair pelo ano colocado pelo usuario.
        int resposta = ano.nextInt();      
        int age = resposta-2022;
        //Agora subtracao do ano que o usuario digitou com o ano definido no programa sera armazenado em "age".
        System.out.println("A idade do é: "+(-age));
        //por fim a exibcao da idade.
        
        
    }
    
}


