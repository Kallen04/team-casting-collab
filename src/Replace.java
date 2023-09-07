public class Replace{

        public static void main(String[] args) {

            String str = "xcodeX";

            str = str.replace('x', 'a').replace('X', 'a');

//or we can implement toLowerCase() method
            str = str.toLowerCase();

            System.out.println(str);

            System.out.println("==============");

            String original = " Coding is fun!     ";
            System.out.println(original);
            System.out.println(original.trim());

        }
}


