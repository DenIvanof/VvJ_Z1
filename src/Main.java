public class Main {
    public static void main(String[] args) {

        int price;
        price = 13_676;
        int onemile = 20;
        int miles = (price / onemile);

        System.out.println("Рассчет количества начисленных миль за купленный билет.");
        System.out.println("Стоимость билета на самолет " + (price) + "руб.");
        System.out.println("Вам будет начислено за покупку билета " + (miles) + "миль");


    }
}