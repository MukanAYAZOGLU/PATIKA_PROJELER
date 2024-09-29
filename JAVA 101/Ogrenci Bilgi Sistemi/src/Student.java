import java.text.DecimalFormat;

public class Student {

    String name;
    int studentNo;
    Course c1;
    Course c2;
    Course c3;
    String classes;
    double avarage;
    boolean isPass;



    public Student(String name, int studentNo, String classes, Course c1, Course c2, Course c3) {
        this.c1 = c1;
        this.name = name;
        this.studentNo = studentNo;
        this.classes = classes;
        this.c2 = c2;
        this.c3 = c3;
        this.isPass = false;
    }



    public void addBulkExamNote(int note1, int note2, int note3) {

        if (note1>=0 &&note1<=100) {
            this.c1.note=note1;

        }

        if (note2>=0 &&note2<=100) {
            this.c2.note=note2;

        }

        if (note3>=0 &&note3<=100) {
            this.c3.note=note3;

        }


    }


    void isPass() {
        this.avarage=(this.c1.note+this.c2.note+this.c3.note)/3.0;

        System.out.println("----------------");

        if (this.avarage>55) {
            System.out.println("Sınıftan geçtiniz.");

        }else {
            System.out.println("Sınıftan kaldınız.");
        }
        printNoteInfo();
    }

    void printNoteInfo() {

        System.out.println(this.c1.name+ " Notu: "+this.c1.note);
        System.out.println(this.c2.name+ " Notu: "+this.c2.note);
        System.out.println(this.c3.name+ " Notu: "+this.c3.note);
        System.out.println("Ortalamanız: "+new DecimalFormat("##.##").format(this.avarage));
    }






}
