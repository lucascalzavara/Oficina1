import android.database.sqlite.SQLiteDatabase;
import android.os.StrictMode;

/**
 * Created by Lucas Calzavara on 06/05/2016.
 */
public class CriaBanco extendes SQLiteOpenHelper{

    private static final Stirng NOME_BANCO = "banco.db";
    private static final String TABELA = "Controle";
    private static final String ID = "_id";


    @Override
    public void onCreate (SQLiteDatabase db){

    }

    @Override
    public void onUpdate (SQLiteDatabase db, int oldVersion, int newVersion){

    }
}
