package com.mybatis.flower.dao;

import com.mybatis.flower.bean.Flower;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class FlowerCRUD {
    public SqlSession getConnection() throws IOException {
        String resource = "mybatis.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory wdySf = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession session = wdySf.openSession();
        return session;
    }


    public int insertFlower(Flower flower) throws IOException {
        SqlSession session = this.getConnection();
        int insertRow = session.insert("com.mybatis.flower.dao.sqlDao.insertFlower", flower);
        session.commit();
        session.close();
        return insertRow;
    }

    public int deleteFlower(int id) throws IOException {
        SqlSession session = this.getConnection();
        int deleteRow = session.delete("com.mybatis.flower.dao.sqlDao.deleteFlower", id);
        session.commit();
        session.close();
        return deleteRow;
    }

    public int updateFlower(Flower flower) throws IOException {
        SqlSession session = this.getConnection();
        int updateRow = session.update("com.mybatis.flower.dao.sqlDao.updateFlower", flower);
        session.commit();
        session.close();
        return updateRow;

    }

    public List<Flower> selectFlower() throws IOException {
        SqlSession session = this.getConnection();
        List<Flower> flowers = session.selectList("com.mybatis.flower.dao.sqlDao.selectFlowerID");
        session.close();
        return flowers;
    }


    public Flower selectFlowerById(int id) throws IOException {
        SqlSession session = this.getConnection();
        Flower flower = null;
        flower = session.selectOne("com.mybatis.flower.dao.sqlDao.selectFlowerById", id);
        session.close();
        return flower;
    }

}
