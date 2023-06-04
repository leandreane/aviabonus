// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        int ticketPrice = 17500; // Стоимость билета
        int oneMile = 20; // Стоимость одной бонусной мили

        System.out.println("Бесплатные мили за перелёт:");
        System.out.println((ticketPrice / oneMile) + " бонусных миль");

        BonusMilesService service = new BonusMilesService();
        int price = 10000;
        int miles = service.calculate(price);

        System.out.println("При оплате на 10000 ");
        System.out.println(miles + " бонусных миль");
    }

}