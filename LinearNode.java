public class LinearNode<T> {
  private LinearNode<T> next;
  private T element;

  //Default constructor
  public LinearNode() {
    next = null;
    element = null;
  }

  //Parameterized constructor
  public LinearNode(T elem) {
    next = null;
    element = elem;
  }

  public LinearNode<T> getNext() {
    return next;
  }

  public void setNext(LinearNode<T> node) {
    //TASK: sets next to reference the next node in the list
    next = node;
  }

  public T getElement() {
    //TASK: return the element stored in this node
    return element;
  }

  public void setElement(T elem) {
    //TASK: Set the element in this node to param elem
    element = elem;
  }
}
