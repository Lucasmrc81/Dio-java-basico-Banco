import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
   
        public static void main(String[] args) {
        //primeiros passos...
            
        
            Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
            
            String NomeCliente = "Divania Martins";
            double saldo = 237.48;        
            
            System.out.println("Por favor, digite o número da Agência!");
                String Agencia = scanner.next();
        
                System.out.println("Por favor, digite sua conta");
                String Conta = scanner.next();

            
        
        //imprimindo os dados, mais informações
        System.out.println("Olá," + NomeCliente + "!" + " obrigado por criar uma conta em nosso banco, sua agência é " + Agencia + " conta " + Conta + " e seu saldo " + saldo + " já está disponível para saque." );
       
        
        
    }
}
