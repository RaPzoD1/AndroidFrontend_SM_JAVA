package com.informacion.rapzodapp.asuguacapp;

import java.io.Serializable;

public class Publicacion implements Serializable{

    //titulo de la publicacion
    private  String mTitlePublication;
    //autor de la publicacion
    private  String mAutorPublication;
    //Tiempo de la publicacion
    private  String mTimePublication;
    //cantidad de favoritos
    private  String mFavoritePublication;
    //Publicacion contenido
    private String mContenidoPublicacion;
    //imagen dela publicacion
    private  int mImageResourceID = NO_IMAGE_PROVIDED;
    private static final int NO_IMAGE_PROVIDED=-1;

    public Publicacion(String TitlePublication, String AutorPublication, String TimePublication, String FavoritePublication){

        mTitlePublication=TitlePublication;
        mAutorPublication=AutorPublication;
        mTimePublication=TimePublication;
        mFavoritePublication=FavoritePublication;
    }
    public Publicacion(String TitlePublication, String AutorPublication, String TimePublication, String FavoritePublication, String ContenidoPublicacion){

        mTitlePublication=TitlePublication;
        mAutorPublication=AutorPublication;
        mTimePublication=TimePublication;
        mFavoritePublication=FavoritePublication;
        mContenidoPublicacion=ContenidoPublicacion;
    }
    public Publicacion(String TitlePublication, String AutorPublication, String TimePublication, String FavoritePublication, int ImageResource){

        mTitlePublication=TitlePublication;
        mAutorPublication=AutorPublication;
        mTimePublication=TimePublication;
        mFavoritePublication=FavoritePublication;
        mImageResourceID=ImageResource;
    }
    public Publicacion(String TitlePublication, String AutorPublication, String TimePublication, String FavoritePublication, int ImageResource, String ContenidoPublicacion){

        mTitlePublication=TitlePublication;
        mAutorPublication=AutorPublication;
        mTimePublication=TimePublication;
        mFavoritePublication=FavoritePublication;
        mImageResourceID=ImageResource;
        mContenidoPublicacion=ContenidoPublicacion;
    }
    public Publicacion(String TitlePublication, int ImageResource,String TimePublication){
        mTitlePublication=TitlePublication;
        mImageResourceID=ImageResource;
        mTitlePublication=TimePublication;

    }

    //opbtiene el titulo de la publicacion
    public String getTitlePublication() {
        return mTitlePublication;
    }
    //Obtiene el autor de la publicacion

    public String getAutorPublication() {
        return mAutorPublication;
    }
    //Obtiene el tiempo de la publicacion
    public String getTimePublication() {
        return mTimePublication;
    }
    //optiene la cantidad de favoritos de la publicacion

    public String getFavoritePublication() {
        return mFavoritePublication;
    }
    //obtiene la imagen de la publicacion
    public int getmImageViewId(){

        return mImageResourceID;
    }
    //verifica si la publicacion tiene imagen
    public boolean hasImage(){

        return mImageResourceID != NO_IMAGE_PROVIDED;
    }

    //optiene el cuerpo de la pblicaciacion

    public String getContenidoPublicacion() {
        return mContenidoPublicacion;
    }
}
