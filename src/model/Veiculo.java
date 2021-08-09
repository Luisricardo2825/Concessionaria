package model;

public class Veiculo extends Usuario{

public String modelo, fabricante, cor, ano, numChassi, descricao;
public float preco;
public int id, quilometragem;


//Get

public int getId() {
        return id;
    }

public String getModelo(){
    return modelo;
}

public String getDescricao(){
    return descricao;
}

@Override
public byte[] getFoto(){
    return foto;
}

public String getFabricante(){
    return fabricante;
}

public String getCor(){
    return cor;
}

public String getAno(){
    return ano;   
}

public int getQuilometragem(){
    return quilometragem;
  }


public String getNumChassi(){
    return numChassi;
}

public float getPreco() {
    return preco;
}

//Set
public void setModelo(String modelo){
    this.modelo = modelo;
}

@Override
    public void setFoto(byte[] foto) {
        this.foto = foto;
    }

public void setFabricante(String fabricante){
    this.fabricante = fabricante;
} 

public void setCor(String cor){
    this.cor = cor;
}

public void setAno(String ano){
    this.ano = ano;
}

public void setNumChassi(String numChassi){
    this.numChassi = numChassi;
}

public void setDescricao(String descricao){
    this.descricao = descricao;
}

public void setPreco(float preco) {
    this.preco = preco;
    }

public void setId(int id) {
        this.id = id;
    }

public void setQuilometragem(int quilometragem) {
        this.quilometragem = quilometragem;
    }
}
