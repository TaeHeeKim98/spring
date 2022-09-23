package spring.di;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.di.entity.Exam;
import spring.di.entity.NewlecExam;
import spring.di.ui.ExamConsole;
import spring.di.ui.GridExamConsol;
import spring.di.ui.InlineExamConsol;

public class Program {

	public static void main(String[] args) {
		
		/* ���������� �����ϴ� ������� �ڵ带 ����
		//Exam exam = new NewlecExam();
		Exam exam = new NewlecExam(10,10,10,10);
		ExamConsole console = new GridExamConsol();
		
		console.setExam(exam);
		*/
		
		ApplicationContext context = 
				new AnnotationConfigApplicationContext(NewlecDIConfig.class);
		
		//Exam exam = context.getBean(Exam.class);
		//System.out.println(exam.toString());
		
		ExamConsole console = (ExamConsole) context.getBean("console");
		//ExamConsole console = context.getBean(ExamConsole.class);
		console.print();
		
		//List<Exam> exams = (List<Exam>) context.getBean("exams");//new ArrayList<>();
		//exams.add(new NewlecExam(1,1,1,1));
		
		//for(Exam e : exams)
		//	System.out.println(e);

	}

}