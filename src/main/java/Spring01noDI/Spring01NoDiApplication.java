package Spring01NoDI;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import Spring01NoDI.controller.EmployeeController;

@SpringBootApplication
public class Spring01NoDiApplication {

    public static void main(String[] args) {
        // DIコンテナを作成
        SpringApplication.run(Spring01NoDiApplication.class, args);

        // 社員コントローラーのインスタンスを生成
        EmployeeController employeeController = new EmployeeController();
        // インスタンスからメソッドを実行
        employeeController.findAll();
    }
}
