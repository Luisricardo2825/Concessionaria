package Manuseio_dados;

import model.Funcionario;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class FuncionarioTableModel extends AbstractTableModel{
    
private List<Funcionario> funcionarios= new ArrayList<>(); //funcionarios da tabela.
    private String[] colunas = {"ID", "Nome", "Data de nascimento","Email", "CPF", "RG", "Telefone", "PIS", "Estado", "Cidade","Login"}; //colunas da tabela.

    @Override
    public String getColumnName(int column) { //altera o nome da coluna da tabela.
        return colunas[column]; //To change body of generated methods, choose Tools | Templates.
        //identifica automaticamente a coluna.
    }
    
    
    @Override
    public int getRowCount() { //qtd de linhas.
        return funcionarios.size(); //retorna a quantidade de linhas, ou seja, quantidade de produtos.
    }

    @Override
    public int getColumnCount() { //qtd de colunas.
        return colunas.length;
    }

    @Override
    public Object getValueAt(int linha, int coluna) { 
    //conseguimos pegar os valores da tabela com ele, porém, utilizados o DefaultTableModel no JFrame.
    //selecionaremos um valor da tabela.
    switch(coluna){
        //se a coluna for 0, imprimirá a linha que o usuário selecionar.
        //etc etc...
        //o funcionarios irá pegar o que o get retorna.
        case 0:
         return funcionarios.get(linha).getId();
        case 1: //2° coluna  
         return funcionarios.get(linha).getNome();
       case 2:
        return funcionarios.get(linha).getDatNascimento();
       case 3:
           return funcionarios.get(linha).getEmail();
       case 4:
           return funcionarios.get(linha).getCPF();
       case 5:
           return funcionarios.get(linha).getRG();
       case 6:
           return funcionarios.get(linha).getTelefone();
       case 7:
           return funcionarios.get(linha).getNumeroPIS();
       case 8:   
           return funcionarios.get(linha).getEstado();
       case 9:   
           return funcionarios.get(linha).getCidade();
       case 10:   
           return funcionarios.get(linha).getLogin();
           
    }
    return null;
  }

    @Override
    public void setValueAt(Object valor, int linha, int coluna) {
        
       switch(coluna){
        
     case 0:
         funcionarios.get(linha).getId(); 
        break;
           
      case 1:
          funcionarios.get(linha).setNome((String) valor);
        break;
         
       case 2:
            funcionarios.get(linha).setDatNascimento((String) valor);
           break;
        
      case 3:
           funcionarios.get(linha).setEmail((String) valor);
          break;
          
       case 4:
           funcionarios.get(linha).setCPF((String) valor);
           break;
           
       case 5:
           funcionarios.get(linha).setRG((String) valor);
           break;
           
       case 6:
           funcionarios.get(linha).setTelefone((String) valor);
           break;
        
        case 7:
           funcionarios.get(linha).setNumeroPIS((String) valor);
           break;
        
        case 8:
           funcionarios.get(linha).setEstado((String) valor);
           break;
           
        case 9:
           funcionarios.get(linha).setCidade((String) valor);
           break;
        
        case 10:
           funcionarios.get(linha).setLogin((String) valor);
           break;  
           
        }
       //this.fireTableRowsUpdated(linha, linha);
    }
    
    /*public void removeRow(int linha){ //excluindo um produto pela linha.
        this.funcionarios.remove(linha);
        this.fireTableRowsDeleted(linha, linha); //função específica do AbstractTableModel para deletar a linha.
    } */
    
}