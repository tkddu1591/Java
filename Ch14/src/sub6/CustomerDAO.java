package sub6;

import java.sql.*;
import java.util.Collection;
import java.util.List;

public class CustomerDAO extends DBHelper {
    private static CustomerDAO instance = new CustomerDAO();

    public void close() throws SQLException {
        super.close();
    }


    public static CustomerDAO getInstance(){
        return instance;
    }
    public List<CustomerVO> selectCustomers(){
        return null;
    }
    public CustomerVO selectCustomer(String custId){
        return null;
    }
    public int insertCustomer(CustomerVO vo){
        psmt=conn.prepareStatement(CustomerSQL.custInsertSQL);
        return 0;
    }
    public int deleteCustomer(CustomerVO vo){
        return 0;
    }
    public void updateCustomer(String custId){

    }
}
