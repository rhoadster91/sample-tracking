package in.coupondunia.sample.source;

import android.app.Application;

public class SourceApplication extends Application {

    public static String currentBuildFlavour;
    public static class BuildFlavours {
        public static final String APPSFLYER = "AppsFlyer";
        public static final String APSALAR = "Apsalar";
        public static final String MAT = "MobileAppTracking";
    }

    @Override
    public void onCreate() {
        super.onCreate();
        switch (BuildConfig.FLAVOR) {
            case "appsflyer":
                currentBuildFlavour = BuildFlavours.APPSFLYER;
                break;

            case "apsalar":
                currentBuildFlavour = BuildFlavours.APSALAR;
                break;

            case "mat":
                currentBuildFlavour = BuildFlavours.MAT;
                break;

        }

    }
}
