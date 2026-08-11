import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        Biến (Variable): lưu trữ dữ liệu từ hệ thống trả về hoặc nhập từ bàn phím
            - Mỗi biến có 1 kiểu dữ liệu nhất định
            - Đặc điểm:
                + Biến có thể thay đổi giá trị
                + Tên biến là duy nhất, k trùng nhau
            - Nguyên tắc đặt tên biến:
                + Duy nhất
                + Chỉ chứa chữ cái, số, _
                + Không bắt đầu bằng số
                + Không trùng từ khóa
                + Phân biệt hoa thường
            - Khai báo biến
                + Khai báo và không gán giá trị
                    <kiểu_dữ_liệu> <tên_biến>;
                + Khai báo và gán giá trị
                    <kiểu_dữ_liệu> <tên_biến> = <giá trị>;
        Kiểu dữ liệu: Kiểu giá trị mà biến lưu trữ được
            - 1 số kiểu dữ liệu cơ bản
                int: số nguyên
                float, double: số thực
                char: ký tự
                string: chuỗi
                boolean: true hoặc false
        Toán tử: Ký hiệu thể hiện các phép toán
            - 1 số loại toán tử:
                + Toán tử số học: +, -, *, /, %
                + Toán tử quan hệ: >, <. >=, <=, ==, !=
                + Toán tử logic: &&, ||, !
                + Toán tử gán: =, +=, -=, *=, /=, %=
                + Toán tử điều kiện: ? :
        Condition: thực hiện 1 khối lệnh tùy theo 1 điều kiện được thỏa mãn
            if(điều kiện){
                Code block;
            }

            if(điều kiện){
                Code block 1;
            } else {
                Code block 2;
            {

            if(điều kiện 1){
                Code block 1;
            } else if(điều kiên 2){
                Code block 2;
            } ...
            else {
                Code block n;
            }

            if(điều kiện 1){
                if(điều kiện 2){
                    Code block 1;
                }
            }

        Khối lệnh lựa chọn: switch - case
            switch(<biến>){
                case <giá_trị>:
                    Code block;
                    break;
                ...
                default:
                    Code block n;
                    break;

        Vòng lặp (Loop): thực hiện 1 khối lệnh nhiều lần
            for(tham số 1; tham số 2; tham số 3){
                Code block;
            }

            tham số 1;
            while(tham số 2){
                Code block;
                Tham số 3;
            }

            tham số 1;
            do {
                Code block;
                Tham số 3;
            } while (tham số 2);

            do {
                Tham số 1;
                Code block;
                Tham số 3;
            } while (tham số 2);

            for (<Đối_tượng_hoặc_kiểu_dữ_liệu> <tên_biến> : <Danh_sách_hoặc_mảng>){
                Code block;
            }

        Mảng (Array): Tập hợp các phần tử có cùng kiểu dữ liệu, được phân biệt bắng chỉ số index
            - Index bắt đầu từ 0
            - Khai báo mảng:
                + Khai báo không gán giá trị
                    <kiểu_dữ_liệu>[] <tên_mảng> = new <Kiểu_dữ_liệu>[<số_phần_tử>];
                + Khai báo gán giá trị:
                    <kiểu_dữ_liệu>[] <tên_mảng> = {<giá_trị_1>, <giá_trị_2>, ...};
            - Truy xuất 1 phần tử
                <tên_mảng>[<index>]
            - Truy xuất lần lượt các phần tử của mảng: dùng vòng lặp chạy theo index
        */

        /*
            1. Nhập mảng số nguyên có n phần tử
            a. Tìm min, max
            b. Sắp xếp mảng tăng dần
            c. Tách mảng trên thành 2 mảng: 1 mảng lưu phần tử giá trị chẵn,
                1 mảng lưu phần tử giá trị lẻ
        */
        Scanner input = new Scanner(System.in);
        int n;
        System.out.print("n = ");
        n = input.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++){
            System.out.print("arr[" + i + "] = ");
            arr[i] = input.nextInt();
        }

        int min = arr[0];
        int max = arr[0];
        for (int i = 0; i < n; i++){
            if(min > arr[i]){
                min = arr[i];
            }

            if(max < arr[i]){
                max = arr[i];
            }
        }
        System.out.println("min = " + min);
        System.out.println("max = " + max);

        int temp;
        for (int i = 0; i < n - 1; i++){
            for(int j = i + 1; j < n; j++){
                if(arr[i] > arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        System.out.println("Mang sau sap xep: ");
        for (int i = 0; i < n; i++){
            System.out.print(arr[i] + "\t");
        }
        System.out.println();

        int count = 0;
        for (int i = 0; i < n; i++){
            if(arr[i] % 2 == 0){
                count++;
            }
        }

        if(count == 0){
            int[] arr2 = new int[n];
            for(int i = 0; i < n; i++){
                arr2[i] = arr[i];
            }
        } else if(count == n){
            int[] arr1 = new int[n];
            for(int i = 0; i < n; i++){
                arr1[i] = arr[i];
            }
        } else {
            int[] arr1 = new int[count];
            int index1 = 0;
            int index2 = 0;
            int[] arr2 = new int[n - count];
            for(int i = 0; i < n; i++){
                if(arr[i] % 2 == 0){
                    arr1[index1] = arr[i];
                    index1++;
                } else {
                    arr2[index2] = arr[i];
                    index2++;
                }
            }
        }

        /* Method: thực hiện 1 chức năng của chương trình
            Khai báo
                public <kiểu_dữ_liệu> <tên_method>(<Kiểu_dữ_liệu> <tên_tham_số>, ...){
                    Code block;
                    return <1_giá_trị_có_kiểu_dữ_liệu_giống_kiểu_dữ_liệu_method>;
                }
            Gọi method
                <tên_method>(<Danh_sách_đối_số>);
            Lưu ý:
                + Tên tham số không quan trọng mà quan trọng là truyền đúng đối số tương ứng
                    . Số lượng đối số = số lượng tham số
                    . Kiểu dữ liệu đối số = kiểu dữ liệu của tham số tương ứng
        */

        /* OOP (Object-oriented programming - Lập trình hướng đối tượng)
           - Đưa đối tượng từ ngoài thực tế vào trong code
           - Lớp (class): khuôn mẫu để tạo đối tượng
                + Thể hiện các thuộc tính, phương thức của 1 đối tượng
                    . Thuộc tính: Các thông tin của đối tượng đó
                    . Phương thức: Các hành động của đối tượng
                + Khai báo class
                    public class <tên_class>{
                        <kiểu_dữ_liệu> <tên_thuộc_tính>;
                        <access_modifier> <kiểu_dữ_liệu> <tên_method>(<Danh_sách_tham_số>){
                            Code block;
                            return <1_giá_trị_có_kiểu_dữ_liệu_giống_kiểu_dữ_liệu_method>;
                        }
                    }
           - Đối tượng (Object): Là 1 thể hiện cụ thể của 1 lớp
                + Khởi tạo đối tượng
                    <tên_class> <tên_object> = new <Tên_class>();
                + Khởi tạo 1 mảng các đối tượng:
                    . Khai báo mảng
                    . Khởi tạo từng phần tử trong mảng là 1 đối tượng

            - Các tính chất:
                + Tính kế thừa (Inheritance): 1 class có thể kế thừa lại thuộc tính, phương của 1 class khác
                    . Class cha có thuộc tính, phương thức nào thì class con có thuộc tính và phương thức đó
                    . Class con có thể có những thuộc tính, phương thức riêng mà class cha không có
                    . 1 class cha có thể có nhiều class con, 1 class con chỉ có 1 class cha
                    class con extends class cha
                + Tính đa hình (Polymorphism): 1 phương thức có thể được triển khai khác nhau bởi các class khác nhau
                    . Nạp chồng (Overloading): trong 1 class có nhiều phương thức giống tên, khác tham số truyền vào
                    . Ghi đè (Overriding): trong 2 class cha con, có 1 phương thức giống tên, tham số
                + Tính đóng gói (Encapsulation): thể hiện phạm vi truy cập của 1 phương thức, thuộc tính
                    . public: có thể truy cập từ mọi nơi trong project
                    . private: chỉ có thể truy cập trong chính class đó
                        * Thuộc tính: để truy cập phải thông qua getter, setter
                        * Phương thức: không có cách truy cập từ bên ngoài
                    . protected: có thể truy cập từ các class con
                    . default: trong cùng package
                + Tính trừu tượng (Abstraction): thể hiện những phần chung, không thể hiện chi tiết của chương trình
                    . Bán trừu tượng - Abstract class: chứa thuộc tính, phương thức thông thường, phương thức trừu tượng (abstract method)
                        Khai báo abstract class
                        public abstract class <tên_class){
                            <kiểu_dữ_liệu> <Tên_thuộc_tính>;
                            <access_modifier> <Kiểu_dữ_liệu> <tên_method>(<Tham số>){
                                code block;
                            }
                            <access_modifier> abstract <kiểu_dữ_liệu> <tên_method>(<tham_số>);
                        }
                    . Trừu tượng hoàn toàn - Interface: chỉ chứa abstract method
                        Khai báo
                        public interface <Tên_interface>{
                            <access_modifier> abstract <kiểu_dữ_liệu> <tên_method>(<tham_số>);
                        }

            Constructor: là 1 phương thức đặc biệt dùng để khởi tạo đối tượng của class
                - Trùng tên với class
                - Có 2 loại constructor:
                    + Constructor không có tham số
                        public <Tên_class>(){
                            code block;
                        }
                    + Constructor có tham số
                        public <Tên_class>(<Tham_số>){
                            code block;
                        }
        */

        /*
            1.	Xây dựng hệ thống quản lý nhân sự cơ bản
            a.	Viết Class cơ sở có tên là NhanVien (Employee). Lớp này phải có các trường dữ liệu private sau: MaSo (string), HoTen (string), và LuongCoBan (double). Tạo các properties công khai (public) để truy cập và thay đổi các trường dữ liệu này một cách hợp lý. Cài đặt một Constructor cho phép khởi tạo đối tượng với đủ 3 thông tin trên.
            b.	Viết Class NhanVienChinhThuc (FullTimeEmployee) kế thừa từ lớp NhanVien. Thêm một trường dữ liệu private mới cho lớp con là Thuong (Bonus - double) và một property công khai tương ứng.
            c.	Định nghĩa một Interface có tên là IInThongTin (IPrintable) với một phương thức công khai duy nhất: InChiTiet() (PrintDetails) không có tham số và không trả về giá trị. Thực thi (Implement) interface IInThongTin cho lớp NhanVienChinhThuc. Phương thức InChiTiet() phải in ra màn hình tất cả thông tin chi tiết (Mã số, Họ tên, Lương cơ bản, Thưởng) của nhân viên đó.
            d.	Trong lớp cơ sở NhanVien, định nghĩa một phương thức virtual tên là TinhLuongThucLinh() (CalculateActualSalary) trả về double. Phương thức này mặc định trả về LuongCoBan. Trong lớp NhanVienChinhThuc, ghi đè (override) phương thức TinhLuongThucLinh() để tính toán tổng lương thực lĩnh bao gồm LuongCoBan cộng với Thuong.
            e.	Viết một Class CongTy (Company) chứa một List (hoặc Collection tương đương) các đối tượng thuộc kiểu NhanVien. Cài đặt một phương thức TinhTongLuongPhaiTra() (CalculateTotalSalary) trong lớp CongTy để duyệt qua toàn bộ danh sách nhân viên và sử dụng tính năng Đa hình (Polymorphism) để tính và trả về tổng lương thực lĩnh (sử dụng phương thức TinhLuongThucLinh()) cho tất cả nhân viên trong công ty.
            f.	Trong hệ thống, cần áp dụng mức thuế khác nhau cho từng loại nhân viên (ví dụ: Nhân viên chính thức có thuế 10%, nhân viên thời vụ có thuế 5%). Yêu cầu sinh viên không được thay đổi cấu trúc của lớp NhanVien hiện tại. Sử dụng Abstract Class (hoặc Interface nâng cao) và áp dụng một mẫu thiết kế (ví dụ: Strategy Pattern đơn giản) để tính toán Tiền Thuế của một nhân viên, sau đó điều chỉnh phương thức TinhTongLuongPhaiTra() trong lớp CongTy.
            i.	Định nghĩa một Abstract Class (hoặc Interface) có tên ThueStrategy (TaxStrategy) với một phương thức trừu tượng TinhTienThue(double luong)
            ii.	Tạo hai lớp dẫn xuất cụ thể (ví dụ: ThueNVCThuc và ThueNVThoiVu) để thực thi logic tính thuế riêng (10% và 5%).
            iii.	Cập nhật lớp NhanVien để chứa một thuộc tính (property) ThueApDung kiểu ThueStrategy
            iv.	Cập nhật phương thức TinhTongLuongPhaiTra() trong lớp CongTy để nó truyền lương thực lĩnh của mỗi nhân viên vào ThueApDung của nhân viên đó để tính thuế, sau đó trừ đi tiền thuế đó để tính tổng lương ròng thực tế công ty phải chi trả.

        */
    }
}
