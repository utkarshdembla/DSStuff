package main.Trees;

import java.util.LinkedList;
import java.util.Queue;


public class LevelOrderTraversal {
    public static void main(String args[])
    {
        Node node = new Node(1);
        node.left = new Node(2);
        node.right = new Node(3);

        printlevelOrder(node);
        node.print(node);
    }

    public static void printlevelOrder(Node node)
    {
        Queue<Node> queue = new LinkedList<Node>();
        queue.add(node);

        while (!queue.isEmpty())
        {
            Node popOutNode = queue.poll();
            System.out.println(popOutNode.data);

            if(popOutNode.left!=null)
                queue.add(popOutNode.left);

            if(popOutNode.right!=null)
                queue.add(popOutNode.right);

        }
    }



}
