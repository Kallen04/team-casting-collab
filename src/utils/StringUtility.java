package utils;

public class StringUtility {

    public static String revers(String str){
        String revers = "";

        for(int i = str.length()-1; i >= 0; i-- ){
            revers += str.charAt(i);
        }
        return revers;
    }

    public static String nameFormatting(String fullName) { // capitalization of the first and the last name
        return fullName.substring(0, 1).toUpperCase() + fullName.substring(1, fullName.indexOf(" ")).toLowerCase()
                + " " + fullName.substring(fullName.indexOf(" ") + 1, fullName.indexOf(" ") + 2).toUpperCase()
                + fullName.substring(fullName.indexOf(" ") + 2).toLowerCase();
    }



}
