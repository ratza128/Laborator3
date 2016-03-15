package ro.pub.cs.systems.pdsd.lab03.phonedialer;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.SyncStateContract.Constants;
import android.text.Editable;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;


public class PhoneDialerActivity extends Activity {
	private Button button0;
	private Button button1;
	private Button button2;
	private Button button3;
	private Button button4;
	private Button button5;
	private Button button6;
	private Button button7;
	private Button button8;
	private Button button9;
	
	private ImageButton apel;
	private EditText numar;
	private String telefon;
	private Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phone_dialer);
        numar=(EditText)findViewById(R.id.editText1);
        telefon=numar.getText().toString();
        
        button0=(Button)findViewById(R.id.tasta0);
        button0.setOnClickListener(new OnClickListener(){
    		@Override
			public void onClick(View arg0) {
    			numar.setText(numar.getText().toString()+button0.getText().toString());			
			}
        });
        button1=(Button)findViewById(R.id.tasta1);
        button1.setOnClickListener(new OnClickListener(){
    		@Override
			public void onClick(View arg0) {
    			numar.setText(numar.getText().toString()+button1.getText().toString());			
			}
        });
        button2=(Button)findViewById(R.id.tasta2);
        button2.setOnClickListener(new OnClickListener(){
    		@Override
			public void onClick(View arg0) {
    			numar.setText(numar.getText().toString()+button2.getText().toString());			
			}
        });
        button3=(Button)findViewById(R.id.tasta3);
        button3.setOnClickListener(new OnClickListener(){
    		@Override
			public void onClick(View arg0) {
    			numar.setText(numar.getText().toString()+button3.getText().toString());			
			}
        });
         
        button4=(Button)findViewById(R.id.tasta4);
        button4.setOnClickListener(new OnClickListener(){
    		@Override
			public void onClick(View arg0) {
    			numar.setText(numar.getText().toString()+button4.getText().toString());			
			}
        });
        button5=(Button)findViewById(R.id.tasta5);
        button5.setOnClickListener(new OnClickListener(){
    		@Override
			public void onClick(View arg0) {
    			numar.setText(numar.getText().toString()+button5.getText().toString());			
			}
        });
        button6=(Button)findViewById(R.id.tasta6);
        button6.setOnClickListener(new OnClickListener(){
    		@Override
			public void onClick(View arg0) {
    			numar.setText(numar.getText().toString()+button6.getText().toString());			
			}
        });button7=(Button)findViewById(R.id.tasta7);
        button7.setOnClickListener(new OnClickListener(){
    		@Override
			public void onClick(View arg0) {
    			numar.setText(numar.getText().toString()+button7.getText().toString());			
			}
        });button8=(Button)findViewById(R.id.tasta8);
        button8.setOnClickListener(new OnClickListener(){
    		@Override
			public void onClick(View arg0) {
    			numar.setText(numar.getText().toString()+button8.getText().toString());			
			}
        });button9=(Button)findViewById(R.id.tasta9);
        button9.setOnClickListener(new OnClickListener(){
    		@Override
			public void onClick(View arg0) {
    			numar.setText(numar.getText().toString()+button9.getText().toString());			
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
        
        Button manager=(Button)findViewById(R.id.button_contactmanager);
        manager.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				if (telefon.length() > 0) {
					  intent = new Intent("ro.pub.cs.systems.pdsd.lab04.contactsmanager.intent.action.ContactsManagerActivity");
					  intent.putExtra("ro.pub.cs.systems.pdsd.lab04.contactsmanager.PHONE_NUMBER_KEY", telefon);
					  startActivityForResult(intent, 21);
					} else {
					  Toast.makeText(getApplication(), getResources().getString(R.string.phone_error), Toast.LENGTH_LONG).show();
					}
				
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
