package test;

import org.junit.Test;

/**
 * 版权所有：   y.
 * 创建日期：   17-12-27.
 * 重要说明：
 * 修订历史：
 */

public class MyTest {
    @Test
    public void t() {
        A<B> a = new A<>();
        System.out.println(a.getMyClass().getName());
    }

    class A<T> {
        public Class getMyClass() {
            return this.getClass().getGenericSuperclass().getClass();
        }
    }

    class B {
    }
}
