package javaplus;

import java.io.*;

public class SerializableEX {
    public static void main(String[] args) {
        marshalling();
        unMarshalling();
    }
    public static void marshalling(){
        try {
            FileOutputStream fos = new FileOutputStream("user.ser");
            BufferedOutputStream bos = new BufferedOutputStream(fos);
            ObjectOutputStream out = new ObjectOutputStream(bos);

            User user1 = new User("test","1234","가길동");
            out.writeObject(user1);
            out.close();
            System.out.println("객체 직렬화 완료!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void unMarshalling(){
        try {
            FileInputStream fis = new FileInputStream("user.ser");
            BufferedInputStream bis = new BufferedInputStream(fis);
            ObjectInputStream ois = new ObjectInputStream(bis);
            User u1 = (User) ois.readObject();
            System.out.println(u1.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
class User implements Serializable {
    private String id;
    private String pw;
    private String name;

    public User(String id, String pw, String name) {
        this.id = id;
        this.pw = pw;
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", pw='" + pw + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
