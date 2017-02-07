package test002;

import Dao.Person;
import Dao.User;
import com.opensymphony.xwork2.ActionSupport;

import java.util.List;
import java.util.Map;

/**
 * Created by yanglc on 2017/2/6.
 * 这个action是使用类型转换成list和map类型的数据的示例
 */
public class TypeExchangeAction02 extends ActionSupport{
    //public List<String> lists;     //这个地方不能定义为private???
    public List<User> lists;     //定义为private还是不行啊！
    private Map<String, Person> map;

    public List<User> getLists() {
        return lists;
    }

    public void setList(List<User> lists) {
        this.lists = lists;
    }

    public Map<String, Person> getMap() {
        return map;
    }

    public void setMap(Map<String, Person> map) {
        this.map = map;
    }

    public String execute() throws Exception{
        System.out.println(lists.get(0).getName());
        System.out.println(lists.get(0).getPassword());
        System.out.println(map.get("first").getAge());
        System.out.println(map.get("first").getSalary());
        return SUCCESS;
    }
}
