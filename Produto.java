public class Produto {
    private String nome;
    private int id;
    private double preco;
    private double qtd;
    private String tipoUn;
    private double estqMin;
    public Categoria cate = new Categoria();

    // -------x----------------x--------
    public Produto(String nome, int id, double preco, double qtd, String tipoUn, double estqMin, Categoria i) {
        setNome(nome);
        setId(id);
        setPreco(preco);
        setQtd(qtd);
        setTipoUn(tipoUn);
        setEstqMin(estqMin);
        setCate(i);
    }

    // -------x----------------x--------
    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    // -------x----------------x--------
    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    // -------x----------------x--------
    public double getPreco() {
        return this.preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    // -------x----------------x--------
    public double getQtd() {
        return this.qtd;
    }

    public void setQtd(double qtd) {
        this.qtd = qtd;
    }

    // -------x----------------x--------
    public String getTipoUn() {
        return this.tipoUn;
    }

    public void setTipoUn(String tipoUn) {
        this.tipoUn = tipoUn;
    }

    // -------x----------------x--------
    public double getEstqMin() {
        return this.estqMin;
    }

    public void setEstqMin(double estqMin) {
        this.estqMin = estqMin;
    }

    // -------x----------------x--------
    public Categoria getCate() {
        return this.cate;
    }

    public void setCate(Categoria cate) {
        this.cate = cate;
    }

    // -------x----------------x--------
    public String getQtdUn() {
        return this.qtd + " " + this.getTipoUn();
    }

    @Override
    public String toString() {
        return this.id + " - " + this.nome;
    }

    // -------x----------------x--------
}