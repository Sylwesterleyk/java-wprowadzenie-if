public class ShopAssistant {
    public static void main(String[] args) {
        int distance = 500000000;
        int walk = 300;
        int bike = 2700;
        int car = 1000000;

        if(distance <= walk) {
            System.out.println("Idź pieszo");
        } else if (distance <= bike) {
            System.out.println("Jedź rowerem");
        } else if (distance <= car) {
            System.out.println("Jedź samochodem");
        } else if (distance >car){
            System.out.println("Leć samolotem");
        }

    }
}
