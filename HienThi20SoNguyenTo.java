package SS1BT4;

public class HienThi20SoNguyenTo {
    public static void main(String[] args) {
        int dem = 3;
        for (int i = 2 ; ;i++) {

            if (isPrime(i)){
                System.out.print(i +", ");
                dem++;
            }
            if (dem == 20) {
                break;
            }
        }
    }

    public static boolean isPrime (int data) {
        int dem =0;
        for (int i = 2 ; i <= Math.sqrt(data) ; i++) {
            if (data % i ==0) {
                dem++;
            }
        }
        if (dem == 0) {
            return true;
        }
        return false;
    }
}
