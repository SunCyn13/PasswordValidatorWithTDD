package lib;

public class PasswordValidatorTest{
    
    public static void run() {
        System.out.println("------------ Running Password Validator Tests ------------");
        
        // Test Case 1: รหัสผ่านสั้น INVALID
        String pw ="136";
        PasswordStrength result1 = PasswordValidator.validate(pw);
        if (result1 == PasswordStrength.INVALID) {
            System.out.println("Test Case 1:"+pw+" Passed: Short password is INVALID.");
        } else {
            System.out.println("Test Case 1 :"+pw+"FAILED: Expected INVALID but got " + result1);
        }

        // Test Case 2: รหัสผ่านตัวเล็ก WEAK
        pw = "chayanin";
        PasswordStrength result2 = PasswordValidator.validate(pw);
        if (result2 == PasswordStrength.WEAK) {
            System.out.println("Test Case 2:"+pw+" Passed: Lower password is WEAK.");
        } else {
            System.out.println("Test Case 2:"+pw+"FAILED: Expected WEAK but got " + result2);
        }
        // Test Case 3: รหัสผ่านตัวใหญ๋ WEAK
        pw = "CHAYANIN";
        PasswordStrength result3 = PasswordValidator.validate(pw);
        if (result3 == PasswordStrength.WEAK) {
            System.out.println("Test Case 3:"+pw+" Passed: Upper password is WEAK.");
        } else {
            System.out.println("Test Case 3:"+pw+"FAILED: Expected WEAK but got " + result3);
        }
        
        // Test Case 4: รหัสผ่านตัวใหญ่ผสมเล็ก MEDIUM
        pw = "CHAYAnin";
        PasswordStrength result4 = PasswordValidator.validate(pw);
        if (result4 == PasswordStrength.MEDIUM) {
            System.out.println("Test Case 4:"+pw+" Passed: Upper,Lower password is MEDIUM.");
        } else {
            System.out.println("Test Case 4:"+pw+"FAILED: Expected  MEDIUM but got " + result4);
        }

        // Test Case 5: รหัสเล็กผสมเลข
        pw = "chaya013";
        PasswordStrength result5 = PasswordValidator.validate(pw);
        if (result5 == PasswordStrength.MEDIUM) {
            System.out.println("Test Case 5:"+pw+" Passed: LowerDigit password is MEDIUM.");
        } else {
            System.out.println("Test Case 5:"+pw+"FAILED: Expected  MEDIUM but got " + result5);
        }

        // Test Case 6: รหัสใหญ่ผสมเลข
        pw = "CHAYA013";
        PasswordStrength result6 = PasswordValidator.validate(pw);
        if (result6 == PasswordStrength.MEDIUM) {
            System.out.println("Test Case 6:"+pw+" Passed: UpperDigit password is MEDIUM.");
        } else {
            System.out.println("Test Case 6:"+pw+"FAILED: Expected  MEDIUM but got " + result6);
        }

        // Test Case 7: รหัสใหญ่,เล็กผสมเลข
        pw = "CHAya013";
        PasswordStrength result7 = PasswordValidator.validate(pw);
        if (result7 == PasswordStrength.MEDIUM) {
            System.out.println("Test Case 7:"+pw+" Passed: Your password is STRONG.");
        } else {
            System.out.println("Test Case 7:"+pw+"FAILED: Expected  STRONG but got " + result7);
        }

        System.out.println("------------------------------------------------------------");
    }
}