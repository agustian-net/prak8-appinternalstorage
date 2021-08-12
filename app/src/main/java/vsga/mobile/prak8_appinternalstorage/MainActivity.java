package vsga.mobile.prak8_appinternalstorage;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Button buttonInternal, buttonExternal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonInternal = findViewById(R.id.btnInternal);
        buttonExternal = findViewById(R.id.btnExternal);

        buttonInternal.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, InternalActivity.class);
            startActivity(intent);
        });

        buttonExternal.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, ExternalActivity.class);
            startActivity(intent);
        });
    }
}
