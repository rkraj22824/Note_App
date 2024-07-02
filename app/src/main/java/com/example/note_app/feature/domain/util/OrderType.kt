package com.example.note_app.feature.domain.util

 sealed class OrderType {
     object Asscending: OrderType()
     object Descending: OrderType()
}