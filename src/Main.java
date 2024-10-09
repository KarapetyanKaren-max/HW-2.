public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int myInt = 121;
        System.out.println("Значение переменной myInt с типом Int = 121");
        byte myByte = 20;
        System.out.println("Значение переменной myByte с типом Byte = 20");
        short myShort = 40;
        System.out.println("Значение переменной myShort с типом Byte = 40");
        long myLong = 2342340000L;
        System.out.println("Значение переменной myLong с типом Long = 2342340000L");
        float myfloat = 23.0325F;
        System.out.println("Значение переменной myfloat с типом Float = 23.0325f");
        double myDouble = 35.2;
        System.out.println("Значение переменной myDouble с типом Double = 35.2");


        double a = 27.12;
        System.out.println("double 27.12");
        long b = 987678965549L;
        System.out.println("long 987678965549L");
        float c = 2.786F;
        System.out.println("float 2.786F");
        int d = 569;
        System.out.println("int 569");
        short e = -159;
        System.out.println("short -159");
        int f = 27897;
        System.out.println("int 27897");
        byte g = 67;
        System.out.println("byte 67");

        int studentsOfClass1 = 23;
        System.out.println(23);
        int studentsOfClass2 = 27;
        System.out.println(27);
        int studentsOfClass3 = 30;
        System.out.println(30);
        int totalSheets = 480;
        System.out.println(480);

        int totalStudents = studentsOfClass1 + studentsOfClass2 + studentsOfClass3;
        System.out.println(studentsOfClass1 + studentsOfClass2 + studentsOfClass3);
        int sheetsPerStudent = totalSheets / totalStudents;

        System.out.println("На каждого ученика рассчитано " + sheetsPerStudent + " листов бумаги");

        int bottlesIn2Minute = 16;
        int bottlesInMinute = 8;
        int minutesInDay = 1440;
        int minutesInThreeDays = 3 * minutesInDay;
        int minutesInMonth = 30 * minutesInDay;
        int bottlesIn20minutes = bottlesInMinute * 20;

        int bottlesInDay = bottlesInMinute * minutesInDay;
        int bottlesIn3Days = bottlesInMinute * minutesInThreeDays;
        int bottlesInMonth = bottlesInMinute * minutesInMonth;

        System.out.println("за 20 минут машина произвела " + bottlesIn20minutes + " штук бутылок");
        System.out.println("за сутки машина произвела " + bottlesInDay + " штук бутылок");
        System.out.println("за 3 дня машина произвела " + bottlesIn3Days + " штук бутылок");
        System.out.println("за месяц машина произвела " + bottlesInMonth + " штук бутылок");

        int totalCans = 120;
        System.out.println(totalCans);
        int whiteCansPerClass = 2;
        System.out.println(whiteCansPerClass);
        int brownCansPerClass = 4;
        System.out.println(brownCansPerClass);

        int totalClasses = totalCans / (whiteCansPerClass + brownCansPerClass);
        System.out.println(totalClasses);
        int totalWhiteCans = totalClasses * whiteCansPerClass;
        System.out.println(totalWhiteCans);
        int totalBrownCans = totalClasses * brownCansPerClass;
        System.out.println(totalBrownCans);

        System.out.println("В школе. где " + totalClasses + " классов. нужно " + totalWhiteCans + " банок белой краскт " + totalBrownCans + " банок коричневой краски");

        int bananasCount = 5;
        System.out.println(bananasCount);
        int bananasaWeight = 80;
        System.out.println(bananasaWeight);
        int milkVolume = 200;
        System.out.println(milkVolume);
        int milkWeightGr = 105;
        System.out.println(milkWeightGr);
        int iceCreamWeight = 200;
        System.out.println(iceCreamWeight);
        int eggsCount = 4;
        System.out.println(eggsCount);
        int eggsWeight = 70;
        System.out.println(eggsWeight);

        int totalWeightGr = bananasCount * bananasaWeight + milkVolume * milkWeightGr / 100 + iceCreamWeight + eggsCount * eggsWeight;
        System.out.println(totalWeightGr);
        double totalWeightInnKg = (double)totalWeightGr / 1000.0;
        System.out.println(totalWeightInnKg);

        int weightLossGoalKg = 7;
        System.out.println(weightLossGoalKg);
        double dailyWeightLossLowKg = 0.25;
        System.out.println(dailyWeightLossLowKg);
        double dalyWeightLossHighKg = 0.5;
        System.out.println(dalyWeightLossHighKg);

        int daysLow = (int)((double)weightLossGoalKg / dailyWeightLossLowKg);
        System.out.println(daysLow);
        int daysHigh = (int)((double)weightLossGoalKg / dalyWeightLossHighKg);
        System.out.println(daysHigh);

        int daysAverage = (daysLow + daysHigh) / 2;
        System.out.println(daysAverage);

        int mashaSalary = 67760;
        System.out.println(mashaSalary);
        int denisSalary = 83690;
        System.out.println(denisSalary);
        int kristinaSalary = 76230;
        System.out.println(kristinaSalary);

        int mashaNewSalary = (int)((double)mashaSalary * 1.1);
        System.out.println(mashaNewSalary);
        int denisNewSalary = (int)((double)denisSalary * 1.1);
        System.out.println(denisNewSalary);
        int kristinaNewSalary = (int)((double)kristinaSalary * 1.1);

        System.out.println(kristinaNewSalary);
        int mashaSalaryBeforeIndexation = mashaSalary * 12;
        System.out.println(mashaSalaryBeforeIndexation);
        int denisSalaryBeforeIndexation = denisSalary * 12;
        System.out.println(denisSalaryBeforeIndexation);
        int kristinaSalaryBeforeIndexation = kristinaSalary * 12;
        System.out.println(kristinaSalaryBeforeIndexation);

        int mashaSalaryAfterIndexation = mashaNewSalary * 12;
        System.out.println(mashaSalaryAfterIndexation);
        int denisSalaryAfterIndexation = denisNewSalary * 12;
        System.out.println(denisSalaryAfterIndexation);
        int kristinaAfterBeforeIndexation = kristinaNewSalary * 12;
        System.out.println(kristinaAfterBeforeIndexation);

        int mashaDifferenceBetweenAnnualIncome = mashaSalaryAfterIndexation - mashaSalaryBeforeIndexation;
        System.out.println(mashaDifferenceBetweenAnnualIncome);
        int denisDifferenceBetweenAnnualIncome = denisSalaryAfterIndexation - denisSalaryBeforeIndexation;
        System.out.println(denisDifferenceBetweenAnnualIncome);
        int kristinaDifferenceBetweenAnnualIncome = kristinaAfterBeforeIndexation - kristinaSalaryBeforeIndexation;
        System.out.println(kristinaDifferenceBetweenAnnualIncome);

        System.out.println(" Маша теперь получает " + mashaNewSalary + " рублей. Годовой доход вырос " + mashaDifferenceBetweenAnnualIncome + " рублей ");
        System.out.println(" Денис теперь получает " + denisNewSalary + " рублей. Годовой доход вырос " + denisDifferenceBetweenAnnualIncome + " рублей ");
        System.out.println(" Кристина теперь получает " + kristinaNewSalary + " рублей. Годовой доход вырос " + kristinaDifferenceBetweenAnnualIncome + " рублей ");

    }
    }