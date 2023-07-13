package sub6;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Collection;
import java.util.List;

public class OrderDAO extends DBHelper{
    private static OrderDAO instance = new OrderDAO();
    private OrderDAO(){}
    public static OrderDAO getInstance(){
        return instance;
    }
    
    Collection conn =null;
    PreparedStatement psmt;
    Statement stmt;
    ResultSet rs;
    
    public List<OrderVO> selectOrders(){
        return null;
    }
    public OrderVO selectOrder(String orderId){
        return null;
    }
    public int insertOrder(OrderVO vo){
        return 0;
    }
    public int deleteOrder(OrderVO vo){
        return 0;
    }
    public void updateOrder(String orderId){
        
    }
    
}
