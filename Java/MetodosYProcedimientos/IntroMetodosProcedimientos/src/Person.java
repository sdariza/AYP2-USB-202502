public class Person {
    String name;
    String age;
    int id;

    public Person(String name, String age, int id) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public void caminar() {
        System.out.println("La persona " + name + " está caminando");
    }
}
