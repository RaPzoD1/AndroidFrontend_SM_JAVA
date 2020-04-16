package com.informacion.rapzodapp.asuguacapp;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Locale;

public class Publicacion_Adapter extends ArrayAdapter<Publicacion> {

    private static final String LOG_TAG= Publicacion.class.getSimpleName();
    private  int mColorResourseID;
    ArrayList<Publicacion> publicacions;
    ArrayList<Publicacion> arrayList;

    public Publicacion_Adapter(Activity context, ArrayList<Publicacion> publicacions, int ColorResourseID) {
        super(context, 0,publicacions);
        mColorResourseID=ColorResourseID;
    }

    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent){

        View itemContainerView = convertView;
        if(itemContainerView == null){

            itemContainerView = LayoutInflater.from(getContext()).inflate(R.layout.item_container_list,parent,false);
        }
        //optiene la posicion
        Publicacion courentpublicacion = getItem(position);
        //texto del titulo
        TextView tituloTextView = (TextView) itemContainerView.findViewById(R.id.Title_view);
        tituloTextView.setText(courentpublicacion.getTitlePublication());

//        //texto del autor
//        TextView autorTextView = (TextView) itemContainerView.findViewById(R.id.Autor_View);
//        autorTextView.setText(courentpublicacion.getAutorPublication());

        //tiempode publicacion
        TextView tiempoTextView = (TextView) itemContainerView.findViewById(R.id.dateTime_view);
        tiempoTextView.setText(courentpublicacion.getTimePublication());

//        //cantidad e favoritos
//        TextView favoritosTextView = (TextView)itemContainerView.findViewById(R.id.favoritos);
//        favoritosTextView.setText(courentpublicacion.getFavoritePublication());

//        ImageView starImagen = (ImageView) itemContainerView.findViewById(R.id.imageView3);
//        starImagen.setImageDrawable(R.drawable.baseline_favorite_24);
        //imagen dela publicacion
        //------- Boton favoritos y share
//        ImageView icon_Favorite = (ImageView)itemContainerView.findViewById(R.id.imageView3);
//        ImageView icon_Share = (ImageView)itemContainerView.findViewById(R.id.imageView5);

        //------------------
        ImageView iconview =(ImageView) itemContainerView.findViewById(R.id.listItemIcon);
        if(courentpublicacion.hasImage()){

            iconview.setImageResource(courentpublicacion.getmImageViewId());
            iconview.setVisibility(View.VISIBLE);
        }else {

            iconview.setVisibility(View.GONE);
        }
        View publicacionContainer = itemContainerView.findViewById(R.id.text_container);

        int color = ContextCompat.getColor(getContext(),mColorResourseID);
        publicacionContainer.setBackgroundColor(color);

        return itemContainerView;
    }
    //filter method
    public void filter(String charText){

        charText =charText.toLowerCase(Locale.getDefault());
        publicacions.clear();
        if (charText.length()==0){
            publicacions.addAll(arrayList);
        }else {
            for (Publicacion publicacion:arrayList){
                if (publicacion.getTitlePublication().toLowerCase(Locale.getDefault()).contains(charText)){

                    publicacions.add(publicacion);

                }
            }
        }
        notifyDataSetChanged();
    }

}
