package com.example.f1data

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var FormulaOneAdapter : FormulaOneAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initRecyclerView()
        addDataSource()

    }

    private fun addDataSource() {
        val dataSource = ExampleDataSource.createDataSet()
        this.FormulaOneAdapter.setDataSet(dataSource)
    }

    private fun initRecyclerView() {

        this.FormulaOneAdapter = FormulaOneAdapter()

        recyclerview.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        recyclerview.adapter = this.FormulaOneAdapter

    }
}