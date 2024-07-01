class W03_01_NetPrice {
    public static void main(String[] args) {
        // ราคา
        short price = 350;

        // ส่วนลด
        byte quantity = 10;
        byte percentDiscount = 5;

        // ราคาทั้งหมด, ส่วนลด, ราคาส่วนลด
        int totalPrice = price * quantity, discount = totalPrice * percentDiscount / 100,
                netPrice = totalPrice - discount;

        // แสดงชื่อ ASCII กับแสดงจำนวณรูปแบบตาราง พร้อมกับ ข้อมูลนักศีกษา
        System.out.println(
                "\n\n\n\s\s\s\s\s    _ _           _   _          \n\s\s\s\s\s   (_|_)         | | | |         \n\s\s\s\s\s    _ _ _ __ __ _| |_| |__ __  __\n\s\s\s\s\s   | | | '__/ _` | __| '_ \\\\ \\/ /\n\s\s\s\s\s   | | | | | (_| | |_| | | |>  < \n\s\s\s\s\s   | |_|_|  \\__,_|\\__|_| |_/_/\\_\\\n\s\s\s\s\s  _/ |                           \n\s\s\s\s\s |__/                             \n\n||\sTotal Price\s|\s\s|\sDiscount\s|\s\s|\sNet Price\s||\n\s\s\s\s\s\s"
                        + String.valueOf(totalPrice) + "\s\s\s\s\s\s\s\s\s\s\s\s"
                        + String.valueOf(discount) + "\s\s\s\s\s\s\s\s\s\s\s" + String.valueOf(netPrice)
                        + "\n\n------------------------------------------------------\n\n||\s\s\s\s\s\s\s\s\sName\s\s\s\s\s\s\s\s\s|\sClass\s|\sStudent ID\s||\n\s\s\s\sJiramate Thongpleaw\s\s\s67/44\s\s\s\s674230013\s\n\n------------------------------------------------------");
    }
}