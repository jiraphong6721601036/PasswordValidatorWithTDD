package lib;

public class PasswordValidatorTest{
    
    public static void run() {
        System.out.println("--- Running Password Validator Tests ---");
        
        // Test Case 1: รหัสผ่านสั้นควรจะเป็นระดับ INVALID
        PasswordStrength result1 = PasswordValidator.validate("123");
        if (result1 == PasswordStrength.INVALID) {
            System.out.println("Test Case 1 Passed: Short password is INVALID.");
        } else {
            System.out.println("Test Case 1 FAILED: Expected INVALID but got " + result1);
        }
        // Test Case 2:ไม่ใส่รหัสผ่านเป็นระดับ INVALID
            PasswordStrength result2 = PasswordValidator.validate("");
        if (result2 == PasswordStrength.INVALID) {
            System.out.println("Test Case 2 Passed: null password is INVALID.");
        } else {
            System.out.println("Test Case 2 FAILED: Expected INVALID but got " + result2);
        }
        // Test Case 3:รหัสผ่านว่างควรจะเป็นระดับ INVALID
            PasswordStrength result3 = PasswordValidator.validate(" ");
        if (result3 == PasswordStrength.INVALID) {
            System.out.println("Test Case 3 Passed: empty password is INVALID.");
        } else {
            System.out.println("Test Case 3 FAILED: Expected INVALID but got " + result3);
        }
            // Test Case 4:รหัสผ่านที่ใส่แค่ตัวเลขอย่างเดียวแต่มากกว่า7ตัวควรจะเป็นระดับ WEAK
           PasswordStrength result4 = PasswordValidator.validate("12345678");
        if (result4 == PasswordStrength.WEAK) {
            System.out.println("Test Case 4 Passed: this password is WEAK.");
        } else {
            System.out.println("Test Case 4 FAILED: Expected WEAK but got " + result4);
        }
            // Test Case 5:รหัสผ่านที่ใส่แค่ตัวอักษรแต่มากกว่า7ตัวควรจะเป็นระดับ WEAK
            PasswordStrength result5 = PasswordValidator.validate("abcdefgh");
        if (result5 == PasswordStrength.WEAK) {
            System.out.println("Test Case 5 Passed: this password is WEAK.");
        } else {
            System.out.println("Test Case 5 FAILED: Expected WEAK but got " + result5);
        }
            // Test Case 6:รหัสผ่านที่ใส่ทั้งตัวอักษร ตัวเลข และมากกว่า7ตัวควรจะเป็นระดับ MEDIUM
            PasswordStrength result6 = PasswordValidator.validate("testpass12");
        if (result6 == PasswordStrength.MEDIUM) {
            System.out.println("Test Case 6 Passed: this password is MEDIUM.");
        } else {
            System.out.println("Test Case 6 FAILED: Expected MEDIUM but got " + result6);
        }
            // Test Case 7:รหัสผ่านที่ใส่ทั้งตัวเลข อักษรพิเศษ และมากกว่า7ตัวควรจะเป็นระดับ MEDIUM
            PasswordStrength result7 = PasswordValidator.validate("0000_9999");
        if (result7 == PasswordStrength.MEDIUM) {
            System.out.println("Test Case 7 Passed: this password is MEDIUM.");
        } else {
            System.out.println("Test Case 7 FAILED: Expected MEDIUM but got " + result7);
        }
            // Test Case 8:รหัสผ่านที่ใส่ทั้งตัวอักษร อักษรพิเศษ และมากกว่า7ตัวควรจะเป็นระดับ MEDIUM
            PasswordStrength result8 = PasswordValidator.validate("Test__pass");
        if (result8 == PasswordStrength.MEDIUM) {
            System.out.println("Test Case 8 Passed: this password is MEDIUM.");
        } else {
            System.out.println("Test Case 8 FAILED: Expected MEDIUM but got " + result8);
        }
        // Test Case 9:รหัสผ่านที่ใส่ทั้งตัวอักษรพิมพ์ใหญ่ พิมพ์เล็ก ตัวเลข อักษรพิเศษ และมากกว่า7ตัวควรจะเป็นระดับ STRONG
            PasswordStrength result9 = PasswordValidator.validate("TestPassW_1122");
        if (result9 == PasswordStrength.STRONG) {
            System.out.println("Test Case 9 Passed: this password is STRONG.");
        } else {
            System.out.println("Test Case 9 FAILED: Expected STRONG but got " + result9);
        }
    }
}
