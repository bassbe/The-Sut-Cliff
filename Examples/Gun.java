//=============================================================================
public class Gun {
//-----------------------------------------------------------------------------
    private String make;
    private int bulletCapacity;
    private int bulletsAvailable;
//-----------------------------------------------------------------------------
    public Gun() {

        make = null;
        bulletCapacity = 0;
        bulletsAvailable = 0;
    }
//-----------------------------------------------------------------------------
    public Gun(String make,int bulletCapacity) {

        this();
        this.make = make;
        this.bulletCapacity = bulletCapacity;
    }
//-----------------------------------------------------------------------------
    public String toString() {

         return(make + ", " + bulletsAvailable + "/" + bulletCapacity + 
" bullets");
    }
//-----------------------------------------------------------------------------
    public void load() {

        bulletsAvailable = bulletCapacity;
    }
//-----------------------------------------------------------------------------
    public void fire() {

        if (bulletsAvailable > 0) {
            System.out.println("Bang");
            bulletsAvailable--;
        } else {
            System.out.println("Click");
        }
    }
//-----------------------------------------------------------------------------
}
//=============================================================================
