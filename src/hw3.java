public class hw3 {
        public static void main(String[] args) {
            //convert to fahrenheit from celsius
            //fT = cT * 9/5 + 32
            double cTem = 5;
            double fTem = cTem * 9/5 + 32;
            System.out.println(cTem + " 'C is equal to " + fTem + " 'F");

            //convert to celsius from fahrenheit
            //T(°C) = (T(°F) - 32) × 5/9
            double fTemp = 41;
            double cTemp = (fTemp - 32) * 5/9;
            System.out.println(fTemp + " 'F is equal to " + cTemp + " 'C");

            //convert to kelvin from celsius
            //T(K) = T(°C) + 273.15
            double cTe = 5;
            double kTe = cTe + 273.15;
            System.out.println(kTe + " 'k is equal to " + cTe + " 'C");

            //convert to kelvin from fahrenheit
            //T(K) = (T(°F) + 459.67)× 5/9
            double fTe = 41;
            double kTem = (fTe + 459.67) * 5/9;
            System.out.println(kTem + " 'k is equal to " + fTe + " 'F");

            //convert Kelvin to Celsius
            //T(°C) = T(K) - 273.15
            double kTemp = 278.15;
            double cTempa = kTemp - 273.15;
            System.out.println("\n" + cTempa + " 'C is equal to " + kTemp + " 'K"); // ( "\n" for skip one line in output)

            //convert Kelvin to Fahrenheit
            //T(°F) = T(K) × 9/5 - 459.67
            double kTempa = 278.15;
            double fTempa = kTempa * 9/5 - 459.67;
            System.out.println(fTempa + " 'F is equal to " + kTempa + " 'K");

        }
    }

