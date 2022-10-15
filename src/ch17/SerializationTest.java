package ch17;

import java.io.*;
// 17. 직렬화 (serialization)
// Serializable 인터페이스
// 직렬화는 인스턴스의 내용이 외부로 유출되는 것이므로 프로그래머가 해당 객체에 대한 직렬화 의도를 표시해야 함
// 구현 코드가 없는 marker interface
// transient : 직렬화 하지 않으려는 멤버 변수에 사용함 (Socket등 직렬화 할 수 없는 객체)
//class Person implements Serializable {
//
//    private static final long serialVersionUID = -1503252402544036183L;
//
//    String name;
//    String job;
//
//    public Person() {}
//
//    public Person(String name, String job) {
//        this.name = name;
//        this.job = job;
//    }
//
//    public String toString()
//    {
//        return name + "," + job;
//    }
//}

// Externalizable 인터페이스
// writerExternal()과 readExternal()메서드를 구현해야 함
// 프로그래머가 직접 객체를 읽고 쓰는 코드를 구현 할 수 있음
class Person implements Externalizable{

    String name;
    String job;

    public Person() {}

    public Person(String name, String job) {
        this.name = name;
        this.job = job;
    }

    public String toString()
    {
        return name + "," + job;
    }

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeUTF(name);
        //out.writeUTF(job);
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        name = in.readUTF();
        //job = in.readUTF();
    }

}

public class SerializationTest {
    public static void main(String[] args) throws ClassNotFoundException {

        Person personAhn = new Person("이순신", "대표이사");
        Person personKim = new Person("김유신", "상무이사");

        try(FileOutputStream fos = new FileOutputStream("serial.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos)){

            oos.writeObject(personAhn);
            oos.writeObject(personKim);

        }catch(IOException e) {
            e.printStackTrace();
        }

        try(FileInputStream fis = new FileInputStream("serial.txt");
            ObjectInputStream ois = new ObjectInputStream(fis)){

            Person p1 = (Person)ois.readObject();
            Person p2 = (Person)ois.readObject();

            System.out.println(p1);
            System.out.println(p2);
        }catch (IOException e) {
            e.printStackTrace();
        }
    }
}
