package com.example.moxy_test.views

import moxy.MvpView
import moxy.viewstate.strategy.alias.AddToEndSingle

interface MainView: MvpView {

    @AddToEndSingle
    fun showMessage(message: String)
}