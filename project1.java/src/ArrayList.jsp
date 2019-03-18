[java]

//ArrayList which contains list of student details

&lt;%
ArrayList &lt;studentBean&gt; arl=(ArrayList) request.getAttribute("studentBean");
%&gt;

&lt;table&gt;
&lt;tr&gt;
&lt;th&gt;STUDENTID &lt;/th&gt;
&lt;th&gt;FIRST NAME &lt;/th&gt;
&lt;th&gt;LASTNAME&lt;/th&gt;
&lt;th&gt;CLASS&lt;/th&gt;

&lt;/tr&gt;

&lt;% try
{
for(int i=0;i&lt;arl.size();i++)
{
&lt;tr&gt;
&lt;td&gt;&lt;%=arl.get(i).getstudentID()%&gt;&lt;/td&gt;
&lt;td&gt;&lt;%=arl.get(i).getstudentFname()%&gt;&lt;/td&gt;
&lt;td&gt;&lt;%=arl.get(i).getstudentLname()%&gt;&lt;/td&gt;
&lt;td&gt;&lt;%=arl.get(i).getClass1()%&gt;&lt;/td&gt;
&lt;/tr&gt;
&lt;%}
}
catch(Exception e)
{
System.out.println("Exception");
}
%&gt;
&lt;/table&gt;
.
[/java]

