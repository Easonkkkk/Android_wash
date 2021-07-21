package cn.edu.hznu.washing;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Announce1 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        overridePendingTransition(R.anim.from_right, R.anim.no_slide);
        setContentView(R.layout.announce1);
        //显示announce1界面信息

        final View showView=findViewById(R.id.gg1);
        showView.setAlpha(0f);
        showView.setVisibility(View.VISIBLE);
        showView.animate()
                .alpha(1f)
                .setDuration(3000)
                .setListener(null);
        //淡入


        Button bback1=(Button)findViewById(R.id.back1);
        bback1.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("ResourceType")
            @Override
            public void onClick(View v) {
                Intent b1=new Intent(Announce1.this,MainActivity.class);
                startActivity(b1);

            }
        });//返回按钮
    }
}

