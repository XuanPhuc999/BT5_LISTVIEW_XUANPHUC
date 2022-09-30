package ltdd.tuan_1.list_view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView;

        ArrayList<LanguageProgram> arrayList;
        AdapterLanguagePrg adapterLanguagePrg;

        listView = findViewById(R.id.list_view_PrgLanguage);
        arrayList = new ArrayList<>();
        arrayList.add(new LanguageProgram("C",
                "C là một ngôn ngữ lập trình cấp trung được phát triển bởi Dennis M.Ritchie....", R.drawable.c));
        arrayList.add(new LanguageProgram("Java", "Java là một ngôn ngữ lập trình bậc cao" +
                ", hướng đối tượng và bảo mật mạnh mẽ....", R.drawable.java));
        arrayList.add(new LanguageProgram("Python", "Python là ngôn ngữ có hình thức " +
                "rất sáng sủa, cấu trúc rõ ràng.......", R.drawable.python));
        arrayList.add(new LanguageProgram("Javascript", "Javascript là ngôn ngữ lập trình" +
                " phổ biến dùng để tạo ra các trang web tương tác.......", R.drawable.javascript));

        adapterLanguagePrg = new AdapterLanguagePrg(MainActivity.this, R.layout.languageprogram_layout, arrayList);
        listView.setAdapter(adapterLanguagePrg);



    }
}