//=============================================================================
public class Student {
//-----------------------------------------------------------------------------
    protected static final int NUMBER_OF_TESTS = 3;
//-----------------------------------------------------------------------------
    private String name;
    protected int[] marks;
    protected char grade;
//-----------------------------------------------------------------------------
    public Student() {

        int index;

        this.name = "";
        marks = new int[NUMBER_OF_TESTS];
        for (index = 0; index < marks.length; index++) {
            marks[index] = -1;
        }
        grade = '*';
    }
//-----------------------------------------------------------------------------
    public Student(String name) {

        this();
        this.name = name;
    }
//-----------------------------------------------------------------------------
    public void display() {

        int index;

        System.out.print(name + " ");
        for (index = 0; index < marks.length; index++) {
            if (marks[index] >= 0) {
                System.out.print(marks[index] + ",");
            }
        }
        System.out.print(" " + grade);
    }
//-----------------------------------------------------------------------------
    public void setMark(int testNumber,int mark) {

        marks[testNumber-1] = mark;
    }
//-----------------------------------------------------------------------------
    protected char gradeFromMark(int mark) {

        if (mark >= 85) {
            return('A');
        } else if (mark >= 75) {
            return('B');
        } else if (mark >= 65) {
            return('C');
        } else if (mark >= 50) {
            return('D');
        } else {
            return('N');
        }
    }
//-----------------------------------------------------------------------------
//----Extra method required for UseStudent2 and UseStudent3 with polymorphism
    public void computeGrade() {

        System.out.println("ERROR: Subclass missing computeGrade() method");
    }
//-----------------------------------------------------------------------------
}
//=============================================================================