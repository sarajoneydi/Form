package sematec.form;

import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.view.menu.ActionMenuItemView;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
EditText name;
    EditText family;
    Button save;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name=(EditText)findViewById(R.id.name);
        family=(EditText)findViewById(R.id.family);
        save=(Button)findViewById(R.id.save);
        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               setShared("name",name.getText().toString());
               setShared("family",name.getText().toString());
                Toast.makeText(Main2Activity.this, "data have been ...");

            }
        });
    }

    void setShared(String key, String value){PreferenceManager.getDefaultSharedPreferences(this).edit().putString(key,value).commit
    }
    String getShared(String key,String default_value){return PreferenceManager.getDefault}
}
