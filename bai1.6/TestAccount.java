public class TestAccount {
    public static void main(String[] args) {
        Account acc1 = new Account("B102", "nguyen Van A", 1000);
        Account acc2 = new Account("C102", "Nguyen Van B");

        System.out.println(acc1);
        System.out.println(acc2);

        acc1.credit(500);
        System.out.println("Sau khi gui 100: " + acc1.getBalance());

        acc1.debit(100);
        System.out.println("Sau khi rut 50: " + acc1.getBalance());

        acc1.debit(200);
        System.out.println("Sau khi rut 500: " + acc1.getBalance());

        acc1.transferTo(acc2, 100);
        System.out.println(acc1);
        System.out.println(acc2);
    }
}