package com.example.hwq;

import org.junit.jupiter.api.Test;

import java.io.*;

public class TestFile {
    @Test
    public void testFile()  {

//        File file = new File("C:\\Users\\Administrator\\Desktop\\log\\aaa.txt");
//        String name = file.getName();
//        String parent = file.getParent();
//        File parentFile = file.getParentFile();
//        System.out.println("name=="+name);
//        System.out.println("parent=="+parent);
//        System.out.println("parentFile=="+parentFile);

//        String fileName ="bbbb.txt";
//        File file1 = new File("C:" + File.separator + "Users" + File.separator + "Administrator" +
//                File.separator + "Desktop" + File.separator + "log"
//                + File.separator + "hh" + File.separator + fileName);
//        File parentFile1 = file1.getParentFile();
//        boolean exists = file1.exists();
//        if(!file1.getParentFile().exists()){
//            parentFile1.mkdirs();
//        }
//        if(!file1.exists()){
//            file1.createNewFile();
//        }
//        FileInputStream fileInputStream = new FileInputStream(file1);


//        byte[] aByte = new byte[1024*5];
//        int read = fileInputStream.read(aByte);
//        System.out.println(read);
//        System.out.println(new String(aByte));
//        FileOutputStream fileOutputStream = new FileOutputStream(new File("C:\\Users\\Administrator\\Desktop\\log\\aaa.txt"),true);
//        fileOutputStream.write(aByte);


//        InputStreamReader gbk = new InputStreamReader(
//                new FileInputStream(new File("C:\\Users\\Administrator\\Desktop\\log\\aaa.txt")), "utf-8");
//        char[] chars = new char[64];
//        int read = gbk.read(chars);
//        System.out.println(read);
//        System.out.println(new String(chars));


//        BufferedReader bufferedReader = new BufferedReader(
//                new InputStreamReader(
//                        new FileInputStream(
//                                new File("C:\\Users\\Administrator\\Desktop\\log\\aaa.txt"))));
//        String s= null;
//        while((s=bufferedReader.readLine()) !=null){
//            System.out.println(s);
//        }
        try {
            String str="cccc.txt";
            File file1 = new File("C:"+File.separator+"Users"+File.separator+"Administrator"
            +File.separator+"Desktop"+File.separator+"log"+File.separator+"ww"+File.separator+str);
            File parentFile = file1.getParentFile();
            if(!parentFile.exists()){
                parentFile.mkdirs();
            }
            if(!file1.exists()){
                file1.createNewFile();
            }
            FileInputStream fileInputStream = new FileInputStream(new File("C:\\Users\\Administrator\\Desktop\\log\\aaa.txt"));
            InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
            String line = null;

            FileOutputStream fileOutputStream = new FileOutputStream(file1);
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream);
            BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter);
            while((line=bufferedReader.readLine())!=null){
                System.out.println(line);
                bufferedWriter.write(line);
                bufferedWriter.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {

        }
    }
}
