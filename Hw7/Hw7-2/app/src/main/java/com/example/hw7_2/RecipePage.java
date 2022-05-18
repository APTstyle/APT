package com.example.hw7_2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.widget.Toolbar;

public class RecipePage extends Activity {

    public static int index = 0;

    int[] images = {R.drawable.first, R.drawable.second};

    String[] descriptions = {
            "義大利麵約125g\n" +
                    "培根4大片\n" +
                    "蘑菇7~10朵或罐頭\n" +
                    "洋蔥半顆\n" +
                    "蒜頭2瓣\n" +
                    "白醬:"+"蛋黃1顆\n" +
                    "鮮奶1大碗（碗公）\n" +
                    "麵粉1大匙\n" +
                    "調味:" +
                    "黑胡椒粉適量\n" +
                    "義大利香料適量\n" +
                    "洋香菜葉適量\n" +
                    "鹽適量\n" +
                    "帕馬森起司粉適量" +
                    "1. 蒜頭切末，蘑菇、洋蔥切片，培根切成每片約2公分。\n" +
                    "\n" +
                    "2. 燒一鍋水煮滾，加一小匙鹽，義大利麵大概抓1/4包的份量（以一包500g算，1/4包約是兩人份）以傘狀下鍋。\n" +
                    "喜歡有點嚼勁煮12~15分鐘，喜歡軟爛口感可以煮近20分鐘。\n" +
                    "\n" +
                    "3. 煮好先撈起，可以加點橄欖油拌一下才不容易黏一團，或直接先裝盤。\n" +
                    "\n" +
                    "4. 鍋子不用加油，直接把培根放上去鋪滿鍋面，小火煎，待培根出油加蒜末一起炒香。\n" +
                    "\n" +
                    "5. 加洋蔥炒至半透明，加蘑菇一起炒熟。\n" +
                    "\n" +
                    "6. 鮮奶和蛋黃一起拌勻，加入鍋內稍煮一分鐘。\n"+
                    "\n" +
                    "7. 一分鐘後轉中小火，加入一大匙麵粉拌勻，然後慢慢攪拌，醬汁會越來越濃稠（不要煮到滾），煮到喜歡的稠度時關火，加入鹽、黑胡椒、義大利香料、洋香菜調味。\n"+
                    "\n" +
                    "8. 把義大利麵裝盤，淋上醬料，灑上帕馬森起司粉，再灑一點義大利香料和洋香菜裝飾就完成囉~",
            "●豬絞肉●蕃茄4顆●洋蔥1顆●蒜末●香菇●高湯or水\n" +
                    "調味料：蕃茄醬、黑胡椒粉、鹽、帕瑪森起司粉\n" +
                    "1. 蕃茄、洋蔥切丁；蒜頭切末備用\n" +
                    "2. 熱鍋後，放入適量的奶油並將蒜頭爆香，接著放入洋蔥丁炒香\n" +
                    "3. 放入絞肉，拌炒至熟，接著放入蕃茄丁炒軟並拌炒至出水，以小火煮滾\n" +
                    "4. 蕃茄丁出水化成水狀時，加入蕃茄醬，攪拌成稠狀！\n" +
                    "5. 倒入少許高湯，大火滾後轉小火，放入月桂葉(買不到可省略)持續燉1小時\n" +
                    "6. 撈出月桂葉，放入黑胡椒粉、鹽調味，攪拌均勻，紅醬就完成囉！"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_first);
        ImageView imageview = findViewById(R.id.imageView2);
        imageview.setImageResource(images[index]);
        TextView textView = findViewById(R.id.textView4);
        textView.setText(descriptions[index]);

        Toolbar toolbar = findViewById(R.id.toolbar);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
            }
        });
    }

}
