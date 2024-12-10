package in.codebuffdev.release.java8.features.models;

import java.util.List;

public class Customer {
    long id;
    String name;
    String email;
    List<Integer> slipNo;

    public Customer() {
    }

    public Customer(long id, String name, String email, List<Integer> slipNo) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.slipNo = slipNo;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Integer> getSlipNo() {
        return slipNo;
    }

    public void setSlipNo(List<Integer> slipNo) {
        this.slipNo = slipNo;
    }
}
