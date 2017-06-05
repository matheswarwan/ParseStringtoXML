import java.util.ArrayList;
import java.util.List;

import org.omg.PortableServer.ForwardRequestHelper;


public class stringToXML {
	public static void main(String[] args) throws Exception {
	// TODO Auto-generated method stub
	/*String test = "&lt;GL_DESC1&gt;1st Pro Rate test data&lt;Test 123&lt;/GL_DESC1&gt;"
		+ "&lt;GL_CODE&gt;2nd Pro Rate test data&lt;Test 123&lt;/GL_CODE&gt;";*/
	//String test = " &lt;CreateGLDChatDetailResMsg xmlns=&quot;http://www.citi.com/GTS/ICG/FLB/GLDChatDetailSchema.xsd&quot; xmlns:xsi=&quot;http://www.w3.org/2001/XMLSchema-instance&quot; xsi:schemaLocation=&quot;http://www.citi.com/GTS/ICG/FLB/GLDChatDetailSchema.xsd GLDChat_Details.xsd&quot;&gt; &lt;CommonHdr&gt; &lt;ServiceName&gt;FLXB-RT-GLDCHACT&lt;/ServiceName&gt; &lt;ServiceVersion&gt;1.0&lt;/ServiceVersion&gt; &lt;Operation&gt;Create&lt;/Operation&gt; &lt;PPCSIID&gt;163007&lt;/PPCSIID&gt; &lt;PPShortName&gt;SYSOPS&lt;/PPShortName&gt; &lt;CountryCode&gt;BE&lt;/CountryCode&gt; &lt;HOBranchCode&gt;CGP&lt;/HOBranchCode&gt; &lt;BranchCode&gt;BE1&lt;/BranchCode&gt; &lt;RequestID&gt;407366&lt;/RequestID&gt; &lt;TotalRecords&gt;1&lt;/TotalRecords&gt; &lt;/CommonHdr&gt; &lt;GLDChatDetailRes&gt; &lt;GL_CODE&gt;125057001&lt;/GL_CODE&gt; &lt;REFINANCE_REQD&gt;N&lt;/REFINANCE_REQD&gt; &lt;INTERNAL_GL_TYPE&gt;N&lt;/INTERNAL_GL_TYPE&gt; &lt;BRANCH_RESTRICTION/&gt; &lt;REFINANCE_IC_GL/&gt; &lt;CHECKER_ID&gt;SYSTEMAU&lt;/CHECKER_ID&gt; &lt;CHECKER_DT_STAMP&gt;2016-04-29&lt;/CHECKER_DT_STAMP&gt; &lt;MAKER_DT_STAMP&gt;2016-04-29&lt;/MAKER_DT_STAMP&gt; &lt;MAKER_ID&gt;SYSTM&lt;/MAKER_ID&gt; &lt;PL_SPLIT_REQD&gt;N&lt;/PL_SPLIT_REQD&gt; &lt;RAC_RATES_APPLICABLE&gt;N&lt;/RAC_RATES_APPLICABLE&gt; &lt;AVG_BAL_REQD&gt;N&lt;/AVG_BAL_REQD&gt; &lt;CHARGE_DETAILS&gt;B&lt;/CHARGE_DETAILS&gt; &lt;RECON_INCR_ALLOWED&gt;N&lt;/RECON_INCR_ALLOWED&gt; &lt;ONLINE_UPDATE&gt;Y&lt;/ONLINE_UPDATE&gt; &lt;DFLT_GAAP_INDICATOR/&gt; &lt;YND_BAL_XFER_REQD&gt;N&lt;/YND_BAL_XFER_REQD&gt; &lt;LD_REFINANCE_GL&gt;N&lt;/LD_REFINANCE_GL&gt; &lt;AC_NETTING&gt;R&lt;/AC_NETTING&gt; &lt;MSG_NETTING&gt;Y&lt;/MSG_NETTING&gt; &lt;APPLY_GAAP_RESTRICTION&gt;N&lt;/APPLY_GAAP_RESTRICTION&gt; &lt;MOD_NO&gt;1&lt;/MOD_NO&gt; &lt;CATEGORY&gt;1&lt;/CATEGORY&gt; &lt;CUSTOMER&gt;I&lt;/CUSTOMER&gt; &lt;TYPE&gt;1&lt;/TYPE&gt; &lt;REVAL/&gt; &lt;HO_RES/&gt; &lt;LEAF&gt;Y&lt;/LEAF&gt; &lt;GL_DESC&gt;PastDConvenlResMtg90-179DPro20%&lt;/GL_DESC&gt; &lt;CCY_POS_GL&gt;A&lt;/CCY_POS_GL&gt; &lt;FLG_POSITION_AC&gt;N&lt;/FLG_POSITION_AC&gt; &lt;CCY_RES&gt;A&lt;/CCY_RES&gt; &lt;PARENT_GL&gt;125057000&lt;/PARENT_GL&gt; &lt;RECON&gt;D&lt;/RECON&gt; &lt;POSTING_RES&gt;Y&lt;/POSTING_RES&gt; &lt;BLOCK&gt;N&lt;/BLOCK&gt; &lt;AUTH_STAT&gt;A&lt;/AUTH_STAT&gt; &lt;ONCE_AUTH&gt;Y&lt;/ONCE_AUTH&gt; &lt;RECORD_STAT&gt;O&lt;/RECORD_STAT&gt; &lt;ULTI_PARENT/&gt; &lt;FIRST_AUTH&gt;Y&lt;/FIRST_AUTH&gt; &lt;VERSION_NO&gt;1&lt;/VERSION_NO&gt; &lt;/GLDChatDetailRes&gt; &lt;ResStatus&gt; &lt;StatusCode&gt;S&lt;/StatusCode&gt; &lt;ErrorInfo&gt; &lt;ErrorCode/&gt; &lt;ErrorMsg/&gt; &lt;/ErrorInfo&gt; &lt;WarningInfo&gt; &lt;WarningCode/&gt; &lt;WarningMsg/&gt; &lt;/WarningInfo&gt; &lt;/ResStatus&gt; &lt;/CreateGLDChatDetailResMsg&gt;";
		String test = "&lt;root&gt;&lt;child1&gt;Content for child 1&lt;/child1&gt;&lt;child2&gt;Content for child 2&lt;/child2&gt;&lt;child3&gt;Content for child 3&lt;/child3&gt;&lt;child4&gt;&lt;child1ofChild4&gt; Content of child 1 of child 4&lt;/child1ofChild4&gt;&lt;/child4&gt;&lt;child5/&gt;&lt;/root&gt;";	
		//Single Tag Content 
	//String test ="&lt;ServiceName&gt;FLXB-RT-GLDCHACT&lt;/ServiceName&gt; &lt;ServiceVersion&gt;1.0&lt;/ServiceVersion&gt; &lt;Operation&gt;Create&lt;/Operation&gt; &lt;PPCSIID&gt;163007&lt;/PPCSIID&gt; &lt;PPShortName&gt;SYSOPS&lt;/PPShortName&gt; &lt;CountryCode&gt;BE&lt;/CountryCode&gt; &lt;HOBranchCode&gt;CGP&lt;/HOBranchCode&gt; &lt;BranchCode&gt;BE1&lt;/BranchCode&gt; &lt;RequestID&gt;407366&lt;/RequestID&gt; &lt;TotalRecords&gt;1&lt;/TotalRecords&gt;"; 
	getTagList(test);
	
}
	public static void getChildElements(String xml)
	{
		
	}
    public static void getTagList(String xml)
    {              
        //Find number of close tags '&lt;/'
        String closeTag = "&lt;/";
        int lastIndex = 0;
        int count = 0;

        while(lastIndex != -1){
            lastIndex = xml.indexOf(closeTag,lastIndex);
            if(lastIndex != -1){
                count ++;
                lastIndex += closeTag.length();
            }
        }
        //for (int i = 0; i < count; i++)  ,getTag(xml)
        {
            System.out.println(getContentForTag(xml,"child1"));
            xml = getNewXMLAfterTag(xml);
            System.out.println(getContentForTag(xml,"child2"));
            xml = getNewXMLAfterTag(xml);
        }
                    
    }


	/*	public static void getTagList(String xml)
	{	
		//Find number of close tags '&lt;/' and '/&lt;'
		String closeTag = "&lt;/";
		String closeTag2 = "/&gt;";
		String originalXML = xml;
		String tagName = null;
		List<String> tagList = new ArrayList<String>();
		int lastIndex = 0;
		int count = 0;

		while(lastIndex != -1){
		    lastIndex = xml.indexOf(closeTag,lastIndex);
		    if(lastIndex != -1){
		        count ++;
		        lastIndex += closeTag.length();
		        System.out.println("* "+ lastIndex + " -- " + xml.substring(lastIndex,xml.indexOf("&gt;",lastIndex)));
		        tagName = xml.substring(lastIndex,xml.indexOf("&gt;",lastIndex));
		        tagList.add(tagName);
		    }
		}
		
		 * To handle - &lt;child5/&gt;
		 
		
		xml = originalXML ;
		lastIndex = 0;
		while(lastIndex != -1){
		    lastIndex = xml.indexOf(closeTag2,lastIndex);
		    if(lastIndex != -1){
		        count ++;
		        lastIndex += closeTag2.length();
		        System.out.println("Last INdex = "+lastIndex);
		        System.out.println("(lastIndex+xml.indexOf(,lastIndex)"+ (lastIndex+xml.indexOf("/&gt;",lastIndex)));
		        System.out.println("* "+ lastIndex + " -- " + xml.substring(lastIndex,xml.length())); 
		        tagName = xml.substring(lastIndex,xml.indexOf("/&gt;",lastIndex-20));
		        tagList.add(tagName);
		    }
		}
		
		System.out.println(tagList);
		for (int i = 0; i < tagList.size(); i++) 
		{
			System.out.println(getContentForTag(xml,tagList.get(i)));
			//xml = getNewXMLAfterTag(xml);
		}
		
	}
*/	public static String getTag(String xml)
	{
		int openTagIndex = xml.indexOf("&lt;");			//Find <
		xml = xml.substring(openTagIndex);				//Filter everything before <
		String openTag = xml.substring(4,xml.indexOf("&gt;"));	//Find the tag between < and >

		int closeTagIndex = xml.indexOf("&lt;/");		//Find </
		xml = xml.substring(closeTagIndex);				//Filter everything before </
		String closeTag = xml.substring(5,xml.indexOf("&gt;"));	//Find the tag between </ and >
		
		if(openTag.equals(closeTag))
		{
			return closeTag;
		}
			
		else
			return null;
					
	}
	
	public static String getNewXMLAfterTag(String xml)
	{
		int openTagIndex = xml.indexOf("&lt;");			//Find <
		xml = xml.substring(openTagIndex);				//Filter everything before <
		String openTag = xml.substring(4,xml.indexOf("&gt;"));	//Find the tag between < and >

		int closeTagIndex = xml.indexOf("&lt;/");		//Find </
		xml = xml.substring(closeTagIndex);				//Filter everything before </
		String closeTag = xml.substring(5,xml.indexOf("&gt;"));	//Find the tag between </ and >
		xml = xml.substring(5);	//Remove </ - to avoid confusion
		
		if(openTag.equals(closeTag))
		{
			return xml;
		}
			
		else
			return null;
					
	}
	
	public static String getContent(String xml)
	{
		int openTagIndex = xml.indexOf("&lt;");			//Find <
		xml = xml.substring(openTagIndex);				//Filter everything before <
		String tag = getTag(xml);
		String content = xml.substring(xml.indexOf("&gt;") + "&lt;".length(),xml.length());
		content = content.substring(0,content.indexOf("&lt;/")); 	//Now that < is not there, find > (end of open tag) and filter all content until </
		content = "<" + tag + ">" + content +  "</" + tag + ">";	
		return content;
	}
	
	public static String getContentForTag(String xml, String Tag)
	{
		int openTagIndex = xml.indexOf("&lt;"+Tag);			//Find <
		xml = xml.substring(openTagIndex);				//Filter everything before <
		String tag = getTag(xml);
		String content = xml.substring(xml.indexOf("&gt;") + "&lt;".length(),xml.length());
		content = content.substring(0,content.indexOf("&lt;/")); 	//Now that < is not there, find > (end of open tag) and filter all content until </
		content = "<" + tag + ">" + content +  "</" + tag + ">";	
		return content;
	}
}
