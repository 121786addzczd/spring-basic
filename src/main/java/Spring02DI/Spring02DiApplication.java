package Spring02DI;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import Spring02DI.controller.EmployeeController;

@SpringBootApplication
public class Spring02DiApplication {

    public static void main(String[] args) {
        // DIコンテナを作成
        ConfigurableApplicationContext context = SpringApplication.run(Spring02DiApplication.class, args);

        // 社員コントローラーのインスタンスを生成
        EmployeeController employeeController = context.getBean(EmployeeController.class);

        // インスタンスからメソッドを実行
        employeeController.findAll();
    }
}
