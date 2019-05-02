package com.company;

import java.util.HashMap;

public class Main
{

    public static void main(String[] args)
    {
        Record one = new Record("Bob Smith", "453 Quota Road, AR-72056", "Teacher");
        Record two = new Record("Joe Hender", "567 Sample Road, AR-72056", "Programmer");
        Record three = new Record("David Ron", "333 Sample1 Road, AR-72056", "Contractor");
        Record four = new Record("Bob Smith", "567 Sample Road, AR-72056", "Programmer");

        HashMap<Integer, Record> records = new HashMap<>();
        
        records.put(1, one);
        records.put(2, two);
        records.put(3, three);
        records.put(4, four);

        for(Record record : records.values())
        {
            if(record.getProfession().equals("Programmer"))
            {
                System.out.println("Name: " + record.getName());
                System.out.println("Address: " + record.getAddress());
                System.out.println("Profession: " + record.getProfession() + "\n");
            }
        }
    }
}
