package com.informacion.rapzodapp.asuguacapp;

import android.content.Context;
import android.content.Intent;
import android.support.design.widget.TabLayout;
import android.support.v4.content.ContextCompat;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ViewFlipper;


import java.util.Timer;
import java.util.TimerTask;

public class mainslider extends AppCompatActivity {

    LinearLayout linearLayout;
    private int dotsCounts;
    private ImageView[] dots;
    ViewPager viewPager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setContentView(R.layout.activity_mainslider);
        int[] NoticiasDestacadas = new int[]{R.drawable.va_expoandina2018,R.drawable.vrin_concurso_tesis_2018ii,R.drawable.seguimiento_graduados_2018,R.drawable.campania_descarte_2018_ii
        };

//        viewFlipper = findViewById(R.id.Slider);
        linearLayout =(LinearLayout)findViewById(R.id.sliderDots);

        viewPager = findViewById(R.id.Slider);
        SliderAdapter adapter = new SliderAdapter(this);
        viewPager.setAdapter(adapter);
        Timer timer = new Timer();
        timer.scheduleAtFixedRate(new SliderTimer(),2000,4000 );

       dotsCounts = NoticiasDestacadas.length;
       dots = new ImageView[dotsCounts];
       for( int i=0; i<dotsCounts;i++)
        {
            dots[i] = new ImageView(this);
            dots[i].setImageDrawable(ContextCompat.getDrawable(getApplicationContext(),R.drawable.nonactive_dot));

            LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT);
            params.setMargins(8,0,8,0);
            linearLayout.addView(dots[i],params);


        }
        dots[0].setImageDrawable(ContextCompat.getDrawable(getApplicationContext(),R.drawable.active_dot));
       viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
           @Override
           public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

           }

           @Override
           public void onPageSelected(int position) {
               for (int i=0; i<dotsCounts;i++){
                   dots[i].setImageDrawable(ContextCompat.getDrawable(getApplicationContext(),R.drawable.nonactive_dot));

               }
               dots[position].setImageDrawable(ContextCompat.getDrawable(getApplicationContext(),R.drawable.active_dot));

           }

           @Override
           public void onPageScrollStateChanged(int state) {

           }
       });
        //Botones intent
        CardView Btn1=(CardView)findViewById(R.id.btn_comment);
        CardView Btn2=(CardView)findViewById(R.id.btn_calendar);
        CardView Btn3=(CardView)findViewById(R.id.btn_graduation);
        CardView Btn4=(CardView)findViewById(R.id.btn_cafe);


        Btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(mainslider.this,MainActivity.class);
                startActivity(intent);

            }
        });
        Btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });


    }

//    public void sliderFlipper (int NoticiasDestacadas){
//
//        ImageView imageView = new ImageView(this);
//        imageView.setImageResource(NoticiasDestacadas);
//        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
//
//        viewFlipper.addView(imageView);
//        viewFlipper.setFlipInterval(4000);
//        viewFlipper.setAutoStart(true);
//
//        viewFlipper.setInAnimation(this,android.R.anim.slide_in_left);
//        viewFlipper.setOutAnimation(this,android.R.anim.slide_out_right);
//    }

    public  class SliderTimer extends TimerTask{

        @Override
        public void run() {
            mainslider.this.runOnUiThread(new Runnable() {
                @Override
                public void run() {
                    if (viewPager.getCurrentItem()==0){
                        viewPager.setCurrentItem(1);
                    }
                    else if (viewPager.getCurrentItem()==1){
                        viewPager.setCurrentItem(2);
                    }
                    else  if (viewPager.getCurrentItem()==2){
                        viewPager.setCurrentItem(3);
                    }else {
                        viewPager.setCurrentItem(0);
                    }
                }
            });

        }
    }

}
