public class Televisor {
    boolean status;
    Televisor(boolean s) {
        status = s;
    }
    void turnOn (){
            status = true;
        }
    void turnOff (){
            status = false;
        }
    void showStatus(){
        System.out.println("Turned on? "+status);
        }
}
