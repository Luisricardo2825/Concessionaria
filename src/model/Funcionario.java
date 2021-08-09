package model;

public class Funcionario extends Usuario {
    
    String numeroPIS;
    int id;
    
    @Override
     public byte[] getFoto() {
        return foto;
    }

    @Override
    public void setFoto(byte[] foto) {
        this.foto = foto;
    }
    
    public int getId() {
        return id;
    }
    
    public void setId(int id) {
    
        this.id = id;
    }

    public String getNumeroPIS() {
        return numeroPIS;
    }

    @Override
    public String getNome() {
        return nome;
    }
    
    @Override
    public String getEmail() {
        return email;
    }
    
    @Override
    public String getCPF() {
        return CPF;
    }
    
    @Override
    public String getTelefone() {
        return telefone;
    }

    @Override
    public String getRG() {
        return RG;
    }
    
    @Override
    public String getLogin() {
        return login;
    }
    
    @Override
    public String getSenha() {
        return senha;
    }
    
    public void setNumeroPIS(String numeroPIS) {
        this.numeroPIS = numeroPIS;
    }
    
    @Override
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    @Override
    public void setEmail(String email) {
        this.email = email;
    }
    
    @Override
    public void setCPF(String CPF) {
        this.CPF = CPF;
    }
    
    @Override
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    
    @Override
    public void setRG(String RG) {
        this.RG = RG;
    }
    
    @Override
    public void setLogin(String login) {
        this.login = login;
    }
    
    @Override
    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    
    public void setDatNascimento(String datanasc){
        this.datanasc = datanasc;
    }
    
    public String getDatNascimento(){
        return this.datanasc;
    }
    
    @Override
    public void setEstado(String estado){
        this.estado = estado;
    }
    
    @Override
    public String getEstado(){
        return this.estado;
    }
    
    @Override
    public void setCidade(String cidade){
        this.cidade = cidade;
    }
    
    @Override
    public String getCidade(){
        return this.cidade;
    }
    
    
            
    
    
    
}
