public class angka {
    int angka;

    public void tebakAngka() {
        int tebakan = (int) (Math.random() * 100) + 1;
        System.out.println("Tebak angka antara 1 sampai 100:");
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int input = 0;
        while (input != tebakan) {
            input = scanner.nextInt();
            if (input < tebakan) {
                System.out.println("Tebakan Anda terlalu kecil, coba lagi:");
            } else if (input > tebakan) {
                System.out.println("Tebakan Anda terlalu besar, coba lagi:");
            } else {
                System.out.println("Selamat! Anda menebak angka yang benar.");
            }
        }
        scanner.close();
    }

    public static void main(String[] args) {
        angka game = new angka(); 
        hejpakar pakar = new hejpakar();
        pakar.hej();
        game.tebakAngka();
    }
}
