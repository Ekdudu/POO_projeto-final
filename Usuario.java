import java.util.Date;

public class Usuario {
    private int id;
    private String nome;
    private String cpf;
    private String sexo;
    private Date dataNasc;
    private String cep;
    private int cargo;
    private String login;
    private String senha;

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
    public String getCpf() {
        return this.cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    // -------x----------------x--------
    public String getSexo() {
        return this.sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    // -------x----------------x--------
    public Date getDataNasc() {
        return this.dataNasc;
    }

    public void setDataNasc(Date dataNasc) {
        this.dataNasc = dataNasc;
    }

    // -------x----------------x--------
    public String getCep() {
        return this.cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    // -------x----------------x--------
    public int getCargo() {
        return cargo;
    }

    public void setCargo(int cargo) {
        this.cargo = cargo;
    }

    // -------x----------------x--------
    public String getLogin() {
        return this.login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    // -------x----------------x--------
    public String getSenha() {
        return this.senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    // -------x----------------x--------
    public Usuario(int id, String nome, String cpf, String sexo, Date dataNasc, String telefone1, String telefone2,
            String cep, int num, String rua, String comp, String bairro, String cidade, String estado, int cargo,
            String login, String senha) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.sexo = sexo;
        this.dataNasc = dataNasc;
        this.cep = cep;
        this.cargo = cargo;
        this.login = login;
        this.senha = senha;
    }

    public Usuario() {

    }
    // -------x----------------x--------

    @Override
    public String toString() {
        return id + " - " + nome;
    }
}