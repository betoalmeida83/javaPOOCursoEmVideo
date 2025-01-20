package aula09;

public class Livro implements Publicacao {

    private String titulo;
    private String autor;
    private int totPaginas;
    private int pagAtual;
    private boolean aberto;
    private Pessoa leitor;

    public String detalhes() {
        return "*** Dados do Livro ***" +
                "\nTitulo: " + titulo +
                "\nAutor: " + autor +
                "\nTotal de Paginas: " + totPaginas +
                "\nPágina Atual: " + pagAtual +
                "\nAberto: " + aberto +
                "\n *** Dados do Leitor ***" +
                "\nNome: " + leitor.getNome() +
                "\nIdade: " + leitor.getIdade() + " anos" +
                "\nSexo: " + leitor.getSexo();
    }

    public Livro(String titulo, String autor, int totPaginas, Pessoa leitor) {
        this.titulo = titulo;
        this.autor = autor;
        this.totPaginas = totPaginas;
        this.aberto = false;
        this.pagAtual = 0;
        this.leitor = leitor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getTotPaginas() {
        return totPaginas;
    }

    public void setTotPaginas(int totPaginas) {
        this.totPaginas = totPaginas;
    }

    public int getPagAtual() {
        return pagAtual;
    }

    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }

    public boolean isAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }

    @Override
    public void abrir() {
        this.aberto = true;
    }

    @Override
    public void fechar() {
        this.aberto = false;
    }

    @Override
    public void folhear(int pagina) {
        if(pagina > this.getTotPaginas()){
            this.pagAtual = 0;
        }
        else {
            this.pagAtual = pagina;
        }
    }

    @Override
    public void avancarPag() {
        if(this.aberto == false) {
            this.pagAtual = 0;
        }
        else {
            this.pagAtual++;
            if(this.pagAtual > this.getTotPaginas()) {
                this.pagAtual = 0;
            }
        }
    }

    @Override
    public void voltarPag() {
        if(this.aberto == false) {
            this.pagAtual = 0;
        }
        else {
            this.pagAtual--;
            if(this.pagAtual < 0) {
                this.pagAtual = 0;
            }
        }
    }
}
