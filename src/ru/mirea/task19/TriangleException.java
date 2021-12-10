package ru.mirea.task19;


class TriangleException extends Exception
{
    long date = 0;

    public String toString()
    {
        return "Wrong angles";
    }
}