package com.y.cloud.example.demo;

import io.shardingjdbc.core.keygen.DefaultKeyGenerator;
import org.hibernate.HibernateException;
import org.hibernate.engine.spi.SessionImplementor;

import java.io.Serializable;

/**
 * 版权所有：   y.
 * 创建日期：   17-12-25.
 * 重要说明：
 * 修订历史：
 */
public class KeyGenerator implements org.hibernate.id.IdentifierGenerator {


    @Override
    public Serializable generate(SessionImplementor session, Object object) throws HibernateException {
        io.shardingjdbc.core.keygen.KeyGenerator generator = new DefaultKeyGenerator();
//        generator = (io.shardingjdbc.core.keygen.KeyGenerator) Class.forName(shardingProperties.getDefaultKeyGeneratorClass()).newInstance();
        return generator.generateKey();
    }
}
