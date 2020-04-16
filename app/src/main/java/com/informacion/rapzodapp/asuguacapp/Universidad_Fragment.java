package com.informacion.rapzodapp.asuguacapp;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class Universidad_Fragment extends Fragment {


    public Universidad_Fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.main_list,container,false);
        final ArrayList<Publicacion> universidadPub = new ArrayList<Publicacion>();

        universidadPub.add(new Publicacion("Titulo1","Autor1","Hace 2 horas","100",R.drawable.unvrsdd_imgdefault));
        universidadPub.add(new Publicacion("Titulo2","Autor2","Hace 2 horas","100",R.drawable.unvrsdd_imgdefault));
        universidadPub.add(new Publicacion("Titulo3","Autor3","Hace 2 horas","100",R.drawable.unvrsdd_imgdefault));
        universidadPub.add(new Publicacion("Titulo4","Autor4","Hace 2 horas","100",R.drawable.unvrsdd_imgdefault));
        universidadPub.add(new Publicacion("Titulo5","Autor5","Hace 2 horas","100",R.drawable.unvrsdd_imgdefault));
        universidadPub.add(new Publicacion("Titulo6","Autor6","Hace 2 horas","100",R.drawable.unvrsdd_imgdefault));
        universidadPub.add(new Publicacion("Titulo7","Autor7","Hace 2 horas","100",R.drawable.unvrsdd_imgdefault));
        universidadPub.add(new Publicacion("Titulo8","Autor8","Hace 2 horas","100",R.drawable.unvrsdd_imgdefault));
        universidadPub.add(new Publicacion("Titulo9","Autor9","Hace 2 horas","100",R.drawable.unvrsdd_imgdefault));
        universidadPub.add(new Publicacion("Titulo10","Autor10","Hace 2 horas","100",R.drawable.unvrsdd_imgdefault));
        universidadPub.add(new Publicacion("Titulo11","Autor11","Hace 2 horas","100",R.drawable.unvrsdd_imgdefault));
        universidadPub.add(new Publicacion("Titulo12","Autor12","Hace 2 horas","100",R.drawable.unvrsdd_imgdefault));

        Publicacion_Adapter adapter = new Publicacion_Adapter(getActivity(),universidadPub,R.color.category_universidad);

        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {

                Publicacion publicacion = universidadPub.get(position);

                Intent intent = new Intent(getActivity(),PublicacionFull.class);
                intent.putExtra("DataPublicacion",publicacion);
                startActivity(intent);
            }
        });

        return rootView;
    }

}
