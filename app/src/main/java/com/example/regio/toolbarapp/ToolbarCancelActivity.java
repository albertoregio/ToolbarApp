package com.example.regio.toolbarapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

import butterknife.BindView;
import butterknife.ButterKnife;

public class ToolbarCancelActivity extends AppCompatActivity {

    @BindView(R.id.toolbar_cancel)
    Toolbar toolbarCancel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toolbar_cancel);

        ButterKnife.bind(this);

        setSupportActionBar(toolbarCancel);
        this.getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        this.getSupportActionBar().setHomeAsUpIndicator(R.drawable.ic_action_cancel);
    }
}
