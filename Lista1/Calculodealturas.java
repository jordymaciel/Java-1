import java.util.Scanner;

public class Calculodealturas{
    public static void main (String[]args){
        Scanner alturas = new Scanner(System.in); 
        //Criando a variavel "alturas" que ira receber as alturas que o usuario vai digitar.
        System.out.println("Digite uma altura: "); 
        Float a1 = alturas.nextFloat();
        //Aqui pede para o usuario digitar uma altura e é armazenado em uma variavel "a1" como a primeira altura digitada pelo usuario
        System.out.println("Digite mais uma altura: ");
        Float a2 = alturas.nextFloat();
        //Aqui pede para o usuario digitar mais uma altura e é armazenado em uma variavel "a2" 
        System.out.println("Digite mais uma altura: ");
        Float a3 = alturas.nextFloat();
        //Aqui pede para o usuario digitar uma altura e é armazenado em uma variavel "a3" 
        System.out.println("Digite mais uma altura: ");
        Float a4 = alturas.nextFloat();
        //Aqui pede para o usuario digitar uma altura e é armazenado em uma variavel "a4" 
        System.out.println("Digite mais uma altura: ");
        Float a5 = alturas.nextFloat();
        //Aqui pede para o usuario digitar uma altura e é armazenado em uma variavel "a5" 
        
        Float soma = a1+a2+a3+a4+a5;
        //A soma de todas as variaveis é armazenado na variavel "soma"
        Float media = soma/5;
        //Logo apos é dividido por 5 e o valor armazenado em "media", e assim foi finalizado o calculo da media.
        
        System.out.println("A media das alturas é: "+media);
        //agora e mostrado para o usuario a media.
    }
    
    
}
