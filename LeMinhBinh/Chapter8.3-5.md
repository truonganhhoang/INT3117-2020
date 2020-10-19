# Chapter 8.3-5

```Java
public static void checkItExpand (boolean a, boolean b, boolean c)
{
	System.out.println("A");
	if(a)
	{	System.out.println("B")
		if(b){
		System.out.println("P is true");
		}
		else {
		System.out.println("C");
		if(c)
		{
		System.out.println("P isn't true");
		}
	}
	}
	else{
	System.out.println ("P isn’t true");
	}
}
```

<br/>`TR1 (T,T,T) p T `
<br/>`TR2 (F,T,T) p F`
<br/>`TR3 (T,T,F) p T`
<br/>`TR4 (F,T,F) p F`
<br/>`TR5 (T,F,T) p T`
<br/>`TR6 (F,F,T) p F`
<br/>`TR7 (T,F,F) p F`
<br/>`TR8 (F,F,F) p F`

`T1 ((TR1,TR2),(TR1,TR4),(TR1,TR6),(TR3,TR2),(TR3,TR4),(TR3,TR6),(TR5,TR2),(TR5,TR4),(TR5,TR6))`

`T2 ((TR1,TR7),(TR1,TR8),(TR3,TR7),(TR3,TR8),(TR3,TR7),(TR5,TR7),(TR5,TR8))`
