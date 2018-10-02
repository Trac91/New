public class Animal {
    private String type;
    private String[] continent;
    private double weight;
    private int age;

    public void setType(String type)
    {
        this.type = type;
    }
    public String getType()
    {
        return type;
    }
    public void setWeight(double weight)
    {
        this.weight = weight;
    }
    public double getWeight()
    {
        return weight;
    }
    public void setAge(int age)
    {
        this.age = age;
    }
    public int getAge()
    {
        return age;
    }

    public Animal()
    {
        this.type = "No Type specified";
        this.continent = null;
        this.weight = 0.0;
        this.age = 0;
    }
    public Animal (String type, String continent, double weight, int age)
    {
       setType(type);
       setWeight(weight);
       setAge(age);
    }

    public String toString()
    {
        return System.out.println("Type" + type + "Continent" + continent + "Weight" + weight + "Age" + age);

    }

    }
