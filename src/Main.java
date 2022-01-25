import java.util.Arrays;


public class Main {
    public static void main(String[] args) {
        String numFone = "Это электронная 890379945 база  89268034567. Телефонных +79296542345 номеров 89458679789 абонентов сети.";
        System.out.println("Текст  с номерами телефонов " + numFone);

        CorrectNum correct = new CorrectNum();

        String[] twoNum = new String[10];
        String[] threeNum = new String[10];
        twoNum = correct.searchNum(numFone, "8\\d{10}\\b");
        threeNum = correct.searchNum(numFone, "" + "7\\d{10}\\b");
        System.out.println(Arrays.toString(twoNum));
        System.out.println(Arrays.toString(threeNum));


    }
}
