package com.hadihariri.littleKotliner

import java.util.ArrayList


/*
    ========================================================================================
    Definitions of functions below try and remain as faithful as possible to the original Scheme definitions
    ========================================================================================

    A lot of functions have easier and better ways to be implemented in Kotlin. For instance
    the function 'lat' could be implemented in Kotlin with:

    return list.firstOrNull { atom(it) == false } == null

    however, we want to remain as true as possible to the original The Little Schemer
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

/*
    Returns a new list where new is inserted to the right of old
 */
fun insertR(new: Any, old: Any, list: ArrayList<Any>): ArrayList<Any> {
    if (nully(list)) {
        return quote()
    } else {
        if (eq(car(list), old)) {
            return cons(old, cons(new, cdr(list)))
        } else {
            return cons(car(list), insertR(new, old, cdr(list)))
        }
    }
}
/*
    Returns a new list where new is inserted to the left old
 */
fun insertL(new: Any, old: Any, list: ArrayList<Any>): ArrayList<Any> {
    if (nully(list)) {
        return quote()
    } else {
        if (eq(car(list), old)) {
            return cons(new, cons(old, cdr(list)))
        } else {
            return cons(car(list), insertL(new, old, cdr(list)))
        }
    }
}

/*
    Returns a new list where the first occurrence of new is replaced with old
 */
fun subst(new: Any, old: Any, list: ArrayList<Any>): ArrayList<Any> {
    if (nully(list)) {
        return quote()
    } else {
        if (eq(car(list), old)) {
            return cons(new, cdr(list))
        } else {
            return cons(car(list), subst(new, old, cdr(list)))
        }
    }

}

/*
    Returns a new list where the first occurrence of new is replaced with old
 */
fun subst2(new: Any, old1: Any, old2: Any, list: ArrayList<Any>): ArrayList<Any> {
    if (nully(list)) {
        return quote()
    } else {
        if (eq(car(list), old1) || eq(car(list), old2)) {
            return cons(new, cdr(list))
        } else {
            return cons(car(list), subst2(new, old1, old2, cdr(list)))
        }
    }

}

/*
    Returns a new list where all occurrences of atom are removed
 */
fun multiRember(atom: Any, list: ArrayList<Any>): ArrayList<Any> {
    if (nully(list)) {
        return quote()
    } else {
        if (eq(car(list), atom)) {
            return multiRember(atom, cdr(list))
        } else {
            return cons(car(list), multiRember(atom, cdr(list)))
        }
    }

}

/*
    Returns a new list where new is inserted to the right of every instance of old
*/
fun multiInsertR(new: Any, old: Any, list: ArrayList<Any>): ArrayList<Any> {
    if (nully(list)) {
        return quote()
    } else {
        if (eq(car(list), old)) {
            return cons(old, cons(new, multiInsertR(new, old, cdr(list))))
        } else {
            return cons(car(list), multiInsertR(new, old, cdr(list)))
        }
    }
}

/*
    Returns a new list where new is inserted to the left of every instance of old
*/
fun multiInsertL(new: Any, old: Any, list: ArrayList<Any>): ArrayList<Any> {
    if (nully(list)) {
        return quote()
    } else {
        if (eq(car(list), old)) {
            return cons(new, cons(old, multiInsertL(new, old, cdr(list))))
        } else {
            return cons(car(list), multiInsertL(new, old, cdr(list)))
        }
    }
}

/*
    Returns a new list where every instance of old is replaced with new
 */
fun multiSubst(new: Any, old: Any, list: ArrayList<Any>): ArrayList<Any> {
    if (nully(list)) {
        return quote()
    } else {
        if (eq(car(list), old)) {
            return cons(new,  multiSubst(new, old, cdr(list)))
        } else {
            return cons(car(list), multiSubst(new, old, cdr(list)))
        }
    }
}


fun plus(number1: Int, number2: Int): Int {
    if (zero(number2)) {
        return number1
    } else {
        return (add1(plus(number2, sub1(number1))))
    }
}
