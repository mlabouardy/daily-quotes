package labouardy.com.dailyquotes;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;

import com.andreabaccega.widget.FormEditText;

import labouardy.com.dailyquotes.util.AlertDialogManager;
import labouardy.com.dailyquotes.util.ConnectionDetector;
import static labouardy.com.dailyquotes.util.CommonUtilities.*;

public class RegisterActivity extends ActionBarActivity {
    // alert dialog manager
    private AlertDialogManager alert = new AlertDialogManager();

    // Internet detector
    private ConnectionDetector cd;

    // UI elements
    private FormEditText txtName;
    private FormEditText txtEmail;

    // Register button
    private Button btnRegister;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        cd = new ConnectionDetector(getApplicationContext());

        // Check if Internet present
        if (!cd.isConnectingToInternet()) {
            // Internet Connection is not present
            alert.showAlertDialog(RegisterActivity.this,
                    "Internet Connection Error",
                    "Please connect to working Internet connection", false);
            // stop executing code by return
            return;
        }

        // Check if GCM configuration is set
        if (SERVER_URL == null || SENDER_ID == null || SERVER_URL.length() == 0 || SENDER_ID.length() == 0) {
            // GCM sernder id / server url is missing
            alert.showAlertDialog(RegisterActivity.this, "Configuration Error!",
                    "Please set your Server URL and GCM Sender ID", false);
            // stop executing code by return
            return;
        }

        txtName = (FormEditText) findViewById(R.id.txtName);
        txtEmail = (FormEditText) findViewById(R.id.txtEmail);
        btnRegister = (Button) findViewById(R.id.btnRegister);

        /*
         * Click event on Register button
         * */
        btnRegister.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // Read EditText dat
                String name = txtName.getText().toString();
                String email = txtEmail.getText().toString();

                FormEditText[] fields={txtName,txtEmail};
                boolean allValid = true;
                for (FormEditText field: fields) {
                    allValid = field.testValidity() && allValid;
                }
                if (allValid) {
                    Intent i = new Intent(getApplicationContext(), MainActivity.class);
                    // Registering user on our server
                    // Sending registraiton details to MainActivity
                    i.putExtra("name", name);
                    i.putExtra("email", email);
                    startActivity(i);
                    finish();
                } else {
                    // user doen't filled that data
                    // ask him to fill the form
                   // alert.showAlertDialog(RegisterActivity.this, "Registration Error!", "Please enter your details", false);
                }

            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_register, menu);
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
