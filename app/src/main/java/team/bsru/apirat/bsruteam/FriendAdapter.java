package team.bsru.apirat.bsruteam;

import android.content.Context;
import android.media.Image;
import android.os.AsyncTask;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

/**
 * Created by Lottae on 17/2/2560.
 */

public class FriendAdapter extends BaseAdapter{

    private Context context;
    private String[] iconString, nameString;
    private TextView textView;
    private ImageView imageView;


    public FriendAdapter(Context context,
                         String[] iconString,
                         String[] nameString) {
        this.context = context;
        this.iconString = iconString;
        this.nameString = nameString;
    }

    @Override
    public int getCount() {
        return iconString.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = layoutInflater.inflate(R.layout.mylistview, parent, false);

        //Bind Widget
        textView = (TextView) view.findViewById(R.id.textView3);
        imageView = (ImageView) view.findViewById(R.id.imageView4);

        //Show View
        Log.d("17febV4", "name(" + position + ") ==>" + nameString[position]);
        Log.d("17febV4", "image(" + position + ") ==>" + iconString[position]);

        textView.setText(nameString[position]);
        Picasso.with(context).load(iconString[position]).into(imageView);


        return view;
    }

} //Main Class
