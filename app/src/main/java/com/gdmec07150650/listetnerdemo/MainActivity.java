package com.gdmec07150650.listetnerdemo;

import android.content.Context;
import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button bt1;
    private Button bt2;
    private Button bt3;
    private Button bt4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        bt1 = (Button) findViewById(R.id.bt1);
        bt2 = (Button) findViewById(R.id.bt2);
        bt3 = (Button) findViewById(R.id.bt3);
        bt4 = (Button) findViewById(R.id.bt4);

        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "这是匿名类", Toast.LENGTH_SHORT).show();
            }
        });
        bt3.setOnClickListener(new ListenerDemo());
        bt4.setOnClickListener(this);
        bt2.setOnClickListener(new listenerClass());
    }

    @Override
    public void onClick(View v) {
        Toast.makeText(MainActivity.this, "这是实现接口的", Toast.LENGTH_SHORT).show();
    }

    class listenerClass implements View.OnClickListener{

        @Override
        public void onClick(View v) {
            Toast.makeText(MainActivity.this, "内部类", Toast.LENGTH_SHORT).show();
        }
    }

}

class ListenerDemo implements View.OnClickListener{
    @Override
    public void onClick(View v) {
        //Toast.makeText(context, "外部类", Toast.LENGTH_SHORT).show();
    }
}
