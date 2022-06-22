package HomeWork.lesson5;

public class lesson5 {
    public static void main(String[] args) {
        worker[] empCorp = new worker[5];
        empCorp[0] = new worker("Gabriel", "quality assurance", "gab@mailbox.com", "9208884422",100000,25);
        empCorp[1] = new worker("Rafael", "web designer", "raf@mailbox.com", "9661112233",150000,30);
        empCorp[2] = new worker("Lucifer", "network administrator", "luc@mailbox.com", "9996660666",100000,37);
        empCorp[3] = new worker("Mikhail", "game developer", "mih@mailbox.com", "9777777777",500000,41);
        empCorp[4] = new worker("Sariel", "front-end developer", "sar@mailbox.com", "9997772244",150000,27);
        for (worker employee : empCorp)
            if (employee.getAge()>40)
                System.out.println(employee);

    }
}
class worker {
    private String name;
    private String position;
    private String email;
    private String phone;
    private int salary;
    private int age;

    public worker(String name, String position, String email, String phone, int salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }
    public int getAge() {
        return age;
    }
    @Override
    public String toString(){
        return(name+ "\n-"
                +position+ "\n-"
                +email+ "\n-"
                +phone+ "\n-"
                +salary+ "\n-"
                +age);
    }
}
//