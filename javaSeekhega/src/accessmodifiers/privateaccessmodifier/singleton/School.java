package accessmodifiers.privateaccessmodifier.singleton;

public class School {
    private School(){}//this prevent this class to create new object directly in another class
    private static School instance;

    public static School getSchoolInstance(){
        if(instance==null){
            instance=new School();
        }
        return instance;
    }
}
