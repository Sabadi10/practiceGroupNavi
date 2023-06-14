package Tasks;

public class RemoveDuplicates {
    public static void main(String[] args) {
        // //String -- Remove Duplicates
        //        //
        //        //Write a return method that can remove the duplicated values from String
        //        //Ex:  removeDup("AAABBBCCC")  ==> ABC

        String STR1 = "AHGDIEF;LGHFDGVCASVAS;.K0AS5ERV1";
        System.out.println(removeDup(STR1));

    }
    public static String removeDup(String STR1 ){
        String result = "";

        for (int i = 0; i < STR1.length(); i++) {
            char ch = STR1.charAt(i);
            for (int j = 0; j < STR1.length(); j++) {
                if (!result.contains(ch+"")){
                    result+= ch;

                }
            }
        }
        return result;
    }
}
