package student

import grails.gorm.transactions.Transactional

@Transactional
class StudentService {

    def get(id){
        Student.get(id)
    }

    def list() {
        Student.list()
    }

    def save(student){
        student.save()
    }

    def delete(id){
        Student.get(id).delete()
    }
    def update(id,student){
        def studentData = Student.find("from Student as s where s.id=${id}");
        studentData.firstName = student.firstName
        studentData.lastName = student.lastName
        studentData.save(flush:true)

    }
}
