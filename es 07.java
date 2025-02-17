class ProdottoElettronico
protected string nome;
protected doubleprezzo;
pubblic ProdottoElettronico(string nome, double prezzo){
this.nome= nome;
this.prezzo= prezzo;
}
public void StampaDettagli(){
    System.out.println("nome:  " + nome + ", prezzo: " + prezzo);
}

class Smartphone extends ProdottoElettronico {
    private string nome;
    private int memoria;

    
}