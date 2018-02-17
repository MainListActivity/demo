package test;

import org.junit.Test;

/**
 * 版权所有：   y.
 * 创建日期：   18-2-13.
 * 重要说明：
 * 修订历史：
 */
public class ExceptionTest {
    @Test
    public void et1() {
        e1H(new RuntimeException("bb"));

    }

    class E1 {

    }

    private void e1H(RuntimeException e) {
        System.out.println(e.getMessage());
        throw e;
    }
}
