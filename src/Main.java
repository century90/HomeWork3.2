public class Main {

    public static void main(String[] args) {
        int price = 3888; // стоимость билета
        int rubleForMile = 20; // количество рублей для 1 бонусной мили
        int bonus = price / rubleForMile; // размер бонуса

        System.out.println(bonus + " бонусных миль");
    }
}
