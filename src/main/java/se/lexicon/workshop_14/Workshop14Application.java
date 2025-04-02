package se.lexicon.workshop_14;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import se.lexicon.workshop_14.config.ComponentScanConfig;
import se.lexicon.workshop_14.data_access.StudentDao;

import java.util.Collections;

@SpringBootApplication
public class Workshop14Application {

    public static void main(String[] args) {
        SpringApplication.run(ComponentScanConfig.class, args);

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Workshop14Application.class);
        StudentDao studentDao = context.getBean(StudentDao.class);
    }

}
