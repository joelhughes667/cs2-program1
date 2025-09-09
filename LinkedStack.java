import java.util.EmptyStackException;

public class LinkedStack<T> implements StackADT<T> {
  private LinearNode<T> top;  //A reference to the top of the stack
  private int count;       //The number of items on the stack

  //Constructor
  public LinkedStack() {
    count = 0;
    top = null;
  }

  public T pop() {
    //Removes and returns the top item on the stack
    if (top == null)
      throw new EmptyStackException();
    else if (count == 1){
      T current = top.getElement();
      top = null;
      count = 0;
      return current;
      }
    else{
      T current = top.getElement();
      top = top.getNext();
      count--;
      return current; 
      }
  }

  public T peek() {
    //Returns the first item in the list
    //currently not implemented
    if (top == null)
      throw new EmptyStackException();
    else
      return top.getElement();
  }

  public void push (T element) {
    //Add this data to the top of the stack
    LinearNode<T> temp = new LinearNode<T>(element);
    temp.setNext(top);     //Set next field to head references
    top = temp;            //Set head to reference the new node
    count++;
  }

  public boolean isEmpty() {
    //TASK: return true if 0 items on the stack; false otherwise
    if (count == 0)
      return true;
    else
      return false; 
  }

  public boolean contains(T element){
    boolean result = false;
    if (top == null)
      return false;
    else{
      LinearNode<T> current = top;
      while (current.getNext() != null){
        if (current.getElement().equals(element)){
          result = true;
          break;
        }
       current = current.getNext();
      }
    }
    return result;
  }

  // helper method
  public static boolean isOperand(char c){
    if((c>='a' && c<='z') ||(c>='A' && c<='Z') || (c>='0' && c<='9')){
      return true;
    }else{
      return false;
    }
  }


  // helper method
  public static boolean isOperator(char c){
    if ((c == '+' || c == '-' || c == '*' || c == '/'))
      return true;
    else
      return false;
  }

  public static int precedence_order(char c){
    if(c == '*' || c == '/' ){
      return 2;
   }else {
      return 1;
   }
  }
 

  public String toString() {
    //Returns the list contents as a String
    LinearNode<T> trav = top;
    String cat = "";
    while (trav != null){
      cat = cat + trav.getElement().toString();
      trav = trav.getNext();
    }
    return cat;
  }
}
