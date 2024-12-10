package in.codebuffdev.release.java8.features.optionals;

import java.util.Optional;

/*
 * resource : javaTechie
 * Optional is a final class provided as part of java-8 .
 * We can create Optional object using 3 methods
 * i) empty()   - static factory method
 * ii) of(T t)  - static builder method - take a object checks if it non-null , optional object created with the passed value, if null NPE .
 * iii) ofNullable - static builder method -  take a object checks if it non-null , optional object created with the passed value,else empty optional Object will be created
 *
 * */

public class LearnOptional {
    private static Customer customer = new Customer("JavaTechie", 32, null);

    public static void main(String[] args) {
        Optional<Object> emptyOptional = Optional.empty();
        System.out.println(emptyOptional);

//	Optional<Object> ofOptional = Optional.of(null);
        Optional<String> ofNameOptional = Optional.of(customer.getCustNm());
        System.out.println(ofNameOptional);
        System.out.println("geeting value from Optional Object -  " + ofNameOptional.get());

        Optional<String> ofNullableOptional = Optional.ofNullable(customer.getCustNm());
        System.out.println(ofNullableOptional);// Optional["JT"]
        System.out.println(ofNullableOptional.get());

        Optional<Object> ofNullable = Optional.ofNullable(customer.getMail());
        System.out.println(ofNullable);

        System.out.println();
        System.out.println("get() - ");
//	System.out.println(ofNullable.get());// NoSuchElementException, so we should not call get() directly 

        //isPresent()
        if (ofNullable.isPresent()) {
            System.out.println(ofNullable.get());
        } else {
            System.out.println("Optional is empty");
        }

        //orElse()
        if (ofNullable.isPresent()) {
            System.out.println(ofNullable.get());
        } else {
            System.out.println(ofNullable.orElse("default@mail.com"));
        }
        // orElse() works like if-else only, if Optional  is empty orElse("given value") will be used
        System.out.println(ofNullable.orElse("default@gmail.com"));
        System.out.println(ofNameOptional.orElse("Java-8"));

        //orElseThrow()
        //using optional we can able to throw customised exception if null value is their
        System.out.println(ofNullable.orElseThrow(() -> new IllegalArgumentException("mail not their")));


    }
}

class Customer {
    private String custNm;
    private int age;
    private String mail;

    public Customer(String custNm, int age, String mail) {
        super();
        this.custNm = custNm;
        this.age = age;
        this.mail = mail;
    }

    @Override
    public String toString() {
        return "Customer [custNm=" + custNm + ", age=" + age + ", mail=" + mail + "]";
    }

    public String getCustNm() {
        return custNm;
    }

    public void setCustNm(String custNm) {
        this.custNm = custNm;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

}