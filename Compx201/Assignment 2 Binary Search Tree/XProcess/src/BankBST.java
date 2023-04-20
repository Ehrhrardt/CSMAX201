

public class BankBST{

    static Account.Node root;

    public static void add(int key , double balance){
        Account.Node newNode = new Account.Node(key,balance);
        
        if (root == null){//If nothing is in the tree
            root = newNode;

        }else {
            Account.Node focusNode = root;
            Boolean added = false;
            Account.Node parent ;
            
            while (added == false){
                parent = focusNode;
                if (key < focusNode.getKey()){//key smaller then go to left child
                    focusNode = focusNode.leftChild;
                    if (focusNode == null){//if left child is null add new node
                        parent.leftChild = newNode;
                        
                        added = true;
                    }
                } else {//else key bigger go to right child
                focusNode = focusNode.rightChild;  
                    if (focusNode == null){//if right child is null add new node
                        parent.rightChild = newNode;
                        
                        added = true;
                    }
            }
            }        
        }
        //System.out.println(newNode.balance);
        //System.out.println(root.balance + " " + root.leftChild + " " + root.rightChild);
    }

    public void inOrderTraverseTree(Account.Node focusNode){

        if (focusNode != null) {
            inOrderTraverseTree(focusNode.leftChild);

            System.out.println(focusNode);

            inOrderTraverseTree(focusNode.rightChild);
        }
    }

    public static Account.Node find(int key){
        Account.Node focusNode = root;
        if (focusNode == null) {
            return null;
        }
        while (focusNode.getKey() != key){
            if (key < focusNode.getKey()){
                focusNode = focusNode.leftChild;
            }else {
                focusNode = focusNode.rightChild;
            }
            if (focusNode == null) {
                return null;
            }

        }
        return focusNode;
    }

    public void remove(){
        
    }

    
}