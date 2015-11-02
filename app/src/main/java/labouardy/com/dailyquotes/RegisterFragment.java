package labouardy.com.dailyquotes;

import android.support.v4.app.Fragment;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import labouardy.com.dailyquotes.controller.CustomAdapter;


public class RegisterFragment extends android.support.v4.app.Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private List<String> l;
    private ListView lv;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_register, container, false);

        lv=(ListView)v.findViewById(R.id.listViewCountries);

        l=new ArrayList<>();

        initCountries();


        CustomAdapter adapter=new CustomAdapter(this.getActivity(),l);
        lv.setAdapter(adapter);

        return v;
    }

    public void initCountries(){
        l.add("France");
        l.add("Sweden");
        l.add("Germany");
        l.add("Morocco");
        l.add("England");
        l.add("Algeria");
        l.add("Spain");
        l.add("Canada");
        l.add("Poland");
        l.add("Korea");
        l.add("Albania");
        l.add("Argentina");
        l.add("Australia");
        l.add("Austria");
        l.add("Brazil");
        l.add("Ireland");
        l.add("Japan");
        l.add("Luxembourg");
        l.add("Mexico");
        l.add("Netherlands");
        l.add("Norway");
        l.add("Palestine");
        l.add("Romania");
        l.add("Russia");
        l.add("Switzerland");
        l.add("Tunisia");
        l.add("Turkey");
        l.add("USA");
        l.add("Bangladesh");
        l.add("Belgium");
        l.add("Bulgaria");
        l.add("Chile");
        l.add("China");
        l.add("Croatian");
        l.add("Cuba");
        l.add("Cyprus");
        l.add("Denmark");
        l.add("Egypt");
        l.add("Estonia");
        l.add("Finland");
        l.add("Georgia");
        l.add("Greece");
        l.add("Hungary");
        l.add("Iceland");
        l.add("Indonesia");
        l.add("Italy");
        l.add("Jordan");
        l.add("Lebanon");
        l.add("Libya");
        l.add("Lithuania");
        l.add("Malaysia");
        l.add("Mali");
        l.add("Malta");
        l.add("Qatar");
        l.add("Saudi Arabia");
        l.add("Syria");
        l.add("Slovakia");
        l.add("South Africa");
        l.add("Ukraine");
        l.add("Thailand");
        l.add("Yemen");
        java.util.Collections.sort(l);
    }



}
