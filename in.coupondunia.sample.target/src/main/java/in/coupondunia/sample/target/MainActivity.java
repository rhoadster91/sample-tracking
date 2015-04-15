package in.coupondunia.sample.target;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(in.coupondunia.sample.target.R.layout.activity_main);
        TextView tvFlavour = (TextView) findViewById(R.id.flavour);
        tvFlavour.setText(TargetApplication.currentBuildFlavour);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(in.coupondunia.sample.target.R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == in.coupondunia.sample.target.R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
