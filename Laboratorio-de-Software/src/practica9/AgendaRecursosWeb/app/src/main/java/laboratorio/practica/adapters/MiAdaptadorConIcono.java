package laboratorio.practica.adapters;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.constraintlayout.widget.Placeholder;

import laboratorio.practica.R;
import laboratorio.practica.modelo.RecursoWeb;
import laboratorio.practica.modelo.TipoRecurso;


public class MiAdaptadorConIcono extends ArrayAdapter<RecursoWeb> {

    private class ViewPlaceholder{
        ImageView imagen;
        TextView texto;
    }

    private final Context context;
    private final RecursoWeb[] values;

    public MiAdaptadorConIcono(Context context, RecursoWeb[] values) {
        super(context, R.layout.recurso_iconico, values);
        this.context = context;
        this.values = values;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewPlaceholder placeholder = null;
        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        if (convertView == null) {
            convertView = inflater.inflate(R.layout.recurso_iconico,parent,false);
            placeholder = new ViewPlaceholder();
            placeholder.imagen = (ImageView) convertView.findViewById(R.id.recursoIcono);
            placeholder.texto = (TextView) convertView.findViewById(R.id.recursoTexto);
            convertView.setTag(placeholder);
        } else {
            placeholder = (ViewPlaceholder) convertView.getTag();
        }

        RecursoWeb recurso = values[position];
        placeholder.texto.setText(recurso.getNombre());
        int icono = android.R.drawable.ic_menu_help;
        switch (recurso.getTipoRecurso()) {
            case AUDIO:
                icono = android.R.drawable.ic_media_play;
                break;
            case VIDEO:
                icono = android.R.drawable.ic_menu_upload_you_tube;
                break;
            case IMAGEN:
                icono = android.R.drawable.ic_menu_gallery;
                break;
            case SITIO_WEB:
                icono = android.R.drawable.ic_menu_search;
                break;
        }
        placeholder.imagen.setImageResource(icono);

        return convertView;
    }
}