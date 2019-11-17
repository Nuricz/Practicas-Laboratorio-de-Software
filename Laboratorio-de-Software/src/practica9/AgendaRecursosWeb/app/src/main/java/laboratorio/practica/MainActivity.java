package laboratorio.practica;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import laboratorio.practica.modelo.RecursoWeb;
import laboratorio.practica.modelo.TipoRecurso;

public class MainActivity extends AppCompatActivity {
    private ListView listView;
    private RecursoWeb[] values ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


         values = new RecursoWeb[] {
                 new RecursoWeb(0, "Fantasma", "http://www.sonidosmp3gratis.com/sounds/ruido_1.mp3", "Ruido fantasmagórico", TipoRecurso.AUDIO),
                 new RecursoWeb(0, "Campanas", "http://www.sonidosmp3gratis.com/sounds/campanas_3.mp3", "Sonido de camapandas", TipoRecurso.AUDIO),
                 new RecursoWeb(0, "Instagram", "http://www.instagram.com", "Sitio Oficial de Instagram", TipoRecurso.SITIO_WEB) ,
                 new RecursoWeb(0, "Guitarra", "https://d1aeri3ty3izns.cloudfront.net/media/44/448686/1200/preview.jpg", "Guitarra PRS",TipoRecurso.IMAGEN)

         };

        this.setListView((ListView)this.findViewById(R.id.listaRecursos));
       this.getListView().setChoiceMode(ListView.CHOICE_MODE_SINGLE);
       this.getListView().setAdapter(new ArrayAdapter<RecursoWeb>(this,android.R.layout.simple_list_item_single_choice, android.R.id.text1,  values));

    }





    public ListView getListView() {
        return listView;
    }

    public void setListView(ListView listView) {
        this.listView = listView;
    }
}
