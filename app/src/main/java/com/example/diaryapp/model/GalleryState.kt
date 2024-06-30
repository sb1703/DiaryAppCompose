package com.example.diaryapp.model

import android.net.Uri
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.remember

// To be able to create instance of this GalleryState
@Composable
fun rememberGalleryState():GalleryState {
    return remember { GalleryState() }
}

class GalleryState {
    val images = mutableStateListOf<GalleryImage>()
    val imagesToBeDeleted = mutableStateListOf<GalleryImage>()

    fun addImage(galleryImage: GalleryImage){
        images.add(galleryImage)
    }

    fun removeImage(galleryImage: GalleryImage){
        images.remove(galleryImage)
        imagesToBeDeleted.add(galleryImage)
    }

}

data class GalleryImage(
    val image: Uri,
    var remoteImagePath: String = ""            // path where you plan to upload it
)