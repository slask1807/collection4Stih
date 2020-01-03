import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Test {
    private static final String SONNET =
            "Мороз и солнце день чудесный,\n"+
                    "Еще ты дремлешь друг прелестный,\n"+
                    "Пора красавица проснись,\n"+
                    "Открой сомкнуты негой взоры\n"+
                    "Навстречу северной Авроры,\n";
    private static final Comparator<String> LINE_LENGTH_COMPARATOR = new Comparator<String>() {
        @Override
        public int compare(String o1, String o2) {
            return o1.length() - o2.length();
        }
    };

    public static void main(String[] args) {
        List<String> lines = Arrays.asList(SONNET.split("\n"));
        System.out.println(lines);

        Collections.sort(lines, LINE_LENGTH_COMPARATOR);
        System.out.println(lines);
    }
}
