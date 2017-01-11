package dao;

/**
 * Created by yanglc on 2017/1/11.
 */
public class Book {
    public Book(int id,String name){
        this.id = id;
        this.name = name;
    }
    String name;
    int id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
