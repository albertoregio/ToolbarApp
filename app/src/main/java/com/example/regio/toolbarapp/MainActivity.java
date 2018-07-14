package com.example.regio.toolbarapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    // Metodo responsavel pelo clique do botao para exibicao das categorias
    @OnClick(R.id.main_show_activity)
    public void showToolbarActivity(View view) {
        Intent intent = new Intent(this, ToolbarActivity.class);
        startActivity(intent);
    }


    // Metodo responsavel pelo clique do botao para exibicao das categorias
    @OnClick(R.id.main_show_activity_cancel)
    public void showToolbarCancelActivity(View view) {
        Intent intent = new Intent(this, ToolbarCancelActivity.class);
        startActivity(intent);
    }
}
