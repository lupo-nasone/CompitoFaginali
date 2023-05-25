/**
 * 
 * @author Matteo
 */
public class Semaforo {
    private int stato;
/**
 * 
 * @param stato
 */
    public Semaforo(int stato){
        this.stato = stato;
    }
    public synchronized void P(){
        while(stato == 0){
            try{
                wait();
            }
            catch(Exception e){
                System.out.println("errore in semaforo");
            }
        }
    }


    public synchronized void V(){
        stato = 1;
        notify();
    }
}
