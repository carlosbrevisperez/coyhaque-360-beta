package com.wimso.android_sqlite;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

import com.wimso.android_sqlite.db.SQLiteDB;
import com.wimso.android_sqlite.model.Contact;

/**
 * Created by docotel on 5/2/16.
 */
public class ActActivity extends AppCompatActivity implements View.OnClickListener{

    private EditText personName;
    private EditText phone;
    private EditText Correo ;
    private EditText Cancha;
    private CheckBox lunes;
    private CheckBox martes;
    private CheckBox miercoles;
    private CheckBox jueves;
    private CheckBox viernes;
    private CheckBox sabado;
    private CheckBox domingo;

    private CheckBox horario_1;
    private CheckBox horario_2;
    private CheckBox horario_3;
    private CheckBox horario_4;
    private CheckBox horario_5;
    private CheckBox horario_6;
    private CheckBox horario_7;


    private Button btnArrendar, btnEdit, btnDelete;

    private SQLiteDB sqLiteDB;
    private Contact contact;

    public static void start(Context context){
        Intent intent = new Intent(context, ActActivity.class);
        context.startActivity(intent);
    }

    public static void start(Context context, Contact contact){
        Intent intent = new Intent(context, ActActivity.class);
        intent.putExtra(ActActivity.class.getSimpleName(), contact);
        context.startActivity(intent);
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_act);

        personName = (EditText) findViewById(R.id.personText);
        phone = (EditText) findViewById(R.id.phoneText);
        Correo = (EditText) findViewById(R.id.Correo);
        Cancha = (EditText) findViewById(R.id.Cancha);

        lunes = (CheckBox) findViewById(R.id.lunes);
        martes = (CheckBox) findViewById(R.id.martes);
        miercoles = (CheckBox) findViewById(R.id.miercoles);
        jueves = (CheckBox) findViewById(R.id.jueves);
        viernes = (CheckBox) findViewById(R.id.viernes);
        sabado = (CheckBox) findViewById(R.id.sabado);
        domingo = (CheckBox) findViewById(R.id.domingo);

        horario_1 = (CheckBox) findViewById(R.id.horario_1);
        horario_2 = (CheckBox) findViewById(R.id.horario_2);
        horario_3 = (CheckBox) findViewById(R.id.horario_3);
        horario_4 = (CheckBox) findViewById(R.id.horario_4);
        horario_5 = (CheckBox) findViewById(R.id.horario_5);
        horario_6 = (CheckBox) findViewById(R.id.horario_6);
        horario_7 = (CheckBox) findViewById(R.id.horario_7);

        btnArrendar = (Button) findViewById(R.id.btnArrendar);
        btnEdit = (Button) findViewById(R.id.btnEdit);
        btnDelete = (Button) findViewById(R.id.btnDelete);

        btnArrendar.setOnClickListener(this);
        btnEdit.setOnClickListener(this);
        btnDelete.setOnClickListener(this);

        contact = getIntent().getParcelableExtra(ActActivity.class.getSimpleName());
        if(contact != null){
            btnArrendar.setVisibility(View.GONE);

            personName.setText(contact.getName());
            phone.setText(contact.getPhone());
        }else{
            btnEdit.setVisibility(View.GONE);
            btnDelete.setVisibility(View.GONE);
        }

        sqLiteDB = new SQLiteDB(this);
    }

    @Override
    public void onClick(View v) {
        if(v == btnArrendar){
            contact = new Contact();

            if(personName.getText().toString().equals("")){
                Toast.makeText(this, "Debe ingresar al menos un campo", Toast.LENGTH_SHORT).show();
            }
            else {
                contact.setName(personName.getText().toString());
                contact.setPhone(phone.getText().toString());
                contact.setCancha(Correo.getText().toString());
                contact.setCorreo(Cancha.getText().toString());
                if(lunes.isChecked()){
                    contact.setDia1("Lunes");
                }

                if(martes.isChecked()){
                    contact.setDia2("Martes");
                }

                if(miercoles.isChecked()){
                    contact.setDia3("Miercoles");
                }

                if(jueves.isChecked()){
                    contact.setDia4("Jueves");
                }
                if(viernes.isChecked()){
                    contact.setDia5("Viernes");
                }
                if(sabado.isChecked()){
                    contact.setDia6("Sabado");
                }

                if(domingo.isChecked()){
                    contact.setDia7("Domingo");
                }



                if(horario_1.isChecked()){
                    contact.setHorario1("11:00 a 12:00 hrs");
                }
                if(horario_2.isChecked()){
                    contact.setHorario2("12:00 a 13:00 hrs");
                }

                if(horario_3.isChecked()){
                    contact.setHorario3("13:00 a 14:00 hrs");
                }

                if(horario_4.isChecked()){
                    contact.setHorario4("14:00 a 15:00 hrs");
                }

                if(horario_5.isChecked()){
                    contact.setHorario5("15:00 a 16:00 hrs");
                }

                if(horario_6.isChecked()){
                    contact.setHorario6("16:00 a 17:00 hrs");
                }
                if(horario_7.isChecked()){
                    contact.setHorario7("17:00 a 18:00 hrs");
                }






                sqLiteDB.create(contact);

                Toast.makeText(this, "Agendado!", Toast.LENGTH_SHORT).show();
                finish();
            }
        }else if(v == btnEdit){
            contact.setName(personName.getText().toString());
            contact.setPhone(phone.getText().toString());
            sqLiteDB.update(contact);

            Toast.makeText(this, "Modificado!", Toast.LENGTH_SHORT).show();
            finish();
        }else if(v == btnDelete){
            sqLiteDB.delete(contact.getId());

            Toast.makeText(this, "Eliminado!", Toast.LENGTH_SHORT).show();
            finish();
        }
    }
}
