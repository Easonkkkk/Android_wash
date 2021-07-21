package cn.edu.hznu.washing;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;

public class Appoint extends AppCompatActivity{
    NotificationChannel channel=null;
    NotificationManager manager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        overridePendingTransition(R.anim.from_right, R.anim.no_slide);
        setContentView(R.layout.appointment);

        Button sumb=(Button)findViewById(R.id.submit);
        manager=(NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
        if(Build.VERSION.SDK_INT>= Build.VERSION_CODES.O) {
            channel = new NotificationChannel("MyChannel", "MyChannel", NotificationManager.IMPORTANCE_HIGH);
            manager.createNotificationChannel(channel);
        }
        sumb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                NotificationCompat.Builder builder;
                if(Build.VERSION.SDK_INT>= Build.VERSION_CODES.O){
                    builder = new NotificationCompat.Builder(Appoint.this, "MyChannel");
                }else{
                    builder = new NotificationCompat.Builder(Appoint.this,"default");
                }
                builder.setSmallIcon(R.mipmap.ic_launcher)
                        .setWhen(System.currentTimeMillis())
                        .setContentTitle("预约消息通知")
                        .setContentText("尊敬的客户，你的预约已成功，请及时到对应的洗衣机清洗")
                        .setPriority(NotificationCompat.PRIORITY_DEFAULT)
                        .setAutoCancel(true);

                manager.notify(1,builder.build());
                Intent a1=new Intent(Appoint.this,MainActivity.class);
                startActivity(a1);
            }
        });
    }
}
