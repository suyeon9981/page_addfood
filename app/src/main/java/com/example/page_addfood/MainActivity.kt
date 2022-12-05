package com.example.page_addfood

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.addfood)
        setContentView(R.layout.activity_main)
    }
    /*
    // id.maxValue/ id.minValue = 숫자로 최댓값, 최솟값 설정
    receiptdateyearPicker.minValue = 1990
    receiptdateyearPicker.maxValue = 2030
    receiptdateyearPicker.wrapSelectorWheel = false

    receiptdatemonthPicker.minValue = 1
    receiptdatemonthPicker.maxValue = 12
    receiptdatemonthPicker.wrapSelectorWheel = false

    receiptdatedatePicker.minValue = 1
    receiptdatedatePicker.maxValue = 31
    receiptdatedatePicker.wrapSelectorWheel = false
    */
}