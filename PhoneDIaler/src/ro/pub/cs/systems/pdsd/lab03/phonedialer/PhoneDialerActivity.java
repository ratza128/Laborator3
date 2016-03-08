package ro.pub.cs.systems.pdsd.lab03.phonedialer;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.Editable;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;


public class PhoneDialerActivity extends Activity {
	private Button button;
	private ImageButton apel;
	private EditText numar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phone_dialer);
        numar=(EditText)findViewById(R.id.editText1);
        
        button=(Button)findViewById(R.id.tasta0);
        button.setOnClickListener(new OnClickListener(){
    		@Override
			public void onClick(View arg0) {
    			numar.setText(numar.getText().toString()+button.getText().toString());			
			}
        });
         
        
        apel=(ImageButton)findViewById(R.id.tasta_rasp);
        apel.setOnClickListener(new OnClickListener(){
    		@Override
			public void onClick(View arg0) {
    			Intent intent = new Intent(Intent.ACTION_CALL);
    			intent.setData(Uri.parse("tel:"+numar.getText().toString()));
    			startActivity(intent);
			}
        });
        }
    


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.phone_dialer, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
    
   
    
}
