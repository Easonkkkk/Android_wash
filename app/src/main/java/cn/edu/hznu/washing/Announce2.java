package cn.edu.hznu.washing;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Announce2 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        overridePendingTransition(R.anim.from_right, R.anim.no_slide);
        setContentView(R.layout.announce2);
        //显示announce2界面信息

        final View showView=findViewById(R.id.gg2);
        showView.setAlpha(0f);
        showView.setVisibility(View.VISIBLE);
        showView.animate()
                .alpha(1f)
                .setDuration(3000)
                .setListener(null);
        //淡入


        Button bback2=(Button)findViewById(R.id.back2);
        bback2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent b2=new Intent(Announce2.this,MainActivity.class);
                startActivity(b2);
            }
        });//返回按钮
    }
}

