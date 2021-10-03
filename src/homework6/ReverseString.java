package homework6;

public class ReverseString
{
    // 5. Reverse given string

    //recursive function to reverse a string
    public String reverseString(String str)
    {
//checks if the string is empty
        if(str.isEmpty())
        {
            System.out.println("The sentence to be reversed: Write once, run anywhere");
//if the above condition is true returns the same string
            return str;
        }
        else
        {
            return reverseString(str.substring(1))+str.charAt(0);
        }
    }
    public static void main(String[] args)
    {
        ReverseString rs = new ReverseString();
        String resultantSting1 = rs.reverseString("Write once, run anywhere");
        System.out.println();
        System.out.print("Reversed: ");
        System.out.println(resultantSting1);
    }
}
