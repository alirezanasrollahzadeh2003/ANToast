import android.content.Context
import android.view.Gravity
import android.view.LayoutInflater
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.Toast
import androidx.annotation.StringRes
import androidx.core.content.ContextCompat
import com.airbnb.lottie.LottieAnimationView
import com.alirezanasrollahzadeh.alirezatoast.R

//Developed By AlirezaNasrollahzadeh

class ANToast private constructor(
    private val context: Context,
    private val message: CharSequence,
    private val duration: Int,
    private val layoutInflater: LayoutInflater,
    private val gravity: Int,
    private val xOffset: Int,
    private val yOffset: Int,
    private val textSize: Int,
    private val style: Int
) {
    fun show() {
        val layout = layoutInflater.inflate(R.layout.custom_toast, null)
        val root = layout.findViewById<LinearLayout>(R.id.root)
        val toastTextView = layout.findViewById<TextView>(R.id.toast_message)
        val animation = layout.findViewById<LottieAnimationView>(R.id.loading_page)
        toastTextView.text = message
        toastTextView.setTextSize(textSize.toFloat())
        when (style) {
            SUCCESS -> {
                root.setBackgroundResource(R.drawable.success)
                animation.setAnimation(R.raw.success)
            }

            FAILURE -> {
                root.setBackgroundResource(R.drawable.error)
                animation.setAnimation(R.raw.error)
            }

            WARNING -> {
                root.setBackgroundResource(R.drawable.warning)
                animation.setAnimation(R.raw.warning)
            }
        }
        animation.playAnimation()
        toastTextView.setTextColor(ContextCompat.getColor(context, R.color.white))
        val toast = Toast(context.applicationContext)
        toast.duration = duration
        toast.view = layout

        toast.setGravity(Gravity.FILL_HORIZONTAL or gravity, xOffset, yOffset)

        toast.show()
    }

    companion object {
        const val SUCCESS = 1
        const val WARNING = 2
        const val FAILURE = 3
        const val INFO = 4
    }

    class success(private val context: Context) {
        private var message: CharSequence = ""
        private var duration: Int = Toast.LENGTH_SHORT
        private var gravity: Int =
            Gravity.BOTTOM or Gravity.CENTER_HORIZONTAL or Gravity.FILL_HORIZONTAL
        private var xOffset: Int = 0
        private var yOffset: Int = 0
        private var textSize: Int = 16

        fun message(message: CharSequence): success {
            this.message = message
            return this
        }

        fun message(@StringRes messageResId: Int): success {
            this.message = context.getString(messageResId)
            return this
        }

        fun duration(duration: Int): success {
            this.duration = duration
            return this
        }

        fun gravity(gravity: Int): success {
            this.gravity = gravity
            return this
        }

        fun textSize(size: Int): success {
            this.textSize = size
            return this
        }

        fun xOffset(xOffset: Int): success {
            this.xOffset = xOffset
            return this
        }

        fun yOffset(yOffset: Int): success {
            this.yOffset = yOffset
            return this
        }

        fun build(): ANToast {
            val layoutInflater = LayoutInflater.from(context)
            return ANToast(
                context,
                message,
                duration,
                layoutInflater,
                gravity,
                xOffset,
                yOffset,
                textSize,
                SUCCESS
            )
        }
    }

    class failure(private val context: Context) {
        private var message: CharSequence = ""
        private var duration: Int = Toast.LENGTH_SHORT
        private var gravity: Int =
            Gravity.BOTTOM or Gravity.CENTER_HORIZONTAL or Gravity.FILL_HORIZONTAL
        private var xOffset: Int = 0
        private var yOffset: Int = 0
        private var textSize: Int = 16

        fun message(message: CharSequence): failure {
            this.message = message
            return this
        }

        fun message(@StringRes messageResId: Int): failure {
            this.message = context.getString(messageResId)
            return this
        }

        fun duration(duration: Int): failure {
            this.duration = duration
            return this
        }

        fun textSize(size: Int): failure {
            this.textSize = size
            return this
        }

        fun gravity(gravity: Int): failure {
            this.gravity = gravity
            return this
        }

        fun xOffset(xOffset: Int): failure {
            this.xOffset = xOffset
            return this
        }

        fun yOffset(yOffset: Int): failure {
            this.yOffset = yOffset
            return this
        }

        fun build(): ANToast {
            val layoutInflater = LayoutInflater.from(context)
            return ANToast(
                context,
                message,
                duration,
                layoutInflater,
                gravity,
                xOffset,
                yOffset,
                textSize,
                FAILURE
            )
        }
    }

    class warning(private val context: Context) {
        private var message: CharSequence = ""
        private var duration: Int = Toast.LENGTH_SHORT
        private var gravity: Int =
            Gravity.BOTTOM or Gravity.CENTER_HORIZONTAL or Gravity.FILL_HORIZONTAL
        private var xOffset: Int = 0
        private var yOffset: Int = 0
        private var textSize: Int = 16

        fun message(message: CharSequence): warning {
            this.message = message
            return this
        }

        fun message(@StringRes messageResId: Int): warning {
            this.message = context.getString(messageResId)
            return this
        }

        fun duration(duration: Int): warning {
            this.duration = duration
            return this
        }

        fun textSize(size: Int): warning {
            this.textSize = size
            return this
        }

        fun gravity(gravity: Int): warning {
            this.gravity = gravity
            return this
        }

        fun xOffset(xOffset: Int): warning {
            this.xOffset = xOffset
            return this
        }

        fun yOffset(yOffset: Int): warning {
            this.yOffset = yOffset
            return this
        }

        fun build(): ANToast {
            val layoutInflater = LayoutInflater.from(context)
            return ANToast(
                context,
                message,
                duration,
                layoutInflater,
                gravity,
                xOffset,
                yOffset,
                textSize,
                WARNING
            )
        }
    }
}