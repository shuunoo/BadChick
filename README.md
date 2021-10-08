# Bài 16: Quản lý tài khoản ngân hàng 
Ngân hàng ABC muốn lưu trữ thông tin của mỗi tài khoản như sau:

- Số tài khoản ( Kiểu long)
- Tên tài khoản (kiểu chuỗi)
- Số tiền trong tài khoản (kiểu double)

Thiết kế lớp Account để lưu trữ các thông tin, lớp bao gồm các phương thức sau:

Constructor: Có 2 constructor ( mặc định và đầy đủ tham số)
Các phương thức get, set cho từng thuộc tính
Phương thức toString để trả về chuỗi chứa toàn bộ thông tin tài khoản, yêu cầu định dạng tiền tệ.

Thêm các thông tin sau vào lớp Account:

Hằng số lãi suất(1 năm) có giá trị khởi tạo 0.055
Constructor có 2 đối số: số tài khoản, tên tài khoản. Constructor này sẽ khởi tạo số tiền mặc định là 50
Phương thức nạp tiền vào tài khoản: Lấy số tiền nạp vào
Phương thức rút tiền: Lấy số tiền hiện tại trong tài khoản – (số tiền muốn rút+phí rúttiền)
Phương thức check số tiền khi được đáo hạn: Mỗi lần đến kỳ đáo hạn thì số tiền trong tài khoản = số tiền trong tài khoản + số tiền trong tài khoản * LAISUAT
Phương thức chuyển khoản từ tài khoản này sang tài khoản khác
Chú ý: Mỗi thao tác phải kiểm tra số tiền nạp, rút, chuyển có hợp lệ hay không? (VD: tiền nhập vào <0, tiền rút nhiều hơn tiền trong tài khoản thì thông báo không hợp lệ và yêu cầu nhập lại)
