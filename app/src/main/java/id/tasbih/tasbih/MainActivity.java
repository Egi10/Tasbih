package id.tasbih.tasbih;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    LinearLayout llTambah;
    Button btnReset;
    TextView tvHasil;
    int hasil = 0;
    int tambah = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        llTambah = findViewById(R.id.llTambah);
        btnReset = findViewById(R.id.btnReset);
        tvHasil = findViewById(R.id.tvHasil);

        llTambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hasil = Integer.parseInt(String.valueOf(tvHasil.getText()));
                tambah = hasil + 1;

                tvHasil.setText(String.valueOf(tambah));
            }
        });

        btnReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvHasil.setText(String.valueOf(0));
            }
        });
    }
}
