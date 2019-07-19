public class AnnotationCheckClass {
    String name;

    @AddName(value = "NoName")
    public void setName(String name) {
        this.name = name;
    }

    public void getName() {
        System.out.println("New Name     \t" + this.name);
    }
}
