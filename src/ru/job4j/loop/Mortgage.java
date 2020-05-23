package ru.job4j.loop;

//5.7. Ипотека. [#285345]

public class Mortgage {


    public int year(int amount, int salary, double percent) {
        int year = 1;
        double residue = amount * (1 + 0.01 * percent);
        while (salary < residue) {
            residue = residue - salary;
            residue = residue * (1 + 0.01 * percent);
             year += 1;
                    }
        return year;
    }
}
