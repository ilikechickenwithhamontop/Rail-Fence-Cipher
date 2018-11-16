import java.util.Scanner;
public class ImitationGame{
    public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    System.out.println("Input:");
    Cipher cipher = new Cipher(scanner.nextLine());
    cipher.encrypt(cipher.getInput());
    Decipher decipher = new Decipher();
    decipher.decrypt(cipher.encrypt(cipher.getInput()));
    
    }

}