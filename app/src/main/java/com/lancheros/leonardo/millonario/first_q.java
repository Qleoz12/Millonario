package com.lancheros.leonardo.millonario;

import android.content.DialogInterface;
import android.content.Intent;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.CountDownTimer;
import android.os.Handler;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class first_q extends AppCompatActivity {
    int contador=0;
    int puntos=0;
    int RespuestaH;
    int correcta=3;
    int correctaActual;
    RadioGroup opciones;
    TextView pregunta;
    TextView tiempo;
    TextView premio;

    //tiempo
    CountDownTimer MyCountDownTimer=null;
    //manejador de eventos
    View.OnClickListener handler = new View.OnClickListener()
    {


        public void onClick(final View v)
        {
            Button btns =(Button) findViewById(R.id.button2);

            //tags para las preguntas
            ArrayList<String> preguntas = new ArrayList<String>();
            preguntas.add("pregunta1");
            preguntas.add("pregunta2");
            preguntas.add("pregunta3");
            preguntas.add("pregunta4");
            preguntas.add("pregunta5");
            preguntas.add("pregunta6");
            preguntas.add("pregunta7");
            preguntas.add("pregunta8");
            preguntas.add("pregunta9");
            preguntas.add("pregunta10");
            preguntas.add("pregunta11");
            preguntas.add("pregunta12");
            preguntas.add("pregunta13");
            preguntas.add("pregunta14");
            preguntas.add("Final");
            //respuestas codes
            final ArrayList<Integer> Respuestas = new ArrayList<Integer>();
            Respuestas.add(3);//0
            Respuestas.add(2); //pregunta 1
            Respuestas.add(4); //pregunta 2
            Respuestas.add(1); //pregunta 3
            Respuestas.add(4); //pregunta 4
            Respuestas.add(3); //pregunta 5
            Respuestas.add(4); //pregunta 6
            Respuestas.add(4); //pregunta 7
            Respuestas.add(4); //pregunta 8
            Respuestas.add(2); //pregunta 9
            Respuestas.add(3); //pregunta 10
            Respuestas.add(3); //pregunta 11
            Respuestas.add(4); //pregunta 12
            Respuestas.add(4); //pregunta 13
            Respuestas.add(3); //pregunta 14





            //Toast.makeText(v.getContext(),"R-"+Respuestas.get(0),Toast.LENGTH_SHORT).show();
            if (contador<preguntas.size())
            {
                //Toast.makeText(v.getContext(),preguntas.get(contador),Toast.LENGTH_SHORT).show();
                //Toast.makeText(v.getContext(),""+preguntas.size(),Toast.LENGTH_SHORT).show();
                btns.setTag(preguntas.get(contador));
                tiempo();
                dishide_cincuenta_cincuent_event(v);
                if (contador<Respuestas.size()-1)
                {
                    correcta=Respuestas.get(contador);
                    correctaActual=Respuestas.get(contador+1);
                    System.out.println("correcta Anterior: "+correcta);
                    System.out.println("correcta Actual: "+Respuestas.get(contador+1));

                }
                else
                {
                    correcta=Respuestas.get(contador);
                    correctaActual=correcta;
                    System.out.println("correcta Actual: "+correcta);
                    System.out.println("correcta proxima: no hay");
                }


            }
            else
            {
                    System.out.println(contador);
            }

            contador++;

            System.out.println("contador Aumentado: "+contador);

            if (v.getTag()=="pregunta1")
            {
                if(validar_respuesta(v,Respuestas.get(0)))
                {
                    Button btn =(Button) v;
                    //btn.setText("primero");
                    ArrayList<String> opcionesa= new ArrayList<String>();
                    opcionesa.add("$_URL[] ");
                    opcionesa.add("$_GET[] ");
                    opcionesa.add("$_FORM[]");
                    opcionesa.add("Las anteriores respuestas no son correctas");
                    String preguntaa="En PHP, ¿cómo se obtiene la información de un formulario que ha sido enviado mediante el método \"get\"?";
                    cambiar_radioGroup(opciones.getId(),pregunta.getId(),opcionesa,preguntaa);
                }



            }
            if (v.getTag()=="pregunta2")
            {
                if(validar_respuesta(v,Respuestas.get(1)))
                {
                    Button btn =(Button) v;
                    //btn.setText("segundo");
                    ArrayList<String> opcionesa= new ArrayList<String>();
                    opcionesa.add(" connect_mysql(\"localhost\");");
                    opcionesa.add("dbopen(\"localhost\"); ");
                    opcionesa.add("mysql_open(\"localhost\");");
                    opcionesa.add(" mysql_connect(\"localhost\");");
                    String preguntaa="En PHP, ¿cuál es la forma correcta de abrir una conexión con una base de datos MySQL?";
                    cambiar_radioGroup(opciones.getId(),pregunta.getId(),opcionesa,preguntaa);
                }


            }
            if (v.getTag()=="pregunta3")
            {
                if(validar_respuesta(v,Respuestas.get(2)))
                {
                    Button btn =(Button) v;
                    ArrayList<String> opcionesa= new ArrayList<String>();
                    opcionesa.add("text-transform:capitalize");
                    opcionesa.add("text-transform:uppercase");
                    opcionesa.add("text-transform:first-letter");
                    opcionesa.add("No se puede hacer con CSS");
                    String preguntaa="¿Cómo se hace en CSS para que cada palabra en un texto comience con una letra en mayúsculas?";
                    cambiar_radioGroup(opciones.getId(),pregunta.getId(),opcionesa,preguntaa);
                    //btn.setText("tercxero");
                }

            }
            if (v.getTag()=="pregunta4")
            {
                if(validar_respuesta(v,Respuestas.get(3)))
                {
                    Button btn =(Button) v;
                    ArrayList<String> opcionesa= new ArrayList<String>();
                    opcionesa.add("lower() ");
                    opcionesa.add("lowerCase() ");
                    opcionesa.add("toLower()");
                    opcionesa.add("toLowerCase()");
                    String preguntaa="En JavaScript, ¿qué función se emplea para convertir una cadena a minúsculas?";
                    cambiar_radioGroup(opciones.getId(),pregunta.getId(),opcionesa,preguntaa);
                    //btn.setText("cuarto");
                }

            }
            if (v.getTag()=="pregunta5")
            {
                if(validar_respuesta(v,Respuestas.get(4)))
                {
                    Button btn =(Button) v;
                    ArrayList<String> opcionesa= new ArrayList<String>();
                    opcionesa.add(" document.open(\"pagina.html\") ");
                    opcionesa.add("document.new(\"pagina.html\")");
                    opcionesa.add("window.open(\"pagina.html\")");
                    opcionesa.add("window.new(\"pagina.html\") ");
                    String preguntaa="En JavaScript, ¿cómo se abre una ventana nueva del navegador?";
                    cambiar_radioGroup(opciones.getId(),pregunta.getId(),opcionesa,preguntaa);
                    //btn.setText("quinto");
                }

            }
            else if (v.getTag()=="pregunta6")
            {
                if(validar_respuesta(v,Respuestas.get(5)))
                {
                    Button btn =(Button) v;
                    ArrayList<String> opcionesa= new ArrayList<String>();
                    opcionesa.add("method ");
                    opcionesa.add("post");
                    opcionesa.add("target");
                    opcionesa.add("Las anteriores respuestas no son correctas ");
                    String preguntaa="En un formulario HTML, cuando se pulsa sobre un botón de tipo submit, los datos introducidos en el formulario se envían a la URL indicada en el atributo del formulario llamado";
                    cambiar_radioGroup(opciones.getId(),pregunta.getId(),opcionesa,preguntaa);
                    //btn.setText("sexto");
                }

            }
            if (v.getTag()=="pregunta7")
            {
                if(validar_respuesta(v,Respuestas.get(6)))
                {
                    Button btn =(Button) v;
                    ArrayList<String> opcionesa= new ArrayList<String>();
                    opcionesa.add("<-- El comentario --> ");
                    opcionesa.add("<--! El comentario !-->");
                    opcionesa.add("<--! El comentario -->");
                    opcionesa.add("<!-- El comentario --> ");
                    String preguntaa="En HTML, la forma correcta de crear un comentario es";
                    cambiar_radioGroup(opciones.getId(),pregunta.getId(),opcionesa,preguntaa);
                    //btn.setText("septimo");
                }

            }
            if (v.getTag()=="pregunta8")
            {
                if(validar_respuesta(v,Respuestas.get(7)))
                {
                    Button btn =(Button) v;
                    ArrayList<String> opcionesa= new ArrayList<String>();
                    opcionesa.add("Definen la forma en la que se codifica un carácter dado en un sistema de representación");
                    opcionesa.add("nfluye en los caracteres que se pueden almacenar");
                    opcionesa.add("Influye en el espacio de almacenamiento necesario ");
                    opcionesa.add("Todas las respuestas son correctas");
                    String preguntaa="Respecto el juego de caracteres";
                    cambiar_radioGroup(opciones.getId(),pregunta.getId(),opcionesa,preguntaa);
                    //btn.setText("octavo");
                }

            }
            else if (v.getTag()=="pregunta9")
            {
                if(validar_respuesta(v,Respuestas.get(8)))
                {

                    Button btn =(Button) v;
                    ArrayList<String> opcionesa= new ArrayList<String>();
                    opcionesa.add(" information_schema");
                    opcionesa.add("mysql ");
                    opcionesa.add("user ");
                    opcionesa.add("Las anteriores respuestas no son correctas ");
                    String preguntaa="En MySQL, la información sobre las cuentas de usuario se almacena en la base de datos";
                    cambiar_radioGroup(opciones.getId(),pregunta.getId(),opcionesa,preguntaa);
                    //btn.setText("noveno");
                }
            }
            if (v.getTag()=="pregunta10")
            {
                if(validar_respuesta(v,Respuestas.get(9)))//2
                {
                    Button btn =(Button) v;
                    ArrayList<String> opcionesa= new ArrayList<String>();
                    opcionesa.add(" Un lenguaje de programación orientado a objetos basado en JavaScrip");
                    opcionesa.add(" Un servidor de aplicaciones basado en JavaScript  ");
                    opcionesa.add("Un formato ligero para el intercambio de datos empleado en JavaScript ");
                    opcionesa.add("Las anteriores respuestas no son correctas ");
                    String preguntaa="¿Qué es JSON?";
                    cambiar_radioGroup(opciones.getId(),pregunta.getId(),opcionesa,preguntaa);
                    //btn.setText("decimo");

                }

            }
            if (v.getTag()=="pregunta11")
            {
                if(validar_respuesta(v,Respuestas.get(10)))//3
                {
                    Button btn =(Button) v;
                    ArrayList<String> opcionesa= new ArrayList<String>();
                    opcionesa.add(" <?php>...</?> ");
                    opcionesa.add(" <script>...</script> ");
                    opcionesa.add("<?php…?>");
                    opcionesa.add( "<&>...</&>");
                    String preguntaa="¿El código PHP se escribe con los delimitadores?";
                    cambiar_radioGroup(opciones.getId(),pregunta.getId(),opcionesa,preguntaa);
                    //btn.setText("once");

                }

            }
            if (v.getTag()=="pregunta12")
            {
                if(validar_respuesta(v,Respuestas.get(11)))//2
                {
                    Button btn =(Button) v;
                    ArrayList<String> opcionesa= new ArrayList<String>();
                    opcionesa.add(" ISO-8859-1 también se conoce como Latin1 ");
                    opcionesa.add("ISO-8859-15 es similar a ISO-8859-1, pero sustituye algunos símbolos poco comunes para incluir, por ejemplo, el símbolo del euro ");
                    opcionesa.add("Incluye todos los símbolos para las principales lenguas de Europa occidental (alemán, castellano, catalán, danés, finés, francés, inglés, noruego, sueco, etc.)");
                    opcionesa.add("Todas las respuestas son correctas ");
                    String preguntaa="Respecto el juego de caracteres ISO-8859-1";
                    cambiar_radioGroup(opciones.getId(),pregunta.getId(),opcionesa,preguntaa);
                    //btn.setText("doce");

                }

            }
            if (v.getTag()=="pregunta13")
            {
                if(validar_respuesta(v,Respuestas.get(12)))//2
                {
                    Button btn =(Button) v;
                    ArrayList<String> opcionesa= new ArrayList<String>();
                    opcionesa.add(" a {underline:no-underline}");
                    opcionesa.add("a {underline:none} ");
                    opcionesa.add("a {text-decoration:no-underline} ");
                    opcionesa.add("a {text-decoration:none} ");
                    String preguntaa="¿Cómo se hace en CSS para que un enlace se muestre sin el subrayado?";
                    cambiar_radioGroup(opciones.getId(),pregunta.getId(),opcionesa,preguntaa);
                    //btn.setText("trece");

                }

            }
            if (v.getTag()=="pregunta14")
            {
                if(validar_respuesta(v,Respuestas.get(13)))//2
                {
                    Button btn =(Button) v;
                    ArrayList<String> opcionesa= new ArrayList<String>();
                    opcionesa.add("1989");
                    opcionesa.add("1991");
                    opcionesa.add("1994");
                    opcionesa.add("1996");
                    String preguntaa="¿Cuando se fundó el W3C?";
                    cambiar_radioGroup(opciones.getId(),pregunta.getId(),opcionesa,preguntaa);
                    //btn.setText("catorce");

                }

            }
            if(v.getTag()=="Final")
            {

                Button btn =(Button) v;
                btn.setText("Final");
                //delay
                final Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        // Do something after 5s = 5000ms
                        new AlertDialog.Builder(v.getContext())
                                .setTitle("Final")
                                .setMessage("Estas seguro de finalizar con esta respuesta")
                                .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int which) {
                                        // continue with delete
                                        validar_respuesta(v,Respuestas.get(14));
                                        terminarJuego();
                                    }
                                })
                                .setNegativeButton(android.R.string.no, new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int which) {
                                        // do nothing
                                    }
                                })
                                .setIcon(android.R.drawable.ic_dialog_alert)
                                .show();

                    }

                }, 1);

            }
        }


    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_q);

        // se obtienen las opciones
        opciones = (RadioGroup) findViewById(R.id.opciones);
        final TextView answer=(TextView ) findViewById(R.id.Answer);
        opciones.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener()        {

            @Override
            public void onCheckedChanged(RadioGroup arg0, int checkedId)
            {
                // TODO Auto-generated method stub
                // Se comprueban los radioButton
                if (checkedId == R.id.radioButton){
                    answer.setText("Ha pulsado el botón 1");
                    RespuestaH=1;
                }else if (checkedId == R.id.radioButton2){
                    answer.setText("Ha pulsado el botón 2");
                    RespuestaH=2;
                }else if (checkedId == R.id.radioButton3){
                    answer.setText("Ha pulsado el botón 3");
                    RespuestaH=3;
                }else if (checkedId == R.id.radioButton4){
                    answer.setText("Ha pulsado el botón 4");
                    RespuestaH=4;
                }else{
                    answer.setText("estas en algo que trasiende lo previsto");
                    RespuestaH=-1;
                }
            }
        });

        //SETEAR listener
        Button btn =(Button) findViewById(R.id.button2);
        pregunta= (TextView) findViewById(R.id.textView5);
        btn.setOnClickListener(handler);

        //setear tiempo
        tiempo=(TextView) findViewById(R.id.tiempo);
        tiempo();

        //setear premio
        premio=(TextView) findViewById(R.id.premio_valor);
        premio.setText(""+0);

    }

    //proceso que verifica la pregunta
    public boolean validar_respuesta(View v,int r)
    {
        if(RespuestaH== r)
        {
            Toast.makeText(v.getContext(),"Correcto",Toast.LENGTH_SHORT).show();
            ArrayList<Integer> premios= new ArrayList<Integer>();
            premios.add(0);
            premios.add(100000);
            premios.add(200000);
            premios.add(300000);
            premios.add(500000);
            premios.add(1000000);
            premios.add(2000000);
            premios.add(3000000);
            premios.add(5000000);
            premios.add(7000000);
            premios.add(10000000);
            premios.add(15000000);
            premios.add(20000000);
            premios.add(50000000);
            premios.add(100000000);
            premios.add(300000000);
            if (contador<premios.size())
            {
                puntos=premios.get(contador);
                premio.setText("$"+premios.get(contador));
                System.out.println("puntos Acumulados"+puntos);

            }
            play_success();
            return true;
        }
        else
        {

            play_error();
            Button b=(Button) findViewById(R.id.button2);
            b.setEnabled(false);
            //delay
            final Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    // Do something after 5s = 5000ms
                    terminarJuego();
                }

            }, 3000);



            return false;
        }
    }

    //proceso que termina el juego
    public void terminarJuego()
    {
        kill_tiempo();
        Intent i=new Intent(this,Resultados.class);
        int gif;
        String estado;
        if (puntos==300000000)
        {
            estado="Ganaste";
            gif=R.drawable.worldclass;
        }
        else
        {
            estado="Perdiste";
            if(puntos>=10000000)
            {
                puntos=10000000;
            }
            else if(puntos>=1000000)
            {
                puntos=1000000;
            }
            else
            {
                puntos=0;
            }

            gif=-1;
        }

        i.putExtra("puntos",puntos);
        i.putExtra("Estado_juego",estado);
        i.putExtra("gif",gif);

        startActivity(i);
    }
   //conteo del tiempo
   public void tiempo()
   {
       kill_tiempo();
       MyCountDownTimer=new CountDownTimer(60000, 1000) {

           public void onTick(long millisUntilFinished) {
               tiempo.setText("T:" + millisUntilFinished / 1000);
           }

           public void onFinish() {
               tiempo.setText("\uD83C\uDFB2 ⊙﹏⊙  (ಠ_ಠ) \uD83C\uDFB2)");
               terminarJuego();
           }
       }.start();

   }
    //parar conteo del tiempo
    public void kill_tiempo()
    {
       if(MyCountDownTimer!= null)
       {
           MyCountDownTimer.cancel();
           MyCountDownTimer=null;
       }
        System.out.println(MyCountDownTimer);

    }
    //proces to pley success sound
    public void play_success() {
        //sounds
        MediaPlayer mp = MediaPlayer.create(this, R.raw.success);
        mp.start();
    }
    //proces to pley error sound
    public void play_error() {
        //sounds
        MediaPlayer mp = MediaPlayer.create(this, R.raw.error);
        mp.start();
    }

    //proceso que cambia la pregunta
    public void cambiar_radioGroup(int grupo,int label,ArrayList<String> opciones,String pregunta)
    {
        //cambiar_radioGroup();
        RadioGroup radioGroup = (RadioGroup)findViewById(grupo);

        for (int i = 0; i < radioGroup .getChildCount(); i++) {
            ((RadioButton) radioGroup.getChildAt(i)).setText(opciones.get(i));
        }
        //setear la pregunta
        TextView lbl=(TextView) findViewById(label);
        lbl.setText(pregunta);
    }

    //generar aleatorio
    public  ArrayList<Integer>  get_ramdom(int limite, int diferente)
    {
        int cuantos=0;
        ArrayList<Integer> ramdom= new ArrayList<Integer>();
        while(cuantos<2)
        {
            int value= (int) (Math.random()*limite+1);
            if(value!=diferente && !ramdom.contains(value))
            {
                ramdom.add(value);
                cuantos++;
            }
        }
        return ramdom;

    }
    ///ayudas 50/50
    public void cincuenta_cincuenta(int grupo, int correcta)
    {
        int numeros;

        //cambiar_radioGroup();
        RadioGroup radioGroup = (RadioGroup)findViewById(grupo);
        ArrayList<Integer> preguntas=get_ramdom(4, correcta);
        System.out.println((preguntas.get(0)));
        System.out.println((preguntas.get(1)));

        RadioButton op=(RadioButton)radioGroup.getChildAt(preguntas.get(0)-1);
        op.setVisibility(View.INVISIBLE);
        op=(RadioButton)radioGroup.getChildAt(preguntas.get(1)-1);
        op.setVisibility(View.INVISIBLE);

    }

    //50/50
    public void cincuenta_cincuent_event(View v)
    {
        cincuenta_cincuenta(R.id.opciones,correctaActual);
        System.out.println("correcta actual"+correctaActual);
        findViewById(R.id.b50_50).setVisibility(View.INVISIBLE);
    }

    //quitar 50/50
    public void dishide_cincuenta_cincuent_event(View v)
    {
        RadioGroup radioGroup = (RadioGroup)findViewById(R.id.opciones);
        for (int i = 0; i < radioGroup.getChildCount(); i++) {
            ((RadioButton) radioGroup.getChildAt(i)).setVisibility(View.VISIBLE);
        }
    }



}
