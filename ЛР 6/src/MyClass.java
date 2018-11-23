
import javax.swing.*;
import java.awt.*;
import proj1.util.*;

public class MyClass{
    public static void main(String[] args) {
        System.out.println("Go");
        if (args.length > 0){
            OutPut output = new OutPut();
            output.outputString(args);
        }
        else
            System.out.println("String ready");
    }
}