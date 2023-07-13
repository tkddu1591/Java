package com.shop.dao;

import com.shop.db.DBHelper;
import com.shop.db.SQL;
import com.shop.vo.CustomerVO;

import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.sql.SQLNonTransientConnectionException;
import java.util.List;

public class CustomerDAO extends DBHelper {
    private static CustomerDAO instance = new CustomerDAO();

    public void close() throws SQLException {
        super.close();
    }


    public static CustomerDAO getInstance(){return instance;}
    public CustomerVO selectCustomers(){
        return null;
    }
    public CustomerVO selectCustomer(String custId){
        CustomerVO vo = null;
        try {
            conn=getConnection();
            psmt= conn.prepareStatement(SQL.SELECT_CUSTOMER);
            psmt.setString(1,custId);
            rs=psmt.executeQuery();

            if(rs.next()){
                vo = new CustomerVO();
                vo.setCustId(rs.getString(1));
                vo.setName(rs.getString(2));
                vo.setHp(rs.getString(3));
                vo.setAddr(rs.getString(4));
                vo.setRdate(rs.getString(5));
            }
            close();
            return vo;
        } catch (SQLException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
    public int insertCustomer(CustomerVO vo){
        int result=0;
        try {
            conn=getConnection();
            psmt = conn.prepareStatement(SQL.INSERT_CUSTOMER);
            psmt.setString(1,vo.getCustId());
            psmt.setString(2,vo.getName());
            psmt.setString(3,vo.getHp());
            psmt.setString(4,vo.getAddr());
            result =psmt.executeUpdate();
            close();
        } catch (SQLIntegrityConstraintViolationException e){
            System.out.println("이미 사용중인 아이디입니다.");
        } catch (SQLException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return result;
    }
    public int deleteCustomer(CustomerVO vo){
        return 0;
    }
    public void updateCustomer(String custId){

    }
}
