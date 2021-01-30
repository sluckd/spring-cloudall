/**
 * 
 */
package com.mashibing;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * 
 * 类名称    ： EurekaServer.java
 * 类描述    ： 
 * 创建人    ：suyunduo
 * 创建时间：2021年1月23日 上午10:38:38
 * 修改人    ：suyunduo 
 * 修改时间： 
 * 修改备注： 
 * @version
 */
@EnableEurekaServer
@SpringBootApplication
public class EurekaServer {

    public static void main(String[] args) {
        SpringApplication.run(EurekaServer.class, args);
    }
}
