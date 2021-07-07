package com.algebra.webview

import android.os.Bundle
import android.util.Log
import android.view.KeyEvent
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {

    private lateinit var webView: WebView

    override fun onCreate( savedInstanceState: Bundle? ) {
        super.onCreate( savedInstanceState )
        setContentView( R.layout.activity_main )

        initWidgets( )
        configureWebView( )
    }

    private fun initWidgets( ) {
        webView = findViewById( R.id.webView )
    }

    private fun configureWebView( ) {
        webView.canGoBack( )
        webView.settings.javaScriptEnabled = true
        webView.setWebViewClient( object : WebViewClient()  {
            override fun shouldOverrideUrlLoading(view: WebView, url: String): Boolean { return false }
        })
        webView.loadUrl( "https://www.net.hr" )
    }
/*
    override fun onKeyDown( keyCode: Int, event: KeyEvent? ): Boolean {
        Log.i( "onKeyDown", "onKeyDown" )
        // Check if the key event was the Back button and if there's history
        if (keyCode == KeyEvent.KEYCODE_BACK && webView.canGoBack( ) ) {
            webView.goBack( )
            return true
        }
        // If it wasn't the Back key or there's no web page history, bubble up to the default
        // system behavior (probably exit the activity)
        return super.onKeyDown( keyCode, event )
    }
*/
}
