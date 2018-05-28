package com.lgufan.daggerdemo.advanced

import android.content.SharedPreferences
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.lgufan.daggerdemo.R
import kotlinx.android.synthetic.main.activity_advanced.*
import javax.inject.Inject

class DependenciesActivity : AppCompatActivity() {

    @Inject
    lateinit var preferences: SharedPreferences


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_advanced)

        initDagger()

        preferences.edit().putString("test", "依赖").commit()

        btn_dependencies.setOnClickListener {
            Toast.makeText(this, preferences.getString("test", ""), Toast.LENGTH_SHORT).show()
        }

    }

    private fun initDagger() {

        val activityComponent = DaggerActivityComponent.builder()
                .activityModule(ActivityModule(this))
                .build()

        DaggerDependenciesComponent.builder()
                .activityComponent(activityComponent)
                .dependenciesModule(DependenciesModule())
                .build()
                .inject(this)
    }

}
