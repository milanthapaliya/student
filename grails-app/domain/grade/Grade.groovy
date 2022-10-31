package grade

class Grade {
    Integer grade

    static constraints = {
        grade unique:true,blank:false,min:1,max:5
    }
}
