import java.io.File;
import java.util.Scanner;

public class XProcess {
    public static void main(String[] args) throws Exception {
        Scanner scanobj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter text file name");
        String fileName = myObj.nextLine();  // Read user input
        try { //Try and get file
            File fileobj = new File(fileName + ".txt");
            Scanner myReader = new Scanner(fileobj);
            while (myReader.hasNextLine()) {
              String line = myReader.nextLine();
              char transactionType = line.charAt(7)
              System.out.println(transactionType);
              switch (transactionType) {
                case 'd' : //Deposit account
                    
                    break;
                case 'w' ://Withdraw account

                    break;
                case 'c' ://Close account

                    break;
                default:
                    break;
              }
            }
            myReader.close();
        } catch (Exception e) {
            //Exit application
        }

        
        
    }

    private dontknow BankBST ;
}
