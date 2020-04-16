package com.informacion.rapzodapp.asuguacapp;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import java.util.TimerTask;

public class SliderAdapter extends PagerAdapter {
    private Context mcontext;
    private int[] NoticiasDestacadas = new int[]{R.drawable.va_expoandina2018,R.drawable.vrin_concurso_tesis_2018ii,R.drawable.seguimiento_graduados_2018,R.drawable.campania_descarte_2018_ii
    };
    SliderAdapter(Context context){
        mcontext=context;
    }
    @Override
    public int getCount() {

        return NoticiasDestacadas.length;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view==object;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        ImageView imagenView = new ImageView(mcontext);
        imagenView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        imagenView.setImageResource(NoticiasDestacadas[position]);
        container.addView(imagenView, 0);
        return imagenView;

    }


    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
         container.removeView((ImageView)object);
    }
}

