public class primer {
    void primerchik(String a, int parse) {
    if (parse == 8) {
        int Dvoichni = Integer.parseInt(a, 8);
        System.out.println("Number in octal system: " + a + ", number in binary system: " + Integer.toBinaryString(Dvoichni) + ", number in decimal number: " + Dvoichni + ", number in hexadecimal system: " + Integer.toHexString(Dvoichni));
    } else if (parse == 16) {
        int Dvoichni = Integer.parseInt(a, 16);
        System.out.println("Number in hexadecimal system: " + a + ", number in binary system: " + Integer.toBinaryString(Dvoichni) + ", number in octal number: " + Integer.toOctalString(Dvoichni) + ", number in decimal system: " + Dvoichni);
    }
}
}

