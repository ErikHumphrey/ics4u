public class AboutMyClasses {
	public static final String MY_NAME = "Erik Humphrey";
	public static void main(String[] args) {
		System.out.println("Name: " + MY_NAME.substring(0, MY_NAME.lastIndexOf(" ") + 2) + ".");
		System.out.println("CS Teacher: " + "Ms. McDougall");
		System.out.println("\"Go Golden Bears!\"\n");
		System.out.format("%-10s %8s %8s", "Course", "Start", "End\n");
		System.out.format("%-10s %8s %8s", "Homeroom", "8:00", "8:10\n");
		System.out.format("%-10s %8s %8s", "HZT4U", "8:10", "9:25\n");
		System.out.format("%-10s %8s %8s", "ICS4U", "9:30", "10:45\n");
		System.out.format("%-10s %8s %8s", "Lunch", "10:45", "11:25\n");
		System.out.format("%-10s %8s %8s", "MCV4U", "11:30", "12:45\n");
		System.out.format("%-10s %8s %8s", "SPH4U", "12:50", "2:05\n");
	}
}