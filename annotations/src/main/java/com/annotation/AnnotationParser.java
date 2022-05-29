package com.annotation;

public class AnnotationParser {
    //parse all annotations
    public void validatePhoneNumber(String phone) {
        if (phone == null) {
            throw new RuntimeException("Bad number");
        }
        //....
    }
}
