/*
About such generic classes...
1. I may have only allowed this one to accept one thing, but you can do two or more generic variables.
Just add them as you would variables here in the class, but then the objects made in Main.java should have syntax
similar to making a hashmap.
2. If you wanna make bounded types (make your generic class ) make a T/Thing of your choosing
extend a class that only deals in certain data types. Like if you're only numerical data types,
the thing should extend Number class.
It may be dumb to copy a while program, but lemme use Bro Code's modifications to show how #1 and #2 work:
public class MyGenericClass <Thing extends Number, Thing2 extends Number>
{

	Thing x;
	Thing2 y;

	MyGenericClass(Thing x, Thing2 y)
	{
		this.x = x;
		this.y = y;
	}

	public Thing2 getValue()
	{
		return y;

	}
}
 */

public class OneSizeFitsAll<T>
{
    T x;
    OneSizeFitsAll(T y)
    {
        this.x=y;
    }

    public T getValue ()
    {
        return x;
    }
}
