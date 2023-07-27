package Week3;
/*
Write a return method that can reverse negative number and return it as int.
First, we find the remainder of the given number by using the modulo (%) operator.
Multiply the variable reverse by 10 and add the remainder into it.
Divide the number by 10. Repeat the above steps until the number becomes 0.
*/
public class ReverseNegativeNumber {
    public static void main(String[] args){
            int number = -10001, reverse = 0;
            while(number != 0)
            {
                int remainder = number%10;
                reverse = reverse*10+remainder;
                number = number/10;
            }
            System.out.println("The reverse of the given number is: " + reverse);
        }
    }