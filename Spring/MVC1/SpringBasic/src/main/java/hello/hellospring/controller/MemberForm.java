package hello.hellospring.controller;

public class MemberForm {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) { // Spring이 Setter를 통하여 값을 전달한다.
        this.name = name;
    }
}
