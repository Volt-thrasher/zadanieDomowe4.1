public class Televisor {
    boolean trnOn;
    Televisor(boolean t) {
    trnOn = t;
    }
        void turnOn (Televisor televisor){
            trnOn = true;
        }
        void turnOff (Televisor televisor){
            trnOn = false;
        }
        void showStatus(Televisor televisor){
            System.out.println("Turned on? "+trnOn);
        }
}
