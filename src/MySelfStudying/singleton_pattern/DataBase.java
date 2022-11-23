package MySelfStudying.singleton_pattern;

import java.util.ArrayList;
import java.util.List;

public class DataBase {
    List<String> names = new ArrayList<>();

    private static DataBase single_instance;

    private DataBase() {}

    public static DataBase getInstance() {
        if (single_instance == null) {
            single_instance = new DataBase();
        }
        return single_instance;
    }
}
