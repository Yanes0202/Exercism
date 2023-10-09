package org.adrian.com.birdWatcher;

class BirdWatcher {
    private final int[] birdsPerDay;
    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }
    public int getTodayIndex() {
        return birdsPerDay.length - 1;
    }
    public int[] getLastWeek() {
        return birdsPerDay;
    }
    public int getToday() {
        return birdsPerDay[getTodayIndex()];
    }
    public void incrementTodaysCount() {
        birdsPerDay[getTodayIndex()] = getToday() + 1;
    }
    public boolean hasDayWithoutBirds() {
        boolean hasZeroBirds = false;
        for (int i: birdsPerDay) {
            if (i == 0) {
                hasZeroBirds = true;
            }
        }
        return hasZeroBirds;
    }
    public int getCountForFirstDays(int numberOfDays) {
        int birdCount = 0;
        int index = Math.min(numberOfDays, birdsPerDay.length);

        for (int i = index; i > 0; i--) {
            birdCount += birdsPerDay[i - 1];
        }
        return birdCount;
    }
    public int getBusyDays() {
        int busyDays = 0;
        for (int i: birdsPerDay) {
            if(i >= 5) {
                busyDays++;
            }
        }
        return busyDays;
    }
}
