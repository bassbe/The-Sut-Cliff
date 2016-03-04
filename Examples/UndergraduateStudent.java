//=============================================================================
public class UndergraduateStudent extends Student {
//-----------------------------------------------------------------------------
    private int standing;  //---1 = freshman, etc
//-----------------------------------------------------------------------------
    public UndergraduateStudent() {

        super();
        this.standing = 1;
    }
//-----------------------------------------------------------------------------
    public UndergraduateStudent(String name,int standing) {

        super(name);
        this.standing = standing;
    }
//-----------------------------------------------------------------------------
    public void display() {

        super.display();
        System.out.print("  ");
        printStanding();
    }
//-----------------------------------------------------------------------------
    private void printStanding() {

        switch (standing) {
            case 1:
                System.out.print("Freshman");
                break;
            case 2:
                System.out.print("Sophomore");
                break;
            case 3:
                System.out.print("Junior");
                break;
            case 4:
                System.out.print("Senior");
                break;
            default:
                System.out.print("Unknown");
                break;
        }
    }
//-----------------------------------------------------------------------------
    public void computeGrade() {

        int index;
        int total;
        int numberOfTests;

        total = 0;
        numberOfTests = 0;
        for (index = 0; index < marks.length; index++) {
            if (marks[index] >= 0) {
                total += marks[index];
                numberOfTests++;
            }
        }
        grade = gradeFromMark(total / numberOfTests);
    }
//-----------------------------------------------------------------------------
}
//=============================================================================