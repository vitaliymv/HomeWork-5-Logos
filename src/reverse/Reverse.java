package reverse;

public class Reverse {

    public static void main(String[] args) {
        String str = "Java, is number 1 programing language!";
        System.out.println("Default stroke: " + str);
        System.out.println();
        buffer(str);
        System.out.println();
        builder(str);
        System.out.println();
        arrayChar(str);
        System.out.println();
    }

    private static void buffer(String str) {
        StringBuffer buffer = new StringBuffer(str);
        System.out.println("Reverse with buffer method: " + buffer.reverse());
    }

    private static void builder(String str) {
        StringBuilder builder = new StringBuilder(str);
        System.out.println("Reverse with builder method " + builder.reverse());
    }

    private static void arrayChar(String str) {
        char[] reverseArr = str.toCharArray();
        System.out.print("Reverse with arrayChar method: ");
        for (int i = reverseArr.length - 1; i >= 0; i--) {
            System.out.print(reverseArr[i]);
        }
    }
}
