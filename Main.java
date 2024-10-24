import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        MailDeliveryService typDelivery = null;//создали пустую переменную чтоб потом присвоить ей одно из необходимых значений
         while (typDelivery==null){ //пока неправильно, запрашивать выбор
             System.out.println("Каким способом вы хотите отправить письмо?");
             System.out.println("1 - DHL");
             System.out.println("2 - E-Mail");
             System.out.println("3 - Owl");
        int number = scanner.nextInt();
        if (number==1) {
            typDelivery = new DHL();
        } else if (number==2) {
            typDelivery= new Email();
        } else if (number==3) {
            typDelivery= new Owl();
        } else {

            System.out.println("Ошибка! Неправильный тип доставки. Повторите ввод: ");
        }}
        if (typDelivery!=null){
            Sender sender = new Sender();
            Sender.send(typDelivery);
        }
        System.out.println("Хорошего дня!");
    }
}
