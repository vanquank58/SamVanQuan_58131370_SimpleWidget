package vn.edu.ntu.vanquan.SamVanQuan_58131370_SimpleWidget;

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

    EditText edtName,edtDay,edtSoThich;
    Button btok;
    String bosung;
    RadioGroup radioGroup;
    CheckBox ckonha,ckNauAn,ckcf,ckXp,ckNgheNhac;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addView();
        addEven();
    }

    private void addView()
    {
        edtName = findViewById(R.id.edtname);
        edtDay = findViewById(R.id.edtDay);
        edtSoThich = findViewById(R.id.edtSoThich);
        btok = findViewById(R.id.btok);
        ckcf = findViewById(R.id.ckCf);
        ckXp = findViewById(R.id.ckXp);
        ckNauAn = findViewById(R.id.ckNauAn);
        ckonha = findViewById(R.id.ckonha);
        ckNgheNhac = findViewById(R.id.ckNgheNhac);
        radioGroup = findViewById(R.id.rdGioiTinh);
    }

    private void addEven()
    {
        btok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showInfor();
            }
        });
    }

    private void showInfor() {
        String ThongTin = "";
        String ten = edtName.getText()+"\n";
        String ngaysinh = edtDay.getText()+"\n";
        String sothichkhac = edtSoThich.getText()+"\n";
        RadioGroup radGR = (RadioGroup)findViewById(R.id.rdGioiTinh);
        int id = radGR.getCheckedRadioButtonId();
        RadioButton radGioiTinh = (RadioButton)findViewById(id);
        String gioiTinh = radGioiTinh.getText()+"";
        ThongTin+="Tên:"+ten+"\n";
        ThongTin+="Ngày sinh:"+ngaysinh+"\n";
        ThongTin+="Giới Tính:"+gioiTinh+"\n";
        String sothich = "";
        if(ckcf.isChecked())sothich+=ckcf.getText()+",";
        if(ckXp.isChecked())sothich+=ckXp.getText()+",";
        if(ckonha.isChecked())sothich+=ckonha.getText()+",";
        if(ckNauAn.isChecked())sothich+=ckNauAn.getText()+",";
        if(ckNgheNhac.isChecked())sothich+=ckNgheNhac.getText()+"\n";
        ThongTin+="Sở thích:"+sothich+"\n";
        ThongTin+="Sở Thích khác:"+sothichkhac+"\n";

        Toast.makeText(MainActivity.this,ThongTin,Toast.LENGTH_LONG).show();
    }


}
