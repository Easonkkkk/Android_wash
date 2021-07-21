package cn.edu.hznu.washing;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Announce4 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        overridePendingTransition(R.anim.from_right, R.anim.no_slide);
        setContentView(R.layout.announce4);
        //显示announce4界面信息

        final View showView=findViewById(R.id.gg4);
        showView.setAlpha(0f);
        showView.setVisibility(View.VISIBLE);
        showView.animate()
                .alpha(1f)
                .setDuration(3000)
                .setListener(null);
        //淡入

        Button bback4=(Button)findViewById(R.id.back4);
        bback4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent b4=new Intent(Announce4.this,MainActivity.class);
                startActivity(b4);
            }
        }); //返回按钮
    }
}
