package edu.alex.java;

import edu.alex.java.utils.StringUtils;

/**
 * Created by Alex on 11-Mar-17.
 */
public enum Food
{
    GRAINS(1), MEAT(2), GRASS(3);

    private int aVal;

    private Food(int aVal)
    {
        this.aVal = aVal;
    }

    public static Food fromInt(int n) {
        //return new Colors(n);
        for (Food c : values()) {
            if (c.aVal == n)
                return c;
        }
        return null;//throw exception.
    }

    @Override
    public String toString() {
        String upper = super.toString();
        return StringUtils.capitalize(upper);

    }
}

