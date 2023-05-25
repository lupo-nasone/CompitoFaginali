/**
 * 
 * @author Matteo
 */
public class Box{

    public Box(){

    }
    /**
     * 
     * @param name
     */
    public void cambioGomme(String name){
        System.out.println(name + " sta effettuando il pit stop");

        try{
            Thread.sleep((int)(Math.random()*4000)+1000);
        }
        catch(Exception e){
            System.out.println("errore nei");
        }
    }
    
}
