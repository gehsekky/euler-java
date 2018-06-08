package com.iamchung.euler.models;

public abstract class EulerProblem {

    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public EulerProblem() {
        throw new IllegalArgumentException();
    }

    public EulerProblem(String name) {
        this.setName(name);
    }

    public abstract void main();

    public void solve(Object output) { System.out.println(this.getName() + ": " + output.toString()); }
}
