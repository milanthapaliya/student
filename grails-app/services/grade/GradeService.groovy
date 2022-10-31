package grade

import grails.gorm.transactions.Transactional


@Transactional
class GradeService {
    def get(id){
        Grade.get(id)
    }

    def list() {
        Grade.list()
    }

    def save(grade){
        grade.save()
    }

    def delete(id){
        Grade.get(id).delete()
    }
    def update(id,clas){
        def gradeData = Grade.find("from Grade as g where g.id=${id}");
        gradeData.firstName = clas.grade
        gradeData.save(flush:true)

    }
}
