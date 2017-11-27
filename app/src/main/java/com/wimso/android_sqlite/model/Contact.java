package com.wimso.android_sqlite.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.StrictMode;

/**
 * Created by wim on 4/26/16.
 */
public class Contact implements Parcelable {

    private int id;
    private String name;
    private String phone;
    private String dia_1;
    private String dia_2;
    private String dia_3;
    private String dia_4;
    private String dia_5;
    private String dia_6;
    private String dia_7;

    private String horario_1;
    private String horario_2;
    private String horario_3;
    private String horario_4;
    private String horario_5;
    private String horario_6;
    private String horario_7;
    private String Correo;
    private String Cancha;



    public Contact() {
    }

    protected Contact(Parcel in) {
        this.id = in.readInt();
        this.name = in.readString();
        this.phone = in.readString();
        this.dia_1 = in.readString();
        this.dia_2 = in.readString();
        this.dia_3 = in.readString();
        this.dia_4 = in.readString();
        this.dia_5 = in.readString();
        this.dia_6 = in.readString();
        this.dia_7 = in.readString();
        this.horario_1 = in.readString();
        this.horario_2 = in.readString();
        this.horario_3 = in.readString();
        this.Correo = in.readString();
        this.Cancha = in.readString();
    }

    public static final Parcelable.Creator<Contact> CREATOR = new Parcelable.Creator<Contact>() {
        @Override
        public Contact createFromParcel(Parcel source) {
            return new Contact(source);
        }

        @Override
        public Contact[] newArray(int size) {
            return new Contact[size];
        }
    };

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public void setDia1(String dia_1) {
        this.dia_1 = dia_1;
    }
    public void setDia2(String dia_2) {
        this.dia_2 = dia_2;
    }
    public void setDia3(String dia_3) {
        this.dia_3 = dia_3;
    }
    public void setDia4(String dia_4) {
        this.dia_4 = dia_4;
    }
    public void setDia5(String dia_5) {
        this.dia_5 = dia_5;
    }
    public void setDia6(String dia_6) {
        this.dia_6 = dia_6;
    }
    public void setDia7(String dia_7) {
        this.dia_7 = dia_7;
    }




    public void setHorario1(String horario_1) {
        this.horario_1 = horario_1;
    }

    public void setHorario2(String horario_2) {
        this.horario_2 = horario_2;
    }

    public void setHorario3(String horario_3) {this.horario_3 = horario_3;  }

    public void setHorario4(String horario_4) {
        this.horario_4 = horario_4;
    }

    public void setHorario5(String horario_5) {
        this.horario_5 = horario_5;
    }

    public void setHorario6(String horario_6) {this.horario_6 = horario_6;  }

    public void setHorario7(String horario_7) {
        this.horario_7 = horario_7;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setCancha(String name) {
        this.name = name;
    }

    public void setCorreo(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getCorreo() {
        return Correo;
    }

    public String getCancha() {
        return Cancha;
    }


    public String getPhone() {
        return phone;
    }

    public String getDia1() {
        return dia_1;
    }
    public String getDia2() {
        return dia_2;
    }
    public String getDia3() {
        return dia_3;
    }
    public String getDia4() {
        return dia_4;
    }
    public String getDia5() {
        return dia_5;
    }
    public String getDia6() {
        return dia_6;
    }
    public String getDia7() {
        return dia_7;
    }

    public String getHorario1() {
        return horario_1;
    }
    public String getHorario2() {
        return horario_2;
    }
    public String getHorario3() {
        return horario_3;
    }
    public String getHorario4() {
        return horario_4;
    }
    public String getHorario5() {
        return horario_5;
    }
    public String getHorario6() {
        return horario_6;
    }
    public String getHorario7() {
        return horario_7;
    }







    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(this.id);
        dest.writeString(this.name);
        dest.writeString(this.phone);
        dest.writeString(this.dia_1);
        dest.writeString(this.dia_2);
        dest.writeString(this.dia_3);
        dest.writeString(this.dia_4);
        dest.writeString(this.dia_5);
        dest.writeString(this.dia_6);
        dest.writeString(this.dia_7);

        dest.writeString(this.horario_1);
        dest.writeString(this.horario_2);
        dest.writeString(this.horario_3);
        dest.writeString(this.horario_4);
        dest.writeString(this.horario_5);
        dest.writeString(this.horario_6);
        dest.writeString(this.horario_7);

        dest.writeString(this.Correo);
        dest.writeString(this.Cancha);



    }

}