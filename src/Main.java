public class Main {
    public static void main(String[] args) {
        Account account = new Account("OLEH", 1000, "PL13121312");
        try {
            account.transfer(1500);
        } catch (NotEnoughMoneyException e) {
            System.out.println("Error: " + e.getMessage());
            e.printStackTrace();
        } catch (Exception e) {
            System.out.println("Other error: " + e.getMessage());
        } finally {
            System.out.println("Current balance: " + account.getBalance());
        }
    }
}
