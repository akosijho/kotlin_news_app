package com.jhobert.news.utils

import com.jhobert.news.BuildConfig

class Constants {
    companion object {
        const val API_KEY = BuildConfig.NEWS_API_KEY
        const val BASE_URL = "http://newsapi.org/"
    }
}