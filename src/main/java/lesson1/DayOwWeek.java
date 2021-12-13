package lesson1;

public enum DayOwWeek {
    Monday(40,true),
    Tuesday(32,true),
    Wednesday(24,true),
    Thursday(16,true),
    Friday(8,true),
    Saturday(0,false),
    Sunday(0,false);

    private int hour;
    private boolean workingDay;

    DayOwWeek(int hour, boolean workingDay){
        this.hour = hour;
        this.workingDay = workingDay;
    }
}
