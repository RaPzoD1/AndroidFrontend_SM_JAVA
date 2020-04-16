package com.informacion.rapzodapp.asuguacapp;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class Promociones_Fragment extends Fragment {


    public Promociones_Fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.main_list,container,false);

        //publicacions de promociones
        final ArrayList<Publicacion> promocionesPub = new ArrayList<Publicacion>();

        promocionesPub.add(new Publicacion("Paga S/ 28.90 por 02 Entradas 2D + Combo y ¡Olvídate de la Cola por las Entradas!","ADMINISTRADOR","Publicado: 02-10-2018","Favorito de: 100 Usuarios",R.drawable.cineplanetpromo1,"¡Porque tú lo pediste! ¡Cineplanet Online!\n" +
                "\n" +
                "Vive el romance, drama, acción y humor de las mejores películas cualquier día de la semana. Escoge la sala que más te guste y disfruta de una experiencia única.\n" +
                "\n" +
                "Incluye\n" +
                "02 Entradas general 2D\n" +
                "Combo\n" +
                "1 pop corn gigante recargable  \n" +
                "02 gaseosas chicas\n"));
        promocionesPub.add(new Publicacion("Paga S/ 25.00 soles por entrada para ¡OKTOBERFEST! no te pierdas el mejor evento cervecero del Año.","ADMINISTRADOR","Publicado el: 02-10-2018","Favorito de: 100 Usuarios",R.drawable.oktoberfestcusquenia,"OKTOBERFEST PERÚ\n" +
                "La fiesta tradicional Alemana más conocida del planeta también se celebra en Lima.\n" +
                "\n" +
                "No te pierdas nuestra pre venta con muy buenos descuentos para disfrutar de la mejor manera el OKTOBERFEST PERÚ, últimos días!\n" +
                "\n" +
                "INCLUYE\n" +
                "1 entrada al OKTOBERFEST PERÚ.\n" +
                "Opción 1: S/ 25 por entrada general para jueves 25 de octubre de 19:00 hrs a 03:00 hrs del día 26 (solo mayores de 18 años) \n" +
                "Opción 2: S/ 30 por entrada general para viernes 26 de octubre de 19:00 hrs a 02:00 hrs del día 27 (solo mayores de 18 años) \n" +
                "Opción 3: S/ 35 por entrada general para sábado 27 de octubre de 14:00 hrs a 02:00 hrs del día 28 (solo mayores de 18 años) \n" +
                "Opción 4: S/ 25 por entrada general para domingo 28 de octubre de 12:00 hrs a 22:00 hrs. (para todas las edades, menores de 13 años no pagan) \n" +
                "Opción 5: S/ 35 por entrada general para miércoles 31 de octubre de 19:00 hrs a 03:00 hrs del día 01/11 (solo mayores de 18 años\n)"));
        promocionesPub.add(new Publicacion("Paga desde S/ 129.00 en vez de S/ 250.00 por Zip Line en el Valle Sagrado - Perú Leisure Travel","ADMINISTRADOR","Publicado: 02-10-2018","Favorito de: 100 Usuarios",R.drawable.valleviaje1,"ZIP LINE EN VALLE SAGRADO\n" +
                "Vive la adrenalina con esta aventura en los andes, 4 cables con inmensa riqueza visual y full aventura te esperan.\n" +
                "\n" +
                "A 40 minutos de la ciudad de Cusco esta la base, donde encontrara los cables completamente segura y con guías especializados en alta montaña los esperan para deslizarse por más de 800 metros de largo.\n" +
                "\n" +
                "INCLUYE\n" +
                "Transporte de ida y retorno\n" +
                "Equipo completo para uso de cables\n" +
                "Guías especializados en alta montaña y uso de equipos\n" +
                "Asistencia integral de viaje\n"));
        promocionesPub.add(new Publicacion("Paga S/ 49.80 en vez de S/ 80.00 por 8 Clases de Karate para Niños en Activa Club ¡Elige el horario de Acuerdo a la Edad de tus Pequeñ@s!","ADMINISTRADOR","Publicado el: 02-10-2018","Favorito de: 100 Usuarios",R.drawable.activaclibkarate,"Si necesitas encontrar talleres de verano o para todo el año para desarrollar las mejores habilidades de tus pequeño. Activa Club es la mejor solución de Lima Norte con sus talleres en la Escuela de Alto Rendimiento en sus diferentes disciplinas.\n" +
                "Incluye\n" +
                "Con Activa Club podrás inscribir a tus peques según la edad que tengan y desarrollar la motilidad, seguridad y otras aptitudes que necesita para su crecimiento.\n" +
                "\n" +
                "Con estos talleres de karate podrán obtener 8 clases durante 1 mes.\n" +
                "\n" +
                "Tienes 3 opciones a elegir según sus edades:\n" +
                "\n" +
                "Opción 1: Karate para peques de 4 – 7 años los días: Martes y Jueves Horario: 5:00 p.m. a 6:00 p.m.\n" +
                "Opción 2: Karate para peques de 8 – 12 años los días: Martes y Jueves Horario: 6:00 p.m. a 7:00 p.m.\n" +
                "Opción 3: Karate para peques de 13 – 17 años los días: Martes y Jueves Horario: 7:00 p.m. a 8:00 p.m.\n" +
                "La Escuela de Alto Rendimiento incluye :\n" +
                "\n" +
                "Yoga, functional, psicología, nutrición, actividades de integración, participación de torneos y campeonatos."));
        promocionesPub.add(new Publicacion("Paga desde S/ 39.00 por 06 Meses de Curson Online de Inglés - 10 Minutos diarios - ICURSEA","ADMINISTRADOR","Publicado: 02-10-2018","Favorito de: 100 Usuarios",R.drawable.inglesclases1,"¿Dispones de 10 minutos al día para aprender inglés?\n" +
                "\n" +
                "Si tu respuesta es sí, enhorabuena, este curso está especialmente diseñado para ti. Podrás aprender inglés a tu ritmo con lecciones cortas adaptadas a tu nivel e intereses para que progreses en tu aprendizaje de forma constante, fácil y divertida.\n" +
                "\n" +
                "\n" +
                "¿QUÉ INCLUYE ESTE CURSO?:\n" +
                "\n" +
                "+60 horas de vídeos interactivos bajo demanda. \n" +
                "+150 entregas de materiales descargables. \n" +
                "Acceso 100% online 24x7 multiplataforma. \n" +
                "Tutor personalizado para la resolución de dudas. \n" +
                "Certificado acreditativo al finalizar el curso. \n" +
                "\n" +
                "¿QUÉ APRENDERÉ?:\n" +
                "\n" +
                "Expresiones y conversaciones reales y cotidianas. \n" +
                "Serás capaz de entender mejor conversaciones reales con nativos ingleses. \n" +
                "Aprenderás la gramática inglesa más importante. \n" +
                "Dominaras todo el vocabulario usado frecuentemente en inglés. \n" +
                "Formarás cientos de frases y preguntas de uso diario en inglés. \n" +
                "Desarrollarás un fantástico acento y pronunciación en inglés. \n" +
                "Técnicas que te ayudarán a practicar y fortalecer tus conocimientos. \n" +
                "Y mucho más… \n" +
                "\n" +
                "DESCRIPCIÓN DEL CURSO:\n" +
                "\n" +
                "Con él aprenderás de una forma lúdica y entretenida mediante el visionado de vídeos de distintas temáticas. Irás ampliando tu vocabulario a la vez que mejoras tu pronunciación.\n" +
                "\n" +
                "Valora, puntúa y corrige tu pronunciación para que sepas, en todo momento, cuál es tu nivel de speaking. Así lograrás hablar de forma fluida al perfeccionar cada palabra que ves, hablas y estudias.\n" +
                "\n" +
                "Registra tu progreso de forma continuada y compite con otros alumnos que estén haciendo el mismo curso que tú.\n" +
                "\n" +
                "Recursos para trabajar la parte ACTIVA del lenguaje:\n" +
                "\n" +
                "Visualización ilimitada de vídeos: practica el listening y el speaking. Aprende vocabulario y gramática de forma natural: con conversaciones reales, aprenderás de una forma fácil y amena siendo alumno de personajes famosos. \n" +
                "Subtítulos: si lo necesitas, activa la transcripción al inglés o la traducción al español. \n" +
                "Diccionario Interactivo: pincha sobre las palabras que no conozcas y obtén su significado, transcripción fonética, etc. \n" +
                "Crea tu vocabulario personal y aprende infinidad de palabras nuevas contextualizadas con ejercicios diferentes. \n" +
                "Acceso completo a nuestra videoteca interactiva con más de 9.000 vídeos que crece cada semana. \n" +
                "Regalo: Sistema de evaluación de la pronunciación en 2 vídeos al mes \n" +
                "Recursos para trabajar la parte PASIVA del lenguaje\n" +
                "\n" +
                "Recibe entregas semanales de teoría de gramática. \n" +
                "Ejercicios con sus soluciones para que trabajes lo aprendido. \n" +
                "Exámenes tipo y trucos para ayudarte a prepararlo. \n" +
                "Otros recursos interesantes: lecturas recomendadas, curiosidades, juegos, test, etc. \n" +
                "BONO REGALO (incluido con la compra de este curso): Descuento especial de hasta el 50% sobre las tarifas de iCursea Premium (¡habla vídeos ilimitados, practica con test y ejercicios interactivos, y recibe informes semanales de tu progreso totalmente personalizados!).\n" +
                "\n" +
                "\n" +
                "TEMARIO DEL CURSO:\n" +
                "\n" +
                "1. Material Audiovisual:\n" +
                "\n" +
                "El material audiovisual está conformado por vídeos y herramientas interactivas con las que trabajarás situaciones de la vida real.\n" +
                "\n" +
                "2. Gramática:\n" +
                "\n" +
                "El material escrito de gramática se conforma de una parte de teoría y otra de ejercicios propuestos. Con todas las entregas se facilita un documento con las soluciones de los ejercicios para que puedas revisar y contrastar tus respuestas.\n" +
                "\n" +
                "3. Fonética:\n" +
                "\n" +
                "El material escrito de fonética cuenta a su vez con una parte de teoría y otra de ejercicios para poner en práctica lo aprendido. En todas las lecciones se facilita un documento con las soluciones de los ejercicios para que puedas comparar tus respuestas.\n" +
                "\n" +
                "Consulta el temario completo del curso Aprende inglés con 10 minutos al día.\n" +
                "\n" +
                "\n" +
                "¿A QUIÉN VA DIRIGIDO?\n" +
                "\n" +
                "Personas con poco tiempo que necesitan aprender inglés a su ritmo. \n" +
                "Aquellas personas dispuestas a dar pequeños pasos hacia adelante cada día. \n" +
                "Personas que quieran aprender a expresarse en inglés con fluidez. \n" +
                "Personas que hayan tratado de aprender inglés mediante otros métodos sin éxito. \n"));
        promocionesPub.add(new Publicacion("Paga S/ 69.90 en vez de S/ 350.00 por Limpieza Dental Profunda: Destartraje con Ultrasonido + Raspado y Alisado Radicula","ADMINISTRADOR","Publicado: 02-10-2018","Favorito de: 100 Usuarios",R.drawable.dentalyong,"Incluye\n" +
                "Limpieza con ultrasonido \n" +
                "Raspaje radicular \n" +
                "Alisado radicular \n" +
                "Profilaxis \n" +
                "Fluorización \n" +
                "Desinfección gingival \n" +
                "Fisioterapia oral \n" +
                "Descarte de maloclusión \n" +
                "Odontograma \n" +
                "Características\n" +
                "Odontograma: es un esquema utilizado por los odontólogos que permite registrar información sobre la boca de una persona. \n" +
                "Limpieza con ultrasonido: Procedimiento mediante el cual se logra retirar la placa dura de los dientes  \n" +
                "Profilaxis: Procedimiento mediante el cual se logra eliminar la placa blanda y las machas superficiales que están sobre los dientes  \n" +
                "Fluorización: gel que fortalece los dientes y protege de futuras bacterias  \n" +
                "Desinfección gingival: enjuague bucal medicado que se utiliza para contrarrestar la carga bacteriana  \n" +
                "Fisioterapia oral: charla en la cual se le indica al paciente la técnica de cepillado ideal para que pueda mantener su salud bucal en óptimas condiciones"));

        promocionesPub.add(new Publicacion("Paga desde S/ 139.00 en vez de S/ 250.00 por Canotaje en Río Vilcanota Cuzco - Perú Leisure Travel","ADMINISTRADOR","Publicado el: 02-10-2018","Favorito: 100 Usuarios",R.drawable.canotajevilcanota1,"CANOTAJE EN RIO VILCANOTA\n" +
                "El río Vilcanota es uno de los principales ríos en Cuzco, su sección más recomendada para hacer rafting, Chuquicahuana, queda a solo 90 minutos de la ciudad.\n" +
                "\n" +
                "Para esta aventura, la salida de Cuzco es las 9am. Viajaremos por aproximadamente media hora hasta Oropesa, un pequeño pueblo andino famoso por su espectacular pan casero, ahí compraremos algunos panes frescos para el almuerzo. Una hora después llegaremos a Chuquicahuana, el punto de partida para esta aventura.\n" +
                "\n" +
                "Nos esperan más de 2 horas de aventura en el rio Vilcanota así como un reconfortante almuerzo a la salida del río. El paisaje rodeado de preciosos paisajes, nos ofrece disfrutar de divertidos rápidos que van de clase III, III+ y IV.\n" +
                "\n" +
                "Por la tarde, le ofrecemos incrementar los niveles de adrenalina con la tirolesa, 100 y 80 metros de cables que cruzan de montaña a montaña complementan perfectamente nuestro día.\n" +
                "\n" +
                "INCLUYE\n" +
                "Guía oficial bilingüe (Inglés – Español)\n" +
                "Transporte turístico\n" +
                "Kayac de seguridad\n" +
                "Equipo completo (casco, chaleco salva vidas, remos, botes)\n" +
                "Recojo en hotel o punto de reunión\n" +
                "Asistencia integral de viaje\n" +
                "Almuerzo en campamento\n" +
                "RECOMENDACIONES\n" +
                "Ropa ligera y sandalias.\n" +
                "Poncho en temporada de lluvias.\n" +
                "Ropa de baño\n" +
                "1 muda de ropa\n" +
                "Toalla\n" +
                "Bloqueador solar\n" +
                "Equipo de cámaras adecuado resistente al agua.\n" +
                "Informar de tallas al personal de reservas\n"));


        Publicacion_Adapter adapter = new Publicacion_Adapter(getActivity(),promocionesPub,R.color.whitedefault);

        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {

                Publicacion publicacion = promocionesPub.get(position);

                Intent intent = new Intent(getActivity(),PublicacionFull.class);
                intent.putExtra("DataPublicacion",publicacion);
                startActivity(intent);
            }
        });


        return rootView;
    }

}
