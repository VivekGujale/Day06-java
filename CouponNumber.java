//Coupon Numbers Program

public class CouponNumber {
    public static void main(String[] args) {
        char[] chars = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWX0123456789".toCharArray();
        int n = 100000;
        int random = (int) (Math.random() * n);
        //Setting string
        StringBuffer a = new StringBuffer();

        while (random > 0) {
            //adding charactors
            a.append(chars[random % chars.length]);
            random = random / chars.length;
        }
        //value conveting to string
        String couponCode = a.toString();
        System.out.println("Coupon code is " + couponCode);
    }
}
