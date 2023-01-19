package homework;

public class ManUnderExperiment {
    public static void main(String[] args) {

//        Pensioner person = new Pensioner();

//        Worker person2 = new Worker("Bob", 3, 40, 70);



//        person1.info();
//        person1.needToWork();
//
//        System.out.println(" ");
//
//        person.info();
//        person.needToWork();
//
//        System.out.println(" ");
//        System.out.print("Money: ");
//
//        person.setMoney(30);
//        System.out.println(person.getMoney());
//
//        person.die();

        Pensioner person = new Pensioner();
        Worker person1 = new Worker();

//        person.setPension(2500);
//        person1.die();
//
//        person.setAge(90);
//        person.die();
        person1.setAge(50);
        person1.setMinSalary(1000);
        person1.setMaxSalary(2000);


        System.out.println(person1.calculatePension());



    }
}
