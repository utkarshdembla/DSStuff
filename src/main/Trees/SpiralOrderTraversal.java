package main.Trees;

import java.util.Stack;

public class SpiralOrderTraversal {
    public static void main(String args[])
    {
        Node node = new Node(1);
        node.left = new Node(2);
        node.left.left = new Node(4);
        node.left.right = new Node(5);

        node.right = new Node(3);
        node.right.left = new Node(6);
        node.right.right = new Node(7);
        
        printSpiralOrder(node);
      //  node.print(node);
    }

    public static void printSpiralOrder(Node node)
    {
        Stack<Node> stack1 = new Stack<>();
        Stack<Node> stack2 = new Stack<>();

        stack1.push(node);
     while(!stack1.isEmpty() || !stack2.isEmpty()) {

         while (!stack1.isEmpty()) {

             Node popedOutNode = stack1.pop();
             System.out.println(popedOutNode.data);

             if (popedOutNode.left != null)
                 stack2.push(popedOutNode.left);

             if (popedOutNode.right != null)
                 stack2.push(popedOutNode.right);
         }

         while (!stack2.isEmpty()) {
             Node popedOutNode = stack2.pop();
             System.out.println(popedOutNode.data);

             if (popedOutNode.right != null)
                 stack1.push(popedOutNode.right);

             if (popedOutNode.left != null)
                 stack1.push(popedOutNode.left);
         }
     }
    }
}
