package edufpaiva.com.br.waystogoogle;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Debug;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.text.Layout;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.ArrayList;

import javax.xml.transform.Source;

public class MainActivity extends AppCompatActivity {
    ArrayList<Tela> telas;
    private int indice = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
       // setSupportActionBar(toolbar);



        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setTela();
            }
        });



        criarTelas();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
       // getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        //int id = item.getItemId();

        //noinspection SimplifiableIfStatement
//        if (id == R.id.action_settings) {
//            return true;
//        }

        return super.onOptionsItemSelected(item);
    }



    public void criarTelas(){
        telas = new ArrayList();


        Tela google = new Tela("Maneiras pra acessar o Google","Mesmo digitando o seu nome errado o google é dono de varios dominios parecidos com o seu e o redirecionam para o correto", "gooogle.com\ngogle.com\ngooglr.com\n466453.com\ncom.google\ngoogle.net\ngogole.com\ngoolge.com\nduck.com",R.drawable.google_bg, R.color.preto);
        Tela breakout = new Tela ("Ao digitar \n\"atari breakout\"\n no Google imagens\n\n\n\nAs imagens se transformam no classico do atari para você jogar!","","", R.drawable.breakout_bg, R.color.branco);
        Tela underwater = new Tela("Ao digitar \n\"underwater\"\\nna pesquisa e clicar no botão \n\"Estou com sorte\"","O Google é jogado num oceano cheio de tubaroes","", R.drawable.underwater_bg , R.color.laranja);
        Tela zergRush = new Tela("Ao pesquisar no Google por \n\"Zerg Rush\"","O Google  transforma sua pesquisa e um campo de batalha que simula a estrategias dos Zergs em Starcraft","",R.drawable.zerg_symbol_bg, R.color.laranja);
        Tela gravity = new Tela("Ao pesquisar no Google por \n\"gravity\"\n e clicar em estou com sorte ","O google despenca como se tivesse sofrendo os efeitos da gravidade","", R.drawable.gravidade_bg, R.color.azul);


        telas.add(google);
        telas.add(breakout);
        telas.add(underwater);
        telas.add(zergRush);
        telas.add(gravity);



    }
    public void setTela(){
        if(telas.size() > indice){

            View v = findViewById(R.id.google_find);
            v.setBackgroundColor(telas.get(indice).getBackground());


            TextView t1 = (TextView) findViewById(R.id.texto1);
            t1.setText(telas.get(indice).getTexto1());
            t1.setTextColor(telas.get(indice).getTextColor());

            TextView t2 = (TextView) findViewById(R.id.texto2);
            t2.setText(telas.get(indice).getTexto2());
            t2.setTextColor(telas.get(indice).getTextColor());

            TextView t3 = (TextView) findViewById(R.id.texto3);
            t3.setText(telas.get(indice).getTexto3());

            //System.out.println(indice);
            indice++;
        }else{
            indice = 0;

            View v = findViewById(R.id.google_find);
            v.setBackgroundColor(telas.get(indice).getBackground());


            TextView t1 = (TextView) findViewById(R.id.texto1);
            t1.setText(telas.get(indice).getTexto1());
            t1.setTextColor(telas.get(indice).getTextColor());

            TextView t2 = (TextView) findViewById(R.id.texto2);
            t2.setText(telas.get(indice).getTexto2());
            t2.setTextColor(telas.get(indice).getTextColor());

            TextView t3 = (TextView) findViewById(R.id.texto3);
            t3.setText(telas.get(indice).getTexto3());

            indice++;

        }




    }

}
