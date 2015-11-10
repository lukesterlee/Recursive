package nyc.c4q.lukesterlee;

public class Main {

    public static boolean isEvenWord(String word) {
        if (word.length() == 0)
            return true;
        char first = word.charAt(0);
        word = word.substring(1);
        if (word.contains(first + "")) // explain the + "" (I get it, but its useful to be clear with stuff like that)
            return isEvenWord(word.replaceFirst(first + "", ""));
        return false;
    }
// this is perfect, I love how short it is and how many test cases you have

    public static void main(String[] args) {
	// write your code here

        System.out.println(isEvenWord("appeases"));
        System.out.println(isEvenWord("tattletale"));
        System.out.println(isEvenWord("arraigning"));
        System.out.println(isEvenWord("aabbccddee"));
        System.out.println(isEvenWord("abcdabcd"));
        System.out.println(isEvenWord("abcddbcaffff"));

        System.out.println();

        System.out.println(isEvenWord("banana"));
        System.out.println(isEvenWord("abc"));
        System.out.println(isEvenWord("appeasess"));
        System.out.println(isEvenWord("tatletale"));
        System.out.println(isEvenWord("abcd"));
    }
}
