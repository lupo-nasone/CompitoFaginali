
public class App {
    public static void main(String[] args) throws Exception {
        Box b1 = new Box();
        Semaforo sem = new Semaforo(1);
        Macchina m1 = new Macchina(1, "ducati", "matteo", b1, sem);
        Macchina m2 = new Macchina(2, "kawasaki", "francesco", b1, sem);
        Macchina m3 = new Macchina(3, "yamaha", "beppe", b1, sem);
        m1.start();
        m2.start();
        m3.start();
        
        m1.join();
        m2.join();
        m3.join();
        
        System.out.println("GARA FINITA");
    }
}
