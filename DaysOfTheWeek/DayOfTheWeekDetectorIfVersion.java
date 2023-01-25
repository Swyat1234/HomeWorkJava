package Homework2;

class DayOfTheWeekDetectorIfVersion implements DayOfTheWeekDetector, DayOfTheWeekSwitchDetector, DaysOfTheWeekDetectorArray {
    @Override
    public String dayOfTheWeekDetection(int number) {
        if (number == 1) {
            return "Monday";
        } else if (number == 2) {
            return "Tuesday";
        } else if (number == 3) {
            return "Wednesday";
        } else if (number == 4) {
            return "Thursday";
        } else if (number == 5) {
            return "Friday";
        } else if (number == 6) {
            return "Saturday";
        } else if (number == 7) {
            return "Sunday";
        } else {
            return "Please input a valid number between 1 and 7";
        }
    }

    @Override
    public String dayOfTheWeekDetectorSwitch(int number) {
        switch (number) {
            case 1:
                return "Monday";
            case 2:
                return "Tuesday";
            case 3:
                return "Wednesday";
            case 4:
                return "Thursday";
            case 5:
                return "Friday";
            case 6:
                return "Saturday";
            case 7:
                return "Sunday";
            default:
                return "Please input a valid number between 1 and 7";
        }
    }

    @Override
    public String dayOfTheWeekDetectorArray(int number) {
        String[] days = new String[]{"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        for (int i = 0; i < days.length; i++) {

        }
        return days[number];
    }

    public static void main(String[] args) {
        DayOfTheWeekDetectorIfVersion dayOfTheWeekDetectorIfVersion = new DayOfTheWeekDetectorIfVersion();
        System.out.println(dayOfTheWeekDetectorIfVersion.dayOfTheWeekDetection(3));
        System.out.println(dayOfTheWeekDetectorIfVersion.dayOfTheWeekDetectorArray(4));
        System.out.println(dayOfTheWeekDetectorIfVersion.dayOfTheWeekDetectorSwitch(5));
    }
}


