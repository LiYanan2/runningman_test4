package xyz.liyanan.runningman_test4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //获取帧布局对象，并且实例化一个running对象
        FrameLayout frameLayout = (FrameLayout) findViewById(R.id.framelayout);
        final running running = new running(MainActivity.this);
        //添加触摸监听事件
        running.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                running.bitmapX = event.getX() - 150;
                running.bitmapY = event.getY() - 150;
                //调用重绘方法
                running.invalidate();
                return true;
            }
        });
        //将running对象加到帧布局中
        frameLayout.addView(running);
    }
}
