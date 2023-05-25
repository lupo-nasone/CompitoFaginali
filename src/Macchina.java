/**
 * 
 * @author Matteo
 */

public class Macchina extends Thread{
    private int num;
    private String scuderia;
    private String pilota;
    private Semaforo sem;
    private Box box;
    
    

    /**
     * 
     * @param num
     * @param scuderia
     * @param pilota
     * @param box
     * @param sem
     */
    public Macchina(int num, String scuderia, String pilota, Box box, Semaforo sem) {
        this.num = num;
        this.scuderia = scuderia;
        this.pilota = pilota;
        this.box = box;
        this.sem = sem;
    }
    public int getNum() {
        return num;
    }
    public String getScuderia() {
        return scuderia;
    }
    public String getPilota() {
        return pilota;
    }
    public Semaforo getSem() {
        return sem;
    }
    public Box getBox() {
        return box;
    }
    

    @Override
    public void run(){
        for(int i = 1;i < 11;i++){
            try{
                Thread.sleep((int)(Math.random()*4000)+1000);
                if(i == 3 || i == 6 || i == 9){
                    sem.P();
                    box.cambioGomme(this.pilota);
                    sem.V();
                }
                System.out.println("Giro " + i + " completato da " + this.getPilota());
            }
            catch(Exception e){
                System.out.println("errore in macchina");
            }
        }
    }
    

    
}
