package com.shop.dao;

import com.shop.db.DBHelper;
import com.shop.db.SQL;
import com.shop.vo.ProductVO;

import java.sql.*;
import java.util.ArrayList;
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
            rs = stmt.executeQuery(SQL.SELECT_PRODUCTS);
            while (rs.next()){
                ProductVO vo = new ProductVO();
                vo.setProdNo(rs.getInt("prodNo"));
                vo.setProdName(rs.getString("prodName"));
                vo.setStock(rs.getInt("stock"));
                vo.setPrice(rs.getInt("price"));
                vo.setCompany(rs.getString("company"));
                productVOS.add(vo);
            }

        } catch (SQLException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return productVOS;
    }

    public ProductVO selectProduct(int prodId) {
        ProductVO vo = null;
        try {
            conn = getConnection();
            psmt = conn.prepareStatement(SQL.SELECT_PRODUCT);
            psmt.setInt(1, prodId);
            rs = psmt.executeQuery();
            if(rs.next()) {

                vo = new ProductVO();
                vo.setProdNo(rs.getInt(1));
                vo.setProdName(rs.getString(2));
                vo.setStock(rs.getInt(3));
                vo.setPrice(rs.getInt(4));
                vo.setCompany(rs.getString(5));
            }
            close();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return vo;
    }

    public int insertProduct(ProductVO vo) {
        return 0;
    }

    public int deleteProduct(ProductVO vo) {
        return 0;
    }

    public void updateProductStock(ProductVO vo) {
        try {
            conn =getConnection();
            psmt = conn.prepareStatement(SQL.UPDATE_PRODUCT_BYE);
            psmt.setInt(1,vo.getStock());
            psmt.setInt(2,vo.getProdNo());
            psmt.executeUpdate();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

}
