# springを入門するリポジトリ

## Javaファイルをコンパイルして実行する手順

### はじめに
Javaはコンパイル型のプログラミング言語であり、ソースコードを実行する前にコンパイルが必要です。本ドキュメントでは、Javaファイルのコンパイルから実行までの手順を具体的に説明します。


### 手順
1. **コンパイル**
Javaファイルをコンパイルするには、javac コマンドを使用します。コンパイル時には、ソースコードが存在するディレクトリ構造を考慮する必要があります。
    ```bash
    javac -d bin src/main/java/helloEmployee/*.java
    ```
    このコマンドでは、helloEmployee パッケージ内のすべてのJavaファイルを一括してコンパイルしています。

    コンパイルが成功すると、以下のようなディレクトリ構造で .class ファイルが生成されます。これらのファイルは、元のJavaファイルの依存関係を反映した形でコンパイルされています。
    ```markdown
    project/
    └── bin/
        └── main/
            └── java/
                └── helloEmployee/
                    ├── Employee.class
                    ├── EmployeeListIF.class
                    ├── EmployeeListImpl.class
                    ├── EmployeeListImpl2.class
                    └── HelloWorld.class
    ```

2. **実行**
コンパイルされた .class ファイルを実行するには、java コマンドを使用します。実行時には、src ディレクトリをクラスパスとして指定し、完全修飾クラス名を指定します。
    ```bash
    java -cp bin main.java.helloEmployee.HelloWorld
    ```
    実行すると以下のように表示されれば一連の手順は完了です。
    ```shell
    --------------------------------------------
    ID,名前,性別,年,住所
    1,鈴木義雄,男性,1984,宮城県仙台市
    2,大島咲希,女性,2004,福岡県福岡市
    --------------------------------------------
    ```

    コンパイルと実行を同時に行う場合は以下のコマンドで可能です。
    ```bash
    javac -d bin src/main/java/helloEmployee/*.java ; java -cp bin main.java.helloEmployee.HelloWorld
    ```

## トラブルシューティング
### mise WARN  Config files in spring-basic/.mise.toml are not trusted.と表示されたら
mise trust を実行して .mise.toml ファイルを信頼する設定にします。
```bash
mise trust
```
