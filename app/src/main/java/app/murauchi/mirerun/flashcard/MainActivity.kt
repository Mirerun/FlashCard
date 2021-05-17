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
        val apple = Word(R.drawable.apple, "りんご")
        val banana = Word(R.drawable.banana3, "バナナ")
        val orange = Word(R.drawable.orange2, "オレンジ")
        val strawberry = Word(R.drawable.strawberry2, "いちご")

        //作ったメソッドを実行
        addWord(apple)
        addWord(banana)
        addWord(orange)
        addWord(strawberry)
    }

    private fun addWord(word: Word) {
        val nameTextView = TextView(this)
        nameTextView.text = word.name

        val layout = LinearLayout(this)
        layout.orientation = LinearLayout.HORIZONTAL

        val imageView = ImageView(this)
        imageView.setImageResource(word.resId)

        layout.addView(imageView)
        layout.addView(nameTextView)

        container.addView(layout)

    }
}