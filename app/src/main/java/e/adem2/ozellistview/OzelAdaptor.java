package e.adem2.ozellistview;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

public class OzelAdaptor extends BaseAdapter {
    private LayoutInflater mLayoutInflater;
    private List<Ulke>  mUlkeListesi;

    public OzelAdaptor(Activity activity, List<Ulke> ulkeler) {
        mLayoutInflater = (LayoutInflater) activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        mUlkeListesi = ulkeler;
    }

    @Override
    public int getCount() {
        return mUlkeListesi.size();
    }

    @Override
    public Object getItem(int position) {
        return mUlkeListesi.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View satirView;
        satirView = mLayoutInflater.inflate(R.layout.row_item,null);
        TextView textView1 = satirView.findViewById(R.id.tv1);
        TextView textView2 = satirView.findViewById(R.id.tv2);

        Ulke ulkeler = mUlkeListesi.get(position);

        textView1.setText(ulkeler.getUlkeAdi());
        textView2.setText(ulkeler.getNufusu());

        return satirView;
    }
}
