public class Main {
    public static void main(String[] args){
    var boxerWeight1 = 78.2;
    var boxerWeight2 = 82.7;
    var boxerTotalWeight = boxerWeight1 + boxerWeight2;
        System.out.println("Общий вес бойцов " + boxerTotalWeight + " кг");

    var boxerWeightDifference = boxerWeight2 - boxerWeight1;
        System.out.println("Разница в весе " + boxerWeightDifference + " кг");
    var boxerWeightDifference1 = boxerWeight2 % boxerWeight1;
        System.out.println("Разница в весе " + boxerWeightDifference1 + " кг");

    var totalWorkTime = 640;
    var workerWorkTime = 8;
    var totalWorkers = totalWorkTime / workerWorkTime;
        System.out.println("Всего работников в компании - " + totalWorkers + " человек");
    var totalWorkers1 = totalWorkers + 94;
    var totalWorkTime1 = totalWorkers1 * workerWorkTime;
        System.out.println("Если в компании работает " + totalWorkers1 + " человек, то всего " +totalWorkTime1 + " часов работы может быть поделено между сотрудниками");
    }
}
