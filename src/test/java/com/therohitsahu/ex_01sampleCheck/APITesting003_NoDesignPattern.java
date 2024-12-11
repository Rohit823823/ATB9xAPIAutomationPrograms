package com.therohitsahu.ex_01sampleCheck;

public class APITesting003_NoDesignPattern {
    public void step1 () {
        System.out.println("step1");
    }
    public void step2 () {
        System.out.println("step2");
    }
    public void step3 (String name) {
        System.out.println("step3:" +name);
    }

    public static void main(String[] args) {
        APITesting003_NoDesignPattern np = new APITesting003_NoDesignPattern();
                np.step1();
        np.step2();
        np.step3("Rohit");
    }
}
