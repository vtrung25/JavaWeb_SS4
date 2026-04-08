package com.example.ss04.reponsitory;

import org.springframework.stereotype.Repository;

//B1
@Repository
public class OrderRepository {
    public String getAllOder(){
        return "Danh sách toàn bộ đơn hàng.";
    }

    public String getOrderById(int id){
        return "Thông tin đơn hàng với ID: " + id;
    }

    public String addOrder(){
        return "Thêm đơn hàng mới thành công";
    }

    //b5

    public String cancelOrder(Long id) {
        return "Huy don hang so " + id + " thanh cong";
    }
}
