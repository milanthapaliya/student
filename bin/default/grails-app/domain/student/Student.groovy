package student

class Student {
    String firstName
    String lastName

    static constraints = {
        firstName size: 1..20, blank: false
        lastName size: 1..20, blank: false
    }
}
