public class Main {
    //Ищем номера телефонов в тексте по 2 шаблонам и выводим их на консоль
    public static void main(String[] args) {
        String numFone = "Это электронная 890379945 база  89268034567. Телефонных +79296542345 номеров 89458679789 абонентов сети.";
        System.out.println("Текст  с номерами телефонов " + numFone);

        CorrectNum correct = new CorrectNum();

        correct.searchNum(numFone, "8\\d{10}\\b");
        correct.searchNum(numFone, "" + "7\\d{10}\\b");

    }
}
