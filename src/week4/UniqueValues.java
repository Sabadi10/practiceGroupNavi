package week4;

public class UniqueValues {
    public static void main(String[] args)
    {
        String str = "GYFTGFSAHFGAHFSG";

        for (int i = 0; i < str.length(); i++)
        {
            int result = 0;
            for (int j = 0; j < str.length(); j++)
            {
                // checking if two characters are equal
                if (str.charAt(i) == str.charAt(j) && i != j)
                {
                    result = 1;
                    break;
                }
            }
            if (result == 0)
                System.out.print(str.charAt(i));
        }
    }
}


