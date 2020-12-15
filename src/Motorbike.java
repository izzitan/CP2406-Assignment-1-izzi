public class Motorbike extends Car{

    public Motorbike(String id) {
        this.id = ("bike_" + id);
        float length = super.getLength() * 0.5f;
    }
}
