package com.epam.JUNIT1;

public class delete2As {



	public String removeAs(String string )
	{
		String result="";
		int stringLength=string.length();
		if(string.isEmpty())
			
			result="";
		if(stringLength>=2)
		{
			if(string.charAt(0)=='A'||string.charAt(1)=='A')
			{
				if(string.charAt(0)=='A'&&string.charAt(1)!='A')
					result=string.substring(1,stringLength);
				if(string.charAt(0)!='A'&&string.charAt(1)=='A')
					result=string.charAt(0)+string.substring(2,stringLength);
				if(string.charAt(0)=='A' && string.charAt(1)=='A')
					result=string.substring(2,stringLength);
				
			}
			else 
				result=string;
		}
		return result;
	}
}

