package Sequencers;

public class AppUserSequencer {

    private static int appUserId;


    public static int nextAppUserId() {
        return nextAppUserId();
    }

    public static void reset() {

    }

    public AppUserSequencer() {
    }

    public static int getAppUserId() {
        return appUserId;
    }

    public static void setAppUserId(int appUserId) {
        AppUserSequencer.appUserId = appUserId;
    }
}
