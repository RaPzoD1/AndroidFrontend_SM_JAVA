package com.informacion.rapzodapp.asuguacapp;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.nfc.Tag;
import android.support.v4.graphics.drawable.RoundedBitmapDrawable;
import android.support.v4.graphics.drawable.RoundedBitmapDrawableFactory;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.AppCompatButton;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;
import android.support.v7.app.AppCompatActivity;

import butterknife.BindView;
import butterknife.ButterKnife;


public class SignupActivity extends AppCompatActivity {
    private static final String TAG = "SignupActivity";


    private  EditText nameText;
    private  EditText lastnameText;
    private EditText careerText;
    private  EditText addressText;
    private EditText EmailText;
    private  EditText mobileText;
    private  EditText passwordText;
    private  EditText reEnterPasswordText;
    private AppCompatButton signupButton;
    private TextView linklogin;
    private Spinner facultadesSp;
    private Spinner EscuelasSp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        ButterKnife.bind(this);

        signupButton = (AppCompatButton)findViewById(R.id.btn_signup);
        signupButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                signup();
            }
        });

        linklogin = (TextView)findViewById(R.id.link_login);
        facultadesSp =(Spinner)findViewById(R.id.Facultad_sp);
        EscuelasSp = (Spinner)findViewById(R.id.Escuelas_sp);

        String[] FacultadesStr =getResources().getStringArray(R.array.Facultades);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,R.layout.spinner_item,R.id.text, FacultadesStr);
        facultadesSp.setAdapter(adapter);

        String[] defaultEscuelas =getResources().getStringArray(R.array.defaultEscuelas);
        ArrayAdapter<String> adapter1=new ArrayAdapter<String>(this,R.layout.spinner_item,R.id.text, defaultEscuelas);
        EscuelasSp.setAdapter(adapter1);

        facultadesSp.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

                if (i==1){
                    String[] defaultEscuelas =getResources().getStringArray(R.array.CEAC);
                    ArrayAdapter<String> adapter1=new ArrayAdapter<String>(SignupActivity.this,R.layout.spinner_item,R.id.text, defaultEscuelas);
                    EscuelasSp.setAdapter(adapter1);
                }
                if (i==2){
                    String[] defaultEscuelas =getResources().getStringArray(R.array.CH);
                    ArrayAdapter<String> adapter1=new ArrayAdapter<String>(SignupActivity.this,R.layout.spinner_item,R.id.text, defaultEscuelas);
                    EscuelasSp.setAdapter(adapter1);
                }
                if (i==3){
                    String[] defaultEscuelas =getResources().getStringArray(R.array.CS);
                    ArrayAdapter<String> adapter1=new ArrayAdapter<String>(SignupActivity.this,R.layout.spinner_item,R.id.text, defaultEscuelas);
                    EscuelasSp.setAdapter(adapter1);
                }
                if (i==4){
                    String[] defaultEscuelas =getResources().getStringArray(R.array.DCP);
                    ArrayAdapter<String> adapter1=new ArrayAdapter<String>(SignupActivity.this,R.layout.spinner_item,R.id.text, defaultEscuelas);
                    EscuelasSp.setAdapter(adapter1);
                }
                if (i==5){
                    String[] defaultEscuelas =getResources().getStringArray(R.array.IA);
                    ArrayAdapter<String> adapter1=new ArrayAdapter<String>(SignupActivity.this,R.layout.spinner_item,R.id.text, defaultEscuelas);
                    EscuelasSp.setAdapter(adapter1);
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        linklogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Finish the registration screen and return to the Login activity
                Intent intent = new Intent(getApplicationContext(),LoginActivity.class);
                startActivity(intent);
                finish();
                overridePendingTransition(R.anim.push_left_in, R.anim.push_left_out);
            }
        });
        //Imagen Circle
        ImageView imageView =(ImageView)findViewById(R.id.logosignup);
        Bitmap bitmap = BitmapFactory.decodeResource(getResources(),R.drawable.logoapp);
        RoundedBitmapDrawable roundedBitmapDrawable = RoundedBitmapDrawableFactory.create(getResources(),bitmap);
        roundedBitmapDrawable.setCircular(true);
        imageView.setImageDrawable(roundedBitmapDrawable);

    }
    public void signup() {
        Log.d(TAG, "Signup");

        if (!validate()) {
            onSignupFailed();
            return;
        }

       signupButton.setEnabled(false);

        final ProgressDialog progressDialog = new ProgressDialog(SignupActivity.this,
                R.style.Theme_AppCompat_Light_DarkActionBar);
        progressDialog.setIndeterminate(true);
        progressDialog.setMessage("Registrando cuenta...");
        progressDialog.show();

        nameText=(EditText)findViewById(R.id.input_name);
        String name = nameText.getText().toString();
        lastnameText=(EditText)findViewById(R.id.input_lastname);
        String lastname = lastnameText.getText().toString();

        addressText=(EditText)findViewById(R.id.input_address);
        String address = addressText.getText().toString();
        EmailText=(EditText)findViewById(R.id.input_email);
        String email = EmailText.getText().toString();
        mobileText=(EditText)findViewById(R.id.input_mobile);
        String mobile = mobileText.getText().toString();
        passwordText=(EditText)findViewById(R.id.input_password);
        String password = passwordText.getText().toString();
        reEnterPasswordText=(EditText)findViewById(R.id.input_reEnterPassword);
        String reEnterPassword = reEnterPasswordText.getText().toString();

        // TODO: Implement your own signup logic here.

        new android.os.Handler().postDelayed(
                new Runnable() {
                    public void run() {
                        // On complete call either onSignupSuccess or onSignupFailed
                        // depending on success
                        onSignupSuccess();
                        // onSignupFailed();
                        progressDialog.dismiss();
                    }
                }, 3000);
    }
    public void onSignupSuccess() {
        signupButton.setEnabled(true);
        setResult(RESULT_OK, null);
        finish();
    }
    public void onSignupFailed() {
        Toast.makeText(getBaseContext(), "Login failed", Toast.LENGTH_LONG).show();
        signupButton.setEnabled(true);
    }
    public boolean validate() {
        boolean valid = true;

        nameText=(EditText)findViewById(R.id.input_name);
        String name = nameText.getText().toString();
        lastnameText=(EditText)findViewById(R.id.input_lastname);
        String lastname = lastnameText.getText().toString();

        addressText=(EditText)findViewById(R.id.input_address);
        String address = addressText.getText().toString();
        EmailText=(EditText)findViewById(R.id.input_email);
        String email = EmailText.getText().toString();
        mobileText=(EditText)findViewById(R.id.input_mobile);
        String mobile = mobileText.getText().toString();
        passwordText=(EditText)findViewById(R.id.input_password);
        String password = passwordText.getText().toString();
        reEnterPasswordText=(EditText)findViewById(R.id.input_reEnterPassword);
        String reEnterPassword = reEnterPasswordText.getText().toString();

        if (name.isEmpty() || name.length() < 3) {
            nameText.setError("Minimo 3 caracteres");
            valid = false;
        } else {
            nameText.setError(null);
        }
        if (lastname.isEmpty() || lastname.length() < 3) {
            lastnameText.setError("Campo obligatorio");
            valid = false;
        } else {
            lastnameText.setError(null);
        }
//        if (career.isEmpty() || career.length() < 3) {
//            careerText.setError("at least 3 characters");
//            valid = false;
//        } else {
//            careerText.setError(null);
//        }

        if (address.isEmpty()) {
            addressText.setError("Campo obligatorio");
            valid = false;
        } else {
            addressText.setError(null);
        }

        if (email.isEmpty() || !android.util.Patterns.EMAIL_ADDRESS.matcher(email).matches()) {
            EmailText.setError("Correo electronico no valido");
            valid = false;
        } else {
            EmailText.setError(null);
        }

        if (mobile.isEmpty() || mobile.length()!=9) {
            mobileText.setError("Telefono celular no valido");
            valid = false;
        } else {
            mobileText.setError(null);
        }

        if (password.isEmpty() || password.length() < 8 || password.length() > 12) {
            passwordText.setError("Contraseña demasiado corta, entre 8 a 12 caracteres alfanumericos");
            valid = false;
        } else {
            passwordText.setError(null);
        }

        if (reEnterPassword.isEmpty() || reEnterPassword.length() < 4 || reEnterPassword.length() > 10 || !(reEnterPassword.equals(password))) {
            reEnterPasswordText.setError("Contraseñas no concuerdan");
            valid = false;
        } else {
            reEnterPasswordText.setError(null);
        }

        return valid;
    }
}
