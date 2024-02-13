public class vehicle{
    protected int ruedas;
    public vehicle(){
        System.out.println("Constructor de un vehiculo");
        ruedas = 0;
    }
    public int numRuedas(){return ruedas;}
    public void pitar(){
        System.out.println("No se pitar! soy un vehiculo");
    }
   
}