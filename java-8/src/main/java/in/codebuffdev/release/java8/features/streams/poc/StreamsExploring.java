package in.codebuffdev.release.java8.features.streams.poc;

import java.util.List;

/*
 * resource:devoxxVenkatsubramaniam*/
class PersonDTO{
    private String personNm;

    public PersonDTO(String personNm) {
        this.personNm = personNm;
    }

    public PersonDTO() {
    }

    public String getPersonNm() {
        return personNm;
    }

    public void setPersonNm(String personNm) {
        this.personNm = personNm;
    }

    @Override
    public String toString() {
        return "PersonDTO{" +
                "personNm='" + personNm + '\'' +
                '}';
    }
}
class Person{
    private String personNm;
    private int personAge;

    public Person(String personNm, int personAge) {
        this.personNm = personNm;
        this.personAge = personAge;
    }

    @Override
    public String toString() {
        return personNm + " " + personAge;
    }

    public String getPersonNm() {
        return personNm;
    }

    public void setPersonNm(String personNm) {
        this.personNm = personNm;
    }

    public int getPersonAge() {
        return personAge;
    }

    public void setPersonAge(int personAge) {
        this.personAge = personAge;
    }
}
public class StreamsExploring {
    public static List<Person> personList(){
        return List.of(new Person("sara",24),
                       new Person("Sachin",45),
                       new Person("sara",19),
                       new Person("Sachin",17),
                       new Person("Salman",55),
                       new Person("Sitaraman",50));
    }
    public static void main(String[] args) {
        personList().forEach(System.out::println);
        System.out.println();
        personList().stream().forEach(System.out::println);
        System.out.println();
        personList().stream().map(obj-> obj.getPersonNm()).forEach(System.out::println);
        System.out.println();
    }
}














