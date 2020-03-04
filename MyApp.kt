package your_package_name
import android.app.Application
class MyApp :Application(){
    var QRResult: String? = null
    companion object {
        private var instance : MyApp? = null
        fun  getInstance(): MyApp {
            if (instance == null)
                instance = MyApp()
            return instance!!
        }
    }
}

//in other file
//call instance
val myApp = MyApp.getInstance()
//setter
myApp.QRResult = string
//getter
val QRResult = myApp.QRResult
