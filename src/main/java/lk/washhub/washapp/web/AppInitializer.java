package lk.washhub.washapp.web;

import lk.washhub.washapp.web.util.LogConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by Sesath De Costa on 2021-02-24
 * <p>
 * This file is subject to the terms and conditions defined in
 * file 'LICENSE.txt', which is part of this source code package.
 **/
@SpringBootApplication
public class AppInitializer {

    public static void main(String[] args) {
        LogConfig.initLogging();
        SpringApplication.run(AppInitializer.class, args);

    }
}
