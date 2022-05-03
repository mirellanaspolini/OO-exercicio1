package introducao.exercicio1;

public class Livro {
    private String titulo;
    private float valor;
    private boolean esgotado;
    private Autor escritor;
    
    public String toString() {
        StringBuilder montador = new StringBuilder();
        montador.append("\nTitulo: ");
        montador.append(getTitulo());
        montador.append("\nValor: ");
        montador.append(getValor());
        montador.append("\nEsgotado: ");
        montador.append(isEsgotado());
        montador.append("\nAutor Nome: ");
        montador.append(getEscritor().getNome());
        montador.append("\nAutor Data Nascimento: ");
        montador.append(getEscritor().getDataNascimento());

        return montador.toString();
    }
    public Livro(String titulo){
        this.titulo = titulo;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public float getValor() {
        return valor;
    }
    public void setValor(float valor) {
        this.valor = valor;
    }
    public boolean isEsgotado() {
        return esgotado;
    }
    public void setEsgotado(boolean esgotado) {
        this.esgotado = esgotado;
    }
    public Autor getEscritor() {
        return escritor;
    }
    public void setEscritor(Autor escritor) {
        this.escritor = escritor;
    }
}