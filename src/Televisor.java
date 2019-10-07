public class Televisor {
    boolean status;
    Televisor(boolean s) {
    status = s;
    }
        void turnOn (Televisor televisor){
            status = true;
        }
        void turnOff (Televisor televisor){
            status = false;
        }
        void showStatus(Televisor televisor){
            System.out.println("Turned on? "+status);
        }
}
