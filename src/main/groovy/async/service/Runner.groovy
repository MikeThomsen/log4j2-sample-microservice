package async.service

import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.context.ApplicationContext

@SpringBootApplication
public class Runner {
    static final Logger logger = LoggerFactory.getLogger(Runner.class)
    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(Runner.class, args);

        System.out.println("Let's inspect the beans provided by Spring Boot:");

        String[] beanNames = ctx.getBeanDefinitionNames();
        Arrays.sort(beanNames);
        for (String beanName : beanNames) {
            System.out.println(beanName);
        }

        0.upto(1000) {
            logger.info(UUID.randomUUID().toString())
        }
    }
}