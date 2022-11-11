package com.yongjincompany.ya.customview

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import androidx.appcompat.widget.AppCompatButton
import androidx.constraintlayout.widget.ConstraintLayout
import com.yongjincompany.ya.R
import com.yongjincompany.ya.databinding.CustomMainButtonBinding

class CustomMainButton @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0,
) : ConstraintLayout(context, attrs, defStyleAttr) {

    private var binding: CustomMainButtonBinding

    init {
        binding = CustomMainButtonBinding.inflate(LayoutInflater.from(context), this, true)

        attrs?.run {
            val typedArr = context.obtainStyledAttributes(attrs, R.styleable.CustomMainButton)
            setMainText(typedArr.getString(R.styleable.CustomMainButton_main_text) ?: "값없음")
            if (!isInEditMode) {
                typedArr.recycle()
            }
        }
    }

    private fun setMainText(text_string: String) {
        binding.tvMain.text = text_string
    }
}