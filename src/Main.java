import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Main {
    public static void main(String[] args) {
        String numFone = "Это электронная 89037994521 база  89268034567 телефонных номеров 89458679789 абонентов сети";
        System.out.println("Строка с номером телефона " + numFone);
        //  String[] oneNum = numFone.split("8\\d{10}");
        Pattern pattern = Pattern.compile("8\\d{10}");
        Matcher matcher = pattern.matcher(numFone);
        System.out.println(matcher);
        CorrectNum correct = new CorrectNum();
        String[] oneNum = new String[10];
        int i = 0;
        while (matcher.find()) {
            int start = matcher.start();
            int end = matcher.end();
            oneNum[i] = numFone.substring(start, end);
            System.out.println(oneNum[i]);
            i++;
        }

    }
}
