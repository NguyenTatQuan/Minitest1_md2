package Minitest1;

    public class Main {
        public static void main(String[] args) {
            Book f1 = new FictionBook(01, "Sach ngon tinh", 120, "TG1", "Tieu Thuyet");
            Book f2 = new FictionBook(02, "Sach ngon tinh", 120, "TG2", "Viễn tưởng 1");
            Book f3 = new FictionBook(03, "Sach ngon tinh", 120, "TG3", "Viễn tưởng 1");
            Book p1 = new ProgrammingBook(04, "Java", 100, "TG4", "Java", "TA");
            Book p2 = new ProgrammingBook(05, "Java", 100, "TG5", "Java", "TA");
            Book p3 = new ProgrammingBook(06, "Java", 100, "TG6", "Java", "TA");

            Book[] books = {f1, f2, f3, p1, p2, p3};
            double total = 0;
            for (Book book : books) {
                total += book.getPrice();
            }
            System.out.println("Tổng giá tiền các cuốn sách = " + total);

            int countJava = 0;
            for (int i = 0; i < books.length; i++) {
                if (books[i] instanceof ProgrammingBook) {
                    ProgrammingBook b = (ProgrammingBook) books[i];
                    if(b.getLanguage().equals("Java")){
                        countJava++;
                    }
                }
            }
            System.out.println("Có " + countJava + " sách có ngôn ngữ Java");

            int countVien = 0;
            for (int i = 0; i < books.length; i++) {
                if (books[i] instanceof FictionBook) {
                    FictionBook c = (FictionBook) books[i];
                    if(c.getCategory().equals("Viễn tưởng 1")){
                        countVien++;
                    }
                }
            }
            System.out.println("Có " + countVien + " sách có thể loại Viễn tưởng 1");

            int countPrice = 0;
            for (int i = 0; i < books.length; i++) {
                Book d = (Book) books[i];
                if(d.getPrice() < 100){
                    countPrice++;
                }
            }
            System.out.println("Có " + countVien + " sách có giá nhỏ hơn 100");
        }

    }

