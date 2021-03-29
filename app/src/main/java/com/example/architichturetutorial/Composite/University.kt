package com.example.architichturetutorial.Composite

class University: Input90 {
    private val studentList: ArrayList<Input90> = ArrayList()

    override fun showDetails() {
        for (item in studentList) {
            item.showDetails()
        }
    }

    fun addStudent(item: Input90?) {
        if (item != null) {
            studentList.add(item)
        }
    }

    fun removeStudent(item: Input90?) {
        studentList.remove(item)
    }
}


