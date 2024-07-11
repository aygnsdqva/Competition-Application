package util;

import java.io.*;

public class FileUtil {
    public static void writeObjectToFile(Serializable object, String filename) throws IOException {
        try(FileOutputStream fileOutputStream = new FileOutputStream(filename);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream)){
            objectOutputStream.writeObject(object);
        }
    }
    public static Object readFileDeserialize(String filename) throws IOException, ClassNotFoundException {
        Object object = null;
        try(ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(filename))){
            object = objectInputStream.readObject();
        }finally {
            return object;
        }
    }
}
