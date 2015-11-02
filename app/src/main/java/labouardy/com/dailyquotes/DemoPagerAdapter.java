package labouardy.com.dailyquotes;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.widget.Toast;

import java.util.Random;

/**
 * Created by mlabouardy on 23/03/15.
 */
public class DemoPagerAdapter extends FragmentPagerAdapter {
    private int pagerCount = 3;
    private Random random = new Random();
    public DemoPagerAdapter(FragmentManager fm) {
        super(fm);
    }
    @Override
    public Fragment getItem(int i) {
        LanguageFragment l=new LanguageFragment();
        RegisterFragment r=new RegisterFragment();
        End e=new End();
        if(i==0){
            return l;
        }else if(i==1){
            if(l.isEmpty())
                Toast.makeText(l.getActivity(),"E",Toast.LENGTH_SHORT).show();
            return r;
        }else{
            return e;
        }
    }
    @Override public int getCount() {
        return pagerCount;
    }
}