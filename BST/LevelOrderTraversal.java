package BST;
import java.util.*;

public class LevelOrderTraversal {

    public static class node{
        node left;
        node right;
        int data;

        node(int val){
            this.data = val;
        }
    }

    public static node createBST(node root, int data){
        if(root == null){
            root = new node(data);
            return root;
        }

        if(data < root.data){
            root.left = createBST(root.left, data);
        }
        else{
            root.right = createBST(root.right, data);
        }
        return root;
    }
   
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of nodes: ");
        int n = sc.nextInt();

        System.out.println("Enter nodes: ");

        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        sc.close();

        node root = null;
        for(int i = 0; i < n; i++){
            root = createBST(root, arr[i]);
        }

        ArrayList<ArrayList<Integer>> lot =  new ArrayList<>();

        Queue<node> q = new LinkedList<>();

        q.add(root);

        while(!q.isEmpty()){

            int levelSize = q.size();
            ArrayList<Integer> levelValues = new ArrayList<>();

            for(int i = 0; i < levelSize; i++){
                node temp = q.poll();

                levelValues.add(temp.data);

                if(temp.left!=null){
                    q.add(temp.left);
                }
                if(temp.right!=null){
                    q.add(temp.right);
                }
            }
            lot.add(levelValues);
        }

        System.out.println(lot);
    }
}
