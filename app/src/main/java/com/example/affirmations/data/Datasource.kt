/*
 * Assignment 3
 * Datasource.kt
 * Maggie Wu / wumag@oregonstate.edu
 * CS 492 / Oregon State University
 */
package com.example.affirmations.data

import com.example.affirmations.R
import com.example.affirmations.model.Course

class Datasource() {

    fun loadCourses(): List<Course> {
        return listOf<Course>(
            Course(R.string.myname, "Assignment", 3, 1),
            Course(R.string.title161, "CS", 161, 100),
            Course(R.string.title162, "CS", 162, 100),
            Course(R.string.title225, "CS", 225, 200),
            Course(R.string.title261, "CS", 261, 200),
            Course(R.string.title271, "CS", 271, 200),
            Course(R.string.title290, "CS", 290, 200),
            Course(R.string.title325, "CS", 325, 300),
            Course(R.string.title340, "CS", 340, 300),
            Course(R.string.title344, "CS", 344, 300),
            Course(R.string.title361, "CS", 361, 300),
            Course(R.string.title361, "CS", 361, 300),
            Course(R.string.title467, "CS", 467, 400),
        )}
}
