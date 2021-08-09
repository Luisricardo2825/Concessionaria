package model;


public class Cliente extends Usuario {
    
    String CNH; 
    String id_funcionario;

    //Gets
    @Override
    public byte[] getFoto() {
        return foto;
    }

    @Override
    public String getNome() {
        return nome;
    }

    public String getId_funcionario() {
        return id_funcionario;
    }

    public void setId_funcionario(String id_funcionario) {
        this.id_funcionario = id_funcionario;
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
    public String getRG() {
        return RG;
    }
    
    @Override
    public String getTelefone() {
        return telefone;
    }
    
    @Override
    public String getCidade() {
        return cidade;
    }
    
    @Override
    public String getEstado() {
        return estado;
    }
    
    public String getCNH() {
        return CNH;
    }
    
    @Override
    public String getDatanasc(){
        return datanasc;
    }

    //Sets
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
    public void setRG(String RG) {
        this.RG = RG;
    }
    
    @Override
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    
    @Override
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
    
    @Override
    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void setCNH(String CNH) {
        this.CNH = CNH;
    }
    
    @Override
    public void setDatanasc(String datanasc){
        this.datanasc = datanasc;
    }
    
    @Override
    public void setFoto(byte[] foto) {
        this.foto = foto;
    }
    
    
}
