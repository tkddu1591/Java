package com.shop.dao;

import com.shop.db.DBHelper;
import com.shop.db.SQL;
import com.shop.vo.ProductVO;

import java.sql.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ProductDAO extends DBHelper {
    private static ProductDAO instance = new ProductDAO();
    private ProductDAO(){}

    public static ProductDAO getInstance() {
        return instance;
    }

    public List<ProductVO> selectProducts() {
        List<ProductVO> productVOS = new ArrayList<>();
        try {
            conn = getConnection();
            stmt = conn.createStatement();
            rs = stmt.executeQuery(SQL.SELECT_PRODUCT);
            while (rs.next()){
                ProductVO vo = new ProductVO();
                vo.setProdNo(rs.getInt(1));
                vo.setProdName(rs.getString(2));
                vo.setStock(rs.getInt(3));
                vo.setPrice(rs.getInt(4));
                vo.setCompany(rs.getString(5));
                productVOS.add(vo);
            }

        } catch (SQLException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return productVOS;
    }

    public ProductVO selectProduct(String prodId) {
        return null;
    }

    public int insertProduct(ProductVO vo) {
        return 0;
    }

    public int deleteProduct(ProductVO vo) {
        return 0;
    }

    public void updateProduct(String prodId) {

    }

}
