package principle.homework;

public class CustomerDao {

    public static void main(String[] args) {
        Transfer transfer = new ExcelDataConvertor();
        transfer.readFile();

        transfer = new TxtDataConvertor();
        transfer.readFile();

        new CustomerDao().addCustomer();
    }

    public void addCustomer() {
        System.out.println("利用解析的客户数据在数据库表中增加信息");
    }
}

interface Transfer {
    public void readFile();
}

class ExcelDataConvertor implements Transfer {

    public void readFile() {
        System.out.println("从excel读取数据");
    }
}

class TxtDataConvertor implements Transfer {
    public void readFile() {
        System.out.println("从tXt读取数据");
    }
}


