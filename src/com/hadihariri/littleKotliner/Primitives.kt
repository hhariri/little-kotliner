package com.hadihariri.littleKotliner

import java.util.ArrayList
import java.util.LinkedList
import com.hadihariri.littleKotliner.InvalidQuestionException

/*
    === Notes ===

    A lot of functions have easier and better ways to be implemented in Kotlin. For instance
    the function 'lat' could be implemented in Kotlin with:

    return list.firstOrNull { atom(it) == false } == null

    however, we want to remain as true as possible to the original The Little Schemer
 */


// TODO: once 'cond' is defined, refactor if/else to use it
// TODO: once 'or' is defined, refactor things like 'member' to use it. Page 23.
// TODO: Do we really need to redefine if/else/or? Maybe not...

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
            throw InvalidQuestionException("Cannoy apply cons on a non-list")
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


/*
    ========================================================================================
    Definitions of functions below try and remain as faithful as possible to the original Scheme definitions
    ========================================================================================
 */

/*
    Returns true if every element in the list is an atom
 */
fun lat(list: ArrayList<Any>): Boolean {
    if (nully(list)) {
        return true
    }
    if (atom(car(list))) {
        return lat(cdr(list))
    }
    return false
}

/*
    Returns true if atom is a member of list
 */
fun member(atom: Any, list: ArrayList<Any>): Boolean {
    if (nully(list)) {
        return false
    } else {
        if (eq(atom, car(list))) {
            return true
        } else {
            return member(atom, cdr(list))
        }
    }
}

/*
    Returns a new list removing atom from list
 */
fun rember(atom: Any, list: ArrayList<Any>): ArrayList<Any> {
    if (nully(list)) {
        return quote()
    } else {
        if (eq(car(list), atom)) {
            return cdr(list)
        }  else {
            return cons(car(list), rember(atom, cdr(list)))
        }
    }
}

/*
    Returns a list containing the first element of each list
 */
fun firsts(list: ArrayList<Any>): ArrayList<Any> {
    if (nully(list)) {
        return quote()
    } else {
        return cons(car(car(list)), firsts(cdr(list)))
    }
}