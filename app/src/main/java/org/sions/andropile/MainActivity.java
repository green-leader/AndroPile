package org.sions.andropile;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Pile pile = new Pile();

    ListView optionList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        optionList = (ListView) findViewById(R.id.option_list);

    }

    public void optionAdd(View view) {
        EditText editText = (EditText) findViewById(R.id.optionText);

        String message = editText.getText().toString();

        pile.add(message);

        editText.setText("");

        ArrayAdapter<String> arrayAdapter =
                new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, pile.list());
        optionList.setAdapter(arrayAdapter);

    }

    public void optionChoose(View view) {
        Context context = getApplicationContext();
        CharSequence text = "Hello toast!";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, pile.getChoice(), duration);
        toast.show();

    }
}
