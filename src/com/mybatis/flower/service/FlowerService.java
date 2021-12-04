package com.mybatis.flower.service;

import com.mybatis.flower.bean.Flower;
import com.mybatis.flower.dao.FlowerCRUD;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FlowerService {
    private FlowerCRUD crud = new FlowerCRUD();

    public boolean insert(Flower flower){
        boolean flag = false;
        try {
            int n = crud.insertFlower(flower);
            if (n > 0){
                flag = true;
            }
        } catch (IOException e) {
            flag = false;
            e.printStackTrace();
        }
        return flag;
    }

    public boolean delete(int id){
        boolean flag = false;

        try {
            int n = crud.deleteFlower(id);
            if (n > 0){
                flag = true;
            }
        } catch (IOException e) {
            flag = false;
            e.printStackTrace();
        }
        return flag;
    }

    public boolean update(Flower flower){
        boolean flag = false;
        try {
            int n = crud.updateFlower(flower);
            if (n > 0){
                flag = true;
            }
        } catch (IOException e) {
            flag = false;
            e.printStackTrace();
        }
        return flag;
    }

    public List<Flower> select(){
        List<Flower> flowers = new ArrayList<>();
        try {
            flowers = crud.selectFlower();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return flowers;
    }

    public Flower selcetById(int id){
        Flower flower = null;

        try {
            flower = crud.selectFlowerById(id);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return flower;
    }

}
