public class Main {
    public static void main(String[] args) {
        CPU cpu = new CPU(100);
        Memory m = new Memory(100);
        RAM ram = new RAM(20);

        DiscountsManager.getInstance().addDiscount(20, Memory.class);
        DiscountsManager.getInstance().addDiscount(10, CPU.class);

        System.out.println(cpu.getPrice());
        System.out.println(m.getPrice());
        System.out.println(ram.getPrice());
    }

}
