package com.example.moxy_test.presenters

import com.example.moxy_test.views.MainView
import moxy.MvpPresenter

class MainPresenter : MvpPresenter<MainView>() {
    override fun onFirstViewAttach() {
        viewState.showMessage("Hello?")
    }
}