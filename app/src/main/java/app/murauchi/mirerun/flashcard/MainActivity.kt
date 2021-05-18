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

        //それぞれの単語を作る
        val apple = CustomWord(R.drawable.apple, "りんご","apple")
        val banana = CustomWord(R.drawable.banana3, "バナナ","banana")
        val orange = CustomWord(R.drawable.orange2, "オレンジ","orange")
        val strawberry = CustomWord(R.drawable.strawberry2, "いちご","strawberry")

        //作ったメソッドを実行
        val fruits: Array<CustomWord> = arrayOf(apple,banana,orange,strawberry)
        val size: Int = fruits.size
        for (i in 0.. (size-1)) {
            addWord(fruits[i])
        }
    }

    private fun addWord(word: CustomWord) {
        val nameTextView1 = TextView(this)
        nameTextView1.text = word.jpName

        val nameTextView2 = TextView(this)
        nameTextView2.text = word.engName

        val layout = LinearLayout(this)
        layout.orientation = LinearLayout.HORIZONTAL

        val imageView = ImageView(this)
        imageView.setImageResource(word.resId)

        layout.addView(imageView)
        layout.addView(nameTextView1)
        layout.addView(nameTextView2)

        container.addView(layout)

    }
}