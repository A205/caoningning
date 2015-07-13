package com.example.cao.ireader;

import android.app.TabActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TabHost;


public class MainActivity extends TabActivity {
    private TabHost host;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        host=getTabHost();
        TabHost.TabSpec s1=host.newTabSpec("one");
        s1.setIndicator("List");
        s1.setContent(R.id.tr1);
        host.addTab(s1);
//        host=getTabHost();
        TabHost.TabSpec s2=host.newTabSpec("two");
        s2.setIndicator("Discover");
        s2.setContent(R.id.tr2);
        host.addTab(s2);

//        host=getTabHost();
        TabHost.TabSpec s3=host.newTabSpec("three");
        s3.setIndicator("Word");
        s3.setContent(R.id.tr3);
        host.addTab(s3);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
