package labouardy.com.dailyquotes;

import android.app.Activity;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import labouardy.com.dailyquotes.controller.CustomAdapter;


public class Countries extends Activity {
    private List<String> l;
    private ListView lv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_countries);

        lv=(ListView)findViewById(R.id.listViewCountries);

        l=new ArrayList<>();

        initCountries();


        CustomAdapter adapter=new CustomAdapter(this,l);
        lv.setAdapter(adapter);
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
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_countries, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
