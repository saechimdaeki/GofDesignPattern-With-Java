package com.example.gofdesignpatternwithjava._01_creational_patterns._05_prototype._02_after;

public class App {

    public static void main(String[] args) throws CloneNotSupportedException {
        GithubRepository repository = new GithubRepository();
        repository.setUser("whiteship");
        repository.setName("live-study");

        GithubIssue githubIssue = new GithubIssue(repository);
        githubIssue.setId(1);
        githubIssue.setTitle("1주차 과제: JVM은 무엇이며 자바 코드는 어떻게 실행하는 것인가.");

        String url = githubIssue.getUrl();
        System.out.println(url);

        GithubIssue clone = (GithubIssue) githubIssue.clone();
        System.out.println(clone.getUrl());


        repository.setUser("saechimdaeki");

        System.out.println(clone!=githubIssue);  // shallow copy : true , deep copy: true
        System.out.println(clone.equals(githubIssue)); // shallow copy : true , deep copy: false
        System.out.println(clone.getClass()==githubIssue.getClass()); //shallow copy : true , deep copy: true

        System.out.println(clone.getRepository() == githubIssue.getRepository()); //shallow copy : true , deep copy: false

        System.out.println(clone.getUrl());
    }

}
