class Stack { 
    //Please read sample.java file before starting.
    //Kindly include Time and Space complexity at top of each file

    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() { 
        // Write your code here 
        return (top == -1); 
    } 

    Stack() { 
        // Initialize your constructor 
        top = -1;
    } 
  
    boolean push(int x) { 
        // Check for stack Overflow
        // Write your code here
        if (top == MAX - 1) {
            System.out.println("Overflow");
            return false;
        }
        a[++top] = x;//element is pushed to array for stack
        return true;
    } 
  
    int pop() { 
        // If empty return 0 and print " Stack Underflow"
        // Write your code here
        if (top == -1) {
            System.out.println("Underflow");
            return 0;
        }
        return a[top--];
    } 
  
    int peek() { 
        // Write your code here
        if (top == -1) {
            System.out.println("Underflow");
            return 0;
        }
        return a[top];
    } 

    void print() { 
        for (int i = top; i > -1; i--) { 
            System.out.print(" " + a[i]); 
        }
        System.out.println(); // Add a newline for better output readability
    } 
} 
  
// Driver code 
class Main { 
    public static void main(String args[]) { 
        Stack s = new Stack(); 
        s.push(10); 
        s.push(20); 
        s.push(30); 
        s.print();
        System.out.println(s.pop() + " Popped from stack"); 
        s.print();
    } 
}
