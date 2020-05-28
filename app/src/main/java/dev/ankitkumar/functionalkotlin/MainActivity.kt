package dev.ankitkumar.functionalkotlin

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
  private val trigrams by lazy {
    hashMapOf(
      "111" to getString(R.string.trigram_111),
      "110" to getString(R.string.trigram_110),
      "101" to getString(R.string.trigram_101),
      "100" to getString(R.string.trigram_100),
      "011" to getString(R.string.trigram_011),
      "010" to getString(R.string.trigram_010),
      "001" to getString(R.string.trigram_001),
      "000" to getString(R.string.trigram_000)
    )
  }

  public override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)

    line1.setOnCheckedChangeListener { _, _ -> update() }
    line2.setOnCheckedChangeListener { _, _ -> update() }
    line3.setOnCheckedChangeListener { _, _ -> update() }

    update()
  }

  private fun update() {
    name.text = "TODO"
  }
}