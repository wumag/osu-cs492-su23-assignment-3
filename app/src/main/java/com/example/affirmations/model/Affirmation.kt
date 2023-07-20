/*
 * Assignment 3
 * Affirmation.kt
 * Maggie Wu / wumag@oregonstate.edu
 * CS 492 / Oregon State University
 */

package com.example.affirmations.model

import androidx.annotation.StringRes

data class Course(
    @StringRes val title: Int,
    val department: String,
    val number: Int,
    val capacity: Int
)
