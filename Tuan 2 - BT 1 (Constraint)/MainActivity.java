package trongthai110.thaicalculator2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    //khai báo sẵn các đối tượng sẽ làm việc
    EditText editSoA, editSoB;
    TextView textViewKetQua;
    Button nutCong, nutTru, nutNhan, nutChia;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TimWidget();
    }

    void TimWidget(){
        editSoA= (EditText)findViewById(R.id.edSoA);
        editSoB= (EditText)findViewById(R.id.edSoB);
        textViewKetQua= (TextView)findViewById(R.id.tvKetQua);
        nutCong= (Button) findViewById(R.id.btnCong);
        nutTru= (Button) findViewById(R.id.btnTru);
        nutNhan= (Button) findViewById(R.id.btnNhan);
        nutChia= (Button) findViewById(R.id.btnChia);
    }
    //hàm xử lý
    public void XuLyCong(View v){
        // Lấy dữ liệu
        String sA = editSoA.getText().toString();
        String sB = editSoB.getText().toString();
        //Chuyển sang kiểu số
        int a = Integer.parseInt(sA);
        int b = Integer.parseInt(sB);
        //Tính tổng
        int tong =a+b;
        //Chuyển tổng thành chuỗi
        String chuoiTong = String.valueOf(tong);
        // Xuất kết quả
        textViewKetQua.setText("=" + chuoiTong);
    }

    public void XuLyTru(View v){
        // Lấy dữ liệu
        String sA = editSoA.getText().toString();
        String sB = editSoB.getText().toString();
        //Chuyển sang kiểu số
        int a = Integer.parseInt(sA);
        int b = Integer.parseInt(sB);
        //Tính Hiệu
        int hieu =a-b;
        //Chuyển Hiệu thành chuỗi
        String chuoiHieu = String.valueOf(hieu);
        // Xuất kết quả
        textViewKetQua.setText("=" + chuoiHieu);
    }

    public void XuLyNhan(View v){
        // Lấy dữ liệu
        String sA = editSoA.getText().toString();
        String sB = editSoB.getText().toString();
        //Chuyển sang kiểu số
        int a = Integer.parseInt(sA);
        int b = Integer.parseInt(sB);
        //Tính tích
        int tich =a*b;
        //Chuyển tích thành chuỗi
        String chuoiTich = String.valueOf(tich);
        // Xuất kết quả
        textViewKetQua.setText("=" + chuoiTich);
    }

    public void XuLyChia(View v){
        // Lấy dữ liệu
        String sA = editSoA.getText().toString();
        String sB = editSoB.getText().toString();
        //Chuyển sang kiểu số
        float a = Integer.parseInt(sA);
        float b = Integer.parseInt(sB);
        //Tính thương
        if (b==0){
            textViewKetQua.setText("Số bị chia phải khác 0 á !!!");}
        else
        {
            float thuong =a/b;
            //Chuyển thương thành chuỗi
            String chuoiThuong = String.valueOf(thuong);
            // Xuất kết quả
            textViewKetQua.setText("=" + chuoiThuong);
        }
    }
}