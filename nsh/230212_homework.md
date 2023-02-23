## 실행 어라운드 패턴(execute around pattern)
### hw1. 실행 어라운드 패턴에 대해 알아보고 정의나 장점 등을 자유롭게 적어주세요. (블로그에 포스팅하시고 url을 적어주셔도 좋습니다.)
초기화/준비 -> 작업 -> 정리/마무리 등과 같이 어떤 작업을 위한 setup/cleanup 작업이 붙는 패턴을 실행 어라운드 패턴이라고 한다.
초기화/준비와 정리/마무리 영역의 코드는 재사용하고 작업 영역의 코드만 바꿔 개발할 수 있기 때문에 코드의 중복을 최소화할 수 있는 장점이 있다.

### hw2. 실행 어라운드 패턴을 이용하여 코드를 작성해 봅시다.

#### 1) java7로 작성한 리소스 클린업 코드를 개선해 보세요.
```java
import java.util.LinkedList;
import java.util.List;


public class Main {
    
    public void printHomework() throws Exception {

        Database database = DatabasePool.instance().pop();
        if ( database == null ) {
            throw new Exception("Database is null.");
        }
        
        try {

            List<String> resultSet = database.executeQuery("select * from homework");
            if(resultSet == null || resultSet.size() == 0)  {
                throw new Exception("No data.");
            }
            resultSet.stream().forEach(System.out::println);

        } catch (Exception excp) {
            System.out.println(excp.getMessage());
        } finally {
            DatabasePool.instance().push(database);
        }

    }

}

class DatabasePool {

    private static DatabasePool dbp;
    private DatabasePool() {}
    static DatabasePool instance() {
        if(dbp == null) {
            dbp = new DatabasePool() {};
        }
        return dbp;
    }

    
    Database pop() {
        System.out.println("db connection을 하나 가져온다");
        return new Database();
    }
    
    void push(Database database) {
        System.out.println("db connection을 돌려준다");
        
    }
    
}

class Database {

    List<String> homeworkList = new LinkedList<String>();
    List<String> executeQuery(String string) {
        homeworkList.add("Excecute Around Pattern");
        return homeworkList ; 
    }
    
}
```

#### 2) 이외의 case를 조사하여 추가로 EAP을 적용시켜 보세요.




