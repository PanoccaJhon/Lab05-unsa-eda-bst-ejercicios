import java.util.*;
public class BST {
    
    public Node root;

    public BST(){
        this.root = null;
    }

    //Metodo para insertar un nuevo nodo al arbol

    public void insertNode(int i){
        Node new_node = new Node(i);

        if(this.root == null){
            this.root = new_node;
        }else{
            Node aux_node = this.root;
            Node parent_node;
            while(true){
                parent_node = aux_node;
                if(i < aux_node.value){
                    aux_node = aux_node.child_left;
                    if(aux_node == null){
                        parent_node.child_left = new_node;
                        break;
                    }
                }else{
                    aux_node = aux_node.child_right;
                    if(aux_node == null){
                        parent_node.child_right = new_node;
                        break;
                    }
                }
            }
        }
    }
    
    //Metodo para buscar un valor en el arbol
    public Node searchNode(int d){
        Node aux_node = this.root;

        while(aux_node.value != d){
            if(d < aux_node.value){
                aux_node = aux_node.child_left;
            }else{
                aux_node = aux_node.child_right;
            }
            if(aux_node == null){
                return null;
            }
        }
        return aux_node; 
    }

    public boolean isNull(){
        return this.root == null;
    }
    //EJERCICIO 1: Metodo para guardar los datos en un ArrayList y posteriormente encontrar k-esimo
    public ArrayList<Integer> inOrder(Node r,ArrayList<Integer>nums){
        if(r != null){
            inOrder(r.child_left,nums);
            nums.add(r.value);
            inOrder(r.child_right,nums);
        }
        return nums;
    }







    //Metodo para recorrer el arbol: In Orden
    public void inOrder(Node r){
        if(r != null){
            inOrder(r.child_left);
            System.out.println(r.value);
            inOrder(r.child_right);
        }
    }

    //Metodo para recorrer el arbol: Pre Orden
    public void preOrder(Node r){
        if(r != null){
            System.out.println(r.value);
            preOrder(r.child_left);
            preOrder(r.child_right);
        }
    }

    //Metodo para recorrer el arbol: Post Orden
    public void postOrder(Node r){
        if(r != null){
            postOrder(r.child_left);
            postOrder(r.child_right);
            System.out.println(r.value);
        }
    }






    private class Node {
        public int value;

        public Node child_left, child_right;

        public Node(int value){
            this.value = value;
            this.child_left = null;
            this.child_right = null;
        }
        public String toString(){
            return ""+this.value;
        }
    }
}
