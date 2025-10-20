public class App {
    public static void main(String[] args) throws Exception {
        Order producto1 = new Order("01", "pc", 10, 799.9);
        Order producto2 = new Order("02", "Mouse", 9, 19.9);
        Order producto3 = new Order("03", "Keyboard", 11, 79.9);

        producto1.showSummary();
        producto2.showSummary();
        producto3.showSummary();
    }
}
