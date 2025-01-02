# springを入門するリポジトリ

## Javaファイルをコンパイルして実行する手順

### はじめに
Javaはコンパイル型のプログラミング言語であり、ソースコードを実行する前にコンパイルが必要です。本ドキュメントでは、Javaファイルのコンパイルから実行までの手順を具体的に説明します。

### ファイル構造
以下のディレクトリ構造とファイル内容を想定しています。
```markdown
project/
└── src/
    └── main/
        └── java/
            └── HelloWorld.java
```

### HelloWorld.java の内容
```java
package main.java;

public class HelloWorld {

    public static void main(String[] args) {
        System.out.println("Hello World");
    }

}
```

### 手順
1. **コンパイル**
Javaファイルをコンパイルするには、javac コマンドを使用します。コンパイル時には、ソースコードが存在するディレクトリ構造を考慮する必要があります。
    ```bash
    javac src/main/java/HelloWorld.java
    ```
    コンパイルが成功すると、以下のように HelloWorld.class ファイルが生成されます。
    ```markdown
    project/
    └── src/
        └── main/
            └── java/
                ├── HelloWorld.java
                └── HelloWorld.class
    ```

2. **実行**
コンパイルされた .class ファイルを実行するには、java コマンドを使用します。実行時には、src ディレクトリをクラスパスとして指定し、完全修飾クラス名を指定します。
    ```bash
    java -cp src main.java.HelloWorld
    ```
    実行すると以下のように表示されれば一連の手順は完了です。
    ```shell
    Hello World
    ```

## トラブルシューティング
### mise WARN  Config files in spring-basic/.mise.toml are not trusted.と表示されたら
mise trust を実行して .mise.toml ファイルを信頼する設定にします。
```bash
mise trust
```
