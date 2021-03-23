package gun0912.tedimagepicker.builder

import android.content.Context
import gun0912.tedimagepicker.R
import gun0912.tedimagepicker.builder.type.AlbumType
import gun0912.tedimagepicker.builder.type.MediaType

class GalleryPicker {

    companion object {
        fun buildPhotoPicker(context: Context): TedImagePicker.Builder {
            return TedImagePicker.with(context)
                .image()
                .cameraTileImage(R.drawable.ic_camera_48dp)
                .startAnimation(R.anim.slide_up, R.anim.fade_out)
                .finishAnimation(R.anim.fade_in, R.anim.slide_down)
                .zoomIndicator(false)
                .title("Select Image")
        }

        fun buildVideoPicker(context: Context): TedImagePicker.Builder {
            return TedImagePicker.with(context)
                .video()
                .cameraTileImage(R.drawable.ic_video_recorder)
                .startAnimation(R.anim.slide_up, R.anim.fade_out)
                .zoomIndicator(false)
                .finishAnimation(R.anim.fade_in, R.anim.slide_down)
                .title("Select Video")
        }
    }

}