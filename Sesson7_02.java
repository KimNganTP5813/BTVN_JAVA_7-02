public class Sesson7_02 {
    public static void main(String[] args) {
        // Khởi tạo đối tượng
        Book myBook = new Book();

        // Thiết lập thuộc tính
        myBook.setTitle("Java Programming");
        myBook.setAuthor("John Doe");

        // Thiết lập giá
        myBook.setPrice(29.99);

        // Hiển thị thông tin
        System.out.println("Tiêu đề: " + myBook.getTitle());
        System.out.println("Tác giả: " + myBook.getAuthor());
        System.out.println("Giá: " + myBook.getPrice());

        // Thay đổi giá thành công
        myBook.setPrice(35.50);
        System.out.println("Giá mới: " + myBook.getPrice());

        // Thay đổi giá không hợp lệ
        myBook.setPrice(-5.00);
    }
}
