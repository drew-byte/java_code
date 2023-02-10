package singleton;


public class MainSession {

    public static void main(String[] args) {
        //Andrew Felix Cunanan

        UserSession session = UserSession.getInstance();
        session.setUserName("Juan");
        System.out.println("Currently logged in: ");
        session.getUserName();

        session.logout();

        UserSession session1 = UserSession.getInstance();
        session1.setUserName("Peter");
        System.out.println("Currently logged in: ");
        session1.getUserName();

    }
}
