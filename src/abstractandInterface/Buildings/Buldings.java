package abstractandInterface.Buildings;

abstract class Buldings {

    public String name;
    public int age;
    public String type;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Buldings(String name, int age, String type) {
        this.name = name;
        this.age = age;
        this.type = type;
    }

    public abstract void hours(int noOfHours);

    public abstract void responseToComplaint(String response);
}
