package com.informacion.rapzodapp.asuguacapp;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.SearchView;
import android.text.TextUtils;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    private SharedPreferences sharedPreferences;
    private SharedPreferences.Editor editor;
    Publicacion_Adapter publicacion_adapter;
    ArrayList<Publicacion> publicacions = new ArrayList<Publicacion>();
    private Publicacion item;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        sharedPreferences = getSharedPreferences("Login", Context.MODE_PRIVATE);
        editor = sharedPreferences.edit();
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        navigationView.getMenu().getItem(0).setChecked(true);

       // int[] imageResId = {R.drawable.promocionesimg, R.drawable.actividades, R.drawable.bolsalaboral,
         //       R.drawable.universidad,R.drawable.transparencia };
        int[] imageResId = {R.drawable.promocionesimg, R.drawable.actividades, R.drawable.bolsalaboral};

        //busca el view pager que permite deslizar los fragment por la pantalla
        ViewPager viewPager = (ViewPager)findViewById(R.id.MainViewPager);
        viewPager.setAdapter(new Category_Adapter(getSupportFragmentManager(),MainActivity.this));
        TabLayout tabLayout =(TabLayout)findViewById(R.id.sliding_tabs);
        tabLayout.setupWithViewPager(viewPager);

        for (int i = 0; i < imageResId.length; i++) {
            tabLayout.getTabAt(i).setIcon(imageResId[i]);
        }

    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);

               return true;
    }

//    @Override
//    public boolean onOptionsItemSelected(MenuItem item) {
//        // Handle action bar item clicks here. The action bar will
//        // automatically handle clicks on the Home/Up button, so long
//        // as you specify a parent activity in AndroidManifest.xml.
//        int id = item.getItemId();
//
//        //noinspection SimplifiableIfStatement
//        if (id == R.id.action_settings) {
//            return true;
//        }
//
//        return super.onOptionsItemSelected(item);
//    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();
        TabLayout tabLayout =(TabLayout)findViewById(R.id.sliding_tabs);
        if (id == R.id.nav_promociones) {
           TabLayout.Tab tab = tabLayout.getTabAt(0);
           tab.select();
        } else if (id == R.id.nav_actividades) {
            TabLayout.Tab tab = tabLayout.getTabAt(1);
            tab.select();
        } else if (id == R.id.nav_bolsalaboral) {
            TabLayout.Tab tab = tabLayout.getTabAt(2);
            tab.select();
        }else if (id == R.id.Miperfil) {
            Intent intent = new Intent(this,Profile_activity.class);
            startActivity(intent);

        } else if (id == R.id.MisPromociones) {
            Intent intent = new Intent(this,Profile_activity.class);
            startActivity(intent);

        }else if (id == R.id.Misactividades) {
            Intent intent = new Intent(this,Profile_activity.class);
            startActivity(intent);

        }  else if (id == R.id.MiBolsaLab) {
            Intent intent = new Intent(this,Profile_activity.class);
            startActivity(intent);

        } else if (id == R.id.TerminarSession) {
            editor.clear();
            editor.commit();
            Intent intent = new Intent(this,LoginActivity.class);
            startActivity(intent);

        }
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
