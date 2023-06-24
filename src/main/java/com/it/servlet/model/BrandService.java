package com.it.servlet.model;

import com.it.mapper.BrandMapper;
import com.it.bean.Brand;
import com.it.util.SqlSessionFactoryUtils;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java.util.List;

public class BrandService {
    SqlSessionFactory Factory = SqlSessionFactoryUtils.getSqlSessionFactory();
    public List<Brand> selectAll(){
        SqlSession sqlSession = Factory.openSession();
        BrandMapper mapper = sqlSession.getMapper(BrandMapper.class);
        List<Brand> brands = mapper.selectAll();
        sqlSession.close();
        return brands;

    }
}
