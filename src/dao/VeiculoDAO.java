package dao;

import connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import model.Veiculo;

public class VeiculoDAO {
    
   public void cadastrarVeiculo(Veiculo veiculo){
       
       Connection con = ConnectionFactory.getConnection();
       PreparedStatement stmt  = null;
       
       try {
           stmt = con.prepareStatement("insert into veiculo (imgCarro,modelo, fabricante, cor, ano, preco, numChassi, descricao) values (?, ?, ?, ?, ?, ?)");
           stmt.setBytes(1, veiculo.getFoto());
           stmt.setString(2, veiculo.getModelo());
           stmt.setString(3, veiculo.getFabricante());
           stmt.setString(4, veiculo.getCor());
           stmt.setString(5, veiculo.getAno());
           stmt.setFloat(6, veiculo.getPreco());
           stmt.setString(7, veiculo.getNumChassi());
           stmt.setString(8, veiculo.getDescricao());
           stmt.executeUpdate();
           
           JOptionPane.showMessageDialog(null, "Veículo cadastrado com sucesso!", "Vilet's Concessionária", JOptionPane.INFORMATION_MESSAGE);
           
           
           //verificação da tabela opcionais.
       } catch (SQLException ex) {
           System.err.println(ex);
       } finally{
           ConnectionFactory.closeConnection(con, stmt);
       }
   }
   
public void excluirVeiculo(Veiculo vei){
    
    Connection conexao = ConnectionFactory.getConnection();
    PreparedStatement stmt = null;
  
    try {
        
       stmt = conexao.prepareStatement("DELETE FROM veiculo where idveiculo = ?");
       stmt.setInt(1, vei.getId());
       stmt.execute();
        
        JOptionPane.showMessageDialog(null, "Veículo excluído.", "Vilet's Muscles informa...", JOptionPane.ERROR_MESSAGE);
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Erro ao excluir!", "Vilet's Hotel informa...", JOptionPane.ERROR_MESSAGE);
        System.out.println(ex);
    } finally{
    ConnectionFactory.closeConnection(conexao, stmt);
  }
 }

   
//the question is: numChassi e modeloVeiculo
//public List<Veiculo> BuscarVeiculo(String modeloVeiculo){
//    
//Connection conexao = ConnectionFactory.getConnection();
//
//PreparedStatement sql = null;
//
//ResultSet listamodeloRS = null;
//
//List <Veiculo> listaveiculos = new ArrayList<>();
//
//try {
//     sql = conexao.prepareStatement("SELECT * FROM veiculo where modelo LIKE ?");
//     
//     sql.setString(1, "%"+modeloVeiculo+"%");
//     
//     listamodeloRS = sql.executeQuery();
//     //verificar o resultado do resultset.
//     
//     while(listamodeloRS.next()){
//         //add os dados no array.
//         
//         Veiculo veiculo = new Veiculo();
//         
//         veiculo.setModelo(listamodeloRS.getString("modelo"));
//         veiculo.setFabricante(listamodeloRS.getString("fabricante"));
//         veiculo.setCor(listamodeloRS.getString("cor"));
//         veiculo.setAno(listamodeloRS.getString("ano"));
//         veiculo.setPreco(listamodeloRS.getFloat("preco"));
//         veiculo.setNumChassi(listamodeloRS.getString("numChassi"));
//         
//         listaveiculos.add(veiculo);
//        
//     }
//     
//} catch (SQLException ex) {
//       JOptionPane.showMessageDialog(null, "Erro ao buscar veículo.", " Vilet's Muscles Informa...", JOptionPane.ERROR_MESSAGE);
//        System.out.println(ex);
//        
//} finally{
//    ConnectionFactory.closeConnection(conexao, sql, listamodeloRS);
//}
//    return listaveiculos;
//}
   
}
