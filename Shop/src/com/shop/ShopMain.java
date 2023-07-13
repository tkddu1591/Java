package com.shop;

import com.shop.dao.CustomerDAO;
import com.shop.dao.OrderDAO;
import com.shop.dao.ProductDAO;
import com.shop.vo.CustomerVO;
import com.shop.vo.OrderVO;
import com.shop.vo.ProductVO;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 * 20230713 김상엽
 * Shop CRUD 실습하기
 * */
public class ShopMain {
    public static void main(String[] args) {

        System.out.println("-----------------");
        System.out.println("쇼핑몰에 오신것을 환영합니다.");
        System.out.println("-----------------");
        Scanner sc = new Scanner(System.in);

        CustomerDAO customerDAO=CustomerDAO.getInstance();
        OrderDAO orderDAO=OrderDAO.getInstance();
        ProductDAO productDAO= ProductDAO.getInstance();
        String custId;
        int log= 0;
        CustomerVO customerVO = new CustomerVO();
        while (true) {
            System.out.println("종료:0, 로그인:1, 회원가입:2, 상품목록:3, 구매하기:4 로그아웃:5");
            System.out.print("번호 입력 : ");
            int answer = sc.nextInt();
            if (answer == 0)
                break;
            else if (answer == 1) {
                if(log <1) {
                    System.out.print("아이디 입력 : ");
                    custId = sc.next();
                    customerVO= CustomerDAO.getInstance().selectCustomer(custId);
                    if (customerVO != null) {
                        System.out.println(customerVO.getName() + "님 어서오세요.");
                        log = 1;
                    } else {
                        System.out.println("일치하는 회원이 없습니다.");
                    }
                }
                else
                    System.out.println("로그인이 되어있습니다.");

            }else if(answer==5){
                if(log>0){
                    System.out.println("로그아웃 되었습니다.");
                    log=0;
                }
                else {
                    System.out.println("로그인을 먼저 해주세요.");
                }
            }
            else if (answer == 2) {
                if(log<1) {
                    customerVO = new CustomerVO();

                    System.out.print("아이디 입력 : ");
                    customerVO.setCustId(sc.next());
                    System.out.print("이름 입력 : ");
                    customerVO.setName(sc.next());
                    System.out.print("휴대폰 입력 : ");
                    customerVO.setHp(sc.next());
                    System.out.print("주소 입력 : ");
                    customerVO.setAddr(sc.next());
                    int result = CustomerDAO.getInstance().insertCustomer(customerVO);
                    if (result > 0) {
                        System.out.println(customerVO.getCustId() + "님 회원가입이 완료되었습니다.");
                    } else
                        System.out.println("회원가입에 실패 했습니다. 다시 시도해주세요.");
                }
                else{
                    System.out.println("로그아웃을 먼저 해주세요.");
                }
            } else if (answer == 3) {
                if(log>0) {
                    List<ProductVO> vos = new ArrayList<>();
                    vos = ProductDAO.getInstance().selectProducts();

                    for (ProductVO prod : vos) {
                        System.out.println(prod);
                    }
                }
                else
                    System.out.println("로그인을 먼저 해주세요.");

            } else if (answer == 4) {


                if(log>0){
                    OrderVO orderVO = new OrderVO();
                    ProductVO productVO = new ProductVO();
                    System.out.print("구매하실 상품의 번호를 입력해 주세요 : ");
                    int prodNo = sc.nextInt();
                    orderVO.setOrderProduct(prodNo);
                    productVO.setProdNo(prodNo);
                    System.out.print("구매하실 상품의 개수를 입력해 주세요 : ");
                    int prodCount = sc.nextInt();
                    orderVO.setOrderCount(prodCount);
                    productVO.setStock(prodCount);
                    orderVO.setOrderId(customerVO.getCustId());

                }
                else
                    System.out.println("로그인을 먼저 해주세요.");
            }

        }


        sc.close();
        System.out.println("안녕히 가세요~");
    }
}
