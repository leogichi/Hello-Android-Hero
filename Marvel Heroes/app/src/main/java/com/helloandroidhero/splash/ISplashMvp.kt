package com.helloandroidhero.splash

interface ISplashMvp {
    interface iModel{}

    interface iView{
        fun goSplash()
        fun bringConfigurations()
    }
    interface iPresenter {
        fun bringConfigurations()
    }

}