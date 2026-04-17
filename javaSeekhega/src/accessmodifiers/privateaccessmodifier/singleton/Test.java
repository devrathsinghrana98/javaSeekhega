package accessmodifiers.privateaccessmodifier.singleton;

public class Test {
    public static void main(String[] args){
       School school = School.getSchoolInstance();
        School.getSchoolInstance();
        School.getSchoolInstance();
        School.getSchoolInstance();
        School.getSchoolInstance();
    }
}
