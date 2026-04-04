import com.javaseekhega.models.User;
import com.javaseekhega.models.admin.Admin;
import com.javaseekhega.models.admin.SuperAdmin;
import com.javaseekhega.utils.*;
import static com.javaseekhega.utils.MathHelper.PI;
import static com.javaseekhega.utils.MathHelper.add;
import com.javaseekhega.innerclasses.InnerClassDemo;

public class PackageDemo {
    public static void main(String[] args) {
        System.out.println("=== PACKAGE AND IMPORT DEMONSTRATION ===\n");
        
        System.out.println("1. SINGLE CLASS IMPORTS:");
        User user1 = new User("john_doe", "john@example.com");
        user1.displayInfo();
        
        System.out.println("\n2. NESTED PACKAGE IMPORTS:");
        Admin admin1 = new Admin("A001", "IT");
        admin1.displayAdminInfo();
        
        SuperAdmin superAdmin = new SuperAdmin("SA001", "Security", "Level 5");
        superAdmin.displaySuperAdminInfo();
        
        System.out.println("\n3. WILDCARD IMPORTS (com.javaseekhega.utils.*):");
        System.out.println("Capitalize: " + StringHelper.capitalize("hello"));
        System.out.println("Reverse: " + StringHelper.reverse("java"));
        System.out.println("Is Palindrome: " + StringHelper.isPalindrome("racecar"));
        
        System.out.println("\nMath operations:");
        System.out.println("Add: " + MathHelper.add(5, 3));
        System.out.println("Multiply: " + MathHelper.multiply(4, 7));
        System.out.println("Is Even: " + MathHelper.isEven(10));
        System.out.println("Factorial: " + MathHelper.factorial(5));
        
        System.out.println("\n4. STATIC IMPORTS:");
        System.out.println("Using static import for PI: " + PI);
        System.out.println("Using static import for add(): " + add(10, 20));
        
        System.out.println("\n5. INNER CLASSES DEMONSTRATION:");
        InnerClassDemo demo = new InnerClassDemo();
        
        demo.memberInnerClassDemo();
        
        InnerClassDemo.StaticNestedClass staticNested = new InnerClassDemo.StaticNestedClass();
        staticNested.display();
        
        demo.localInnerClassDemo();
        
        demo.anonymousInnerClassDemo();
        
        System.out.println("\n6. CREATING INNER CLASS INSTANCES:");
        InnerClassDemo.MemberInner memberInner = demo.new MemberInner();
        memberInner.display();
        
        System.out.println("\n=== DEMONSTRATION COMPLETE ===");
    }
}
