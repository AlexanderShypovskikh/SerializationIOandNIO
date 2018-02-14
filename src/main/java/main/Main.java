package main;

import serialization.TestSerializableClass;
import serialization.User;

import java.io.*;

public class Main {

    public static void main(String[] args) {

        TestSerializableClass testClass = new TestSerializableClass("Alex", 25);
        User user = new User("Jonh", "password");
        testClass.setUser(user);

        File destination = new File("C:\\Users\\User7\\IdeaProjects\\FileWork\\out.bin");
        System.out.println(destination.getAbsolutePath());

        try (FileOutputStream fos = new FileOutputStream(destination)) {
            BufferedOutputStream bos = new BufferedOutputStream(fos);
            ObjectOutputStream os = new ObjectOutputStream(bos);
            os.writeObject(testClass);
            os.flush();

        }catch (FileNotFoundException fnf){
                System.out.println(fnf.getMessage());
        }catch (IOException ex){
            System.out.println(ex.getMessage());
        }

        TestSerializableClass test2 = null;
        try (FileInputStream is = new FileInputStream(destination)){
            BufferedInputStream bis = new BufferedInputStream(is);
            ObjectInputStream ois = new ObjectInputStream(bis);
            test2 = (TestSerializableClass) ois.readObject();
            System.out.println(test2.toString());
          }catch(FileNotFoundException fnf){

              } catch(IOException ex){

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }


        }
