public class Main {
    public static void main(String[] args) {
        //Задание 1
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        //Задание 2
        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        //Задание 3
        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        //Задание 4
        var friend = 19;
        System.out.println(friend);

        friend = friend + 2;
        System.out.println(friend);

        friend = friend / 7;
        System.out.println(friend);

        //Задание 5
        var frog = 3.5;
        System.out.println(frog);

        frog = frog * 10;
        System.out.println(frog);

        frog = frog / 3.5;
        System.out.println(frog);

        frog = frog + 4;
        System.out.println(frog);

        //Задание 6
        var boxerWeight1 = 78.2;
        var boxerWeight2 = 82.7;
        var totalWeight = boxerWeight1 + boxerWeight2;
        var weightDifference = boxerWeight2 - boxerWeight1;
        System.out.println("Общий вес боксеров составляет " + totalWeight);
        System.out.println("Разница составляет " + weightDifference);

        //Задание 7
        var amount1 = 80;
        var amount2 = 61;
        System.out.println("80 % 61 = " + amount1 % amount2);

        //Задание 8
        var totalHours = 640;
        var hoursPerEmployee = 8;
        var totalEmployees = totalHours / hoursPerEmployee;
        System.out.println("Всего работников в компании - " + totalEmployees);

        totalEmployees = totalEmployees + 94;
        var totalHoursExtended = totalEmployees * hoursPerEmployee;
        System.out.println("Если в компании работает " + totalEmployees + " человек, то всего " + totalHoursExtended + " часов работы может быть поделено между сотрудниками");
    }
}