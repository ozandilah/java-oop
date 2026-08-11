/**
 * Person
 */
class Person {

    String name;
    String address;

    final String country = "INA";
    void sayHello(String paramName){
            System.out.println("Hello " + paramName + ", My name is " + this.name); 
        }
}