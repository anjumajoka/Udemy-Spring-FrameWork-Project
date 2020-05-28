package algo;

class Employee implements Comparable<Employee> {

    private int id;
    private int age;
    private String name;

    public Employee(int id, int age, String name){
        this.id = id;
        this.age = age;
        this.name = name;
    }

    @Override
    public int compareTo(Employee o) {
        return name.compareTo(o.name);
    }

    public String toString(){
        return "\n(Id: "+ id +", Age: "+ age +", Name: "+ name +" )";
    }

    public int getId() {
        return id;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

}
