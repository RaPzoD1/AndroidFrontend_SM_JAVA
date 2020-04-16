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
public class Actividades_Fragment extends Fragment {


    public Actividades_Fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.main_list,container,false);

        //publicacions de promociones
        final ArrayList<Publicacion> activiadesPub = new ArrayList<Publicacion>();

        activiadesPub.add(new Publicacion("VIII FERIA DE CIENCIA Y TECNOLOGÍA – EXPOANDINA 2018","ADMINISTRADOR","Publicado: 20-09-2018","Favorito de: 100 Usuarios",R.drawable.va_expoandina2018,"La Universidad Andina del Cusco a través del Vicerrectorado de Investigación, en cumplimiento de las normas que fundamentan la Investigación y con el objetivo de promover y difundir la investigación aplicada para resolver los problemas inherentes a nuestra sociedad, incentivar y desarrollar el potencial de semilleros en la investigación, aportar nuevas tecnologías tendientes a mejorar procesos de producción; organiza la VIII FERIA DE CIENCIA Y TECNOLOGÍA DE LA UNIVERSIDAD ANDINA DEL CUSCO, “EXPO ANDINA 2018”, convocando a la participación de docentes, jóvenes investigadores (egresados) y estudiantes de la Universidad Andina del Cusco.\n" +
                "- Descargar BASES\n" +
                "- Descargar Anexo 1: FORMULARIO DE DATOS GENERALES DEL PARTICIPANTE\n" +
                "- Descargar Anexo 2: FORMULARIO DE INSCRIPCIÓN DE TRABAJO\n" +
                "- Descargar Anexo 3: DECLARACIÓN JURADA DE NO PLAGIO\n"));
        activiadesPub.add(new Publicacion("CONCURSO DE TESIS DE PREGRADO Y POSGRADO","ADMINISTRADOR","Publicado: 20-09-2018","Favorito de: 100 Usuarios",R.drawable.vrin_concurso_tesis_2018ii,"La Universidad Andina del Cusco a través del Vicerrectorado de Investigación y la Dirección de Gestión de la Investigación y de la Producción Intelectual, la cual es responsable de promover la investigación a todo nivel en nuestra institución y en cumplimiento de las normas de investigación, considera que una de las modalidades principales de desarrollar la investigación la constituye la formulación de tesis de los alumnos de pregrado y posgrado para su titulación profesional, lo que permite acrecentar el desarrollo académico de nuestra casa superior de estudios.\n" +
                "Mediante la presente convocatoria al “CONCURSO DE PREMIACIÓN DE TRABAJOS DE TESIS DE PREGRADO Y POSGRADO DE LA UNIVERSIDAD ANDINA DEL CUSCO – 2018” se busca promover el proceso de investigación y consolidar los pilares fundamentales de la universidad tales como la investigación, dirigidos a proponer resolver los problemas de la sociedad.\n" +
                "DIRIGIDO A:\n" +
                "Investigadores de pregrado y posgrado de la UAC.\n"));
        activiadesPub.add(new Publicacion("SEGUIMIENTO AL GRADUADO","ADMINISTRADOR","Publicado: 20-09-2018","Favorito de: 100 Usuarios",R.drawable.seguimiento_graduados_2018,"OBJETIVOS\n" +
                "•\tA partir de la información recolectada, podremos identificar áreas de mejoramiento en los procesos de formación y diseñar y/o reestructurar planes de estudio, con el objetivo de implementar el Plan de Mejoras de la Institución.\n" +
                "•\tVincular al Graduado con la Universidad e incrementar el nivel de participación de los graduados en las comunidades académicas\n" +
                "BENEFICIOS:\n" +
                "•\tEl llenado de la Encuesta de Seguimiento a Graduados es de gran valor para analizar los avances en la calidad de la educación, la pertinencia del trabajo de las Escuelas Profesionales y la equidad social, además de permitirnos identificar las necesidades y debilidades de las estructuras curriculares.\n" +
                "•\tCon el análisis de los resultados, deseamos atender las necesidades de formación continua y posgradual que demanden nuestros Graduados, ofreciéndoles beneficios especiales.\n" +
                "•\tA través de la Bolsa de empleos y el trabajo coordinado con las Escuelas Profesionales, se apoyará a los Graduados en su proceso de consecución de empleo, facilitando la captación de hojas de vida y la divulgación de oportunidades laborales mediante la firma de convenios.\n"));
        activiadesPub.add(new Publicacion("SEMINARIO INTERNACIONAL DE INDIGENISMO A LA INTERCULTURALIDAD","ADMINISTRADOR","Publicado: 20-09-2018","Favorito de: 100 Usuarios",R.drawable.eminario_indigenismo,"Inscripciones en el siguiente link \n https://docs.google.com/forms/d/e/1FAIpQLSdfDyr106eTUAn_jr4TaNlhT9ZEI1OmbNUJIfKrqCcys4I67w/viewform"));
        activiadesPub.add(new Publicacion("CAMPAÑA DE DESCARTE 2018-II","ADMINISTRADOR","Publicado el: 20-09-2018","Favorito de: 100 Usuarios",R.drawable.campania_descarte_2018_ii));
        activiadesPub.add(new Publicacion("TALLERES UAC","ADMINISTRADOR","Publicado: 20-09-2018","Favorito de: 100 Usuarios",R.drawable.taller_bachata_salsa_2018_ii,"TALLERES ARTÍSTICOS Y CULTURALES – SEMESTRE ACADÉMICO 2018-II\n" +
                "REQUISITOS:\n" +
                "Los requisitos para la INSCRIPCIÓN a los TALLERES son de carácter obligatorio:\n" +
                "•\tFotocopia de DNI o de carné universitario.\n" +
                "•\tRecibo de pago por concepto de Seguro Estudiantil.\n" +
                "•\tFotocopia de la Ficha de matrícula o kárdex de pago.\n" +
                "Horarios en el siguiente link\n" +
                "https://www.uandina.edu.pe/index.php/talleres-uac/\n"));
        activiadesPub.add(new Publicacion("DISCIPLINAS DEPORTIVAS","ADMINISTRADOR","Publicado: 20-09-2018","Favorito de: 100 Usuarios",R.drawable.disciplinas_deportivas_2018_ii,"DISCIPLINAS DEPORTIVAS – SEMESTRE ACADÉMICO 2018-II\n" +
                "REQUISITOS\n" +
                "Los requisitos para la INSCRIPCIÓN a los TALLERES DEPORTIVOS son:\n" +
                "•\tFicha de matrícula semestre 2018-i\n" +
                "•\tFotocopia del recibo de pago por concepto de Seguro Estudiantil o kardex de pago.\n" +
                "•\tCuadernillo de firmas (extracurriculares).\n" +
                "Horarios en el siguiente link\n" +
                "https://www.uandina.edu.pe/index.php/disciplinas-deportivas-uac/\n"));






        Publicacion_Adapter adapter = new Publicacion_Adapter(getActivity(),activiadesPub,R.color.whitedefault);

        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {

                Publicacion publicacion = activiadesPub.get(position);

                Intent intent = new Intent(getActivity(),PublicacionFull.class);
                intent.putExtra("DataPublicacion",publicacion);
                startActivity(intent);
            }
        });


        return rootView;
    }

}
