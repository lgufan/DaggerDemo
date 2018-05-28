package com.lgufan.daggerdemo.sub

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.lgufan.daggerdemo.R
import kotlinx.android.synthetic.main.activity_sub.*
import javax.inject.Inject

class SubActivity : AppCompatActivity() {

    @Inject
    lateinit var parent1: Parent

    @Inject
    lateinit var parent2: Parent

    @Inject
    lateinit var child: Child

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sub)

        initDagger()

        btn_sub.setOnClickListener {
            Toast.makeText(this, parent1.getParentName(), Toast.LENGTH_SHORT).show()
            Toast.makeText(this, child.getChildName(), Toast.LENGTH_SHORT).show()
        }

        btn_singleton.setOnClickListener {
            Log.d("==", "parent1=${parent1}")
            Log.d("==", "parent2=${parent2}")
        }
    }

    private fun initDagger() {
        DaggerParentComponent.builder()
                .parentModule(ParentModule())
                .build()
                .addSub(ChildModule())
                .inject(this)
    }

}
