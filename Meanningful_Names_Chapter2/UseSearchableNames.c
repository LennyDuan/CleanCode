// much easier it will be to find WORK_DAYS_PER_WEEK than to find all the places where 5 was used and filter the list down to just the instances with the intended meaning.
// Bad Code
for (int j = 0; j < 34; j ++) {
    s += (t[j] * 4) / 5;
}
// Good Code
int realDaysPerIdealDay = 4;
const int WORK_DAYS_PER_WEEK = 5;
int sum = 0;
for (int j=0; j < NUMBER_OF_TASKS; j++) {
    int realTaskDays = taskEstimate[j] * realDaysPerIdealDay; 
    int realTaskWeeks = (realdays / WORK_DAYS_PER_WEEK);
    sum += realTaskWeeks;
}
