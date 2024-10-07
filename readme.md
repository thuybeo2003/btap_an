# 1. Tính trừu tượng là gì? Phân biệt đa hình vs trừu tượng?
- Tính trừu tượng là 1 class tổng quát không cần chú ý tới chi tiết bên trong, 1 class đấy nó mang tính trừu tượng, không hoàn toàn cụ thể mà mình muốn tạo thành 1 intance
- Phân biệt :
    + Tính trừu tượng vào các class kế thừa
	+ Tính đa hình tập chung vào cả class cha và kế thừa
- Giải thích trừu tượng là gì? Và trong java nó được thể hiện qua đâu(hint: interface vs abstract)?
    + Trừu tượng : thể hiện chi tiết cần thiết của 1 đối tượng hoặc hành động mà không cần biết chi tiết bên trong
    + Tính trừu tượng được thể hiện qua Interface
- Nếu nói: tính đa hình tập chung vào cả class cha và kế thưa . Vậy overloading có phải là đa hình k?
   + Overloading là đa hình tĩnh, nó sẽ sảy ra khi các phương thức có cùng tên trong cùng 1 lớp nhưng có số lượng và tham số khác nhau nên overloading được gọi là đa hinh nhưng nó sẽ không dựa trên lớp cha và kế thừa mà nó dựa vào sự khác biệt trong tham số phương thức
- Sau khi hiểu rõ hơn thì phân tích thêm overloading đa hình tại thời điểm nào và overriding đa hình tại thời điểm nào?
    + overloading sẽ đa hình khi: các phương thức có cùng tên trong 1 lớp nhưng có lượng và tham số khác nhau
    + overide sẽ đa hình khi :lớp con ghi đè lớp cha, và các lớp con phải cùng tên tham số và cùng kiểu dữ liệu lớp cha
# 2. Phân biệt interface, abstract? Khi nào dùng interface, khi nào dùng abstract? Tìm hiểu về method default, static trong interface? Method và field mặc định trong interface là gì? Tìm hiểu function interface, lamda?
- Khác nhau giữa interface và abstract
    + abstract là để cho class khác kế thừa, gồm những thuộc tính có access modifer và những phương thức abstract hoặc không, 1 lớp chỉ kế thừa 1 lớp
interface là để cho class khác implement, chỉ có phương thức public static final, chỉ khai 1 phương thức để cho class con implement, 1 lớp có thể kế thừa nhiều interface
- Loại nào hỗ trợ constructor, đa kế thừa, trưu tượng hoàn toàn
  + abstract : có thể có contructor, không hỗ trợ đa kế thừa,không hoàn toàn trừu tượng(có thể có phương thức thường và trừu tượng)
  + interface : không có contructor, hỗ trợ đa kế thừa, có thể chưa phương thức mặc định và tĩnh
- Khi nào dùng interface, khi nào dùng abstract?
  + Khi nào cần dùng abstract : dùng khi 1 nhóm đối tượng có cùng bản chất kế thừa 1 class
  + Khi nào cần dùng interface:  dùng cho nhóm đối tượng không có cùng bản chất nhưng chúng hành động giống nhau
- Khi triền khai cho từng loại thì dùng từ khoá nà
   + Abstract dùng từ khóa : extends
   + Interface dùng từ khóa implements 
- Tìm hiểu về method default, static trong interface
  + method default : là phương thức được mặc định sẵn trong interface và cho phép lớp thực hiện dược sử dụng hoặc ghi đè
  + static : là phương thức tĩnh và không thể bị ghi đè

- Method và field mặc định trong interface là gì
    + method default : public abstract
    + field: public static final


- Tìm hiểu function interface, lamda
  + function interface là 1 interface chỉ có 1 phương thức trừu tượng, đại diện cho 1 hàm và có thể sử dụng lamda
  + lambda là cách viết ngắn gọn để biêu diễn 1 phương thức function interface

# 3. Phân biệt array, arrayList, LinkedList(xem cấu trúc của 3 cái khác nhau như nào? truy xuất ptu cái nào nhanh hơn, thêm mới ptu cái nào nhanh hơn? tại sao)? Nguyên lý hoạt đông của Stack, Queue?

- Phân biệt array, arrayList, LinkedList(xem cấu trúc của 3 cái khác nhau như nào? truy xuất ptu cái nào nhanh hơn, thêm mới ptu cái nào nhanh hơn? tại sao)?
  + array : kích thước cố định, có thể lưu kiểu dữ liệu nguyên thủy , chỉ có thuộc tính length 
  + arrayList: là mảng động, kích thước linh hoạt, kích thước của mảng được cố định khi nó được tạo, và không thể thay đổi trong suốt quá trình thực thi 
  + linkerList: là 1 cấu trúc dữ liệu kép trong đó mỗi phần tử chứa dữ liêu và tham số đén phần tử trước và sau


- truy xuất ptu cái nào nhanh hơn, thêm mới ptu cái nào nhanh hơn? tại sao
   + Truuy xuất :
     + array truy xuất nhanh nhất vì có mảng lưu trữ các phần tử liên tiếp trong bộ nhớ
     + arrayList nhanh vì cũng giống như array vì cũng có mảng nội để lưu trữ
      + linkedList sẽ chậm nhất vì là 1  phần tử chứa dữ liêu và tham số đén phần tử trước và sau,khi truy cập phần từ thì phải bắt đầu từ đầu danh sách và duyệt qua từng phần tử
      linkerList thì sẽ truy suất duyệt tuần tự từ đầu tới cuối đẻ tìm phần tử mong muốn 
+ Thêm mới :
  + array sẽ chậm vì là mảng cố định khi thêm 1 phần từ thì phải thay đổi kích thước của mảng 
  + arrayList nhanh hơn vì là mảng động có thể tự tăng kích thước mảng những sẽ gặp vấn đề khi thêm 1 phần tử mới có phần từ còn lại phải dịch ra để tạo không gian cho phần từ mới
  + linkerList nhanh nhất vì linkerList chỉ cần thay đổi tham chiếu tới node liên quan mà không cần di chuyển dữ liệu
 

-  Nguyên lý hoạt đông của Stack, Queue
  + stack: phần tử được thêm vào sau cùng sẽ lấy ra đầu , các thao tác chính push(thêm 1 phần tử vào đinh stack), pop(lấy phần tử ở đinh ra và xóa khỏi stack),peek/top(xem giá trị ở phần đầu đỉnh mà ko loại bỏ nó)
  + queue: phần tử được thêm vào đầu tiên thì sẽ lấy ra đầu , các thao tác chính emqueue(thêm 1 phần từ vào cuối hàng đợi), dequeue(lấy phần tử đầu hàng đợi và xóa),front/peek(xem giá trị đầu hàng đợi và ko loại bỏ nó)


-  Giải thích equal, hashcode
  + equal: phương thức này sử dụng để so sánh 2 đối tượng để xác định xem chúng có bằng nhau hay không
  + hashcode: phương thức này trả về giá trị số nguyên duy nhất cho 1 đối tượng 

# 4. Giải thích equal, hashcode? Method equal, hashcode mặc định sẽ như nào? Nếu override equal mà k override hashcode thì sao? Cách hoạt động của method put trong HashMap(Câu trả lời cho câu hỏi trước)?
- Method equal, hashcode mặc định sẽ như nào
  + equal mặc định: so sánh địa chỉ bộ nhớ để xác định xem 2 đối tượng có có giống nhau hay không
  + hashcode mặc định : trả về giá trị hash dựa trên địa chỉ bộ nhớ của đối tượng

- Nếu override equal mà k override hashcode thì sao
  + Hai đối tượng có thể được coi bằng nhau theo nội dung nhưng có thể giá trị hash sẽ khác nhau 

- Cách hoạt động của method put trong HashMap
  + Sử dụng để thêm 1 cặp khóa-giá trị vào HashMap nếu khóa đã tồn tại thì sẽ thay thế giá trị cũ
