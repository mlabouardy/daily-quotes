package labouardy.com.dailyquotes;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.andreabaccega.widget.FormEditText;

/**
 * Created by mlabouardy on 23/03/15.
 */
public class LanguageFragment extends Fragment {
    public FormEditText name;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_language, container, false);

        name=(FormEditText)v.findViewById(R.id.txtName);
        return v;
    }

    public boolean isEmpty(){
        return name.getText().toString().length()==0;
    };
}

