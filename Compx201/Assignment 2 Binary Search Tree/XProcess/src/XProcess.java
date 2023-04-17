import java.io.File;
import java.util.Scanner;

public class XProcess {
    public static void main(String[] args) throws Exception {
        Scanner scanobj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter text file name");

        // File file = new File(".");
        // for(String fileNames : file.list()) System.out.println(fileNames);

        String fileName = scanobj.nextLine();  // Read user input
        try { //Try and get file
            File fileobj = new File(fileName + ".txt");
            Scanner myReader = new Scanner(fileobj);
            while (myReader.hasNextLine()) {
              String line = myReader.nextLine();
              String[] arrOfLine = line.split(" ", 3);
              System.out.println(arrOfLine[0]);
              System.out.println(arrOfLine[1]);
              System.out.println(arrOfLine[2]);
              switch (arrOfLine[1]) {
                case "d" : //Deposit account
                    BankBST.add(Integer.parseInt(arrOfLine[0]) ,Double.parseDouble(arrOfLine[2]));
                    break;
                case "w" ://Withdraw account

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

    static class BST{
        
    }
    //private dontknow BankBST ;
}
