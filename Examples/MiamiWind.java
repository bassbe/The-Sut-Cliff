//=============================================================================
public class MiamiWind {
//-----------------------------------------------------------------------------
    private int strength;
    private String direction;
//-----------------------------------------------------------------------------
    public MiamiWind() {

        strength = 12;
        direction = "south east";
    }
//-----------------------------------------------------------------------------
    public MiamiWind(int newStrength) {

        this();
        strength = newStrength;
    }
//-----------------------------------------------------------------------------
    public MiamiWind(String newDirection) {

        this();
        direction = newDirection;
    }
//-----------------------------------------------------------------------------
    public MiamiWind(int newStrength,String newDirection) {

        this();
        strength = newStrength;
        direction = newDirection;
    }
//-----------------------------------------------------------------------------
    public String toString() {

        String displayString;

        displayString = String.format("%d knots from the %s",strength,
direction);
        return(displayString);
    }
//-----------------------------------------------------------------------------
}
//=============================================================================