package com.jasper.propertiesstarter.autoconfigure;

import com.sun.net.httpserver.HttpsServer;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.http.HttpClient;

/**
 * @author jasper
 * @date 2022-04-01 11:40
 */
@Slf4j
@Configuration
@EnableConfigurationProperties(ServerProperty.class)
public class ServerAutoConfiguration {

    @Bean
    @ConditionalOnClass(HttpsServer.class)
    public HttpsServer httpsServer(ServerProperty serverProperty) throws IOException {
        HttpsServer server = HttpsServer.create(new InetSocketAddress(serverProperty.getPort()), 0);
        server.start();
        log.info("[httpServer][启动服务器成功，端口为:{}]", serverProperty.getPort());
        return server;
    }
}
