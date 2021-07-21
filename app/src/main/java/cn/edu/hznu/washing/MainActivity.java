package cn.edu.hznu.washing;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.youth.banner.Banner;
import com.youth.banner.BannerConfig;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        overridePendingTransition(R.anim.from_right, R.anim.no_slide);
        setContentView(R.layout.activity_main);

        List<Integer> images = new ArrayList<>();

        images.add(R.drawable.hihk);
        images.add(R.drawable.hihk2);
        images.add(R.drawable.hihk3);
        images.add(R.drawable.hihk4);

        Banner banner =(Banner)findViewById(R.id.banner);
        //设置banner样式
        banner.setBannerStyle(BannerConfig.NUM_INDICATOR);
        //设置图片加载器
        banner.setImageLoader(new GlideImageLoader());
        //设置图片集合
        banner.setImages(images);
        //设置轮播时间
        banner.setDelayTime(2000);
        //banner设置方法全部调用完毕时最后调用
        banner.start();

        ImageView mapp2=(ImageView)findViewById(R.id.map2);
        mapp2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ma2=new Intent(MainActivity.this,MapActivity4.class);
                startActivity(ma2);
            }
        });

        ImageView mapp1=(ImageView)findViewById(R.id.map1);
        mapp1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ma1=new Intent(MainActivity.this,MapActivity3.class);
                startActivity(ma1);
            }
        });

        Button dorm_jump1=(Button)findViewById(R.id.dorm1);
        dorm_jump1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent1=new Intent(MainActivity.this,List1activity.class);
                startActivity(intent1); }
        });    //洗衣房1进入按钮

        Button dorm_jump2=(Button)findViewById(R.id.dorm2);
        dorm_jump2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2=new Intent(MainActivity.this,List2activity.class);
                startActivity(intent2); }
        });    //洗衣房2进入按钮

        TextView a4=(TextView)findViewById(R.id.announce4);
        a4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent i4=new Intent(MainActivity.this,Announce4.class);
                startActivity(i4);
            }
        });

        TextView a3=(TextView)findViewById(R.id.announce3);
        a3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent i3=new Intent(MainActivity.this,Announce3.class);
                startActivity(i3);
            }
        });

        TextView a2=(TextView)findViewById(R.id.announce2);
        a2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent i2=new Intent(MainActivity.this,Announce2.class);
                startActivity(i2);
            }
        });

        TextView a1=(TextView)findViewById(R.id.announce1);
        a1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent i1=new Intent(MainActivity.this,Announce1.class);
                startActivity(i1);
            }
        });
    }
}