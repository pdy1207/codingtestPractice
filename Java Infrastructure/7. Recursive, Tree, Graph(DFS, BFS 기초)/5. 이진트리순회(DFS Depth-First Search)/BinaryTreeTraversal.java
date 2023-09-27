import java.util.*;

class Node {
    int data;
    Node lt , rt; 
    public Node(int val){
        data = val;
        lt = rt = null;
    }
}

public class BinaryTreeTraversal {
    Node root; 
    public void DFS(Node root){
        if(root == null){
            return;
        }else {
            // System.out.print(root.data+ " ");  전위 순회
            DFS(root.lt);
            // System.out.print(root.data+ " ");  중위 순회
            DFS(root.rt);
            // System.out.print(root.data+ " ");  하위 순회
        }
    }

    public static void main(String[] args){
        BinaryTreeTraversal tree = new BinaryTreeTraversal();
        tree.root = new Node(1);
        tree.root.lt = new Node(2);
        tree.root.rt = new Node(3);
        tree.root.lt.lt = new Node(4);
        tree.root.lt.rt = new Node(5);
        tree.root.rt.lt = new Node(6);
        tree.root.rt.rt = new Node(7);
        tree.DFS(tree.root);
    }
}
/* 
 * 전위 순회 : 부모 방문 왼쪽 자식 오른쪽 자식 즉, 부모가 기준
 * 중위 순회 : 왼쪽 자식 부모 방문 오른쪽 자식 
 * 후위 순회 : 왼쪽 자식 오른쪽 자식 부모 방문
 */
