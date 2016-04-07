package com.example.rr.application2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.ViewSwitcher;

public class MainActivity extends AppCompatActivity implements ViewSwitcher.ViewFactory,View.OnClickListener {
    private int i=0;
    private Button mButton;
    private ImageSwitcher mImageS;
    private int[] image={R.mipmap.m1,R.mipmap.m2};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mImageS= (ImageSwitcher) findViewById(R.id.image);
        mImageS.setFactory(this);
        mButton= (Button) findViewById(R.id.Button);
        mButton.setOnClickListener(this);

    }

    @Override
    public View makeView() {
        ImageView imageView=new ImageView(this);
        imageView.setLayoutParams(new FrameLayout.LayoutParams(
                FrameLayout.LayoutParams.MATCH_PARENT,FrameLayout.LayoutParams.WRAP_CONTENT
        ));

        imageView.setImageResource(image[i]); return imageView;

    }

    @Override
    public void onClick(View v) {

        i++;
        if(i==2){
            i=0;
        mImageS.setImageResource(image[i]);
        }
        else{
            mImageS.setImageResource(image[i]);
        }

    }
}
