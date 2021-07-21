package cn.edu.hznu.washing;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Announce3 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        overridePendingTransition(R.anim.from_right, R.anim.no_slide);
        setContentView(R.layout.announce3);
        //显示announce3界面信息

        final View showView=findViewById(R.id.gg3);
        showView.setAlpha(0f);
        showView.setVisibility(View.VISIBLE);
        showView.animate()
                .alpha(1f)
                .setDuration(3000)
                .setListener(null);
        //淡入

        Button bback3=(Button)findViewById(R.id.back3);
        bback3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent b3=new Intent(Announce3.this,MainActivity.class);
                startActivity(b3);
            }
        });//返回按钮
    }
}

