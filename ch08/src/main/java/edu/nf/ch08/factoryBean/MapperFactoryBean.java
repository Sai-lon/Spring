package edu.nf.ch08.factoryBean;

import edu.nf.ch08.util.MybatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.FactoryBean;

/**
 * 通过自定义factoryBean
 * 来创建mybatis的mapper接口的代理对象
 * T代表的是任何Dao接口的类型
 */
public class MapperFactoryBean<T> implements FactoryBean<T> {

    /**
     * 由于jdk动态代理创建时需要传入一个接口
     * 而这个接口可以通过set方法注入进来
     */
    private Class<T> daoInterface;

    /**
     * 提供一个set方法注入一个dao的接口的Class对象
     * @param daoInterface
     */
    public void setDaoInterface(Class<T> daoInterface) {
        this.daoInterface = daoInterface;
    }

    /**
     * 当ioc容器调用getObject方法时，返回的是sqlSession的getMapper
     * 的代理对象，这个代理对象就可以纳入容器中管理
     * @return
     * @throws Exception
     */
    @Override
    public T getObject() throws Exception {
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        //daoInterface就是某个dao接口的class对象
        T mapperProxy = sqlSession.getMapper(daoInterface);
        return mapperProxy;
    }

    @Override
    public Class<?> getObjectType() {
        return daoInterface;
    }

    @Override
    public boolean isSingleton() {
        return true;
    }
}
