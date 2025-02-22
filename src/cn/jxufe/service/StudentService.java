package cn.jxufe.service;

import org.springframework.data.domain.Pageable;

import cn.jxufe.bean.EasyUIData;
import cn.jxufe.bean.Message;
import cn.jxufe.entity.Classes;
import cn.jxufe.entity.Student;

public interface StudentService extends QueryService<Student>{
	/**
	 * 保存一个实例对象
	 * @param student实例对象
	 * @return Message 返回保存结果的信息，成功或失败
	 */
	public Message save(Student student);
	
	/**
	 * 根据班级查询学生
	 * @param classes 班级实例对象
	 * @param pageable 分页属性
	 * @return Student类实体集
	 */
	public EasyUIData<Student> findByClasses(Classes classes, Pageable pageable);
}