
package astrapharm;
import java.sql.*;

public class DB_Model_AP {
    Connection con;
    Statement st;
    ResultSet rs;
    
    DB_Model_AP(){
         
    try{
        Class.forName("com.mysql.cj.jdbc.Driver");
    con=DriverManager.getConnection("jdbc:mysql://localhost:3306/AP_DB","root","");
     st=con.createStatement();
     System.out.println("DB is connected");
    }
    catch(Exception e){
        System.out.println(e);
    }
    }
    public static void main(String []args){
     DB_Model_AP db= new DB_Model_AP();
     
    }
    
    public ResultSet AdminLogin(String id,String pass){
     try{
         String sql="select* from admin where User_Admin='"+id+"' and Password_Admin='"+pass+"'";
       rs=st.executeQuery(sql);
     }
     catch(Exception e){
         System.out.println(e);
     }
        return rs;
    }
    
    public ResultSet Inventory(){
    try{
    String sql="select* from stock";
    rs=st.executeQuery(sql);
    }catch(Exception e){System.out.println(e);}
    return rs;
    }
    
    public int AddInventory(String name,String code,String quantity,String price) {
    int status=0;
    try{ 
        String sql="insert into stock values('"+name+"','"+code+"','"+quantity+"','"+price+"')";
    status=st.executeUpdate(sql);}
    catch(SQLException ex){
        System.out.println(ex);}
    return status;
    }
    
    public ResultSet SelectInventory(String medi){
    try{
    String sql="select*from stock where name='"+medi+"'";
    rs=st.executeQuery(sql);
    }catch(Exception e){System.out.println(e);}
    return rs;
    }
    
    public int updateInventory(String name,String code,String quantity,String price){
    int status=0;
    try{
        String sql="update stock set quantity='"+quantity+"' , price='"+price+"' where name='"+name+"' AND code='"+code+"'";
        status=st.executeUpdate(sql);
    }catch(Exception e){System.out.println(e);}
    
    return status;
    }
    
    public ResultSet Orders(){
    try{
     String sql="select* from order_customer";
     rs=st.executeQuery(sql);
    }catch(Exception e){System.out.println(e);
    }
    return rs;
    }
    
    
    
    public int CustomerRegister(String name,String id,String contact,String address,String pass) {
    int status=0;
    try{ 
        String sql="insert into customer values('"+name+"','"+id+"','"+contact+"','"+address+"','"+pass+"')";
    status=st.executeUpdate(sql);}
    catch(SQLException ex){
        System.out.println(ex);}
    return status;
    }
    public ResultSet CustomerLogin(String id,String pass){
     try{
         String sql="select* from customer where User_Customer='"+id+"' and Password_Customer='"+pass+"'";
       rs=st.executeQuery(sql);
     }
     catch(Exception e){
         System.out.println(e);
     }
        return rs;
    }
    
    public int AddToCart(String id,String medicine,String amount){
    int status=0;
    try{
        String sql="insert into cart values('"+id+"','"+medicine+"','"+amount+"')";
        status=st.executeUpdate(sql);
    }catch(Exception e){System.out.println(e);}
    
    return status;
    }
    
    public ResultSet ShowCart(String id){
     try{
         String sql="select* from cart where id='"+id+"'";
         rs=st.executeQuery(sql);
     }catch(Exception e){System.out.println(e);}
     return rs;   
    }
    
    public int CartDelete(String id,String qmed,String amount){
    int status=0;
    try{
    String sql="delete from cart where id='"+id+"' AND qmed='"+qmed+"' AND amount='"+amount+"' ";
    status=st.executeUpdate(sql);
    }catch(Exception e){
        System.out.println(e);}
    return status;
    }
    
    
    
    public int Userbuy(String id,String qmed,String amount){
    int status=0;
    try{
    String sql="insert into order_customer values('"+id+"','"+qmed+"','"+amount+"')";
    status=st.executeUpdate(sql);
    }catch(Exception e){
        System.out.println(e);}
    return status;
    }
    
    public ResultSet UserInfo(String id){
    try{
        String sql="select* from customer where User_Customer='"+id+"'";
        rs=st.executeQuery(sql);
    }catch(Exception e){
        System.out.println(e);}
        return rs;
    }
    
    public ResultSet UserOrder(String id){
    try{
        String sql="select* from order_customer where id='"+id+"'";
        rs=st.executeQuery(sql);
    }catch(Exception e){
        System.out.println(e);}
        return rs;
    }
    
    public int EmployeeRegister(String name,String contact,String email,String cnic,String id,String pass) {
    int status=0;
    try{ 
        String sql="insert into employee values('"+name+"','"+contact+"','"+email+"','"+cnic+"','"+id+"','"+pass+"')";
    status=st.executeUpdate(sql);}
    catch(SQLException ex){
        System.out.println(ex);}
    return status;
    }
    public ResultSet EmployeeLogin(String id,String pass){
     try{
         String sql="select* from employee where User_Employee='"+id+"' and Password_Employee='"+pass+"'";
       rs=st.executeQuery(sql);
     }
     catch(Exception e){
         System.out.println(e);
     }
        return rs;
    }
    
    public ResultSet CodeScan(double code){
    try{
        String sql="select* from stock where code='"+code+"'";
        rs=st.executeQuery(sql);
    }catch(Exception e){System.out.println(e);}
    return rs;
    }
    
    
}
