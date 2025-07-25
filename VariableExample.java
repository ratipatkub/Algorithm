//package Lesson;
Public class VariablesExample {
    public static void main(String[] args) {
        //1.1 ตัวแปรที่จะใช้เก็บคำของขนาดเสื้อผ้า ซึ่งมีขนาดเป็น s, m หรือ l
        char clothingSize = 's' ; // สามารถเป็น 's', 'm', หรือ 'l'

        //1.2 ตัวแปรที่ใช้เก็บค่าของจำนวนคนที่เข้ามาชมเว็ปไซต์
        int websiteVisitors = 0; // จำนวนคนเข้าชมเว็ปไซต์

        //1.3 ตัวแปรที่ใช้เก็บเกรดของนักศึกษา (A, B, C, D, E)
        char studentGrade = 'A'; // สามารถเป็น 'A', 'B', 'C', 'D', 'E'

        //1.4 ตัวแปรที่ใช้เก็บเกรดเฉลี่ยของนักศึกษา
        double studentsGPA = 4.0; // ค่าเกรดเฉลี่ยของนักศึกษา

        //1.5 ตัวแปรที่ใช้เก็บค่าของ π (Pi - ค่าที่ใช้ในการหาเส้นรอบวงและพื้นที่วงกลม)
        final double PI = 3.14159; // ค่าของ Pi ควรเป็นค่าคงที่

        // 1.6 ตัวแปรที่ีใช้เก็บค่าใช้จ่ายรายปีของนักศึกษา
        float annualExpenses = 15000.00f; // ค้าใช้จ่ายรายปีของนักศึกษา

        //1.7 ตัวแปรที่ใช้เก็บค่าจำนวนของเดือนที่มีในหนึ่งปี
        final int MONTHS_IN_YEAR = 12; // จำนวนเดือนในหนึ่งปี ควรเป็นค่าคงที่

        // ตัวอย่างการแสดงผลค่าตัวแปร
        System.out.println("Clothing Size: " + clothingSize);
        System.out.println("Website Visitors: " + WebsiteVisitors);
        System.out.println("Student Grade: " + studentGrade);
        System.out.println("Student GPA: " + StudentGPA);
        System.out.println("Value of Pi: " + PI);
        System.out.println("annual Expenses: " + annualExpenses);
        System.out.println("Months in a year: " + MONTHS_IN_YEAR)

    }
}