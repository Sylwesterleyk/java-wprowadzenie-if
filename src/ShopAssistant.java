public class ShopAssistant {
    public static void main(String[] args) {
        double FirstPc = 12444;
        double SecondPc = 2698;
        double ThirdPc = 1198;

        if (FirstPc <= SecondPc & FirstPc <= ThirdPc) {
            System.out.println("Najtańszy jest pierwszy komputer");
        }
        if (SecondPc <= FirstPc & SecondPc <= ThirdPc) {
            System.out.println("Najtańszy jest drugi komputer");
        }
        if (ThirdPc <= SecondPc & ThirdPc <= FirstPc) {
            System.out.println("Najtańszy jest trzeci komputer");
        }
    }
}
