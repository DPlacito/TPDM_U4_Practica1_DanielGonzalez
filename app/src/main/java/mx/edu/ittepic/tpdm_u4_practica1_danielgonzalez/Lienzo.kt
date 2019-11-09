package mx.edu.ittepic.tpdm_u4_practica1_danielgonzalez

import android.graphics.BitmapFactory
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.view.View

class Lienzo(p: MainActivity) : View(p) {

    val imagen = BitmapFactory.decodeResource(resources, R.drawable.moon)
    val santa = BitmapFactory.decodeResource(resources, R.drawable.santa)
    override fun onDraw(c: Canvas) {
        super.onDraw(c)
        val p = Paint()

        setBackgroundColor(Color.rgb(0, 50, 133))
        p.color = Color.WHITE
        p.textSize = 170f
        c.drawText(".", 100.0f, 100f, p)
        c.drawText(".", 200.0f, 50f, p)
        c.drawText(".", 200.0f, 200f, p)
        c.drawText(".", 300.0f, 100f, p)
        c.drawText(".", 400.0f, 50f, p)
        c.drawText(".", 400.0f, 200f, p)
        c.drawText(".", 500.0f, 100f, p)
        c.drawText(".", 600.0f, 50f, p)
        c.drawText(".", 600.0f, 200f, p)
        c.drawText(".", 700.0f, 100f, p)
        c.drawText(".", 800.0f, 50f, p)
        c.drawText(".", 800.0f, 200f, p)
        c.drawText(".", 900.0f, 100f, p)
        c.drawText(".", 1000.0f, 50f, p)
        c.drawText(".", 1000.0f, 200f, p)
        c.drawText(".", 1100.0f, 100f, p)
        c.drawText(".", 1200.0f, 50f, p)
        c.drawText(".", 1200.0f, 200f, p)
        c.drawText(".", 1300.0f, 100f, p)
        c.drawText(".", 1400.0f, 50f, p)
        c.drawText(".", 1400.0f, 200f, p)
        c.drawText(".", 1500.0f, 100f, p)
        c.drawText(".", 1600.0f, 50f, p)
        c.drawText(".", 1600.0f, 200f, p)
        c.drawText(".", 1700.0f, 100f, p)
        c.drawText(".", 1800.0f, 50f, p)
        c.drawText(".", 1800.0f, 200f, p)
        c.drawText(".", 1900.0f, 100f, p)
        c.drawText(".", 2000.0f, 50f, p)
        c.drawText(".", 2000.0f, 200f, p)
        c.drawText(".", 2000.0f, 300f, p)
        c.drawText(".", 2000.0f, 400f, p)
        c.drawText(".", 2000.0f, 500f, p)
        c.drawText(".", 1800.0f, 500f, p)
        c.drawText(".", 1500.0f, 500f, p)
        c.drawText(".", 1500.0f, 400f, p)
        c.drawText(".", 1300.0f, 500f, p)
        c.drawText(".", 1300.0f, 400f, p)
        c.drawText(".", 1300.0f, 300f, p)
        c.drawText(".", 1200.0f, 400f, p)
        c.drawText(".", 1100.0f, 400f, p)
        c.drawText(".", 1300.0f, 500f, p)

        p.color = Color.rgb(15, 183, 133)
        c.drawCircle(1900f, 1200f, 750f, p)

        p.color = Color.rgb(15, 183, 133)
        c.drawCircle(150f, 1750f, 1500f, p)

        p.color = Color.WHITE//Casa
        c.drawRect(200f, 750f, 600f, 950f, p)
        p.color = Color.RED //Puerta
        c.drawRect(260f, 800f, 350f, 950f, p)
        p.color = Color.RED //Ventana
        c.drawRect(400f, 800f, 500f, 880f, p)
        p.color = Color.RED//Chimenea
        c.drawRect(500f, 700f, 600f, 750f, p)

        p.color = Color.WHITE//Casa
        c.drawRect(500f, 450f, 800f, 650f, p)
        p.color = Color.RED //Puerta
        c.drawRect(560f, 500f, 640f, 650f, p)
        p.color = Color.RED //Ventana
        c.drawRect(680f, 500f, 770f, 580f, p)
        p.color = Color.RED //Chimenea
        c.drawRect(790f, 400f, 680f, 450f, p)

        p.color = Color.WHITE//Casa
        c.drawRect(700f, 700f, 1100f, 950f, p)
        p.color = Color.RED //Puerta
        c.drawRect(760f, 800f, 850f, 950f, p)
        p.color = Color.RED //Ventana
        c.drawRect(900f, 800f, 1070f, 880f, p)
        p.color = Color.RED//Chimenea
        c.drawRect(1010f, 630f, 1100f, 700f, p)

        p.color = Color.rgb(146,81,3)
        c.drawRect(140f, 420f, 210f, 550f, p)
        p.color = Color.GREEN
        c.drawRect(70f, 380f, 280f, 420f, p)
        p.color = Color.GREEN
        c.drawRect(100f, 340f, 250f, 380f, p)
        p.color = Color.GREEN
        c.drawRect(120f, 300f, 220f, 340f, p)
        p.color = Color.GREEN
        c.drawRect(150f, 260f, 200f, 300f, p)
        p.color = Color.GREEN
        c.drawRect(170f, 240f, 180f, 260f, p)
        p.color = Color.RED
        p.textSize = 170f
        c.drawText(".", 100.0f, 400f, p)
        p.color = Color.BLUE
        p.textSize = 170f
        c.drawText(".", 120.0f, 360f, p)
        p.color = Color.YELLOW
        p.textSize = 170f
        c.drawText(".", 140.0f, 390f, p)
        p.color = Color.RED
        p.textSize = 170f
        c.drawText(".", 150.0f, 340f, p)
        p.color = Color.BLUE
        p.textSize = 170f
        c.drawText(".", 170.0f, 400f, p)
        p.color = Color.YELLOW
        p.textSize = 170f
        c.drawText(".", 190.0f, 370f, p)

        p.color = Color.rgb(146,81,3)
        c.drawRect(1440f, 620f, 1510f, 750f, p)
        p.color = Color.GREEN
        c.drawRect(1370f, 580f, 1580f, 620f, p)
        p.color = Color.GREEN
        c.drawRect(1400f, 540f, 1550f, 580f, p)
        p.color = Color.GREEN
        c.drawRect(1420f, 500f, 1520f, 540f, p)
        p.color = Color.GREEN
        c.drawRect(1450f, 460f, 1500f, 500f, p)
        p.color = Color.GREEN
        c.drawRect(1470f, 440f, 1480f, 460f, p)
        p.color = Color.RED
        p.textSize = 170f
        c.drawText(".", 1460.0f, 600f, p)
        p.color = Color.BLUE
        p.textSize = 170f
        c.drawText(".", 1400.0f, 580f, p)
        p.color = Color.YELLOW
        p.textSize = 170f
        c.drawText(".", 1430.0f, 550f, p)
        p.color = Color.RED
        p.textSize = 170f
        c.drawText(".", 1470.0f, 530f, p)
        p.color = Color.BLUE
        p.textSize = 170f
        c.drawText(".", 1450.0f, 500f, p)
        p.color = Color.YELLOW
        p.textSize = 170f
        c.drawText(".", 1500.0f, 580f, p)

        p.color = Color.rgb(146,81,3)
        c.drawRect(1740f, 820f, 1810f, 950f, p)
        p.color = Color.GREEN
        c.drawRect(1670f, 780f, 1880f, 820f, p)
        p.color = Color.GREEN
        c.drawRect(1700f, 740f, 1850f, 780f, p)
        p.color = Color.GREEN
        c.drawRect(1720f, 700f, 1820f, 740f, p)
        p.color = Color.GREEN
        c.drawRect(1750f, 660f, 1800f, 700f, p)
        p.color = Color.GREEN
        c.drawRect(1770f, 640f, 1780f, 660f, p)
        p.color = Color.RED
        p.textSize = 180f
        c.drawText(".", 1760.0f, 800f, p)
        p.color = Color.BLUE
        p.textSize = 170f
        c.drawText(".", 1700.0f, 790f, p)
        p.color = Color.YELLOW
        p.textSize = 170f
        c.drawText(".", 1740.0f, 700f, p)
        p.color = Color.RED
        p.textSize = 170f
        c.drawText(".", 1740.0f, 730f, p)
        p.color = Color.BLUE
        p.textSize = 170f
        c.drawText(".", 1820.0f, 810f, p)
        p.color = Color.YELLOW
        p.textSize = 170f
        c.drawText(".", 1780.0f, 750f, p)

        p.color = Color.WHITE
        c.drawCircle(1800f, 500f, 80f, p)
        p.color = Color.WHITE
        c.drawCircle(1800f, 400f, 60f, p)
        p.color = Color.BLACK
        c.drawCircle(1800f, 450f, 10f, p)
        p.color = Color.BLACK
        c.drawCircle(1800f, 490f, 10f, p)
        p.color = Color.BLACK
        c.drawCircle(1780f, 380f, 10f, p)
        p.color = Color.BLACK
        c.drawCircle(1820f, 380f, 10f, p)
        p.color = Color.rgb(255,108,0)
        c.drawRect(1780f, 390f, 1820f, 410f, p)



        c.drawBitmap(imagen, 950f, 250f, p)
        c.drawBitmap(santa, 200f, 580f, p)
    }
}