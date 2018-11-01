package e.adem2.ozellistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    public ListView listemiz;
    public final List<Ulke> ulkeler=new ArrayList<Ulke>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ulkeler.add(new Ulke("Turkey","80Milyon"));
        ulkeler.add(new Ulke("Almanya","75Milyon"));
        ulkeler.add(new Ulke("Rusya","150Milyon"));

        listemiz=findViewById(R.id.ListView);

        OzelAdaptor adaptor = new OzelAdaptor(this,ulkeler);

        listemiz.setAdapter(adaptor);


    }
}
