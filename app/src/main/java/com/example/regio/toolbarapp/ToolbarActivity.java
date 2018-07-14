package com.example.regio.toolbarapp;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;

public class ToolbarActivity extends AppCompatActivity {

    @BindView(R.id.mytoolbar)
    Toolbar myToolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toolbar);

        ButterKnife.bind(this);

        setSupportActionBar(myToolbar);
        this.getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        //this.getSupportActionBar().setHomeAsUpIndicator(R.drawable.ic_action_close);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.toolbar_menu, menu);
        return true;
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {

            case R.id.menu_item_android:
                Toast.makeText(getApplicationContext(), "Item Android is clicked", Toast.LENGTH_LONG).show();
                return true;

            case R.id.menu_item_save:
                Toast.makeText(getApplicationContext(), "Item Save is clicked", Toast.LENGTH_LONG).show();
                return true;

            case R.id.menu_item_settings:
                Toast.makeText(getApplicationContext(), "Item Settings is clicked", Toast.LENGTH_LONG).show();
                return true;

            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
