package com.example.gofdesignpatternwithjava._01_creational_patterns._01_Singleton;

import java.io.Serializable;

public class Settings implements Serializable {

//    private static Settings instance;    //아래의 1에 사용하는 변수
//    private static final Settings INSTANCE = new Settings(); // 2에 사용되는 변수
//    private static volatile Settings instance; // 3에 사용되는 변수
    private Settings(){}

    private static class SettingsHolder{
        private static final Settings INSTANCE=new Settings();

    }


    /**  기존 문제로직.
     * 현재의 getInstance 방식은 멀티스레드 환경에서 안전하지 않다.
     */
//    public static Settings getInstance(){
//        if(instance==null){
//            instance=new Settings();
//        }
//        return instance;
//    }

    /** 해결방법 1.
     * 해당 방법은 멀티스레드 환경에서 하나의 인스턴스라는 것을 보장해준다.
     * 하지만 getInstance를 호출할 때마다 동기화를 처리하는 작업때문에 성능이슈가 생긴다.
     */
//    public static synchronized Settings getInstance(){
//        if(instance==null){
//            instance=new Settings();
//        }
//        return instance;
//    }

    /** 해결방법 2.
     * 해당 방법은 이른 초기화를 사용하는 방법이다.
     * 멀티스레드 환경에서 스레드 세이프하지만 만약 만들어 놓은 객체를 사용하지 않는다면 큰 낭비가 될 수 있다.
     */
//    public static Settings getInstance(){
//        return INSTANCE;
//    }


    /** 해결방법 3.
     *  double checked locking 사용하기
     */
//    public static Settings getInstance(){
//        if(instance==null){
//            synchronized (Settings.class){
//                if(instance==null){
//                    instance= new Settings();
//                }
//            }
//        }
//        return instance;
//    }

    /** 해결방법 4.
     *  static inner 클래스 사용하기
     */
    public static Settings getInstance(){
        return SettingsHolder.INSTANCE;
    }

    protected Object readResolve(){
        return getInstance();
    }
}
