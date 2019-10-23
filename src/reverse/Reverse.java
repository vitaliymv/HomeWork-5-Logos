package reverse;

public class Reverse {

    public static void main(String[] args) {
        String str = "Java, is number 1 programing language!";
        System.out.println("Default stroke: " + str);
        reverse(str);
    }
    
    private static void reverse(String str) {
    	StringBuilder temp = new StringBuilder();
        StringBuilder res = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            if (Character.isAlphabetic(str.charAt(i))) {
                temp.append(str.charAt(i));
            } else {
                res.append(temp.reverse()).append(str.charAt(i));
                temp.setLength(0);
            }
        }
        System.out.println(res.toString());
    }
}
