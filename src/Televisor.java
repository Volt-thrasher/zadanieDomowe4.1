public class Televisor {
    boolean tOn;
    Televisor(boolean t) {

    }
        void turnOn (Televisor televisor){
            televisor.tOn = true;
        }
        void turnOff (Televisor televisor){
            televisor.tOn = false;
        }
        void showStatus(Televisor televisor){
            System.out.println("Turned on? "+televisor.tOn);
        }
}
