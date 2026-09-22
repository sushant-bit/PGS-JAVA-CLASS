package Week5;

import Week5.accessModifier.AccessModifierExample;

public class Test extends  AccessModifierExample{
    public static void main(String[] args) {
        Test test = new Test();
        AccessModifierExample accessModifierExample= new AccessModifierExample();
        test.displayInfo();
    }
}
