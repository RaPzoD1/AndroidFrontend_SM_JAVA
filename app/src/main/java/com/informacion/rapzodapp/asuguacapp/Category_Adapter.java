package com.informacion.rapzodapp.asuguacapp;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class Category_Adapter extends FragmentPagerAdapter {

    private String tabTitles[] = new String[] { "Promociones", "Oportunidades", "Actualizacion","Crecimiento","Universidad" };
    private Context context;
    Drawable myDrawable;
    String title;

    public Category_Adapter(FragmentManager fm, Context context){

        super(fm);
        this.context = context;
    }
    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new Promociones_Fragment();
        } else if (position == 1) {
            return new Actividades_Fragment();
        } else  {
            return new BolsaLab_Fragment();
        }
    }
    @Override
    public CharSequence getPageTitle(int position) {

       return null;

    }
    @Override
    public int getCount() {
        return 3;
    }
}
