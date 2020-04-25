package ntu.edu.vn.sw_nguyenthikimngoc_58131350;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText edtTen;
    EditText edtNgaySinh;
    RadioGroup rdgGioiTinh;
    RadioButton radioButton;
    CheckBox checkBoxPhim;
    CheckBox checkBoxNha;
    CheckBox checkBoxCaPhe;
    CheckBox checkBoxNhac;
    CheckBox checkBoxBep;
    EditText edtKhac;
    Button btnXacNhan;
    String soThich;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addContent();
        addEvent();
    }

    private void addContent(){
        edtTen = findViewById(R.id.edtTen);
        edtNgaySinh = findViewById(R.id.edtNgaySinh);
        edtKhac = findViewById(R.id.edtKhac);
        rdgGioiTinh = findViewById(R.id.rdgGioiTinh);
        checkBoxPhim = findViewById(R.id.checkBoxPhim);
        checkBoxNhac = findViewById(R.id.checkBoxNhac);
        checkBoxCaPhe = findViewById(R.id.checkBoxCaPhe);
        checkBoxNha = findViewById(R.id.checkBoxNha);
        checkBoxBep = findViewById(R.id.checkBoxBep);
        btnXacNhan = findViewById(R.id.btnXacNhan);
        soThich = "";
    }

    private void addEvent(){
        btnXacNhan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hienThi();
            }
        });
    }

    private void hienThi(){
        if(checkBoxPhim.isChecked()){
            soThich+=checkBoxPhim.getText().toString();
            soThich+="; ";
        }

        if(checkBoxNhac.isChecked()){
            soThich+=checkBoxNhac.getText().toString();
            soThich+="; ";
        }

        if(checkBoxCaPhe.isChecked()){
            soThich+=checkBoxCaPhe.getText().toString();
            soThich+="; ";
        }

        if(checkBoxNha.isChecked()){
            soThich+=checkBoxNha.getText().toString();
            soThich+="; ";
        }

        if(checkBoxBep.isChecked()){
            soThich+=checkBoxBep.getText().toString();
            soThich+="; ";
        }

        if(edtKhac.getText().toString() != null){
            soThich += edtKhac.getText().toString();
        }

        int radio = rdgGioiTinh.getCheckedRadioButtonId();
        radioButton = findViewById(radio);

        Toast.makeText(this, edtTen.getText().toString()+"\nNgày sinh: "+edtNgaySinh.getText().toString()+"\nGiới tính: "+
                radioButton.getText().toString()+"\nSở thích: "+soThich.trim(), Toast.LENGTH_SHORT).show();
        soThich="";

    }

}