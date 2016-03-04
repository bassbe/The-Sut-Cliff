//=============================================================================
public class GraduateStudent extends Student {
//-----------------------------------------------------------------------------
//----This is not really necessary, as the compiler would create this for me
//----Inlcuded for educational purposes :-)
    public GraduateStudent() {

        super();
    }
//-----------------------------------------------------------------------------
    public GraduateStudent(String name) {

        super(name);
    }
//-----------------------------------------------------------------------------
    public void computeGrade() {

        int index;
        int minimum;

        minimum = 100;
        for (index = 0; index < marks.length; index++) {
            if (marks[index] >= 0 && marks[index] < minimum) {
                minimum = marks[index];
            }
        }
        grade = gradeFromMark(minimum);
    }
//-----------------------------------------------------------------------------
}
//=============================================================================