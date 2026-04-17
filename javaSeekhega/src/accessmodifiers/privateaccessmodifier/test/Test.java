package accessmodifiers.privateaccessmodifier.test;

import accessmodifiers.privateaccessmodifier.singleton.School;
import accessmodifiers.privateaccessmodifier.utils.Utils;

public class Test {
    public static void main(String[] args){
        Utils.sumOfTwo(1,3);
        School school = School.getSchoolInstance();
        School.getSchoolInstance();
        School.getSchoolInstance();
        School.getSchoolInstance();
        School.getSchoolInstance();
        School.getSchoolInstance();
    }
}
