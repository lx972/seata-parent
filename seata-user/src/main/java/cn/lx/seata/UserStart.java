package cn.lx.seata;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * cn.lx.seata
 *
 * @Author Administrator
 * @date 16:43
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages = {"cn.lx.seata.feign"})
@MapperScan(basePackages = {"cn.lx.seata.dao"})
public class UserStart {
    public static void main(String[] args) {
        SpringApplication.run(UserStart.class,args);
    }
}
