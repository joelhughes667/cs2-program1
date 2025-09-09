import java.util.Scanner;

public class Postfix{
  public static void main(String [] args ){

    Scanner scan = new Scanner(System.in);

    System.out.println("Enter a expression in infix form: ");
    String expression = scan.nextLine();
    infixtopostfix(expression);
  }

  public static void infixtopostfix(String input){
    LinkedStack<Character> opstack = new LinkedStack<Character>();
    for (int c = 0; c < input.length(); c++){
      char ch = input.charAt(c);
      if (opstack.isOperand(ch))
        System.out.print(ch);
      else if (ch == '(')
        opstack.push(ch);
      else if (ch == ')'){
        while (!opstack.isEmpty() && opstack.peek() != '(')
          System.out.print(opstack.pop());
        opstack.pop();
      }
      else if (opstack.isOperator(ch)){
        while (!opstack.isEmpty() && opstack.isOperator(opstack.peek()) && opstack.precedence_order(opstack.peek()) >= opstack.precedence_order(ch)){
          System.out.print(opstack.pop());
        }
        opstack.push(ch);
      }
    }

    while (!opstack.isEmpty())
      System.out.print(opstack.pop());
    System.out.println();
  }
}
