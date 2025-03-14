package String;

public class ReverseAString {
    public static void main(String[] args) {
        String s = "Anshuman Mahajan";
        StringBuffer sb = new StringBuffer();

        for (int i = s.length() - 1; i >= 0; i--) {
            sb.append(s.charAt(i));
        }
        sb.toString();
        System.out.println(sb);
    }
}
