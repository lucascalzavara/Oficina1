package com.example.lucascalzavara.controlaltdel;

/**
 * Created by Lucas Calzavara on 12/05/2016.
 */
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class BancoDados extends SQLiteOpenHelper {
    private static final String DATABASE_NOME = "banco.db";
    private static final int DATABASE_VERSION = 1;
    private static final String TABELA_TV = "controletv";
    private static final String TABELA_PROJ = "controleprojetor";
    private static final String botaoliga = "botaoliga";
    private static final String botao1 = "botao1";
    private static final String botao2 = "botao2";
    private static final String botao3 = "botao3";
    private static final String botao4 = "botao4";
    private static final String botao5 = "botao5";
    private static final String botao6 = "botao6";
    private static final String botao7 = "botao7";
    private static final String botao8 = "botao8";
    private static final String botao9 = "botao9";
    private static final String botao0 = "botao10";
    private static final String botaoa = "botaoa";
    private static final String botaob = "botaob";
    private static final String botaoc = "botaoc";
    private static final String botaod = "botaod";
    private static final String botaovolmais = "botaovolmais";
    private static final String botaovolmenos  = "botalvolmenos";
    private static final String botaochmais = "botaochamis";
    private static final String botaochmenos = "botaochmenos";
    private static final String botaovoltar = "botaovoltar";
    private static final String botaosair = "botaosair";
    private static final String botaoup = "botaoup";
    private static final String botaodw = "botaodw";
    private static final String botaolf = "botaolf";
    private static final String botaort = "botaort";
    private static final String botaook = "botaook";
    private static final String botaomenu = "botaomenu";
    private static final String botaoop = "botaoop";
    private static final String botaoinput = "botaoinnput";
    private static final String nome = "nome";
    private static final String botaocomp = "botaocomp";
    private static final String botaovideo = "botaovideo";
    private static final String botaousb = "botaousb";
    private static final String botaolan = "botaolan";
    private static final String botaosource = "botaosource";
    private static final String botaoesc = "botaoesc";

    public BancoDados(Context context) {
        super(context, DATABASE_NOME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String sql1 = "create table "+TABELA_TV+" ( "+nome+" varchar(20) PRIMARY KEY, "+botaoliga+" varchar(1000), "+botao1+" varchar(1000), "+botao2+" varchar(1000), "+botao3+" varchar(1000), "+botao4+" varchar(1000),"+botao5+
                " varchar(1000), "+botao6+" varchar(1000), "+botao7+" varchar(1000), "+botao8+" varchar(1000), "+botao9+" varchar(1000), "+botao0+" varchar(1000), "+botaoa+" varchar(1000), "+botaob+" varchar(1000), "+botaoc+" varchar(1000), "+botaod+" varchar(1000), "+botaovolmais+
                " varchar(1000), "+botaovolmenos+" varchar(1000), "+botaochmais+" varchar(1000), "+botaochmenos+" varchar(1000), "+botaovoltar+" varchar(1000), "+botaosair+" varchar(1000), "+botaoup+" varchar(1000), "+botaodw+" varchar(1000), "+botaolf+" varchar(1000), "+botaort+
                " varchar(1000), "+botaook+" varchar(1000), "+botaomenu+" varchar(1000), "+botaoop+" varchar(1000), "+botaoinput+" varchar(1000))";
        String sql2 = "create table "+TABELA_PROJ+" ("+nome+" PRIMARY KEY, "+botaoliga+" varchar(1000), "+botao1+" varchar(1000), "+botao2+" varchar(1000), "+botao3+" varchar(1000), "+botao4+" varchar(1000),"+botao5+" varchar(1000)," +
                " "+botao6+" varchar(1000), "+botao7+" varchar(1000), "+botao8+" varchar(1000), "+botao9+" varchar(1000), "+botao0+" varchar(1000), "+botaoup+" varchar(1000), "+botaodw+" varchar(1000), "+botaolf+" varchar(1000), " +
                ""+botaort+" varchar(1000), "+botaook+" varchar(1000), "+botaomenu+" varchar(1000), "+botaocomp+" varchar(1000), "+botaovideo+" varchar(1000),"+botaousb+" varchar(1000), "+botaolan+" varchar(1000), " +
                ""+botaosource+" varchar(1000), "+botaovolmais+" varchar(1000), "+botaovolmenos+" varchar(1000),"+botaoesc+" varchar(1000))";
        db.execSQL(sql1);
        db.execSQL(sql2);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("drop table if exists "+TABELA_TV);
        db.execSQL("drop table if exists "+TABELA_PROJ);
        onCreate(db);
    }
}