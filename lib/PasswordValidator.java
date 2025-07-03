package lib;

public class PasswordValidator {

    /**
     * ตรวจสอบระดับความยากง่ายของรหัสที่ผู้ใช้งานตั้ง
     * @param password รหัสผ่านที่ผู้ใช้งานป้อนเข้ามา
     * @return ระดับความยากง่ายของรหัส โดยเรียงลำดับจาก(INVALID=ไม่ถูกต้อง,WEAK=ง่าย,MEDIUM=ปานกลาง, STRONG=ยาก)
     */

    public static PasswordStrength validate(String password) {  
        int minLength = 8;
                if (password.length() < minLength) {
            return PasswordStrength.INVALID;
        }
        if (password == null || password.isEmpty()) {
            return PasswordStrength.INVALID;
        }
        boolean Upper = password.matches(".*[A-Z].*");
        boolean Lower = password.matches(".*[a-z].*");
        boolean Digit = password.matches(".*\\d.*");
        boolean Special = password.matches(".*[!@#$%^&*()_+\\-=\\[\\]{};':\"\\\\|,.<>/?].*");

        if (Upper && Lower && Digit && Special && password.length() >= minLength) {
            return PasswordStrength.STRONG;
        } else if ((Upper || Lower) && Digit && password.length() >= minLength) {
            return PasswordStrength.MEDIUM;
        }else if (Digit && Special&& password.length() >= minLength ) {
            return PasswordStrength.MEDIUM; 
        }else if ((Upper || Lower) && Special && password.length() >= minLength ) {
            return PasswordStrength.MEDIUM; 
        }else
            return PasswordStrength.WEAK;
    }
}
