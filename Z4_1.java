package Recursion;

public class Z4_1 {

public static void main(String[] args) {
	System.out.println(foo(98,70));
}
	
public static int foo (int x, int y)
{
	if (y == 0)
 	    return x;
	else
 	    return foo(y, x % y);
}

}
//namira naj golqm obsht delitel