package dao;
        
import model.Funcionario;
import connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.Veiculo;
public class GerenteDAO {

public void CadastrarFuncionario(Funcionario vei){

   Connection conexao = ConnectionFactory.getConnection();
   
   //2°
   PreparedStatement comandosql = null;
   
   //3°
   try{
   comandosql = conexao.prepareStatement("INSERT INTO funcionario"
           + "(nome, foto, datanasc, email, cpf, rg, telefone, num_pis, estado, cidade, login, senha)"
           + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
   
   comandosql.setString(1, vei.getNome());
   comandosql.setBytes(2, vei.getFoto());
   comandosql.setString(3, vei.getDatNascimento());
   comandosql.setString(4, vei.getEmail());
   comandosql.setString(5, vei.getCPF());
   comandosql.setString(6, vei.getRG());
   comandosql.setString(7, vei.getTelefone());
   comandosql.setString(8, vei.getNumeroPIS());
   comandosql.setString(9, vei.getEstado());
   comandosql.setString(10, vei.getCidade());
   comandosql.setString(11, vei.getLogin());
   comandosql.setString(12, vei.getSenha());
   
   comandosql.executeUpdate();
   
   JOptionPane.showMessageDialog(null, "Funcionário  cadastrado com sucesso!", "Vilet's Concessionária", JOptionPane.INFORMATION_MESSAGE);
   
   } catch(SQLException ex){
       System.err.println(ex);
   } finally{
       ConnectionFactory.closeConnection(conexao, comandosql);
   }
      
}

public ArrayList<Funcionario> ListarFuncionarios(){
    
    Connection conexao = ConnectionFactory.getConnection();
    PreparedStatement stmt = null;
    ResultSet rs = null;
    
    //imprimir todos os funcionarios na lista...
   ArrayList<Funcionario> Funcionarios = new ArrayList<>();
    
    try{
       stmt = conexao.prepareStatement("SELECT idfuncionario, nome, datanasc, email, cpf, rg, telefone, num_pis, estado, cidade, login from funcionario");
       rs = stmt.executeQuery();
       
       while(rs.next()){
       Funcionario fun = new Funcionario();
       fun.setId(rs.getInt("idfuncionario"));
       fun.setNome(rs.getString("nome"));
       fun.setDatNascimento(rs.getString("datanasc"));
       fun.setEmail(rs.getString("email"));
       fun.setCPF(rs.getString("cpf"));
       fun.setRG(rs.getString("rg"));
       fun.setTelefone(rs.getString("telefone"));
       fun.setNumeroPIS(rs.getString("num_pis"));
       fun.setEstado(rs.getString("estado"));
       fun.setCidade(rs.getString("cidade"));
       fun.setLogin(rs.getString("login"));
       
       Funcionarios.add(fun);
        
       }
       
    } catch(SQLException ex){
        JOptionPane.showMessageDialog(null, "Erro ao listar funcionarios.", "Vilet's Hotel Informa...", JOptionPane.ERROR_MESSAGE);
        System.out.println(ex);
        
    } finally{
        ConnectionFactory.closeConnection(conexao, stmt, rs);
    }
    return Funcionarios;
  
}
public void alterarDados(Funcionario fun){
 
//1° - abrir a conexão.    
Connection conexao = ConnectionFactory.getConnection();

//2° - utilizar o preparedstatement para identificar meu comando sql
PreparedStatement stmt = null;

try{
   stmt = conexao.prepareStatement("UPDATE funcionario SET nome = ? , datanasc = ?, email = ?, cpf = ?, rg = ?, telefone = ?, num_pis = ?, estado = ?, cidade = ?, login = ? where cpf = ?"); 
   stmt.setString(1, fun.getNome());
   stmt.setString(2, fun.getDatanasc());
   stmt.setString(3, fun.getEmail());
   stmt.setString(4, fun.getCPF());
   stmt.setString(5, fun.getRG());
   stmt.setString(6, fun.getTelefone());
   stmt.setString(7, fun.getNumeroPIS());
   stmt.setString(8, fun.getEstado());
   stmt.setString(9, fun.getCidade());
   stmt.setString(10, fun.getLogin());
   stmt.setString(11, fun.getCPF());
   
   stmt.executeUpdate();
        JOptionPane.showMessageDialog(null, "Atualizado com sucesso!", "Vilet's Muscles Informa...", JOptionPane.INFORMATION_MESSAGE);
   
}catch(SQLException ex) {
        JOptionPane.showMessageDialog(null, "Erro ao Atualizar.", "Vilet's Muscles Informa...", JOptionPane.ERROR_MESSAGE);
        System.out.println(ex);
        
} finally {
   ConnectionFactory.closeConnection(conexao, stmt);
}

}

public void excluirFuncionario(Funcionario fun){
    
    Connection conexao = ConnectionFactory.getConnection();
    PreparedStatement stmt = null;
  
    try {
        
       stmt = conexao.prepareStatement("DELETE FROM funcionario where cpf = ?");
       stmt.setString(1, fun.getCPF());
       stmt.execute();
        
        JOptionPane.showMessageDialog(null, "Cliente excluído.", "Vilet's Muscles informa...", JOptionPane.ERROR_MESSAGE);
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Erro ao excluir!", "Vilet's Hotel informa...", JOptionPane.ERROR_MESSAGE);
        System.out.println(ex);
    } finally{
    ConnectionFactory.closeConnection(conexao, stmt);
  }
 }
public ArrayList<Veiculo> ListarVeiculos(){
    
    Connection conexao = ConnectionFactory.getConnection();
    PreparedStatement stmt = null;
    ResultSet rs = null;
    
    //imprimir todos os funcionarios na lista...
   ArrayList<Veiculo> veiculos = new ArrayList<>();
    
    try{
       stmt = conexao.prepareStatement("SELECT idveiculo, imgCarro, modelo, fabricante, cor, ano, preco, numChassi, descricao, quilometragem from veiculo");
       rs = stmt.executeQuery();
       
       while(rs.next()){
       Veiculo vei = new Veiculo();
       vei.setId(rs.getInt("idveiculo"));
       vei.setFoto(rs.getBytes("imgCarro"));
       vei.setModelo(rs.getString("modelo"));
       vei.setFabricante(rs.getString("fabricante"));
       vei.setCor(rs.getString("cor"));
       vei.setAno(rs.getString("ano"));
       vei.setPreco(rs.getFloat("preco"));
       vei.setNumChassi(rs.getString("numChassi"));
       vei.setDescricao(rs.getString("descricao"));
       vei.setQuilometragem(rs.getInt("quilometragem"));

       veiculos.add(vei);
        
       }
       
    } catch(SQLException ex){
        JOptionPane.showMessageDialog(null, "Erro ao listar funcionarios.", "Vilet's Hotel Informa...", JOptionPane.ERROR_MESSAGE);
        System.out.println(ex);
        
    } finally{
        ConnectionFactory.closeConnection(conexao, stmt, rs);
    }
    return veiculos;
  
}
}

