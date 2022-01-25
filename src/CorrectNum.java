import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CorrectNum {


    public String correctN(String num) {
        //преобразуем номера телефонов в необходимом нам формате
        StringBuilder builder = new StringBuilder();
        String partNum1 = num.substring(1, 4);
        String partNum2 = num.substring(4, 7);
        String partNum3 = num.substring(7, 9);
        String partNum4 = num.substring(9);
        builder.append("+7" + "(" + partNum1 + ")" + partNum2 + "-" + partNum3 + "-" + partNum4);
        return builder.toString();

    }

    public String[] searchNum(String text, String regular) {
//Производим поиск по тексту номеров телефонов по шаблонам и выводим их в консоль
        Pattern pattern = Pattern.compile(regular);
        Matcher matcher = pattern.matcher(text);
        String[] oneNum = new String[100];
        int i = 0;
        while (matcher.find()) {
            int start = matcher.start();
            int end = matcher.end();
            oneNum[i] = correctN(text.substring(start, end));
            System.out.println(oneNum[i]);
            i++;
        }
        return oneNum;
    }
}
