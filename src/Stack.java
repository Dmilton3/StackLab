/**
 * Created by Dewey Milton on 2/16/2016.
 */
import java.util.Arrays;
public class Stack {

    private final int MAX_SIZE = 30;
    private int top;
    private String[] stack;

    public Stack(int initialCapacity)
    {
        top = 0;
        stack = new String[initialCapacity];

    }

    public boolean isEmpty()
    {
        boolean isEmpty = top == 0;

        return isEmpty;
    }

    public void push(String input)
    {
        if(top < MAX_SIZE)
        {
            stack[top] = input;
            top++;
        }
        else
            System.out.println("Stack Overflow!!");
    }

    public String pop()
    {
        String result;
        if(!isEmpty())
        {
            result = this.peek();
            stack[top-1] = null;
            top--;
        }
        else
            result = null;

        return result;
    }

    public String peek()
    {
        if(isEmpty())
            return null;
        else
            return stack[top-1];
    }

    public String contents()
    {
        String result = "";

        for(int index = 0; index < stack.length; index++){
            if(stack[index] != null)
            result += stack[index] + ", "; }


        return result;
    }
}
