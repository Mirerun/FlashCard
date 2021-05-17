package app.murauchi.mirerun.flashcard

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Word型の変数を宣言
        //val apple : Word
        //インスタンスを生成(↑にバリューを入れる)
        val apple = Word(R.drawable.apple,"りんご")
        val banana = Word(R.drawable.banana3,"バナナ")
        val orange = Word(R.drawable.orange2,"オレンジ")
        val strawberry = Word(R.drawable.strawberry2,"いちご")

        //りんご
        //TextViewインスタンスを生成、単語の名前を表示するため
        val nameTextView = TextView(applicationContext)
        //TextViewクラスのtextプロパティに代入する
        nameTextView.text = apple.name //nameTextView.text = ”りんご"と同じ

        //containerにTextViewを追加
        //container.addView(nameTextView)
        //LinearLayoutインスタンスを生成
        val layout = LinearLayout(this.applicationContext)
        //LinearLayoutの方向を縦向きのHORIZONTALに設定
        layout.orientation = LinearLayout.HORIZONTAL

        //ImageViewのインスタンス生成
        val imageView = ImageView(this)
        //appleが持っているリソースIDを使って画像をImageViewに設定
        imageView.setImageResource(apple.resId)
        //imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE)

        //小さな枠にImageViewとTextViewを入れる
        layout.addView(imageView)
        layout.addView(nameTextView)
        //全体の枠に小さな枠を入れる=container
        container.addView(layout)

        //バナナ
        val nameTextView2 = TextView(this)
        nameTextView2.text = banana.name
        val layout2 = LinearLayout(this)
        layout2.orientation = LinearLayout.HORIZONTAL
        val imageView2 = ImageView(this)
        imageView2.setImageResource(banana.resId)
        //imageView2.setScaleType(ImageView.ScaleType.CENTER_INSIDE)
        layout2.addView(imageView2)
        layout2.addView(nameTextView2)
        container.addView(layout2)
        //オレンジ
        val nameTextView3 = TextView(this)
        nameTextView3.text = orange.name
        val layout3 = LinearLayout(this)
        layout3.orientation = LinearLayout.HORIZONTAL
        val imageView3 = ImageView(this)
        imageView3.setImageResource(orange.resId)
        //imageView3.setScaleType(ImageView.ScaleType.CENTER_INSIDE)
        layout3.addView(imageView3)
        layout3.addView(nameTextView3)
        container.addView(layout3)
        //いちご
        val nameTextView4 = TextView(this)
        nameTextView4.text = strawberry.name
        val layout4 = LinearLayout(this)
        layout4.orientation = LinearLayout.HORIZONTAL
        val imageView4 = ImageView(this)
        imageView4.setImageResource(strawberry.resId)
        //imageView4.setScaleType(ImageView.ScaleType.CENTER_INSIDE)
        layout4.addView(imageView4)
        layout4.addView(nameTextView4)
        container.addView(layout4)
    }
}