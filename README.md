# Bài 19: Chương trình quản lý sinh viên
Viết chương trình quản lý sinh viên. Mỗi đối tượng sinh viên có các thuộc tính sau: id, name, age, address và gpa (điểm trung bình). Yêu cầu: tạo ra một menu với các chức năng sau:
/****************************************/
1. Add student.
2. Edit student by id.
3. Delete student by id.
4. Sort student by gpa.
5. Sort student by name.
6. Show student.
0. Exit.
/****************************************/

Tạo các lớp sau để xây dựng chương trình:
Lớp Student implements Serializable để lưu thông tin cho mỗi sinh viên.
Lớp StudentDao để đọc và ghi sinh viên vào file.
Lớp SortStudentByGPA được implements Comparator để sắp xếp sinh viên tăng dần theo điểm trung bình.
Lớp SortStudentByName được implements Comparator để sắp xếp sinh viên tăng dần theo tên.
Lớp StudentManager cung cấp các phương thức để quản lý sinh viên như thêm, sửa, xóa, sắp xếp và hiển thị sinh viên.
Lớp Main chứa phương thức public static void main() để chạy ứng dụng và menu như yêu cầu của bài toán.
