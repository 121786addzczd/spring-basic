package Spring03IF;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import Spring03IF.controller.EmployeeController;

@SpringBootApplication
public class Spring03IFApplication {

    public static void main(String[] args) {
        // DIコンテナを作成
        ConfigurableApplicationContext context = SpringApplication.run(Spring03IFApplication.class, args);

        // 社員コントローラーのインスタンスを生成
        EmployeeController employeeController = context.getBean(EmployeeController.class);

        // インスタンスからメソッドを実行
        employeeController.findAll();
    }
}
