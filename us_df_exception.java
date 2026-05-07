//check our profit is higher than 1000 or not
public class us_df_exception extends Exception {
    public us_df_exception(String message) {
        super(message);
}
    public static void main(String[] args) {
        int profit = 1200;

        try {
            if (profit > 1000) {
                throw new us_df_exception("Profit exceeds the limit of 1000.");
            } else {
                System.out.println("Profit is within the acceptable range.");
            }
        } catch (us_df_exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
