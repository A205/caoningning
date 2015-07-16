package com.example.cao.i_reader;

import android.app.TabActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TabHost;


public class MainActivity extends TabActivity {
    private TabHost host;
    private Button button;
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
        button=(Button)findViewById(R.id.bt);
        button.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Intent intent=new Intent(MainActivity.this,YdActivity.class);
                startActivity(intent);
            }
        });
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
