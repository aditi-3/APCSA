public class Celebrity
{
    String name;
    String hint;

    public Celebrity()
    {
        name = "";
        hint = "";
    }

    public Celebrity(String name, String hint)
    {
        this.name = name;
        this.hint = hint;
    }

    // getters
    public String getName()
    {
        return name;
    }

    public String getHint()
    {
        return hint;
    }

    // setters
    public void setName(String name)
    {
        this.name = name;
    }

    public void setHint(String hint)
    {
        this.hint = hint;
    }

    public String toString()
    {
        return name;
    }

    public boolean equals(Celebrity c)
    {
        if (this.name.equals(c.name))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}