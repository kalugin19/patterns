package com.company;

public class Main {

    public static void main(String[] args) {
        String text = "Text one two three six";
        DataSource baseDataSource = new DataSourceDecorator(new FileDataSource("out/OutputDemo.txt"));
        DataSource encryptionSource = new CompressionDecorator(new EncryptionDecorator(baseDataSource));
        encryptionSource.writeData(text);
        System.out.println(encryptionSource.readData());
        DataSource plain = new FileDataSource("out/OutputDemo.txt");

        System.out.println("- Input ----------------");
        System.out.println(text);
        System.out.println("- Encoded --------------");
        System.out.println(plain.readData());
        System.out.println("- Decoded --------------");
        System.out.println(encryptionSource.readData());


    }
}
