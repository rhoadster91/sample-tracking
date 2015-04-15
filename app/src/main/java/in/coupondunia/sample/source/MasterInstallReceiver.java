package in.coupondunia.sample.source;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

import com.appsflyer.MultipleInstallBroadcastReceiver;
import com.apsalar.sdk.ApsalarReceiver;
import com.mobileapptracker.Tracker;

public class MasterInstallReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        switch (SourceApplication.currentBuildFlavour) {
            case SourceApplication.BuildFlavours.APPSFLYER:
                new MultipleInstallBroadcastReceiver().onReceive(context, intent);
                break;

            case SourceApplication.BuildFlavours.APSALAR:
                new ApsalarReceiver().onReceive(context, intent);
                break;

            case SourceApplication.BuildFlavours.MAT:
                new Tracker().onReceive(context, intent);
                break;

        }
    }
}
