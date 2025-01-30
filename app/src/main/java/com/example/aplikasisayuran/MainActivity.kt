package com.example.aplikasisayuran

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnKentang: Button = findViewById(R.id.btnkentang)
        val btnpaprika: Button = findViewById(R.id.btnpaprika)
        val btntomat: Button = findViewById(R.id.btntomat)
        val btnwortel: Button = findViewById(R.id.btnwortel)
        val btnkubis: Button = findViewById(R.id.btnkubis)

        btnKentang.setOnClickListener {
            val intent = Intent(this, DetailActivity::class.java)
            intent.putExtra("nama", "Kentang")
            intent.putExtra("deskripsi", "Kentang adalah umbi-umbian yang kaya akan karbohidrat dan menjadi sumber energi utama di banyak negara. Kulitnya dapat berwarna cokelat, merah, atau kuning, dengan daging yang berwarna putih hingga kuning. Kentang sering digunakan dalam berbagai hidangan, seperti kentang goreng, mashed potato, atau sup. Selain itu, kentang juga mengandung vitamin C, vitamin B6, dan kalium.\n" +
                    "\n")

            intent.putExtra("idGambar", R.drawable.kentang)
            startActivity(intent)
        }
        btnpaprika.setOnClickListener {
            val intent = Intent(this, DetailActivity::class.java)
            intent.putExtra("nama", "Paprika")
            intent.putExtra("deskripsi", "Paprika adalah jenis sayuran yang memiliki bentuk menyerupai lonceng. Warnanya bervariasi, mulai dari merah, kuning, hijau, hingga oranye. Rasanya manis dengan sedikit rasa pedas, terutama pada jenis tertentu. Paprika kaya akan vitamin C, vitamin A, dan serat. Sayuran ini sering digunakan dalam salad, tumisan, atau sebagai hiasan pada masakan.\n" +
                    "\n")

            intent.putExtra("idGambar", R.drawable.paprika)
            startActivity(intent)
        }
        btntomat.setOnClickListener {
            val intent = Intent(this, DetailActivity::class.java)
            intent.putExtra("nama", "Tomat")
            intent.putExtra("deskripsi", "Tomat adalah buah yang sering dianggap sayuran dalam dunia kuliner. Memiliki bentuk bulat atau oval dengan warna merah cerah ketika matang. Rasanya segar dan sedikit asam, sehingga cocok untuk digunakan dalam berbagai masakan seperti saus, sup, atau salad. Tomat kaya akan likopen, vitamin C, dan antioksidan yang baik untuk kesehatan.\n" +
                    "\n")

            intent.putExtra("idGambar", R.drawable.tomat)
            startActivity(intent)
        }
        btnwortel.setOnClickListener {
            val intent = Intent(this, DetailActivity::class.java)
            intent.putExtra("nama", "Wortel")
            intent.putExtra("deskripsi", "Wortel adalah sayuran akar yang memiliki warna oranye cerah, meskipun ada juga varietas berwarna kuning, ungu, atau merah. Rasanya manis dengan tekstur renyah. Wortel kaya akan beta-karoten, yang diubah menjadi vitamin A dalam tubuh, penting untuk kesehatan mata dan kulit. Wortel sering dimakan mentah, direbus, atau ditambahkan ke dalam sup dan tumisan.\n" +
                    "\n")

            intent.putExtra("idGambar", R.drawable.wortel)
            startActivity(intent)
        }
        btnkubis.setOnClickListener {
            val intent = Intent(this, DetailActivity::class.java)
            intent.putExtra("nama", "Kubis")
            intent.putExtra("deskripsi", "Kubis adalah sayuran berlapis-lapis dengan daun hijau muda, hijau tua, atau ungu, tergantung varietasnya. Rasanya ringan dan renyah saat mentah, namun menjadi lembut setelah dimasak. Kubis kaya akan serat, vitamin C, vitamin K, dan senyawa sulfur yang baik untuk kesehatan pencernaan dan kekebalan tubuh. Kubis biasa digunakan dalam salad, sup, atau tumisan.\n" +
                    "\n")

            intent.putExtra("idGambar", R.drawable.kubis)
            startActivity(intent)
        }



    }
}