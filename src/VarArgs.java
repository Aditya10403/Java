import java.util.Arrays;

// Variable Arguments and Method Overloading.
public class VarArgs {
    public static void main(String[] args) {
        fun(2, 4, 6);
        fun("Aditya", "Kunal", "Rahul");
        fun(1, "Aditya", 2, 4, 6);
        System.out.println("..End of Program..");
    }
    // Integer Function VarArgs ..
    static void fun(int ...v){
        System.out.println("Integer Function running.. ");
        System.out.println("Integer Values passed are - " + Arrays.toString(v));
    }
    // String Function VarArgs
    static void fun(String ...v){
        System.out.println("String Function running.. ");
        System.out.println("String Values passed are - " + Arrays.toString(v));
    }
    // Multiple Type & VarArgs
    static void fun(int num,String name,int ...v){
        System.out.println("Multiple Function running.. ");
        System.out.println("Integer passed - " + num);
        System.out.println("String passed - " + name);
        System.out.println("Integer Values passed are - " + Arrays.toString(v));
    }
}
