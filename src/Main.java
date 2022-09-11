public class Main {
    public static void main(String[] args){
        //Задача 6
        System.out.println("   Задача 6");
    var boxerWeight1 = 78.2;
    var boxerWeight2 = 82.7;
        System.out.println("Общий вес бойцов " + boxerWeight1 + boxerWeight2 + " кг");

        //Задача 7
        System.out.println("   Задача 7");
        System.out.println("Разница в весе (1 способ) " + (boxerWeight2 - boxerWeight1) + " кг");
        System.out.println("Разница в весе (2 способ) " + (boxerWeight2 % boxerWeight1) + " кг");

        //Задача 6
        System.out.println("   Задача 8");
    var totalWorkTime = 640;
    var workerWorkTime = 8;
    var totalWorkers = totalWorkTime / workerWorkTime;
        System.out.println("Всего работников в компании - " + totalWorkers + " человек");
    var totalWorkers1 = totalWorkers + 94;
    var totalWorkTime1 = totalWorkers1 * workerWorkTime;
        System.out.println("Если в компании работает " + totalWorkers1 + " человек, то всего " +totalWorkTime1 + " часов работы может быть поделено между сотрудниками");
    }
}
