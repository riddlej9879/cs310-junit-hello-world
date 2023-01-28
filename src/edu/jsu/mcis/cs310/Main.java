package edu.jsu.mcis.cs310;

public class Main {

    public static void main(String[] args) {
        
        Main m = new Main();
        String message = m.getGreeting();
        
        System.out.println(message);
        System.out.println(m.reverse(message));
        
    }
    
    public String getGreeting() {
        return "Hello, World!";
    }
    
    public String reverse(String message) {
        StringBuilder result = new StringBuilder(message.length());
        String[] msg = message.split("");
        for (int i = msg.length; i > 0; i--) {
            result.append(msg[i-1]);
        }
        message = result.toString();
        return message;
    }
}
