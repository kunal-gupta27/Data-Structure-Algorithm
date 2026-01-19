package Stack;

public class ArrayImplementation {
    public static class Stack{
        int[] arr = new int[4];

        int idx=0;
        void push(int x){
            if(isFull()){
                System.out.println("Stack is Full");
                return;
            }
            arr[idx] = x;
            idx++;
        }
        
        int peek(){
            if(idx==0){
                System.out.print("Stack is Empty");
                return -1;
            }
            return arr[idx-1];
        }

        int pop(){
            if(idx==0){
                System.out.print("Stack is Empty");
                return -1;
            }
            int top = arr[idx-1];
            arr[idx-1]=0;
            idx--;
            return top;
        }
        int size(){
            return idx;
        }

        void display(){
            for(int i=0;i<=idx-1;i++){
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        }

        boolean isEmpty(){
            if(idx==0) return true;
            else return false;
        }
        boolean isFull(){
            if(idx==arr.length) return true;
            else return false;
        }
        int capacity(){
            return arr.length;
        }
    }
    public static void main(String[] args) {
        Stack st = new Stack();
        st.push(4); 
        st.display();  // 4
        st.push(5);
        st.display(); // 4 5
        st.push(1);
        st.display(); // 4 5 1
        System.out.println(st.size());  // otput-> 3
        st.pop();
        st.display(); // 4 5
        System.out.println(st.size()); // output -> 2
        st.push(23);
        st.display();  // 4 5 23
        st.push(7);
        st.display(); // 4 5 23 7
        st.push(8);
        st.display();  // it gives me error  arr size is 5
        System.out.println(st.size()); 

    }
}
