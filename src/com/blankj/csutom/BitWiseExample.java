package com.blankj.csutom;

//https://www.mkyong.com/java/java-convert-ip-address-to-decimal-number/
//https://www.mkyong.com/java/java-and-0xff-example/?utm_source=mkyong&utm_medium=author&utm_campaign=related-post&utm_content=0

//http://blog.csdn.net/tinna_zhang/article/details/44414747
//0xFF (十进制1)
//二进制码:00000000 00000000 00000000 11111111
//由于0xff最低的8位是1,因此number中低8位中的&之后,如果原来是1,结果还是1,原来是0,结果位还
//是0.高于8位的,0xff都是0,所以无论是0还是1,结果都是0.

public class BitWiseExample {

    public static void main(String[] args) {

        BitWiseExample obj = new BitWiseExample();
        long ipAddressInLong = obj.ipToLong("192.168.1.2");
        System.out.println(ipAddressInLong);

        String binary = Long.toBinaryString(ipAddressInLong);
        printPrettyBinary(binary);

        String ipAddressInString = obj.longToIp(ipAddressInLong);
        System.out.println(ipAddressInString);

        int i = 12315;
        System.out.println(Integer.toBinaryString(i));
        System.out.println(i >> 2);
        System.out.println(binaryToInt(Integer.toBinaryString(i)));

    }

    public long ipToLong(String ipAddress) {
        String[] addrArray = ipAddress.split("\\.");
        long num = 0;
        for (int i = 0; i < addrArray.length; i++) {
            int power = 3 - i;
            // 1. (192 % 256) * 256 pow 3
            // 2. (168 % 256) * 256 pow 2
            // 3. (2 % 256) * 256 pow 1
            // 4. (1 % 256) * 256 pow 0
            num += ((Integer.parseInt(addrArray[i]) % 256 * Math.pow(256, power)));

        }

        return num;
    }

    public String longToIp(long i) {
        return ((i >> 24) & 0xFF) + "." + ((i >> 16) & 0xFF) + "." + ((i >> 8) & 0xFF) + "." + (i & 0xFF);
    }

    //print pretty binary code, padding left zero
    private static void printPrettyBinary(String binary) {

        String s1 = String.format("%32s", binary).replace(' ', '0');
        System.out.format("%8s %8s %8s %8s %n",
                s1.substring(0, 8), s1.substring(8, 16),
                s1.substring(16, 24), s1.substring(24, 32));
    }

    public static int binaryToInt(String binaryString) {
        int intNumber = 0;
        for (int i = 0; i < binaryString.length(); i++) {
//            int t = binaryString.length() - i;
//            System.out.println((t - 1) + " " + (t));
            if (binaryString.substring(binaryString.length() - i - 1,binaryString.length() - i).equals("1")) {
                intNumber += Math.pow(2, i);
            }
        }
        return intNumber;
    }
}
