package com.example.note_app.feature.domain.util

 sealed class OrderType {
     object Ascending: OrderType()
     object Descending: OrderType()
}