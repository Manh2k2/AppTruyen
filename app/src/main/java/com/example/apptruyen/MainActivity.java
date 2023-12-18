package com.example.apptruyen;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {




    TextView txtAppTruyen;
    Button btnClick;

    Button btn2;

    Button btn3;

    TextView txtNoiDung;



    int thisBtn = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtAppTruyen =(TextView) findViewById(R.id.textView4AppTruyen);
        txtNoiDung=(TextView) findViewById(R.id.textView);
        btnClick =(Button) findViewById(R.id.buttonClick);
        btn2 = (Button) findViewById(R.id.button2);
        btn3 = (Button) findViewById(R.id.button3);




        btnClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                // Nút 1 hiện
                thisBtn = 1;

                // Check
                if(btn2.getVisibility() == View.VISIBLE || btn2.getVisibility() == View.VISIBLE) {

                    // Set Text
                    txtNoiDung.setText("Chuyện cười: Con gà trống\n" +
                            "Một nông dân mua được một chú gà trống rất hăng. Gà ta đạp hết gà mái rồi tới vịt mái khiến chúng đẻ liên tục, nông dân nọ rất hả hê. Một bữa, ông ta đi làm đồng về thấy gà trống đang nằm trên bãi cỏ sau nhà, bên trên là mấy con quạ đang chờ ăn xác.\n" +
                            "\n" +
                            "Người nông dân thương xót than thở:\n" +
                            "\n" +
                            "- Ôi chú gà tội nghiệp! Sao mày vội bỏ tao mà đi sớm vậy?\n" +
                            "\n" +
                            "Gà trống mở hé mắt nói:\n" +
                            "\n" +
                            "- Lạy bố, bố đi chỗ khác dùm con kẻo lũ quạ mái bay hết mất bây giờ!");







                    // Ẩn 2 nút
                    txtAppTruyen.setVisibility(View.INVISIBLE);
                    btn2.setVisibility(View.INVISIBLE);

                    btn3.setVisibility(View.INVISIBLE);
                } else {
                    txtNoiDung.setText("");

                    // Ẩn 2 nút
                    txtAppTruyen.setVisibility(View.VISIBLE);
                    btn2.setVisibility(View.VISIBLE);

                    btn3.setVisibility(View.VISIBLE);
                }


                boolean isClick = false;


            }
        });

                btn2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v)
                    {
                        // Nút 1 hiện
                        thisBtn = 1;

                        // Check
                        if(btn3.getVisibility() == View.VISIBLE || btn3.getVisibility() == View.VISIBLE) {

                            // Set Text
                            txtNoiDung.setText("Chuyện cười : Ông nội và cháu\n" +
                                    "Ông nội và người cháu đích tôn 3 tuổi đang ngồi chơi trò bán hàng.\n" +
                                    "\n" +
                                    "- Cháu: Đây tôi đưa bác 5.000 đồng, nhưng với một điều kiện.\n" +
                                    "- Ông: Điều kiện gì cũng được.\n" +
                                    "- Cháu: Thật không?\n" +
                                    "- Ông: Thật. Bác cứ nói đi.\n" +
                                    "- Cháu: Bác phải về dạy lại con bác đi nhé, con bác hay đánh tôi lắm đấy.");



                            // Ẩn 2 nút
                            txtAppTruyen.setVisibility(View.INVISIBLE);
                            btnClick.setVisibility(View.INVISIBLE);

                            btn3.setVisibility(View.INVISIBLE);
                        } else {
                            txtNoiDung.setText("");

                            // Ẩn 2 nút
                            txtAppTruyen.setVisibility(View.VISIBLE);
                            btnClick.setVisibility(View.VISIBLE);

                            btn3.setVisibility(View.VISIBLE);
                        }


                        boolean isClick = false;

            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                // Nút 1 hiện
                thisBtn = 1;

                // Check
                if(btn2.getVisibility() == View.VISIBLE || btn2.getVisibility() == View.VISIBLE) {

                    // Set Text
                    txtNoiDung.setText("Chuyện cười : Tỉnh táo\n" +
                            "Vừa xong bữa nhậu đầu năm với bạn bè, anh chồng ngất ngư đi về nhà. Để vợ không đoán được là mình uống rượu quá mức, anh ta quyết định đi thẳng vào phòng và ngồi đọc sách, hy vọng vợ trông thấy sẽ nghĩ là mình tỉnh táo...Vài phút sau, cô vợ vào và hỏi:\n" +
                            "\n" +
                            "- Anh đang làm gì vậy?\n" +
                            "\n" +
                            "- Đọc sách.\n" +
                            "\n" +
                            "- Vợ anh ta thét lên: Đồ điên! Đóng vali lại và ngủ đi!\n" +
                            "\n" +
                            "\n");



                    // Ẩn 2 nút
                    txtAppTruyen.setVisibility(View.INVISIBLE);
                    btnClick.setVisibility(View.INVISIBLE);

                    btn2.setVisibility(View.INVISIBLE);
                } else {
                    txtNoiDung.setText("");

                    // Ẩn 2 nút
                    txtAppTruyen.setVisibility(View.VISIBLE);
                    btnClick.setVisibility(View.VISIBLE);

                    btn2.setVisibility(View.VISIBLE);
                }


                boolean isClick = false;

            }
        });










    }


}