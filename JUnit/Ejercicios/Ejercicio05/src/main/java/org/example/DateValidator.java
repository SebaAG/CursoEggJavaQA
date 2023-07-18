package org.example;

import java.util.Calendar;

public class DateValidator {

    public boolean validDate(int d, int m, int y) {
        // Verificar si el año es válido (mayor que 0)
        if (y <= 0) {
            return false;
        }

        // Verificar si el mes es válido (entre 1 y 12)
        if (m < 1 || m > 12) {
            return false;
        }

        if (m == 2 && isLeapYear(y)) {
            return d <= 29;
        }

        // Verificar si el día es válido (entre 1 y 31, dependiendo del mes)
        return d >= 1 && d <= daysInMonth(m, y);


    }

    public int daysInMonth(int m, int y) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR, y);
        calendar.set(Calendar.MONTH, m - 1); // Restamos 1 al mes, ya que Calendar.MONTH es zero-based
        return calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
    }

    public boolean isLeapYear(int y) {
        return (y % 4 == 0 && y % 100 != 0) || (y % 400 == 0);
    }
}

// zero-based = se usa el m - 1 para ajustar el mes ingresado
// 0 = enero y 11 = diciembre