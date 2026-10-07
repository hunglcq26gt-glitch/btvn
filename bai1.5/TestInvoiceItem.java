public class TestInvoiceItem {
    public static void main(String[] args) {
        InvoiceItem inv1 = new InvoiceItem("C101", "Ao anime", 1, 1500000);

        System.out.println("ID: " + inv1.getID());
        System.out.println("Mo ta: " + inv1.getDesc());
        System.out.println("So luong: " + inv1.getQty());
        System.out.println("Don gia: " + inv1.getUnitPrice());
        System.out.println("Tong tien: " + inv1.getTotal());

        inv1.setQty(3);
        inv1.setUnitPrice(1200000);
        System.out.println("Tong tien moi: " + inv1.getTotal());
    }
}