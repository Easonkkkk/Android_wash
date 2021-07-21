package cn.edu.hznu.washing;

import android.Manifest;
import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import com.baidu.location.LocationClientOption;
import com.baidu.mapapi.map.BaiduMap;
import com.baidu.mapapi.map.BitmapDescriptorFactory;
import com.baidu.mapapi.map.MapStatus;
import com.baidu.mapapi.map.MapStatusUpdate;
import com.baidu.mapapi.map.MapStatusUpdateFactory;
import com.baidu.mapapi.map.MapView;
import com.baidu.mapapi.model.LatLng;

import java.util.ArrayList;
import java.util.List;

public class MapActivity3 extends Activity {
    private MapView mMapView = null;
    private static final int STROKE_COLOR= Color.argb(180,3,145,255);
    private static final int FILL_COLOR=Color.argb(10,0,0,180);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        overridePendingTransition(R.anim.from_right, R.anim.no_slide);
        setContentView(R.layout.maping3);
//获取地图控件引用

        mMapView = (MapView) findViewById(R.id.map);
        MapView mMapView = (MapView) findViewById(R.id.map);
//获取百度地图
        BaiduMap mBaiduMap = mMapView.getMap();
//开启地图的定位图层
        //获取地图控件引用
//开启地图的定位图层

        LatLng ll = new LatLng(30.299563,120.030494);
        MapStatus mMapStatus = new MapStatus.Builder()
                .target(ll)
                .zoom(18f)
                .build();
//定义MapStatusUpdate对象bai，以便描述地图状态将要发du生的变化
        MapStatusUpdate mMapStatusUpdate = MapStatusUpdateFactory.newMapStatus(mMapStatus);
//改变地图状态
        mBaiduMap.setMapStatus(mMapStatusUpdate);

        MapStatusUpdate update1 = MapStatusUpdateFactory.newLatLng(ll);
        mBaiduMap.animateMapStatus(update1);
        MapStatusUpdate update = MapStatusUpdateFactory.zoomTo(19f);
        mBaiduMap.animateMapStatus(update);
        mBaiduMap.setMyLocationEnabled(true);
        LocationClientOption option = new LocationClientOption();
        option.setOpenGps(true);
        option.setCoorType("bd09ll"); // 设置坐标类型
        option.setScanSpan(1000);


        Button b=(Button)findViewById(R.id.back1);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent b1=new Intent(MapActivity3.this,MainActivity.class);
                startActivity(b1); }
        });

    }
    @Override
    protected void onResume() {
        super.onResume();
//在activity执行onResume时执行mMapView. onResume ()，实现地图生命周期管理
        mMapView.onResume();
    }
    @Override
    protected void onPause() {
        super.onPause();
//在activity执行onPause时执行mMapView. onPause ()，实现地图生命周期管理
        mMapView.onPause();
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
//在activity执行onDestroy时执行mMapView.onDestroy()，实现地图生命周期管理
        mMapView.onDestroy();
    }

}



