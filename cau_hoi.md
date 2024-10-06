# 1. Tính trừu tượng là gì? Phân biệt đa hình vs trừu tượng?
- Tính trừu tượng là 1 class tổng quát không cần chú ý tới chi tiết bên trong
- Phân biệt : - tính trừu tượng vào các class kế thừa
	    - tính đa hình tập chung vào cả class cha và kế thưa

# 2. Phân biệt interface, abstract? Khi nào dùng interface, khi nào dùng abstract? Tìm hiểu về method default, static trong interface? Method và field mặc định trong interface là gì? Tìm hiểu function interface, lamda?
- Khác nhau giữa interface và abstract
abstract là class chỉ hỗ trợ đơn kế thừa, có thể có cả trừu tượng và cụ thể,biến instance, contructor
interface là hỗ trợ đa kế thừa, chỉ có trừu tượng , có hằng số , không có constructor
- Khi nào cần dùng inplement : khi các lớp có cùng bản chất
- Khi nào cần dùng interface:  sử dung đa kế thừa

- Tìm hiểu về method default, static trong interface
method default : là phương thức được mặc định sẵn trong interface và cho phép lớp thực hiện dược sử dụng hoặc ghi đè
static : là phương thức tĩnh và không thể bị ghi đè

- Method và field mặc định trong interface là gì

method default : là phương thức được mặc định sẵn trong interface và cho phép lớp thực hiện dược sử dụng hoặc ghi đè
field : hằng số không thể thay đổi, dùng chung cho tất cả lớp kế thừa


- Tìm hiểu function interface, lamda
function interface là 1 interface chỉ có 1 phương thức trừu tượng, đại diện cho 1 hàm và có thể sử dụng lamda
lambda là cách viết ngắn gọn để biêu diễn 1 phương thức function interface

# 3. Phân biệt array, arrayList, LinkedList(xem cấu trúc của 3 cái khác nhau như nào? truy xuất ptu cái nào nhanh hơn, thêm mới ptu cái nào nhanh hơn? tại sao)? Nguyên lý hoạt đông của Stack, Queue?

- Phân biệt array, arrayList, LinkedList(xem cấu trúc của 3 cái khác nhau như nào? truy xuất ptu cái nào nhanh hơn, thêm mới ptu cái nào nhanh hơn? tại sao)?
array : kích thước cố định, sử dụng kiểu nguyên thủy
arrayList: là mảng động, kích thước linh hoạt
linkerList: là 1 danh sach liên kết đôi, kích thước linh hoạt


- truy xuất ptu cái nào nhanh hơn, thêm mới ptu cái nào nhanh hơn? tại sao
array và arrayList truy suất trực tiếp tới index vì ko cần duyệt qua các phần tử khác 
linkerList thì sẽ truy suất duyệt tuần tự từ đầu tới cuối đẻ tìm phần tử mong muốn 
- array, arrayList, LinkedList
array thêm phần tử chậm phải thay đổi mảng 
arrayList thêm phần tử nhanh nếu còn chỗ
linkerList thêm phần tử ở đầu với cuối thì nhanh còn ở giữa thì chậm hơn vì phải đuyệt danh sách

-  Nguyên lý hoạt đông của Stack, Queue
stack: phần tử được thêm vào sau cùng sẽ lấy ra đầu , các thao tác chính push(thêm 1 phần tử vào đinh stack), pop(lấy phần tử ở đinh ra và xóa khỏi stack),peek/top(xem giá trị ở phần đầu đỉnh mà ko loại bỏ nó)
queue: phần tử được thêm vào đầu tiên thì sẽ lấy ra đầu , các thao tác chính emqueue(thêm 1 phần từ vào cuối hàng đợi), dequeue(lấy phần tử đầu hàng đợi và xóa),front/peek(xem giá trị đầu hàng đợi và ko loại bỏ nó)


-  Giải thích equal, hashcode
equal: phương thức này sử dụng để so sánh 2 đối tượng để xác định xem chúng có bằng nhau hay không
hashcode: phương thức này trả về giá trị số nguyên duy nhất cho 1 đối tượng 

# 4. Giải thích equal, hashcode? Method equal, hashcode mặc định sẽ như nào? Nếu override equal mà k override hashcode thì sao? Cách hoạt động của method put trong HashMap(Câu trả lời cho câu hỏi trước)?
- Method equal, hashcode mặc định sẽ như nào
equal mặc định: so sánh địa chỉ bộ nhớ để xác định xem 2 đối tượng có có giống nhau hay không
hashcode mặc định : trả về giá trị hash dựa trên địa chỉ bộ nhớ của đối tượng

- Nếu override equal mà k override hashcode thì sao
hai đối tượng có thể được coi bằng nhau theo nội dung nhưng có thể giá trị hash sẽ khác nhau 

- Cách hoạt động của method put trong HashMap
Sử dụng để thêm 1 cặp khóa-giá trị vào HashMap nếu khóa đã tồn tại thì sẽ thay thế giá trị cũ
