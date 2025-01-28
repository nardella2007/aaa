class Rettangolo {
    private int altezza, larghezza;

    public int Area() {
        return altezza * larghezza;
    }

    public int getAltezza() { return altezza; }
    public void setAltezza(int altezza) { this.altezza = altezza; }

    public int getLarghezza() { return larghezza; }
    public void setLarghezza(int larghezza) { this.larghezza = larghezza; }
}

public class es07 {
    public static void main(String[] args) {
        Rettangolo r = new Rettangolo();
        r.setAltezza(2);
        r.setLarghezza(5);
        System.out.println("L'area del rettangolo è: " + r.Area());
    }
}
