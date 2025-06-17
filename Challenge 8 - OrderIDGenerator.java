package pkg_oop2ch;
import java.util.Random;

public class OrderIDGenerator {
    public static void main (String[] args) {
        Random random = new Random();
        String[] orderIDs = new String[7];

        for (int i = 0; i < orderIDs.length; i++) {
            char prefix = (char) (random.nextInt(5) + 'A');
            int number = random.nextInt(999) + 1;
            String suffix = String.format("%03d", number);
            orderIDs[i] = prefix + suffix;
        }
        for (String orderID : orderIDs) {
            if(orderID.startsWith("E")){
                System.out.println(orderID);
            }
        }
    }
}
