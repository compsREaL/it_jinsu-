package com.real.assignment.assignmentBySpringMybatis.bean;

public class Student {

	//学生id
	private Integer id;
	//学生姓名
	private String name;
	//学生qq号
	private String qq;
	//修真类型
	private String occupation;
	//入学时间
	private long enrolltime;
	//毕业院校
	private String graduatefrom;
	//学号
	private String snumber;
	//日报链接
	private String reportlink;
	//立愿
	private String desire;
	//辅导师兄
	private String seniorname;
	//从何处了解到修真院
	private String realizefrom;
	//创建时间
	private long create_at;
	//更新时间
	private long update_at;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Student(String name, String qq, String occupation, long enrolltime, String graduatefrom, String snumber,
			String reportlink, String desire, String seniorname, String realizefrom, long create_at, long update_at) {
		super();
		this.name = name;
		this.qq = qq;
		this.occupation = occupation;
		this.enrolltime = enrolltime;
		this.graduatefrom = graduatefrom;
		this.snumber = snumber;
		this.reportlink = reportlink;
		this.desire = desire;
		this.seniorname = seniorname;
		this.realizefrom = realizefrom;
		this.create_at = create_at;
		this.update_at = update_at;
	}


	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getQq() {
		return qq;
	}
	public void setQq(String qq) {
		this.qq = qq;
	}
	public String getOccupation() {
		return occupation;
	}
	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}
	public long getEnrolltime() {
		return enrolltime;
	}
	public void setEnrolltime(long enrolltime) {
		this.enrolltime = enrolltime;
	}
	public String getGraduatefrom() {
		return graduatefrom;
	}
	public void setGraduatefrom(String graduatefrom) {
		this.graduatefrom = graduatefrom;
	}
	public String getSnumber() {
		return snumber;
	}
	public void setSnumber(String snumber) {
		this.snumber = snumber;
	}
	public String getReportlink() {
		return reportlink;
	}
	public void setReportlink(String reportlink) {
		this.reportlink = reportlink;
	}
	public String getDesire() {
		return desire;
	}
	public void setDesire(String desire) {
		this.desire = desire;
	}
	public String getSeniorname() {
		return seniorname;
	}
	public void setSeniorname(String seniorname) {
		this.seniorname = seniorname;
	}
	public String getRealizefrom() {
		return realizefrom;
	}
	public void setRealizefrom(String realizefrom) {
		this.realizefrom = realizefrom;
	}
	public long getCreate_at() {
		return create_at;
	}
	public void setCreate_at(long create_at) {
		this.create_at = create_at;
	}
	public long getUpdate_at() {
		return update_at;
	}
	public void setUpdate_at(long update_at) {
		this.update_at = update_at;
	}


	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", qq=" + qq + ", occupation=" + occupation + ", enrolltime="
				+ enrolltime + ", graduatefrom=" + graduatefrom + ", snumber=" + snumber + ", reportlink=" + reportlink
				+ ", desire=" + desire + ", seniorname=" + seniorname + ", realizefrom=" + realizefrom + ", create_at="
				+ create_at + ", update_at=" + update_at + "]";
	}
	
}
