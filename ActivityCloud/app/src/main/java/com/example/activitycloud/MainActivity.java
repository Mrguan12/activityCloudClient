package com.example.activitycloud;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.activitycloud.entity.DictionaryResult;
import com.example.activitycloud.retrofit.ApiBuilder;
import com.example.activitycloud.retrofit.ApiClient;
import com.example.activitycloud.retrofit.CallBack;
import com.example.activitycloud.util.URLConstant;


public class MainActivity extends AppCompatActivity {

    private Button start;
//    private DictionaryResult dictionaryResult;

    private void initComponent(){
        start = findViewById(R.id.bt_start);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initComponent();
//        start.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                System.out.println("hello1");
//                ApiBuilder builder = new ApiBuilder()
//                        .Url(URLConstant.PAYMENT_DETAIL)
//                        .Params("id", "1");
//                System.out.println("hello2");
//                ApiClient.getInstance().doGet(builder, new CallBack<DictionaryResult>() {
//                    @Override
//                    public void onResponse(DictionaryResult data) {
//                        System.out.println("hello3");
//                        dictionaryResult = data;
//                        DictionaryResult.DictionaryBean bean = data.getData().get(0);
//                        System.out.println(bean.toString());
//                        Toast.makeText(MainActivity.this,"成功",Toast.LENGTH_LONG).show();
//                    }
//
//                    @Override
//                    public void onFail(String msg) {
//                        System.out.println("hello4");
//                        Log.d("DictionaryResult", "onFail: " + msg);
//                    }
//                }, DictionaryResult.class);
//            }
//        });
    }
}
