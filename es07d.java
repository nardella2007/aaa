import java.util.Scanner;

class Prodotto {
    private String nome;
    private double prezzo;
    private int quantita;

    public void setNome(String nome) { this.nome = nome; }
    public String getNome() { return nome; }

    public void setPrezzo(double prezzo) { this.prezzo = prezzo; }
    public double getPrezzo() { return prezzo; }

    public void setQuantita(int quantita) { this.quantita = quantita; }
    public int getQuantita() { return quantita; }

    public double calcolaValoreTotale() {
        return prezzo * quantita;
    }
}

public class es07d {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Prodotto p = new Prodotto();

        System.out.print("Inserisci il nome del prodotto: ");
        p.setNome(sc.nextLine());

        System.out.print("Inserisci il prezzo del prodotto: ");
        p.setPrezzo(sc.nextDouble());

        System.out.print("Inserisci la quantità del prodotto: ");
        p.setQuantita(sc.nextInt());

        System.out.println("Nome: " + p.getNome());
        System.out.println("Prezzo: " + p.getPrezzo());
        System.out.println("Quantità: " + p.getQuantita());
        System.out.println("Valore totale: " + p.calcolaValoreTotale());

        sc.close();
    }
}


