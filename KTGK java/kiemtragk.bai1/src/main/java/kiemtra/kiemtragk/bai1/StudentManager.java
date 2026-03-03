package kiemtra.kiemtragk.bai1;

    import java.util.ArrayList;
    import java.util.List;

//List T
public class StudentManager<T> {
    private final List<T> data;

public StudentManager() {
        this.data = new ArrayList<>();
}
//add(T item
public void add(T item) {
        data.add(item);
}
//List <T> getAll()
public List<T> getAll(){
    return data;
}
}
