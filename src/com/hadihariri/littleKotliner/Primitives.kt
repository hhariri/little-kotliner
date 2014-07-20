package com.hadihariri.littleKotliner

import java.util.ArrayList
import java.util.LinkedList
import com.hadihariri.littleKotliner.InvalidQuestionException

fun list<T>(vararg values: T): ArrayList<T> =  values.toCollection(ArrayList(values.size))

/*
    Returns the first element of a list
 */
fun car(list: Any): Any {
    when (list) {
        !is ArrayList<*> -> {
            throw InvalidQuestionException("Cannot ask for car on a non-list")
        }
        else -> {
            if (list.empty) {
                throw InvalidQuestionException("Cannot ask for car on empty list")
            }
            return list.first()!!
        }
    }
}

/*
    Returns a list removing the first element
 */
fun cdr(list: Any): ArrayList<Any> {
    when (list) {
        !is ArrayList<*> -> {
            throw InvalidQuestionException("Cannot ask for car on a non-list")
        }
        else -> {
            if (list.empty) {
                throw InvalidQuestionException("Cannot ask for cdr on empty list")
            }
            return list.drop(1) as ArrayList<Any>
        }
    }
}

/*
    Returns a list which is a concatenation of expression and list
 */
fun cons(expression: Any, list: Any): ArrayList<Any> {
    when (list) {
        !is ArrayList<*> -> {
            throw InvalidQuestionException("Cannot apply cons on a non-list")
        }
        else -> {
            val consList = list<Any>()
            consList.add(expression)
            consList.addAll(list as ArrayList<Any>)
            return consList
        }
    }
}

/*
    Returns true if a list is empty
 */
fun nully(list: ArrayList<Any>): Boolean {
    return list.empty
}

/*
    Returns an empty list
 */
fun quote(): ArrayList<Any> {
    return list()
}

/*
    Returns true if the s-expression is an atom
 */
fun atom(expression: Any): Boolean {
    return expression !is ArrayList<*>
}

/*
    Returns true if atom1 is equivalent to atom2 and both are non-numeric
 */
fun eq(atom1: Any, atom2: Any): Boolean {
    when {
        atom1 is ArrayList<*>, atom2 is ArrayList<*> -> {
            throw InvalidQuestionException("Arguments to eq cannot be lists")
        }
    }
    if (atom1 !is String || atom2 !is String) {
        throw InvalidQuestionException("Arguments to eq have to be non-numeric atoms")
    }
    return atom1 == atom2
}

