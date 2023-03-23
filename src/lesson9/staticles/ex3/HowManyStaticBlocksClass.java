package lesson9.staticles.ex3;

public class HowManyStaticBlocksClass {
    static int howManyStaticBlocks;
    static {
        System.out.println("Это статический блок под номером "+howManyStaticBlocks);
    }
    static {
        howManyStaticBlocks++;
        System.out.println("Это статический блок под номером "+howManyStaticBlocks);
    }
    static {
        howManyStaticBlocks++;
        System.out.println("Это статический блок под номером "+howManyStaticBlocks);
    }
    static {
        howManyStaticBlocks++;
        System.out.println("Это статический блок под номером "+howManyStaticBlocks);
    }
    static {
        howManyStaticBlocks++;
        System.out.println("Это статический блок под номером "+howManyStaticBlocks);
    }

}
