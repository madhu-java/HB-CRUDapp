package in.madhu.daofactory;

import in.madhu.dao.IStudentDao;
import in.madhu.dao.StudentDaoImpl;

public class StudentDaoFactory {

	private StudentDaoFactory() {}

	private static IStudentDao studentDao = null;

	public static IStudentDao getStudentDao() {
		if (studentDao == null) {
			studentDao = new StudentDaoImpl();
		}
		return studentDao;
	}
}
