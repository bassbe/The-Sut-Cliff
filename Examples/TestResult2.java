//=============================================================================
public class TestResult2 {
//-----------------------------------------------------------------------------
    private int maximal;
    private double fractionResult;
//-----------------------------------------------------------------------------
    public TestResult2() {

        maximal = 0;
        fractionResult = 0.0;
    }
//-----------------------------------------------------------------------------
    public void storeResult(int maximal,int achieved) {

        this.maximal = maximal;
        if (maximal != 0) {
            fractionResult = (double)achieved / maximal;
        } else {
            fractionResult = 0.0;
        }
    }
//-----------------------------------------------------------------------------
    public void storeResult(int maximal,double fractionResult) {

        this.maximal = maximal;
        this.fractionResult = fractionResult;
    }
//-----------------------------------------------------------------------------
    public void storeResult(int maximal,char grade) {

        this.maximal = maximal;
        switch (Character.toUpperCase(grade)) {
            case 'A':
                fractionResult = 0.85;
                break;
            case 'B':
                fractionResult = 0.75;
                break;
            case 'C':
                fractionResult = 0.65;
                break;
            case 'D':
                fractionResult = 0.5;
                break;
            default:
                fractionResult = 0.0;
                break;
        }
    }
//-----------------------------------------------------------------------------
    public void displayResult() {

         int mark,percent;

         mark = (int)(fractionResult * maximal);
         percent = (int)(fractionResult * 100);
         System.out.println(mark + " out of " + maximal + " (" + percent + "%)");
    }
//-----------------------------------------------------------------------------
    public void displayResult(String name) {

         System.out.print(name + " got ");
         displayResult();
    }
//-----------------------------------------------------------------------------
}
//=============================================================================