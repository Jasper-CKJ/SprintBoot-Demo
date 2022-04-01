package com.jasper.propertiesstarter.autoconfigure;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author jasper
 * @date 2022-04-01 11:40
 */
@Data
@ConfigurationProperties(prefix = "server")
public class ServerProperty {
    private static final Integer DEFAULT_PORT = 8000;
    private Integer port = DEFAULT_PORT;
}
