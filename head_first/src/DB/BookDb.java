package DB;

import dao.Book;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by yanglc on 2017/1/11.
 */
public class BookDb {
    public static Map<String, Book> map = new HashMap<String,Book>();
    static{
        map.put("1",new Book(1,"一号书"));
        map.put("2",new Book(2,"二号书"));
        map.put("3",new Book(3,"三号书"));
        map.put("4",new Book(4,"四号书"));
        map.put("5",new Book(5,"五号书"));
    }
    public static Map<String,Book> getAll(){
        return map;
    }
}
