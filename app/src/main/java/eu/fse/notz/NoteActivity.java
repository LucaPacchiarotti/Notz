package eu.fse.notz;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class NoteActivity extends AppCompatActivity {

    EditText titleEt,descriptionEt;

    Button editConfirmBtn;
    Button editDeleteBtn;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_note);
        titleEt = (EditText) findViewById(R.id.edit_title);
        descriptionEt = (EditText) findViewById(R.id.edit_description);
        editConfirmBtn = (Button)findViewById(R.id.edit_confirm);
        editDeleteBtn= (Button)findViewById(R.id.edit_delete);

        //get values from launching intent
        final Intent intent = getIntent();
        final String title = intent.getStringExtra("title");
        String description = intent.getStringExtra("description");

        // set values to Edittexts

        titleEt.setText(title);
        descriptionEt.setText(description);

        editConfirmBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String editedTitle = titleEt.getText().toString();
                String editedDescription = descriptionEt.getText().toString();


                int position = intent.getIntExtra("position",-1);

                Intent returnIntent = new Intent();
                returnIntent.putExtra("title",editedTitle);
                returnIntent.putExtra("description",editedDescription);
                returnIntent.putExtra("position",position);
                setResult(Activity.RESULT_OK,returnIntent);


                finish();
            }
        });
        editDeleteBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int position = intent.getIntExtra("position", -1);

                Intent returnIntent = new Intent();

                returnIntent.putExtra("position", position);
                setResult(MainActivity.RERSULT_DELETE, returnIntent);

                finish();

            }
        });

    }
}