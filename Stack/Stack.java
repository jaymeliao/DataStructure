
public class Stack {
    static final public int MAX_SIZE =1000;
    
    private int[] elements= new int[MAX_SIZE];
    private int top;
    
    public Stack(){
        top=0;


    }
    public void push(int x){
        elements[top]=x;
        top+=1;
    }
    //Remove an element at the top and return the element
    public int pop(){
        if (top<1){
            System.out.println("The stack is empty..");
            return -1;
        }else{
            int e= elements[top-1];
            top-=1;
            return e;
        }
    }

    public int peek(){
        return elements[top-1];
    }

    //Overwrite
    public String toString(){
        String out="";
        for (int i=0;i<top;i++){
            out+=elements[i]+"->>";
        }
     return out;
    }

    public static void main(String[] args){

        Stack s1=new Stack();
        s1.push(10);
        System.out.println(s1.pop());
        System.out.println(s1);
        System.out.println(s1.pop());
        System.out.println(s1);

    }

    
}
