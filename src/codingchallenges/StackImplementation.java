package codingchallenges;
class RunnableStack{
    public static void main(String[] args) {
        StackImplementation.Stack stack = new StackImplementation.Stack(5);
        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println("Top element: " + stack.peek()); // 출력: 3
        System.out.println("Popped element: " + stack.pop()); // 출력: 3
        System.out.println("Top element after pop: " + stack.peek()); // 출력: 2
    }
}
public class StackImplementation {

    static class Stack{
        private int array[];
        private int top;
        private int capacity;
        public boolean isFull(){
         return top == capacity-1;
        }
        public boolean isEmpty(){
            return top == -1;
        }

        public Stack(int capacity) {
            this.array = new int[capacity];
            this.top = -1;
            this.capacity = capacity;
        }

        public void push(int item){
            if (isFull()){
                throw new RuntimeException("Stack is full");
            }
            array[++top] = item;
        }

        public int pop(){
            if(isEmpty()){
                throw new RuntimeException("Stack is Empty");
            }
            return array[top--];
        }

        public int peek(){
            return array[top];
        }
    }

}
