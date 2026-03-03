package kiemtra.kiemtragk.bai1;
public class main {
public static void main(String[] args) {
    StudentManager<Student> manager = new StudentManager<>();

        manager.add(new Student("SV1", "nguyen le duc minh", 3.3));
        manager.add(new Student("SV2", "tran quang anh", 3.4));
        manager.add(new Student("SV3", "dinh bao long", 3.5));

        System.out.println("DANH SACH SINH VIEN ");
        for (Student x : manager.getAll()) {
            System.out.println(x);
        }
    } 
}
