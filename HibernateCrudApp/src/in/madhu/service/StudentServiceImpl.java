package in.madhu.service;

import in.madhu.dao.IStudentDao;
import in.madhu.daofactory.StudentDaoFactory;
import in.madhu.dto.Student;

//service layer logic
public class StudentServiceImpl implements IStudentService {

	private IStudentDao stdDao;

	@Override
	public String save(String sname, Integer sage, String saddress) {
		stdDao = StudentDaoFactory.getStudentDao();
		return stdDao.save(sname, sage, saddress);
	}

	@Override
	public Student findById(Integer sid) {
		stdDao = StudentDaoFactory.getStudentDao();
		return stdDao.findById(sid);
	}

	@Override
	public String updateById(Student student) {
		stdDao = StudentDaoFactory.getStudentDao();
		return stdDao.updateById(student);
	}

	@Override
	public String deleteById(Integer sid) {
		stdDao = StudentDaoFactory.getStudentDao();
		return stdDao.deleteById(sid);
	}

}
