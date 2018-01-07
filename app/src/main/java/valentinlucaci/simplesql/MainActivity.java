package valentinlucaci.simplesql;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText editTextName,editTextParola;
    Button buttonSave;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editTextName = findViewById(R.id.editTextName);
        editTextParola = findViewById(R.id.editTextPass);
        buttonSave = findViewById(R.id.button);
    }

    public void saveData(View view) {
        Toast.makeText(this, "db creat", Toast.LENGTH_SHORT).show();
    }
}
