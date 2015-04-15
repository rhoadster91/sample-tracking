package in.coupondunia.sample.target;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

import com.appsflyer.MultipleInstallBroadcastReceiver;
import com.apsalar.sdk.ApsalarReceiver;
import com.mobileapptracker.Tracker;

public class MasterInstallReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        switch (TargetApplication.currentBuildFlavour) {
            case TargetApplication.BuildFlavours.APPSFLYER:
                new MultipleInstallBroadcastReceiver().onReceive(context, intent);
                break;

            case TargetApplication.BuildFlavours.APSALAR:
                new ApsalarReceiver().onReceive(context, intent);
                break;

            case TargetApplication.BuildFlavours.MAT:
                new Tracker().onReceive(context, intent);
                break;

        }
    }
}
