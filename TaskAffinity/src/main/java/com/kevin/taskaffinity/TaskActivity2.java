package com.kevin.taskaffinity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

/**
 * Created by Kevin on 13-8-22.
 */
public class TaskActivity2 extends Activity implements View.OnClickListener {
    private Button btn_2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task_2);
        btn_2 = (Button)findViewById(R.id.btn_2);
        btn_2.setOnClickListener(this);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.tast, menu);
        return true;
    }

    @Override
    public void onClick(View v) {
//        Intent i = new Intent(TaskActivity2.this,TaskActivity2.class);
//        startActivity(i);
    }
}
