package grade


class GradeController {

    def gradeService

    def index() {
        println(gradeService)
        respond gradeService.list()
    }

    def show(Long id) {
        respond gradeService.get(id)
    }

    def create() {
        respond new Grade(params)
    }

    def save(Grade clas) {
        gradeService.save(clas)
        redirect action:"index", method:"GET"
    }

    def delete(Long id, Grade clas) {
        gradeService.delete(id)
        redirect action:"index", method:"GET"
    }

    def update(Long id, Grade clas){
        gradeService.update(id,clas)
        redirect action:"index", method:"GET"
    }
}
