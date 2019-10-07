public class TelevisorTest {
    public static void main(String[] args) {

        Televisor televisor1 = new Televisor(true);
        televisor1.showStatus(televisor1);
        televisor1.turnOn(televisor1);
        televisor1.showStatus(televisor1);
        televisor1.turnOff(televisor1);
        televisor1.showStatus(televisor1);
    }
}