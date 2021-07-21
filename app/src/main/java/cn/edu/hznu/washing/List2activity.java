package cn.edu.hznu.washing;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import cn.pedant.SweetAlert.SweetAlertDialog;

public class List2activity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        overridePendingTransition(R.anim.from_right, R.anim.no_slide);
        setContentView(R.layout.list2);
        //显示list2界面信息

        Button u1=(Button)findViewById(R.id.use1);
        Button u2=(Button)findViewById(R.id.use2);
        Button u3=(Button)findViewById(R.id.use3);
        final TextView s1=(TextView)findViewById(R.id.state1);
        final TextView s2=(TextView)findViewById(R.id.state2);
        final TextView s3=(TextView)findViewById(R.id.state3);


        u1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final String content1=s1.getText().toString();
                if(content1.equals("空闲中")){
                    new SweetAlertDialog(List2activity.this, SweetAlertDialog.SUCCESS_TYPE)
                            .setTitleText("清洗消息")
                            .setContentText("你现在可以开始清洗衣服啦!")
                            .show();

                    s1.setText("使用中");
                    //可使用通知
                }
                else{
                    new SweetAlertDialog(List2activity.this, SweetAlertDialog.WARNING_TYPE)
                            .setTitleText("清洗消息")
                            .setContentText("很抱歉!这台洗衣机已经在工作啦，请选择下一台")
                            .setConfirmText("好的!")
                            .show();
                }
                //警告通知
            }
        });

        u2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final String content2=s2.getText().toString();

                if(content2.equals("空闲中")){
                    new SweetAlertDialog(List2activity.this, SweetAlertDialog.SUCCESS_TYPE)
                            .setTitleText("清洗消息")
                            .setContentText("你现在可以开始清洗衣服啦!")
                            .show();
                    s2.setText("使用中");
                    //可使用通知
                }
                    //警告通知
                }});



        u3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    new SweetAlertDialog(List2activity.this, SweetAlertDialog.SUCCESS_TYPE)
                            .setTitleText("清洗消息")
                            .setContentText("你现在可以开始清洗衣服啦!")
                            .show();

                    s3.setText("使用中");

                    //可使用通知
                }

                //警告通知
        });

        ImageView m1=(ImageView)findViewById(R.id.map1);
        m1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gq1=new Intent(List2activity.this,MapActivity2.class);
                startActivity(gq1);
            }
        });

        ImageView m2=(ImageView)findViewById(R.id.map2);
        m2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gq2=new Intent(List2activity.this,MapActivity2.class);
                startActivity(gq2);
            }
        });

        ImageView m3=(ImageView)findViewById(R.id.map3);
        m3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gq3=new Intent(List2activity.this,MapActivity2.class);
                startActivity(gq3);
            }
        });


        Button a4=(Button)findViewById(R.id.appoint4);
        a4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent app1=new Intent(List2activity.this,Appoint.class);
                startActivity(app1); }
        });    //预约按钮

        Button a5=(Button)findViewById(R.id.appoint5);
        a5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent app2=new Intent(List2activity.this,Appoint.class);
                startActivity(app2); }
        });    //预约按钮

        Button a6=(Button)findViewById(R.id.appoint6);
        a6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent app3=new Intent(List2activity.this,Appoint.class);
                startActivity(app3); }
        });    //预约按钮

        Button bbackl2=(Button)findViewById(R.id.backl2);
        bbackl2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent b2=new Intent(List2activity.this,MainActivity.class);
                startActivity(b2);
            }
        });//返回按钮
    }
}