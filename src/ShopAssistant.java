public class ShopAssistant {
    public static void main(String[] args) {
        double firstPc = 12444;
        double secondPc = 2698;
        double thirdPc = 1198;

        if (firstPc <= secondPc && firstPc <= thirdPc) {
            System.out.println("Najtańszy jest pierwszy komputer");
        }
        if (secondPc <= firstPc && secondPc <= thirdPc) {
            System.out.println("Najtańszy jest drugi komputer");
        }
        if (thirdPc <= secondPc && thirdPc <= firstPc) {
            System.out.println("Najtańszy jest trzeci komputer");
        }
    }
}
