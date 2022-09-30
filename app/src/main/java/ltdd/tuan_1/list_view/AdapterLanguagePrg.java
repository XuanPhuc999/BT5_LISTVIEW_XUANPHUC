package ltdd.tuan_1.list_view;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.time.temporal.Temporal;
import java.util.List;


public class AdapterLanguagePrg extends BaseAdapter {

    private Context context;
    private int layout;
    private List<LanguageProgram> arraylist;

    public AdapterLanguagePrg(Context context, int layout, List<LanguageProgram> arraylist) {
        this.context = context;
        this.layout = layout;
        this.arraylist = arraylist;
    }

    @Override
    public int getCount() {
        return arraylist.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }
    //i is position
    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View convertView, ViewGroup viewGroup) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        convertView = inflater.inflate(layout, null);

        LanguageProgram languageProgram = arraylist.get(i);

        TextView textView1 = convertView.findViewById(R.id.name);
        TextView textView2 = convertView.findViewById(R.id.mota);
        ImageView imageView = convertView.findViewById(R.id.imageProgram);

        textView1.setText(languageProgram.getNameLanguage());
        textView2.setText(languageProgram.getDescrep());
        imageView.setImageResource(languageProgram.getImage());

        return convertView;
    }
}
