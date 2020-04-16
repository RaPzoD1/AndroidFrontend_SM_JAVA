package com.informacion.rapzodapp.asuguacapp;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.SearchView;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class BolsaLab_Fragment extends Fragment {

    Publicacion_Adapter adapter;
    public BolsaLab_Fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.main_list,container,false);

        //publicacions de promociones
        final ArrayList<Publicacion> bolsalabPub = new ArrayList<Publicacion>();

        bolsalabPub.add(new Publicacion("TÉCNICO ADMINISTRATIVO\n","Universidad Andina del Cusco","Publicado: 02-10-2018","Favorito de: 100 Usuarios",R.drawable.logo_institucion2,"Descripción: La Universidad Andina del Cusco realiza la siguiente convocatoria para el cargo de: \n" +
                "TÉCNICO ADMINISTRATIVO (01 plaza) CPCPI\n" +
                "REQUISITOS:\n" +
                "-Técnico en Administración o afines.\n" +
                "-Certificación en Ofimática.\n" +
                "-Experiencia mínima de tres (03) años en el desarrollo de la actividad (apoyo en matrículas de estudiantes, registros, archivos de documentos).\n" +
                "-Experiencia en la orientación de trámites académicos y administrativos.\n" +
                "REQUISITOS GENERALES:\n" +
                "- Curriculum Vitae documentado.\n" +
                "- Declaración Jurada de no tener antecedentes: Penales o PDR, Judiciales, ni sanción por falta administrativa disciplinaria.\n" +
                "- Certificados de salud (psicológico y médico)\n" +
                "Disponibilidad inmediata.\n" +
                "Link del cronograma.\n"));
        bolsalabPub.add(new Publicacion("CONCURSO PÚBLICO A DOCENCIA ORDINARIA – UAC\n","ESCRITO POR UAC","Publicado: 01/10/2018","Favorito de: 100 Usuarios",R.drawable.uac,"REQUISITOS:\n" +
                "Título profesional correspondiente a la plaza que postula.\n" +
                "Grado de Magister o en el caso de Medicina Humana, Especialidad obtenida en residentado médico dado por una universidad (de tres años o más).\n" +
                "Cinco (5) años de labor profesional contados a partir del título profesional universitario.\n" +
                "Otros requisitos que establezca el reglamento."));
        bolsalabPub.add(new Publicacion("ESPECIALISTA MARKETING DE SERVICIOS – UAC\n","ESCRITO POR UAC","Publicado: 25-09-2018","Favorito de: 100 Usuarios",R.drawable.uac,"REQUISITOS:\n" +
                "Título Profesional de Licenciado en Marketing o profesiones afines.\n" +
                "Cursos de especialización, capacitaciones y otros en marketing de servicios.\n" +
                "Experiencia de tres (03) años en el desarrollo de planes de marketing, estudios de mercado\n" +
                "REQUISITOS GENERALES\n" +
                "Curriculum Vitae Documentado.\n" +
                "Declaración Jurada de no tener antecedentes: Penales o PDR, Judiciales, ni sanción por falta administrativa disciplinaria.\n" +
                "Horario de Trabajo: Lunes a Viernes.\n" +
                "Disponibilidad inmediata.\n"));
        bolsalabPub.add(new Publicacion("ASISTENTE ADMINISTRATIVO\n","ESCRITO POR UAC","Publicado: 21/09/2018","Favorito de: 100 Usuarios",R.drawable.uac,"REQUISITOS:\n" +
                "Egresado o Bachiller de las carrera de Ingeniería Industrial.\n" +
                "Manejo de Microsoft Office avanzado.\n" +
                "Experiencia mínima de 6 meses en la posición o puestos similares.\n" +
                "Disponibilidad para laborar en régimen atipo de 10 días de trabajo*20 días de descanso.\n" +
                "Disponibilidad para laborar en la provincia de Cusco (Kiteni)\n" +
                "FUNCIONES:\n" +
                "Elaborar reportes diarios, semanales y mensuales de las Operaciones Aéreas y demás actividades conexas que se realicen dentro de la locación.\n" +
                "Elaboración y control de indicadores de todos los procesos.\n" +
                "Elaboración de manuales y procesos bajo los lineamientos establecidos en las normas ISO 9001, ISO 14001 y OHSAS 18001.\n" +
                "SE OFRECE:\n" +
                "Beneficios de ley\n" +
                "Viáticos (hospedaje + alimentación)\n" +
                "Línea de carrera\n" +
                "Sueldo S/1200\n" +
                "Lugar de trabajo: Cusco-Kiteni"));
        bolsalabPub.add(new Publicacion("JEFE DE MANTENIMIENTO para empresa RETAIL INTERNACIONAL\n","ADMINISTRADOR","Publicado: 21/09/2018","Favorito de: 100 Usuarios",R.drawable.perutalento,"Requisitos:\n" +
                "·         Graduado de la carrera de Ingeniería Industrial, Mecánica, Electromecánica, Electrónica o afines.\n" +
                "·         Experiencia mínima de 5 años en posiciones de Jefe o Gerente de Mantenimiento, preferentemente en empresas de retail internacional.\n" +
                "·         Elaboración y administración de presupuesto anual.\n" +
                "·         Indispensable Excel a nivel avanzado.\n" +
                "-Indispensable Inglés a nivel intermedio.\n" +
                "Funciones:\n" +
                "-Desarrollar y hacer cumplir las tareas de Mantenimiento Preventivo y Correctivo logrando alta satisfacción del cliente interno.\n" +
                "·         Controlar gastos dentro de las proyecciones y presupuestos aprobados.\n" +
                "·         Participar en implementación de nuevas aperturas y nuevos equipos.\n" +
                "-Elaborar, administrar y controlar el presupuesto asignado.\n" +
                "-Desarrollar y capacitar de forma planificada su equipo.\n" +
                "-Asegurar y contar con la estructura adecuada.\n" +
                "- Proponer cambios en estructuras actuales.\n" +
                "·         Buscar oportunidades de ahorros en todas las líneas.\n" +
                "·         Gestionar las tareas necesarias de mantenimiento de la oficina y de flota de vehículos.\n" +
                "·         Velar por el adecuado funcionamiento de las máquinas en provincia.\n" +
                "Competencias requeridas:\n" +
                "·         Gestión y capacidad de análisis\n" +
                "·         Criterio en la toma de decisiones a corto y largo plazo\n" +
                "·         Alta planificación y organización\n" +
                "·         Negociación\n" +
                "·         Liderazgo\n" +
                "·         Comunicación a todo nivel\n" +
                "\n" +
                "Se ofrece:\n" +
                "\n" +
                "·         Pertenecer a una cadena internacional de retail\n" +
                "·         Salario acorde al mercado\n" +
                "·         EPS\n" +
                "·         Seguro de vida ley\n" +
                "·         Capacitaciones\n" +
                "·         Beneficios corporativos\n" +
                "Horario:\n" +
                "·         Lunes a Viernes: 9am a 6pm\n" +
                "El contenido de este aviso es de propiedad del anunciante. Los requisitos de la posición son definidos y administrados por el anunciante sin que Bumeran sea responsable por ello."));
        bolsalabPub.add(new Publicacion("Teleoperadores ATENCIÓN AL CLIENTE Con o Sin Experiencia / Planilla y Beneficios\n","ADMINISTRADOR","Publicado: 16/09/2018","Favorito de: 100 Usuarios",R.drawable.comdatagroup,"¡¡CONVOCATORIA!! MARTES 02/10 a las 10AM (en punto) ó a las 02PM (en punto)."+"\n" +" PREGUNTAR POR DANIELA LAGOS\n" +
                "\n" +
                "Requerimos: Teleoperadores para atención al cliente y ventas para telefonía móvil y fija.\n" +
                "Disponibilidad para laborar en los siguientes horarios: 12PM A 9PM / 1PM A 10PM / 2PM - 11PM\n" +
                "Requisitos:\n" +
                "\n" +
                "- De 18 años a más\n" +
                "- Experiencia en atención al cliente o ventas presencial o en call center, mínimo 3 meses.\n" +
                "- Excelente nivel de comunicación.\n" +
                "- Disponibilidad para laborar en SURCO - Primavera (Vivir en zonas aledañas)\n" +
                "Ofrecemos:\n" +
                "\n" +
                "- FULL TIME: Básico (s/930) + Bono de desempeño + Comisiones + Asignación Familiar (si aplica)\n" +
                "- Planilla con todos los Beneficios de Ley desde la firma de contrato.\n" +
                "- Oportunidades de crecimiento profesional a corto plazo\n" +
                "- Convenios educativos y corporativos.\n" +
                "Si te encuentras interesado acércate a entrevista este MARTES 02/10 a las 10AM (en punto) ó a las 02PM (en punto) en Av. Primavera 2142 - Surco. Referencia: Altura puente Primavera. Paradero Óvalo Los Álamos, al costado de la Editorial Santillana y a 2 cuadras de la UPC de Monterrico.\n" +
                "PREGUNTAR POR: DANIELA LAGOS (Traer CV actualizado y DNI en físico y copia)\n" +
                "Comdata Group es un promotor activo de la inserción laboral con habilidades diferentes.\n" +
                "\n" +
                "El contenido de este aviso es de propiedad del anunciante. Los requisitos de la posición son definidos y administrados por el anunciante sin que Bumeran sea responsable por ello."));
        bolsalabPub.add(new Publicacion("Supervisor de Operaciones (Restaurantes / Fast Food)\n","ADMINISTRADOR","Publicado: 10/09/2018","Favorito de: 100 Usuarios",R.drawable.ngr,"NGR, holding gastronómico del grupo Intercorp, se encuentra en la búsqueda de (02) Supervisores de Operaciones, para que se integre al equipo de colaboradores de la unidad de negocio Popeyes o Dunkin Donut’s.\n" +
                "\n" +
                "Requisitos:\n" +
                "Formación: Egresados de las carreras universitarias de Administración de Empresas, Administración de Hoteles y Restaurantes, Ingeniería Industrial o afines.\n" +
                "Experiencia: 2 – 3 años en el cargo o posiciones afines en el rubro de Fast Food o Restaurantes.\n" +
                "Conocimientos adicionales: Manejo de Office a nivel intermedio, manejo de EE.FF, gestión operativa,  BPM, Bioseguridad, cadenas de frío, HACCP y flujos operativos.\n" +
                "Competencias: Liderazgo, Comunicación, Capacidad de Análisis, Organización y Planificación, Visión de Negocio, Gestión de Personas, Desarrollo de Equipos y Compromiso con el Cliente.\n" +
                "Disponibilidad para trabajar en campo.\n" +
                "Funciones principales:\n" +
                "Responsable de dirigir, guiar y liderar las operaciones de las tiendas en una zona asignada.\n" +
                "Análisis de reportes financieros para identificar y responder a los problemas relacionados con el desempeño de su zona y el control de cada uno de los indicadores acorde a los presupuestos asignados.\n" +
                "Presentación a la Jefatura de Operaciones y Gerencia de Unidad de los reportes de indicadores de venta, costos y rotación de su zona.\n" +
                "Desarrollo de planes estratégicos y operativos para la obtención de resultados.\n" +
                "Desarrollo de planes para motivar e incentivar la línea de carrera en su área.\n" +
                "Gestión del servicio óptimo hacia los clientes y el cumplimiento de los estándares de la unidad asignada.\n" +
                "Proteger la marca asegurándose que los colaboradores conozcan y practiquen el significado de seguridad alimentaria y cada uno de los estándares de higiene, seguridad y procesos en tienda.    \n" +
                "Se ofrece:\n" +
                "Grato ambiente de trabajo.\n" +
                "Convenios de capacitación.\n" +
                "Descuentos corporativos del Grupo Intercorp.     \n" +
                "*NGR es una empresa incluyente, que respeta la diversidad y no hace ningún tipo de discriminación*    \n" +
                "\n" +
                "El contenido de este aviso es de propiedad del anunciante. Los requisitos de la posición son definidos y administrados por el anunciante sin que Bumeran sea responsable por ello."));
        bolsalabPub.add(new Publicacion("Analista Sr. de Comunicaciones Internas Nestlé Perú S.A\n","ADMINISTRADOR","Publicado: 07/09/2018","Favorito de: 100 Usuarios",R.drawable.nestle,"Nestlé Perú, la empresa líder en Nutrición, Salud y Bienestar, se encuentra en la búsqueda de talentos como tú para la posición de:\n" +
                "\n" +
                "Analista Sr. de Comunicaciones Internas \n" +
                "\n" +
                "Tendrá como objetivo principal: \n" +
                "\n" +
                "Garantizar la efectividad de la comunicación interna, como apoyo para la consolidación de los resultados del Negocio, soporte en la construcción de cultura y promoción de un buen clima organizacional, mediante el uso de canales de comunicación adecuados.\n" +
                "\n" +
                "Reporta a: Internal Communications & Welfare Manager\n" +
                "\n" +
                "Funciones:\n" +
                "\n" +
                "Asegurar la medición del clima organizacional de acuerdo al modelo definido por la organización.\n" +
                "Implementar y garantizar la satisfacción de los eventos internos.\n" +
                "Brindar servicio a las áreas y/o negocios diseñando estrategias de comunicación interna de acuerdo a sus necesidades (ejm. para gestión de cambio, difusión de productos o procesos, dar a conocer proyectos o iniciativas, etc.)\n" +
                "Soportar y ejecutar la elaboración e implementación del plan anual de comunicación interna.\n" +
                "Implementar, programar y mantener actualizados los medios y canales de comunicación interna de acuerdo al plan de comunicación anual.\n" +
                "Elaborar contenidos y mensajes efectivos para los canales de comunicación de la organización.\n" +
                "Apoyar la implementación de las Campañas de Comunicación Interna con foco en Cultura Corporativa: Principios Corporativos, Principios de Gestión y Liderazgo, modelo Único de Operaciones NCE.\n" +
                " \n" +
                "Requisitos:\n" +
                "\n" +
                "Bachilleres de las carreras de Comunicaciones, Publicidad, Markting, Administración o Ciencias Sociales.\n" +
                "Experiencia mínima de 2 años en funciones similares.\n" +
                "Manejo de M. Office a nivel intermedio.\n" +
                "Manejo de Inglés a nivel avanzado.\n" +
                "Manejo de Illustratror y Photoshop a nivel intermedio\n" +
                "Conocimiento básico en editor de videos.\n" +
                "Ofrecemos un entorno de trabajo internacional atractivo y dinámico con oportunidades constantes de desarrollo, lo que refleja nuestra convicción de que las personas son nuestro activo más importante.\n" +
                "“En Nestlé respetamos y valoramos la diversidad como uno de los pilares más importantes para nuestra organización, por ello, apuntamos a seguir construyendo un ambiente laboral inclusivo que brinde las mismas oportunidades para todas las personas, sin excepción alguna”\n" +
                 "El contenido de este aviso es de propiedad del anunciante. Los requisitos de la posición son definidos y administrados por el anunciante sin que Bumeran sea responsable por ello"));


        Publicacion_Adapter adapter = new Publicacion_Adapter(getActivity(),bolsalabPub,R.color.whitedefault);

        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {

                Publicacion publicacion = bolsalabPub.get(position);

                Intent intent = new Intent(getActivity(),PublicacionFull.class);
                intent.putExtra("DataPublicacion",publicacion);
                startActivity(intent);
            }
        });

        return rootView;
    }


}
