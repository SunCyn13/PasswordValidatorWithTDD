package lib;

public class PasswordValidator {

    /**
     * คุณจะต้องเขียน Javadoc ที่สมบูรณ์ที่นี่ในอนาคต
     * เพื่ออธิบายกฎการทำงานของเมธอด
     * ตรวจสอบความแข็งแรงของรหัสที่จะเกิดขึ้นได้
     * ถ้ารหัสน้อยกว่า8 จะเป็น INVALID
     * ถ้ารหัสเป็นตัวพิมพ์ใหญ่หรือเล็ก จะเป็น WEAK
     * ถ้ารหัสเป็นตัวพิมพ์ใหญ่ผสมเล็ก จะเป็น MEDIUM
     * ถ้ารหัสเป็นตัวพิมพ์ใหญ่หรือเล็กผสมเลข จะเป็น MEDIUM
     * ถ้ารหัสเป็นตัวพิมพ์ใหญ่ผสมเล็กและเลข จะเป็น STRONG
     * @param = Password ที่ต้องการตรวจสอบ
     * @return = ผลลัพธ์ว่ารหัสผ่านนั้นใช้ได้หรือไม่
     */
    // TODO: แก้ไข return type ของเมธอดนี้ให้ถูกต้อง
    public static PasswordStrength validate(String password) { // Function Type ให้เป็น PasswordStrength 
        
        // ส่วนของ Implementation ที่คุณต้องเขียน
        // ...
         // TODO: มีอะไรขาดหายไปที่บรรทัดนี้?

        boolean Lower = false;
        boolean Upper = false;
        boolean Digit = false;

        if(password == null || password.length() < 8 )
            return PasswordStrength.INVALID;
        
        for(char c : password.toCharArray()){
            if (Character.isLowerCase(c)) 
                Lower = true; 
            else if(Character.isUpperCase(c))
                Upper = true;
            else if (Character.isDigit(c)) 
                Digit = true;
        }
    
        if(!Upper && Lower && !Digit) 
        return PasswordStrength.WEAK;

        if(Upper && !Lower && !Digit) 
        return PasswordStrength.WEAK;

        if (Upper && Lower && Digit)
        return PasswordStrength.MEDIUM;

        if (!Upper && Lower && Digit)
        return PasswordStrength.MEDIUM;

        if (Upper && !Lower && Digit) 
        return PasswordStrength.MEDIUM;

        if (Upper && Lower && !Digit)
        return PasswordStrength.MEDIUM;

        return PasswordStrength.INVALID; 
    }
}