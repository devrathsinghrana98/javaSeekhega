package abstraction.abstractclass;

public abstract class Animal {
    String name;
    int age;
    protected abstract void sayHello();//no need for public as abstract class can't be instantiated
    abstract void eat();

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
