package com.airbender.camero

import androidx.camera.view.PreviewView
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.viewinterop.AndroidView
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.constraintlayout.compose.Dimension

@Composable
@Preview
fun CameraUI() {
    ConstraintLayout(
        modifier = Modifier.fillMaxSize()
    ) {
        val (previewView, captureButton, videoButton) = createRefs()

        AndroidView(
            factory = { context ->
                PreviewView(context)
            },
            modifier = Modifier.constrainAs(previewView) {
                width = Dimension.fillToConstraints
                height = Dimension.fillToConstraints
                top.linkTo(parent.top)
                bottom.linkTo(parent.bottom)
                start.linkTo(parent.start)
                end.linkTo(parent.end)
            }
        )

        Button(
            onClick = { /* capture image */ },
            modifier = Modifier
                .size(80.dp)
                .constrainAs(captureButton) {
                    bottom.linkTo(parent.bottom, margin = 75.dp)
                    end.linkTo(parent.end)
                    start.linkTo(parent.start)
                    //top.linkTo(parent.top)
                }
        ) {}
        

//        Button(
//            onClick = { /* start video */ },
//            modifier = Modifier
//                .size(110.dp)
//                .constrainAs(videoButton) {
//                    bottom.linkTo(parent.bottom, margin = 50.dp)
//                    start.linkTo(parent.start, margin = 50.dp)
//                }
//        ){
//            Text(text = "Hey")
//        }
    }
}
