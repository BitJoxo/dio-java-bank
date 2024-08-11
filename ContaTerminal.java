import java.util.Scanner;

//import javax.print.DocFlavor.STRING;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        //conhecer e importar a classe scanner 
        //exibir as mensagens para o nosso usuario
        //obter pela classe scanner os valores digitados no terminal
        //exibir a mensagem final/ mensagem criada
    Scanner sc = new Scanner(System.in);
    int numero;
    String agencia, nomeCliente ; 
    double saldo = 237.48;
    

    System.out.println("\"BEM VINDO(A) ao DIO BANK.\nPor favor digite seu nome: ");
        nomeCliente = sc.nextLine(); 
    System.out.println("iforme sua agência(ex:067-8): ");
        agencia = sc.next();
    System.out.println("\nPor favor, digite o numero do seu usuario(ex:1021): ");
        numero = sc.nextInt();   

  
    
    System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque.", nomeCliente, agencia, numero, saldo);
    sc.close(); 

    }
   
 }

