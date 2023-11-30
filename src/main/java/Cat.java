public class Cat {

    private String name;

    public Cat() {

    }

    public static void main(String[] args) {
        for (String arg : args){
            Cat cat = new Cat(arg);
            System.out.println(cat);

        }
    }
    public Cat(String name){
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
