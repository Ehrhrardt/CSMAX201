import java.io.File;
import java.util.Scanner;

public class XProcess {

    private static Account.Node bankBST ;
    public static void main(String[] args) throws Exception {
        Scanner scanobj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter text file name");

        // File file = new File(".");
        // for(String fileNames : file.list()) System.out.println(fileNames);
        double balanceUpdate ;
        String fileName = scanobj.nextLine();  // Read user input
        try { //Try and get file
            File fileobj = new File(fileName + ".txt");
            Scanner myReader = new Scanner(fileobj);
            while (myReader.hasNextLine()) {
              String line = myReader.nextLine();
              String[] arrOfLine = line.split(" ", 3);
              switch (arrOfLine[1]) {
                case "d" : //Deposit account
                if (BankBST.find(Integer.parseInt(arrOfLine[0])) == null) {
                    BankBST.add(Integer.parseInt(arrOfLine[0]) ,0.00);//first adding account with 0 balance
                    bankBST = BankBST.find(Integer.parseInt(arrOfLine[0]));
                    System.out.println(bankBST.getKey());
                }else {
                    bankBST = BankBST.find(Integer.parseInt(arrOfLine[0]));
                    System.out.println(bankBST.getKey());
                }   
                    balanceUpdate = Double.parseDouble(arrOfLine[2]);
                    bankBST.setBalance(balanceUpdate);
                    System.out.println(bankBST.getBalance());
                
                    break;
                case "w" ://Withdraw account
                if (BankBST.find(Integer.parseInt(arrOfLine[0])) == null) {
                    BankBST.add(Integer.parseInt(arrOfLine[0]) ,0.00);
                    bankBST = BankBST.find(Integer.parseInt(arrOfLine[0]));
                    System.out.println(bankBST.getKey());
                }else {
                    bankBST = BankBST.find(Integer.parseInt(arrOfLine[0]));
                    System.out.println(bankBST.getKey());
                }   
                    balanceUpdate = Double.parseDouble(arrOfLine[2]) * -1;
                    bankBST.setBalance(balanceUpdate);
                    System.out.println(bankBST.getBalance());
                    break;
                case "c" ://Close account

                    break;
                default:
                    break;
              }
            }
            myReader.close();
            scanobj.close();
        } catch (Exception e) {
            System.out.println(e);
            System.exit(0); //Exit application  
        }

        
        
    }

}
