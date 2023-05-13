package com.luciaspackage;

public class EmployeeSalary {
    private int baseSalary;
    private int hourlyRate;


    public EmployeeSalary(int baseSalary, int hourlyRate){
        setBaseSalary(baseSalary);
        setHourlyRate(hourlyRate);
    }

    public EmployeeSalary(int baseSalary){
        this(baseSalary,0);
    }

    public int calculateWage(int extraHours){
        return baseSalary + (hourlyRate * extraHours);
    }

    public int calculateWage(){
        return calculateWage(0);
    }


    private void setBaseSalary(int baseSalary){
        if(baseSalary <= 0){
            throw new IllegalArgumentException("Salary cant be 0 or less");
            }
        this.baseSalary = baseSalary;
    }


    private int getBaseSalary(){

        return baseSalary;
    }

    private void setHourlyRate(int hourlyRate) {
        if(hourlyRate < 0){
            throw new IllegalArgumentException("hourlyRate cant be 0 or less");
        }
        this.hourlyRate = hourlyRate;
    }

    private int getHourlyRate() {
        return hourlyRate;
    }
}
