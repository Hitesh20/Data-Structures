package BinarySearchTree;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
        /* Creating object of BT */
        BinarySearchTree bst = new BinarySearchTree(); 
        /*  Perform tree operations  */
        System.out.println("Binary Tree Test\n");          
        char ch;        
        do    
        {
            System.out.println("\nBinary Tree Operations\n");
            System.out.println("1. insert ");
            System.out.println("2. search");
            System.out.println("3. count nodes");
            System.out.println("4. check empty");
            System.out.println("5. delete value");
            int choice = scan.nextInt();            
            switch (choice)
            {
            case 1 : 
                System.out.println("Enter integer element to insert");
                bst.insert( scan.nextInt() );                     
                break;                          
            case 2 : 
                System.out.println("Enter integer element to search");
                System.out.println("Search result : "+ bst.find( scan.nextInt() ));
                break;                                          
            case 3 : 
                System.out.println("Nodes = "+ bst.countNodes());
                break;     
            case 4 : 
                System.out.println("Empty status = "+ bst.isEmpty());
                break; 
            case 5 : 
                bst.delete(scan.nextInt());
                break; 
            default : 
                System.out.println("Wrong Entry \n ");
                break;   
            }
            /*  Display tree  */ 
            System.out.print("\nPost order : ");
            bst.postOrder();
            System.out.print("\nPre order : ");
            bst.preOrder();
            System.out.print("\nIn order : ");
            bst.inOrder();
 
            System.out.println("\n\nDo you want to continue (Type y or n) \n");
            ch = scan.next().charAt(0);                        
        } while (ch == 'Y'|| ch == 'y'); 

	}

}