case class Student(id: Int, name: String)

case class Marks(subjectId: Int, studentId: Int, marksObtained: Int)

object PassFail extends App {

  val l1: List[Student] = List(Student(1, "Anmol"), Student(2, "Pankhurie"))

  val l2: List[Marks] = List(Marks(1, 1, 80), Marks(2, 1, 85), Marks(3, 1, 12), Marks(1, 2, 90), Marks(2, 2, 75), Marks(3, 2, 6))


println(findPassFail(l2, 1,33, "pass"))

  def findPassFail(marksList:List[Marks],id:Int,percent:Int,choice:String): Int={
    choice match {
      case "pass"=> {
        val count = marksList.flatMap(x => if (x.subjectId == id && x.marksObtained > percent) Some(x) else None)
        count.size
      }
      case "fail"=>{
        val count = marksList.flatMap(x => if (x.subjectId == id && x.marksObtained < percent) Some(x) else None)
        count.size
      }
    }
  }
}