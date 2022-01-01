package org.sbgrt.orgaappbackend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class OrgaAppBackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(OrgaAppBackendApplication.class, args);
        System.out.println("application runs");
    }

}
