// import java.util.*;

// public class BT {
//     static Scanner sc = new Scanner(System.in);

//     public static void main(String[] args) {
//         Node root = createTree();
//         // Rest of your main method logic
//     }

//     static Node createTree() {
//         Node root = null;
//         System.out.println("Enter data: ");
//         int data = sc.nextInt();
//         if(data== -1) return null;
//         root = new Node(data);

//         System.out.println("Enter left for: " +data);
//         root.left=createTree();
//         System.out.println("Enter right for :" +data);
//         root.right=createTree();
       
//         return root;
//     }

//     public static class Node {
//         int data;
//         Node left;
//         Node right;

//         public Node(int data) {
//             this.data = data;
//         }
//     }
// }
