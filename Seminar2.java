package Lesson2;

public class Seminar2 {
    public static void main(String[] args) {
        concatMethod3();
    }

    private static void concatMethod3() {
        String str = "aaaabbbbbcccdddeff";
        StringBuilder sb = new StringBuilder();
        int counter = 1;
        char currChar = str.charAt(0);
        char nextChar = 0;

        for (int i = 0; i < str.length() - 1; i++) {
            nextChar = str.charAt(i + 1);
            if (currChar == nextChar){
                counter++;
            } else if (counter > 1){
                sb.append(currChar).append(counter);
                counter = 1;
                currChar = nextChar;
            } else {
                sb.append(currChar);
                currChar = nextChar;
                counter = 1;
            }

            
        }
        if (counter > 1){
            sb.append(currChar).append(counter);
        } else {
            sb.append(currChar);
        }

        System.out.println(sb);

    }
}
