package com.shop.dao;

import com.shop.db.DBHelper;
import com.shop.db.SQL;
import com.shop.vo.OrderVO;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class OrderDAO extends DBHelper {
    private static OrderDAO instance = new OrderDAO();

    private OrderDAO() {
    }

    public static OrderDAO getInstance() {
        return instance;
    }

    public List<OrderVO> selectOrdersCust(String custId) {
        List<OrderVO> vos = new ArrayList<>();
        try {
            conn = getConnection();
            psmt = conn.prepareStatement(SQL.SELECT_ORDERS_CUSTOMER);
            psmt.setString(1,custId);
            rs= psmt.executeQuery();
            while (rs.next()){
                OrderVO vo = new OrderVO();
                vo.setOrderNo(rs.getInt(1));
                vo.setOrderId(rs.getString(2));
                vo.setOrderProduct(rs.getInt(3));
                vo.setOrderCount(rs.getInt(4));
                vo.setOrderDate(rs.getString(5));
                vo.setName(rs.getString(6));
                vo.setProdName(rs.getString(7));
                vos.add(vo);
            }
            close();
        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }
        return vos;
    }

    public OrderVO selectOrder(String orderId) {
        return null;
    }

    public int insertOrder(OrderVO vo) {
        int result;
        try {
            conn = getConnection();
            psmt = conn.prepareStatement(SQL.INSERT_ORDER_BYE);
            psmt.setString(1, vo.getOrderId());
            psmt.setInt(2, vo.getOrderProduct());
            psmt.setInt(3, vo.getOrderCount());
            result = psmt.executeUpdate();
        } catch (SQLException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return result;
    }

    public int deleteOrder(OrderVO vo) {
        return 0;
    }

    public int orderNo() {
        try {
            conn = getConnection();
            stmt = conn.createStatement();
            rs = stmt.executeQuery(SQL.SELECT_ORDERS);
            close();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return 0;
    }

    public void updateOrder(OrderVO vo) {
        try {
            conn = getConnection();
            psmt = conn.prepareStatement(SQL.INSERT_ORDER_BYE);
        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }
    }

}
