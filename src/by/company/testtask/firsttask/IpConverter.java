package by.company.testtask.firsttask;

public class IpConverter {

    public static long convertToNumber(String ipAddress) {
        String[] array = ipAddress.split("\\.");
        long result = 0;
        for (int i = 0; i < array.length; i++) {
            int power = 3 - i;
            int ip = Integer.parseInt(array[i]);
            result += ip * Math.pow(256, power);
        }
        return result;
    }

    public static String convertToString(long ip) {
        StringBuilder ipAddress = new StringBuilder();
        for (int i = 0; i < 4; i++) {
            ipAddress.insert(0, ip & 0xff);
            if (i < 3) {
                ipAddress.insert(0, '.');
            }
            ip = ip >> 8;
        }
        return ipAddress.toString();
    }
}
