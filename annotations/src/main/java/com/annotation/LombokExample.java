package com.annotation;

import lombok.*;

@Data
@AllArgsConstructor
public class LombokExample {
    private String name;
    private int age;
    private String randomMessage;
/*    public LombokExample(String name, int age, String randomMessage) {
        this.name = name;
        this.age = age;
        this.randomMessage = randomMessage;
    } ------------> @AllArgsConstructor

    public LombokExample() {
    } ------------> @NoArgsConstructor

    public String getName() {
        return name;
    } ----> Getter

    public void setName(String name) {
        this.name = name;
    } ----> @Setter

    public int getAge() {
        return age;
    } ----> Getter

    public void setAge(int age) {
        this.age = age;
    } ----> @Setter

    public String getRandomMessage() {
        return randomMessage;
    } ----> Getter

    public void setRandomMessage(String randomMessage) {
        this.randomMessage = randomMessage;
    } ----> @Setter

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LombokExample that = (LombokExample) o;
        return age == that.age && Objects.equals(name, that.name) && Objects.equals(randomMessage, that.randomMessage);
    } -----> @EqualsAndHashCode

    @Override
    public int hashCode() {
        return Objects.hash(name, age, randomMessage);
    } -----> @EqualsAndHashCode */

    public String parseMessage() {
        return "";
    }
}
