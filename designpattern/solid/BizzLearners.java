package designpattern.solid;

public class BizzLearners {

    class Student {
        private Teacher teacher;

        public Student(Teacher teacher) {
            this.teacher = teacher;
        }
    }

    class GoodStudent extends Student {
        public GoodStudent(Teacher teacher) {
            super(teacher);
        }
    }

    class BadStudent extends Student {
        public BadStudent(Teacher teacher) {
            super(teacher);
        }
    }

    class Teacher {
        private Student student;

        public Teacher(Student student) {
            this.student = student;
        }
    }
/**
 * (1) if we register student and teacher as scoped (separate object per httpRequest)
 * (2) or if we register student and teacher as transient (separate object per Object creation)
 * (3) or if we register student and teacher as singleton (One object whole Runtime)
 * ---------------------------------------------------
 * case 1: what will be happened in runtime ?
 * case 2: what will be happened in runtime ?
 * case 3: what will be happened in runtime ?
 *
 * if any problem exist then how to resolve this.
 *
 * N.B : this is not just related to C#.
 * also applicable for JAVA and Dart . so mobile devs can also participate.
 *
 * */

}
