package com.bw.ddvs.observerpattern01.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.bw.ddvs.observerpattern01.R;
import com.bw.ddvs.observerpattern01.bean.Teacher;

import java.util.Observable;
import java.util.Observer;

public class BaseActivity extends AppCompatActivity implements Observer {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_base);

        if (this instanceof Observer) {
            //将要接收消息的学生添加
            Teacher.getInstance().addObserver(this);
        }
    }

    //接受到消息的回调方法，就是学生接受到消息后做出的反映
    @Override
    public void update(Observable o, Object arg) {

    }
}
