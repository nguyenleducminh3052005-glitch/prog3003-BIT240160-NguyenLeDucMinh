package kiemtra.kiemtragk.bai1;
public class Student {
    private String Id;
    private String Name;
    private double Gpa;
// constructor
    public Student (String Id,String Name,double Gpa){
            this.Id=Id;
            this.Name=Name;
            this.Gpa=Gpa;
    }
//setter và getter 
    public String getid(){
        return Id;
    }
    public void setid(String Id){
        this.Id=Id;
    }
    public String getName(){
        return Name;
    }
    public void setName(String Name){
        this.Name=Name;
    }
    public double getGpa(){
        return Gpa;
    }
    public void setGpa(double Gpa){
        this.Gpa=Gpa;
    }
//    toString()
    @Override
    public String toString(){
       return "Student{Id=" + Id + ",Name=" + Name + ",Gpa=" + Gpa + "}";
    }
    }

