package daemonconstruction.recyclerbindingexample

/**
 * Created by devarshi.k on 27/09/17.
 */

class PersonsProvider {
    companion object {
        fun getPersons() : Array<Person> = arrayOf(Person(name = "John", designation = "Principal Consultant"),
                Person(name = "Joseph", designation = "Lead Consultant"),
                Person(name = "Darren", designation = "Senior Consultant"))
    }
}