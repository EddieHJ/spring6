package com.example.proxy.service;

//目标对象
public class OrderServiceImpl implements OrderService {

    @Override
    public void generate() {  //目标方法
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("订单已生成");

    }

    @Override
    public void modify() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("订单已修改");

    }

    @Override
    public void detail() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("订单详情可见");

    }
}
