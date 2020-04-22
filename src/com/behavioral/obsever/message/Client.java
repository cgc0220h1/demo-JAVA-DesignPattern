package com.behavioral.obsever.message;/*
 * @project demo-JAVA-DesignPattern
 * @author Duc on 4/22/2020
 */

public class Client {
    public static void main(String[] args) {
        Subject subject = new Subject();
        Observer observer1 = new Observer() {

            @Override
            public void update(String message) {
                System.out.println("Message 1 changed: " + message);
            }
        };
        subject.attach(observer1);

        Observer observer2 = new Observer() {
            @Override
            public void update(String message) {
                System.out.println("Message 2 changed: " + message);
            }
        };
        subject.attach(observer2);

        //Subject quản lý các observer. Khi truyền Hello thì tất cả các obsever
        //đều kêu Hello. Trong trường hợp các observer được attach vào.
        subject.notifyChange("Hello");
        //Sau khi detach observer 1, tryền World vào thì observer1 không kêu được nữa
        //chỉ có observer 2 kêu do vẫn được attach với subject
        subject.detach(observer1);
        subject.notifyChange("World");
    }
}
