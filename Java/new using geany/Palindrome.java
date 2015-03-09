public class Palindrome {
public static void main(String[] args) {
if(args.length == 0 || args.length > 1) {
System.out.println("Usage: java Palindrome <text>");
System.exit(-1);
}

String revString = new StringBuffer(args[0]).reverse().toString();

if(revString.equals(args[0]))
System.out.println(args[0] + " is palindrome.");
else
System.out.println(args[0] + " is not palindrome.");
}
}

