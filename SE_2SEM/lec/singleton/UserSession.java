package singleton;

public class UserSession {

    private static UserSession instance = null;
    private boolean log = false;
    private String userName;
    private String str;
    private UserSession() {
    }
    public static UserSession getInstance() {
        if (instance == null) {
            instance = new UserSession();

        } else {
            System.out.println("One user at a time please!");
        }
        return instance;

    }
    public boolean setUserName(String userName) {
        if (this.userName == userName) {
            System.out.println("User already logged in");
            return false;
        } else if (this.userName == null || !this.log) {
            this.userName = userName;
            if(str!=null)
            {
                System.out.println("--------------------");
                System.out.println(str);
                System.out.println("--------------------");
            }
            return true;
        }
        else {
            System.out.println("Only 1 user at a time");
            return false;
        }
    }
    public void getUserName() {
        System.out.println(this.userName);
    }
    public void logout() {
        this.userName = null;
        this.log = false;
        str = "Currently logging out";
    }
}
