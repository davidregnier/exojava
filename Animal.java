public class Animal {
       public Animal(String name, int age, boolean vaccin) {
           this.mName = name;
           this.mAge = age;
           this.mVaccin = vaccin;
       }

       String mName ;
       int mAge ;
       boolean mVaccin;

        public void crier() {
            System.out.println("Je suis un animal et je crie !");
        }
    public String getName() {
        return this.mName;
    }

    public void setName(String name) {
        this.mName = name;
    }

    public int getAge() {
        return this.mAge;
    }

    public void setAge(int age) {
        this.mAge = age;
    }
    public boolean getVaccin() {
        return this.mVaccin;
    }

    public void setAge(boolean vaccin) {
        this.mVaccin = vaccin;
    }

}
