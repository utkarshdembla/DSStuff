package main.Trees;

public class Node {
    int data;
    Node left,right;

    public Node(int data)
    {
        this.data=data;
        left=null;
        right=null;
    }

    public void print(Node node)
    {
        if(node==null)
            return;

        System.out.println(node.data);
        print(node.left);
        print(node.right);
    }
}

