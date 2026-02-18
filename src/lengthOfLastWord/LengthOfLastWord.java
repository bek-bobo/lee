package lengthOfLastWord;


public class LengthOfLastWord {
    public static void main(String[] args) {

        String s = "   fly me   to   the        ";


//        if (s.length() == 0) {
//            System.out.println("nothing");
//        }
        int counter = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == ' ') {
                counter++;
            } else {
                break;

            }
        }

        int secCounter = 0;
        String sub = s.substring(0, s.length() - counter);

        for (int i = sub.length() - 1; i >= 0; i--) {
            if (s.charAt(i) != ' ') {
                secCounter = i;
            } else {
                break;

            }
        }
        sub = s.substring(secCounter, s.length() - counter);

        System.out.println(sub);
    }

}
