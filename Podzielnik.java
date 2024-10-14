public class Podzielnik {
    public static int div(int n) {
        int a = 2;
        while (n%a != 0) a++;
        return n/a;
    }
    public static void main(String[] args) {
        int n;
        for (int i=0; i < args.length; i++) {
            try {
                n = Integer.parseInt(args[i]);
                System.out.println(n + " " + div(n));
            }
            catch (NumberFormatException ex) {
                System.out.println(args[i] + " nie jest liczba calkowita");
            }
            
        }
    }
}