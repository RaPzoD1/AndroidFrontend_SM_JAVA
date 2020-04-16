package com.informacion.rapzodapp.asuguacapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.text.Layout;
import android.widget.ImageView;
import android.widget.TextView;

public class PublicacionFull extends AppCompatActivity {

    private Publicacion item;
    private TextView TituloFull,PublicacionContenido,Fecha;
    private ImageView ImageFull;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_publicacion_full);

        item =(Publicacion) getIntent().getSerializableExtra("DataPublicacion");

        TituloFull =(TextView) findViewById(R.id.tituloFull);
        PublicacionContenido = (TextView) findViewById(R.id.publicacionHTMLFULL);
        Fecha =(TextView) findViewById(R.id.FechapubFULL);
        ImageFull = (ImageView) findViewById(R.id.img_publicacionFull);

        TituloFull.setText(item.getTitlePublication());

        PublicacionContenido.setText(item.getContenidoPublicacion());
        Fecha.setText(item.getTimePublication());
        ImageFull.setImageResource(item.getmImageViewId());
    }
}
