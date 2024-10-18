fun main() {

    var student: Student? = Student()
    student?.let { st -> //Ничего не возвращает, работем с объектом через ключевое слово st

        st.hi()
        st.bye()
        st.name = "Masha"
    }
    println(student?.name)

    var student_new = student?.apply { //Возвращает изменённый объкт калсса студент

        hi()
        bye()
    }
    println(student_new?.name)

    var count = student?.run { //Возврщает значение в последней строке
                                //Работ отобъекта
        count_of_debts = 15
        count_of_debts
    }
    println(count)

    count = with(Student()) { //Возврщает значение в последней строке
                                //Работ отобъекта
        count_of_debts = 10
        count_of_debts
    }
    println(count)

    val sudent_3 = Student().also { st -> //Возвращает измененный объект
                                            //Работает через ключевое слово
        st.count_of_debts = 5
    }
    println(sudent_3.count_of_debts)

}