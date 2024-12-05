public class JavaOperators {
    public void getLeftShift(){
        int[] nums = {2, 9, 17, 88};
//        My prediction for 2<<1 is  4 in Decimal Number and 100 in Binary Number
//        My prediction for 9<<1 is  18 in Decimal Number and 10010 in Binary Number
//        My prediction for 17<<1 is  34 in Decimal Number and 100010 in Binary Number
//        My prediction for 88<<1 is  176 in Decimal Number and 10110000 in Binary Number
        for (int i = 0; i < 4; i++) {
            int x = nums[i];
            x = x << 1;

//            if(nums[i] == 2){
//                System.out.println("x = " + Integer.toBinaryString(x));
//                System.out.println("My prediction for x<<1 is  4 in Decimal Number and 100 in Binary Number ");
//            }

            System.out.println(nums[i] + "<<1 = " + x + " in Decimal Number");
            System.out.println(nums[i] + "<<1 = " + Integer.toBinaryString(x) + " in Binary Number");
        }

    }
    public void getRightShift(){
        int[] nums = {150, 225, 1555, 32456};
//        My prediction for 150>>2 is  37 in Decimal Number and 100101 in Binary Number
//        My prediction for 225>>2 is  56 in Decimal Number and 111000 in Binary Number
//        My prediction for 1555>>2 is  388 in Decimal Number and 110000100 in Binary Number
//        My prediction for 32456>>2 is  8114 in Decimal Number and 1111110110010 in Binary Number
        for (int i = 0; i < 4; i++) {
            int x = nums[i];
            x = x >> 2;

            System.out.println(nums[i] + ">>2 = " + x + " in Decimal Number");
            System.out.println(nums[i] + ">>2 = " + Integer.toBinaryString(x) + " in Binary Number");
        }
    }
    public void getBitwiseAND(){
        int x=7, y=17;
        int z = x & y;
//        My prediction for 7&17 is  1 in Decimal Number and 1 in Binary Number
        System.out.println("7&17 = " + z + " in Decimal Number");
        System.out.println("7&17 = " + Integer.toBinaryString(z) + " in Binary Number");
    }
    public void getBitwiseOR(){
        int x=7, y=17;
        int z = x | y;
//        My prediction for 7&17 is  23 in Decimal Number and 10111 in Binary Number
        System.out.println("7|17 = " + z + " in Decimal Number");
        System.out.println("7|17 = " + Integer.toBinaryString(z) + " in Binary Number");
    }
    public void getPostfix(){
        int x=10;
        System.out.println("The number before postfix is " + x++);
        System.out.println("The number after postfix is " + x);
    }
    public void increment() {
        int x = 10;
        System.out.println("The initial number is " + x++);
        System.out.println("The  number is now " + x + " from x++ in previous line");
        System.out.println("The  number after ++x is " + ++x);
        System.out.println("The  number after x+1 is " + (x+1));

    }
    public void prefixAndPostfix() {
        int x = 5, y=8;
        int sum = y + (++x);
        System.out.println("The result of y + (++x) is " + sum);

        int m = 5, n=8;

        int res = (m++) + n;
        System.out.println("The result of y + (x++) is " + res);

    }
}
