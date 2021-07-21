    package cn.edu.hznu.washing;

    import android.app.Activity;
    import android.graphics.Color;
    import android.os.Bundle;
    import android.os.CountDownTimer;
    import android.view.View;

    import android.content.Intent;
    import android.os.Bundle;
    import android.view.View;
    import android.widget.Button;
    import android.widget.ImageView;
    import android.widget.TextView;

    import androidx.appcompat.app.AppCompatActivity;

    import java.util.ArrayList;
    import java.util.List;

    import javax.crypto.Mac;

    import cn.pedant.SweetAlert.SweetAlertDialog;

    public class List1activity extends AppCompatActivity {

        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            overridePendingTransition(R.anim.from_right, R.anim.no_slide);
            setContentView(R.layout.list1);
            //显示list1界面信息

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
                            new SweetAlertDialog(List1activity.this, SweetAlertDialog.SUCCESS_TYPE)
                                    .setTitleText("消息")
                                    .setContentText("转借成功!")
                                    .show();
                             s1.setText("使用中");
                             //警告通知
                           }
                        else{
                            new SweetAlertDialog(List1activity.this, SweetAlertDialog.WARNING_TYPE)
                                    .setTitleText("清洗消息")
                                    .setContentText("很抱歉!这台洗衣机已经在工作啦，请选择下一台")
                                    .setConfirmText("好的!")
                                    .show();
                           }
                        //可使用通知
                }
            });

            u2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    final String content2=s2.getText().toString();

                    if(content2.equals("空闲中")){
                        new SweetAlertDialog(List1activity.this, SweetAlertDialog.SUCCESS_TYPE)
                                .setTitleText("清洗消息")
                                .setContentText("你现在可以开始清洗衣服啦!")
                                .show();
                        s2.setText("使用中");
                        //可使用通知
                    }
                    else{
                        new SweetAlertDialog(List1activity.this, SweetAlertDialog.WARNING_TYPE)
                                .setTitleText("清洗消息")
                                .setContentText("很抱歉!这台洗衣机已经在工作啦，请选择下一台")
                                .setConfirmText("好的!")
                                .show();
                        //警告通知

       }}});



            u3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    final String content3=s3.getText().toString();
                    if(content3.equals("空闲中")){
                        new SweetAlertDialog(List1activity.this, SweetAlertDialog.SUCCESS_TYPE)
                                .setTitleText("清洗消息")
                                .setContentText("你现在可以开始清洗衣服啦!")
                                .show();
                        s3.setText("使用中");
                        //可使用通知
                    }
                    else{
                        new SweetAlertDialog(List1activity.this, SweetAlertDialog.WARNING_TYPE)
                                .setTitleText("清洗消息")
                                .setContentText("很抱歉!这台洗衣机已经在工作啦，请选择下一台")
                                .setConfirmText("好的!")
                                .show();
                    }
                    //警告通知
                }
            });


            Button a1=(Button)findViewById(R.id.appoint1);
            a1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent app1=new Intent(List1activity.this,Appoint.class);
                    startActivity(app1); }
            });    //预约按钮


           ImageView m1=(ImageView)findViewById(R.id.map1);
            m1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent gq1=new Intent(List1activity.this,MapActivity.class);
                    startActivity(gq1);
                }
            });

            ImageView m2=(ImageView)findViewById(R.id.map2);
            m2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent gq2=new Intent(List1activity.this,MapActivity.class);
                    startActivity(gq2);
                }
            });

            ImageView m3=(ImageView)findViewById(R.id.map3);
            m3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent gq3=new Intent(List1activity.this,MapActivity.class);
                    startActivity(gq3);
                }
            });


            Button a2=(Button)findViewById(R.id.appoint2);
            a2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent app2=new Intent(List1activity.this,Appoint.class);
                    startActivity(app2); }
            });    //预约按钮

            Button a3=(Button)findViewById(R.id.appoint3);
            a3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent app3=new Intent(List1activity.this,Appoint.class);
                    startActivity(app3); }
            });    //预约按钮

            Button bback1=(Button)findViewById(R.id.backl1);
            bback1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent b1=new Intent(List1activity.this,MainActivity.class);
                    startActivity(b1);
                }
            });//返回按钮
        }
    }