public class Main {
    public static void main(String[] args) {
        //task 1
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        //task 2
        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        //task 3
        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        //task 4
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);

        //task 5
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);

        //task 6
        var boxerFirst = 78.2;
        var boxerSecond = 82.7;
        var generalWeight = boxerFirst + boxerSecond;
        System.out.println(generalWeight);
        var differenceWeight = boxerSecond - boxerFirst;
        System.out.println(differenceWeight);

        //task 7
        var remainder = boxerSecond % boxerFirst;
        System.out.println(remainder);

        //task 8
        var generalHours = 640;
        var hoursPerOne = 8;
        var employeesAmount = generalHours / hoursPerOne;
        System.out.println("Всего работников в компании " + employeesAmount + " человек");
        var newEmployees = 94;
        var newGeneralHours = generalHours + newEmployees * hoursPerOne;
        System.out.println("Если в компании работает " + (employeesAmount + newEmployees) + " человек, то всего "
                + newGeneralHours + " часов работы может быть поделено между сотрудниками");


    }
}