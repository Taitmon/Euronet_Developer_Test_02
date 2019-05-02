package com.company;

public class Record
{
    private String name;
    private String address;
    private String profession;

    public Record(String name, String address, String profession)
    {
        this.name = name;
        this.address = address;
        this.profession = profession;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getAddress()
    {
        return address;
    }

    public void setAddress(String address)
    {
        this.address = address;
    }

    public String getProfession()
    {
        return profession;
    }

    public void setProfession(String profession)
    {
        this.profession = profession;
    }
}
