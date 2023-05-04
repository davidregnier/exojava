public class Serpent extends Animal{
    public Serpent (String name, int age, boolean vaccin, String sang) {
        super(name, age, vaccin);
        this.mSang = sang;
    }
    String mSang;
}
