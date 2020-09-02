package cn.lx.seata;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * cn.lx.seata
 *
 * @Author Administrator
 * @date 17:12
 */
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
@EnableEurekaServer
public class EurekaStart {
    public static void main(String[] args) {
        SpringApplication.run(EurekaStart.class,args);
    }
}
