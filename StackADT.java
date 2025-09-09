public interface StackADT<T> {
  public T pop();
  //Removes and returns the first item from the list

  public T peek();
  //Returns the first item in the list

  public void push (T data);
  //Returns the last item in the list

  public boolean isEmpty();
  //Returns true if the stack is empty

  public String toString();
  //Returns the list contents as a String
}
