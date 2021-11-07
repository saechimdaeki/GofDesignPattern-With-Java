package com.example.gofdesignpatternwithjava._01_creational_patterns._01_Singleton;


import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class App {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

//        Settings settings=Settings.getInstance();

        /* 1. 리플렉션 사용하기 */
//        Constructor<Settings> constructor = Settings.class.getDeclaredConstructor();
//        constructor.setAccessible(true);
//        Settings settings1 = constructor.newInstance();
//        System.out.println(settings==settings1);


        /* 2. 직렬화 & 역직렬화 사용하 */
//        Settings settings1=null;
//        try(ObjectOutput out = new ObjectOutputStream(new FileOutputStream("settings.obj"))){
//            out.writeObject(settings);
//        }
//        try(ObjectInput in=new ObjectInputStream(new FileInputStream("settings.obj"))){
//            settings1=(Settings) in.readObject();
//        }
//        System.out.println(settings==settings1);


    }
}
