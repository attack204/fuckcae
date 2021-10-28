package wiki.primo.generator.mybatis.plus.cae;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//第二步：扫描mapper
@MapperScan("wiki.primo.generator.mybatis.plus.cae.mapper")
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
