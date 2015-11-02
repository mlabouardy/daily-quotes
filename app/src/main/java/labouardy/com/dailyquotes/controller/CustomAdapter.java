package labouardy.com.dailyquotes.controller;

import android.app.Activity;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import labouardy.com.dailyquotes.R;

/**
 * Created by mlabouardy on 22/03/15.
 */
public class CustomAdapter extends BaseAdapter {
    private Activity activity;
    private List<String> countries;
    private LayoutInflater inflater;

    public CustomAdapter(Activity activity,List<String> countries){
        this.activity=activity;
        this.countries=countries;
    }

    @Override
    public int getCount() {
        return countries.size();
    }

    @Override
    public Object getItem(int position) {
        return countries.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        inflater=LayoutInflater.from(activity);
        convertView=inflater.inflate(R.layout.country,null);

        String item=(String)getItem(position);
        TextView country=(TextView)convertView.findViewById(R.id.country);
        ImageView countryImg=(ImageView)convertView.findViewById(R.id.countryImg);

        switch(item){
            case "Morocco":
                countryImg.setImageResource(R.drawable.morocco);
                break;
            case "France":
                countryImg.setImageResource(R.drawable.france);
                break;
            case "Germany":
                countryImg.setImageResource(R.drawable.germany);
                break;
            case "Sweden":
                countryImg.setImageResource(R.drawable.sweden);
                break;
            case "England":
                countryImg.setImageResource(R.drawable.england);
                break;
            case "Canada":
                countryImg.setImageResource(R.drawable.canada);
                break;
            case "Spain":
                countryImg.setImageResource(R.drawable.spain);
                break;
            case "Korea":
                countryImg.setImageResource(R.drawable.korea);
                break;
            case "Poland":
                countryImg.setImageResource(R.drawable.poland);
                break;
            case "Algeria":
                countryImg.setImageResource(R.drawable.algeria);
                break;
            case "Albania":
                countryImg.setImageResource(R.drawable.albania);
                break;
            case "Argentina":
                countryImg.setImageResource(R.drawable.argentina);
                break;
            case "Australia":
                countryImg.setImageResource(R.drawable.australia);
                break;
            case "Austria":
                countryImg.setImageResource(R.drawable.austria);
                break;
            case "Brazil":
                countryImg.setImageResource(R.drawable.brazil);
                break;
            case "Ireland":
                countryImg.setImageResource(R.drawable.ireland);
                break;
            case "Japan":
                countryImg.setImageResource(R.drawable.japan);
                break;
            case "Luxembourg":
                countryImg.setImageResource(R.drawable.luxembourg);
                break;
            case "Mexico":
                countryImg.setImageResource(R.drawable.mexico);
                break;
            case "Netherlands":
                countryImg.setImageResource(R.drawable.netherlands);
                break;
            case "Norway":
                countryImg.setImageResource(R.drawable.norway);
                break;
            case "Palestine":
                countryImg.setImageResource(R.drawable.palestine);
                break;
            case "Romania":
                countryImg.setImageResource(R.drawable.romania);
                break;
            case "Russia":
                countryImg.setImageResource(R.drawable.russia);
                break;
            case "Switzerland":
                countryImg.setImageResource(R.drawable.switzerland);
                break;
            case "Tunisia":
                countryImg.setImageResource(R.drawable.tunisia);
                break;
            case "Turkey":
                countryImg.setImageResource(R.drawable.turkey);
                break;
            case "USA":
                countryImg.setImageResource(R.drawable.usa);
                break;
            case "Bangladesh":
                countryImg.setImageResource(R.drawable.bangladesh);
                break;
            case "Belgium":
                countryImg.setImageResource(R.drawable.belgium);
                break;
            case "Bulgaria":
                countryImg.setImageResource(R.drawable.bulgaria);
                break;
            case "Chile":
                countryImg.setImageResource(R.drawable.chile);
                break;
            case "China":
                countryImg.setImageResource(R.drawable.china);
                break;
            case "Croatian":
                countryImg.setImageResource(R.drawable.croatian);
                break;
            case "Cuba":
                countryImg.setImageResource(R.drawable.cuba);
                break;
            case "Cyprus":
                countryImg.setImageResource(R.drawable.cyprus);
                break;
            case "Denmark":
                countryImg.setImageResource(R.drawable.denmark);
                break;
            case "Egypt":
                countryImg.setImageResource(R.drawable.egypt);
                break;
            case "Estonia":
                countryImg.setImageResource(R.drawable.estonia);
                break;
            case "Finland":
                countryImg.setImageResource(R.drawable.finland);
                break;
            case "Georgia":
                countryImg.setImageResource(R.drawable.georgia);
                break;
            case "Greece":
                countryImg.setImageResource(R.drawable.greece);
                break;
            case "Hungary":
                countryImg.setImageResource(R.drawable.hungary);
                break;
            case "Iceland":
                countryImg.setImageResource(R.drawable.iceland);
                break;
            case "Indonesia":
                countryImg.setImageResource(R.drawable.indonesia);
                break;
            case "Italy":
                countryImg.setImageResource(R.drawable.italy);
                break;
            case "Jordan":
                countryImg.setImageResource(R.drawable.jordan);
                break;
            case "Lebanon":
                countryImg.setImageResource(R.drawable.lebanon);
                break;
            case "Libya":
                countryImg.setImageResource(R.drawable.libya);
                break;
            case "Lithuania":
                countryImg.setImageResource(R.drawable.lithuania);
                break;
            case "Malaysia":
                countryImg.setImageResource(R.drawable.malaysia);
                break;
            case "Mali":
                countryImg.setImageResource(R.drawable.mali);
                break;
            case "Malta":
                countryImg.setImageResource(R.drawable.malta);
                break;
            case "Qatar":
                countryImg.setImageResource(R.drawable.qatar);
                break;
            case "Saudi Arabia":
                countryImg.setImageResource(R.drawable.saudiarabia);
                break;
            case "Slovakia":
                countryImg.setImageResource(R.drawable.slovakia);
                break;
          /*  case "South Africa":
                countryImg.setImageResource(R.drawable.southafrica);
                break;*/
            case "Syria":
                countryImg.setImageResource(R.drawable.syria);
                break;
            case "Thailand":
                countryImg.setImageResource(R.drawable.thailand);
                break;
            case "Ukraine":
                countryImg.setImageResource(R.drawable.ukraine);
                break;
            case "Yemen":
                countryImg.setImageResource(R.drawable.yemen);
                break;
        }
        country.setText(item);

        return convertView;
    }
}
