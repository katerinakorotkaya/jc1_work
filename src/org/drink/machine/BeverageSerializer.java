package org.drink.machine;

import java.io.*;

public class BeverageSerializer {
    public static void serialize(Beverage beverage) {
        try {
            FileOutputStream fos = new FileOutputStream("beverage.dat");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(beverage);
            oos.close();
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Beverage deserialize() {
        try {
            FileInputStream fis = new FileInputStream("beverage.dat");
            ObjectInputStream ois = new ObjectInputStream(fis);
            Object obj = ois.readObject();
            ois.close();
            fis.close();
            return (Beverage) obj;
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void main(String[] args) throws IOException {
        Beverage test1 = new Beverage("Coca-cola", 2.5, 1, 0.5);
        System.out.println(test1);
        System.out.println(test1.number);
        serialize(test1);


        Beverage test2 = deserialize();
        System.out.println(test2);
        System.out.println(test2.number);
    }
}