class student {
    int roll;
    String course;

    student(int r,String c) {
roll=r;
course=c;

    }
    void register()
    {
System.out.println(roll+"is the roll and the course is"+course);
    }
}
class kittian extends student{
kittian(int r, String c)
{
	super(r,c);

	System.out.println("is is defalult construcotr");
	}
    void hostel()
    {
        System.out.println(roll+"wants to request for hostel accomodation and his course is "+course);

    }

}

