package sub6;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Collection;
import java.util.List;

public class ProductDAO extends DBHelper{
    public static ProductDAO instance = new ProductDAO();
    private ProductDAO(){}
    Collection conn = null;
    PreparedStatement psmt;
    Statement stmt;
    ResultSet rs;

    private static ProductDAO getInstance() {
        return instance;
    }

    public List<ProductVO> selectProducts() {
        return null;
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
