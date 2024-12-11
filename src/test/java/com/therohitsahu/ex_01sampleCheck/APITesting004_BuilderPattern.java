package com.therohitsahu.ex_01sampleCheck;

public class APITesting004_BuilderPattern {

    public APITesting004_BuilderPattern step1 () {
        System.out.println("step1");
        return this;
    }
    public APITesting004_BuilderPattern step2 () {
        System.out.println("step2");
        return this;
    }
    public APITesting004_BuilderPattern step3 (String name) {
        System.out.println("step3:" +name);
        return this;
    }

    public static void main(String[] args) {
        APITesting004_BuilderPattern bp = new APITesting004_BuilderPattern();
        bp.step1().step2().step3("Rohit");
    }
}
