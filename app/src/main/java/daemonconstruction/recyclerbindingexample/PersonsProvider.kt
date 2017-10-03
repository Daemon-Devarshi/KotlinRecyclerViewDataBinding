package daemonconstruction.recyclerbindingexample

/**
 * Created by devarshi.k on 27/09/17.
 */

class PersonsProvider {
    companion object {
        fun getPersons() : Array<Person> = arrayOf(Person(name = "Devarshi", designation = "Principal Consultant"),
                Person(name = "Aniket", designation = "Lead Consultant"),
                Person(name = "Rahul", designation = "Senior Consultant"))
    }
}