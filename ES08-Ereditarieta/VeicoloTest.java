class Veicolo {
    private String marca;
    private String modello;

    //costruttore
    public Veicolo(String marca, String modello) {
        this.marca = marca;
        this.modello = modello;
    }

    //metodo
    public void stampaDettagli() {
        System.out.println("Marca: " + marca + ", Modello: " + modello);
    }
}


public class VeicoloTest {

    public static void main(String[] args) {
        Veicolo vec1 = new Veicolo ("Ferrari", "f40");
        vec1.stampaDettagli();   

        Veicolo vec2 = new Veicolo ("Mercedes", "benz");
        vec2.stampaDettagli();    
    }
}