package com.sky.demo;

import com.sky.demo.utils.BigDecimalUtil;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @ClassName: DemoSpringTest
 * @author: zouws
 * @since: 2023/7/22 22:21
 */
@Slf4j
@SpringBootTest
public class DemoSpringTest {

    @Test
    public void test1() {
        boolean b = BigDecimalUtil.compareToBoolean(0.90, 0.9);
        log.info(String.valueOf(b));
    }
}
