import java.util.*;



public class Tree{
    public Node root;
    private class Node{
        private int value;
        private Node leftChild;
        private Node rightChild;
        public Node(int value){
            this.value=value;
            //leftChild=null;
            //rightChild=null;
        }
        public String toString(){
            return value+"-->";
        }
    }
    public void insert(int value){
        Node newNode= new Node (value);
        if (root==null){
            root=newNode;
        }else{
            Node currNode=root;
            while (true){
                if (value<currNode.value){
                    if (currNode.leftChild!=null) currNode=currNode.leftChild;
                    else{ 
                        currNode.leftChild = newNode; 
                        break;
                    }  
                }else{
                    if (currNode.rightChild!=null) currNode=currNode.rightChild;
                    else{ 
                        currNode.rightChild = newNode; 
                        break;
                    }    
                }
            }

        }     
    }

    public boolean find(int value){
        Node currNode=root;
        while (currNode!=null){
            if (value<currNode.value){
                currNode=currNode.leftChild;
            }else if (value>currNode.value){
                currNode=currNode.rightChild;
            }else{
                return true;
            }
        }
        return false;
    }

    public void DFS(Node node){
        if (node==null){
            return;
        }else{
            System.out.print(node+" ");
            DFS(node.leftChild);
            DFS(node.rightChild);
        }
    }
    //BFS using queue
    public void BFS(Node node){
        if (root==null){
            System.out.println("This is empty!!");
            return;
        }

        Queue<Node> q = new LinkedList<>();
        Node currNode=root;
        String out="";
        q.add(currNode);
        while(q.size()!=0){
            currNode=q.remove();
            out+=currNode;
            if (currNode.leftChild!=null) q.add(currNode.leftChild);
            if (currNode.rightChild!=null) q.add(currNode.rightChild);
            
        }
        System.out.println(out);
    }

    public static void main(String[] args){
        
        Tree t1 = new Tree();
        int[] elements= {10, 5, 15, 6, 1, 8, 12, 18, 17};
        for (int i=0;i<elements.length;i++){
            t1.insert(elements[i]);
        }
        t1.BFS(t1.root);
    }
}
 /*   
    Queue<Integer> q = new LinkedList<>();
    q.add(14);
    q.add(10);
    q.add(12);
    q.remove(); //remove 14
    //q add at the end but removed from the back
    System.out.println(q); //[10,12]
*/    