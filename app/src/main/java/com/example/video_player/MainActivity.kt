package com.example.video_player

import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView
import android.widget.VideoView
import android.widget.MediaController

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val videoview:VideoView = findViewById(R.id.playVideoInThis)
        val Controller = MediaController(this)
        Controller.setAnchorView(videoview)
        val uri:Uri = Uri.parse("android.resource://"+packageName+"/raw/"+"test")


        videoview.setMediaController(Controller)
        videoview.setVideoURI(uri)
        videoview.requestFocus()
        videoview.start()
    }
}