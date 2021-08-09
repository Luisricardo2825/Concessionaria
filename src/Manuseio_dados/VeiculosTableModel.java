/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Manuseio_dados;

import java.util.ArrayList;
import java.util.List;
import model.Veiculo;

/**
 *
 * @author luis_
 */
public class VeiculosTableModel {
       
private List<Veiculo> veiculos= new ArrayList<>(); //veiculos da tabela.
    private String[] colunas = {"ID", "Imagem", "Modelo","Fabricante", "Cor", "Ano","Preço", "Nº Chassi", "Descrição", "Quilometragem"}; //colunas da tabela.

    
    public String getColumnName(int column) { //altera o nome da coluna da tabela.
        return colunas[column]; //To change body of generated methods, choose Tools | Templates.
        //identifica automaticamente a coluna.
    }
    
    
    
    public int getRowCount() { //qtd de linhas.
        return veiculos.size(); //retorna a quantidade de linhas, ou seja, quantidade de produtos.
    }

    
    public int getColumnCount() { //qtd de colunas.
        return colunas.length;
    }

    
    public Object getValueAt(int linha, int coluna) { 
    //conseguimos pegar os valores da tabela com ele, porém, utilizados o DefaultTableModel no JFrame.
    //selecionaremos um valor da tabela.
    switch(coluna){
        //se a coluna for 0, imprimirá a linha que o usuário selecionar.
        //etc etc...
        //o veiculos irá pegar o que o get retorna.
        case 0:
         return veiculos.get(linha).getId();
        case 1: //2° coluna  
         return veiculos.get(linha).getFoto();
       case 2:
        return veiculos.get(linha).getModelo();
       case 3:
           return veiculos.get(linha).getFabricante();
       case 4:
           return veiculos.get(linha).getCor();
       case 5:
           return veiculos.get(linha).getAno();
       case 6:
           return veiculos.get(linha).getPreco();
       case 7:
           return veiculos.get(linha).getNumChassi();
       case 8:   
           return veiculos.get(linha).getDescricao();
       case 9:
           return veiculos.get(linha).getQuilometragem();

           
    }
    return null;
  }

    
    public void setValueAt(Object valor, int linha, int coluna) {
        
       switch(coluna){
        
     case 0:
         veiculos.get(linha).getId(); 
        break;
           
      case 1:
          veiculos.get(linha).setFoto((byte[]) valor);
        break;
         
       case 2:
            veiculos.get(linha).setModelo((String) valor);   
           break;
        
      case 3:
           veiculos.get(linha).setFabricante((String) valor);
          break;
          
       case 4:
           veiculos.get(linha).setCor((String) valor);
           break;
           
       case 5:
           veiculos.get(linha).setAno((String) valor);
           break;
           
       case 6:
           veiculos.get(linha).setPreco((float) valor);
           break;
           
        
        case 7:
           veiculos.get(linha).setNumChassi((String) valor);
           break;
        
        case 8:
           veiculos.get(linha).setDescricao((String) valor);
           break;
       
        case 9:
           veiculos.get(linha).setQuilometragem(Integer.parseInt((String) valor));
           
        }
       //this.fireTableRowsUpdated(linha, linha);
    } 
}
