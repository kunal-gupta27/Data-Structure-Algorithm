package Queues;
public class arrayImplementation {
    public static class queueA{
        int f=-1;
        int r=-1;
        int size=0;
        int[] arr= new int[5];

        //add()
        public void add(int val) throws Exception{
            if(size==arr.length){
                throw new Exception("Queue is Full!");
            }
            if(f==-1){
                f=r=0;
                arr[0]=val;
            }else{
                arr[r+1]=val;
                r++;
            }
            size++;
        }

        //remove()
        public int remove() throws Exception{
            if(size==0){
                throw new Exception("Queue is Empty!");
            }
            f++;
            size--;
            return arr[f-1];
        }

        //peek()
        public int peek() throws Exception{
            if(size==0){
                throw new Exception("Queue is Empty!");
            }
            return arr[f];
        }

        //isEmpty()
        public boolean isEmpty(){
            if(size==0)  return true;
            else return false;
            
        }

        //display
        public void display(){
            if(size==0){
                System.out.println("Queue is Empty!");
                return;
            }
            else{
                for(int i=f;i<=r;i++){
                    System.out.print(arr[i]+" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) throws Exception {
        queueA q = new queueA();
        System.out.println(q.isEmpty());
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.display();  // 1 2 3 4
        q.remove();
        q.display();  // 2 3 4
        System.out.println(q.peek()); // 2
        System.out.println(q.size);  // 3
        
    }
}
