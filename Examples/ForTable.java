//=============================================================================
public class ForTable {
//-----------------------------------------------------------------------------
    private static final int PRICE_PER_SQUARE = 19;
//-----------------------------------------------------------------------------
    public static void main(String[] args) {

        int width,length,price;

        for (width = 11; width <= 20; width++) {
            System.out.println("Width : " + width);
            for (length = 5; length <= 25; length += 5) {
                price = width * length * PRICE_PER_SQUARE;
                System.out.println("   Width : " + width + "  Length : " +
length + "  Price : " + price);
            }
            System.out.println();
        }

    }
//-----------------------------------------------------------------------------
}
//=============================================================================