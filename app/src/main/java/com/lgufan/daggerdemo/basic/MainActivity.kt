package com.lgufan.daggerdemo.basic

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.google.gson.Gson
import com.lgufan.daggerdemo.R
import com.lgufan.daggerdemo.advanced.DependenciesActivity
import com.lgufan.daggerdemo.sub.SubActivity
import kotlinx.android.synthetic.main.activity_main.*
import javax.inject.Inject
import javax.inject.Named

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var person: Person

    @Inject
    lateinit var job: IJob

    @Inject
    lateinit var gson: Gson

    @field:[Named("Android")]
    @Inject
    lateinit var android:IJob

    @field:[Named("iOS")]
    @Inject
    lateinit var iOS:IJob

    @field:[AndroidQualifier]
    @Inject
    lateinit var android2:IJob

    @field:[iOSQualifier]
    @Inject
    lateinit var iOS2:IJob

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initDagger()

        person.name = "测试"

        btn_inject.setOnClickListener {

            person.test(this)
        }

        btn_module.setOnClickListener {
            job.work(this)
            val json = gson.toJson(person)
            Log.d("==", json)
        }

        btn_main_dependencies.setOnClickListener {
            val intent = Intent(this,DependenciesActivity::class.java)
            startActivity(intent)
        }

        btn_main_subcomponent.setOnClickListener {
            val intent = Intent(this,SubActivity::class.java)
            startActivity(intent)
        }

        btn_name.setOnClickListener {
            android.work(this)
            iOS.work(this)
        }

        btn_qualifier.setOnClickListener {
            android2.work(this)
            iOS2.work(this)
        }
    }

    private fun initDagger() {

        DaggerMainComponent.builder()
                .mainModule(MainModule())
                .build()
                .inject(this)
    }
}
