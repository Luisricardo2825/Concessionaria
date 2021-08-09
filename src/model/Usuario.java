package model;

public class Usuario {
    
    String nome;
    String datanasc;
    String email;
    String CPF;
    String RG;
    String telefone;
    String estado;
    String cidade;
    String login;
    String senha;
    byte[] foto;
 

    public byte[] getFoto() {
        return foto;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public String getCPF() {
        return CPF;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getRG() {
        return RG;
    }

    public String getLogin() {
        return login;
    }

    public String getSenha() {
        return senha;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setRG(String RG) {
        this.RG = RG;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getDatanasc() {
        return datanasc;
    }

    public void setDatanasc(String datanasc) {
        this.datanasc = datanasc;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    public void setFoto(byte[] foto) {
        this.foto = foto;
    }
    
}
