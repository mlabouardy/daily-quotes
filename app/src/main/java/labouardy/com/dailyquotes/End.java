package labouardy.com.dailyquotes;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.Toast;

/**
 * Created by mlabouardy on 23/03/15.
 */
public class End extends Fragment {
    private RadioGroup groupBtn;
    private Button finishBtn;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_end, container, false);


        groupBtn=(RadioGroup)v.findViewById(R.id.groupBtn);
        finishBtn=(Button)v.findViewById(R.id.finish);

        finishBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int radioButtonID = groupBtn.getCheckedRadioButtonId();
                if(radioButtonID==-1){
                    Toast.makeText(End.this.getActivity(),"erreur",Toast.LENGTH_SHORT).show();
                }else{
                    switch(radioButtonID){
                        case R.id.arabic:
                            Toast.makeText(End.this.getActivity(),"Arabic",Toast.LENGTH_SHORT).show();
                            break;
                        case R.id.french:
                            Toast.makeText(End.this.getActivity(),"French",Toast.LENGTH_SHORT).show();
                            break;
                        case R.id.english:
                            Toast.makeText(End.this.getActivity(),"English",Toast.LENGTH_SHORT).show();
                            break;
                        case R.id.spanish:
                            Toast.makeText(End.this.getActivity(),"Spanish",Toast.LENGTH_SHORT).show();
                            break;
                    }
                }
            }
        });


        return v;
    }
}

