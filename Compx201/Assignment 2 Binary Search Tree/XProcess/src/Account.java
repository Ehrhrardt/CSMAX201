public class Account {

    public static void main(){
        
        
    }
    
    

    // public static class Node {
        

    //     Node leftChild ;
    //     Node rightChild ;
    //     private int key ; //account number that uniquely identifies this account
    //     private double balance ; // how much money is in this account
        

    //     Node(int valuekey, double valuebalance){
            
    //         this.balance = valuebalance;
    //         this.key = valuekey;
    //     }
    // }

    public static class Node {
        
        private int key;
        private double balance;
        Node rightChild, leftChild;

        Node(int valuekey, double valuebalance){
            this.balance = valuebalance;
            this.key = valuekey;
        }
        public int getKey(){
            return key;
        }
    
        public double getBalance() {
            return balance;
        }
    
        public void setBalance(double accountBalance){
           balance = accountBalance;
        }
    }

    public void constructor(int accountNumber, double accountBalance){
        
    }


    
    static class BST{
        
    }

    
}
