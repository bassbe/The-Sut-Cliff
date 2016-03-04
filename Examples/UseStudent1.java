//=============================================================================
public class UseStudent1 {
//-----------------------------------------------------------------------------
    public static void main(String[] args) {

        GraduateStudent perryComo;
        UndergraduateStudent andrePrevin;

        perryComo = new GraduateStudent("Perry Como");
        perryComo.setMark(1,90);
        perryComo.setMark(2,72);
        perryComo.setMark(3,92);
        perryComo.computeGrade();
        perryComo.display();
        System.out.println();

        andrePrevin = new UndergraduateStudent("Andre Previn",3);
        andrePrevin.setMark(1,85);
        andrePrevin.setMark(2,82);
        andrePrevin.setMark(3,90);
        andrePrevin.computeGrade();
        andrePrevin.display();
        System.out.println();

    }
//-----------------------------------------------------------------------------
}
//=============================================================================