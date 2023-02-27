package Decorator;

import java.util.Scanner;

class AccessControlDecorator implements Data {
    private Data data;
    private String password;

    public AccessControlDecorator(Data data, String password) {
        this.data = data;
        this.password = password;
    }

    @Override
    public String read() {
        if (authenticate()) {
            return data.read();
        } else {
            throw new IllegalArgumentException("Incorrect password.");
        }
    }

    public boolean authenticate() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter password: ");
        String input = scanner.nextLine();
        return input.equals(password);
    }
}