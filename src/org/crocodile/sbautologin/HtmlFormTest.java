
package org.crocodile.sbautologin;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import org.junit.Assert;
import org.junit.Test;

/**
 * Tests the HtmlForm class.
 * 
 * @author michael
 */
public class HtmlFormTest
{
    /**
     * The URL of the Starbucks login page.
     */
    private static final String url  = "http://nmd.sbx10253.saratca.wayport.net/index.adp?MacAddr=B8%3aF6%3aB1%3a18%3aD8%3a9B&IpAddr=192%2e168%2e5%2e169&Ip6Addr=&vsgpId=&vsgId=97360&UserAgent=&ProxyHost=&TunnelIfId=349198&VlanId=20";
    /**
     * The HTML of the login page.
     */
    private static final String html = "<!DOCTYPE html >\n" + 
            "<html xmlns=\"http://www.w3.org/1999/xhtml\" lang=\"en\" xml:lang=\"en\">\n" + 
            " <head>\n" + 
            "  <title>AT&T Wi-Fi Service @ Starbucks</title>\n" + 
            "  <meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\n" + 
            "  <!-- Mobile viewport optimized: h5bp.com/viewport -->\n" + 
            "  <meta name=\"viewport\" content=\"initial-scale=1.0, maximum-scale=1.0, width=device-width;\">\n" + 
            "  <link rel=\"shortcut icon\" type=\"image/ico\" href=\"/favicon.ico\" />\n" + 
            "  <script type=\"text/javascript\" src=\"http://ajax.googleapis.com/ajax/libs/jquery/1.7.2/jquery.min.js\"></script>\n" + 
            "  <script type=\"text/javascript\" src=\"/dhtml/att/trouble_connect.js\"></script>\n" + 
            "   \n" + 
            "\n" + 
            "    <link rel=\"stylesheet\" type=\"text/css\" href=\"/css/att/themes/sbux/laptop_free_2013.css\" media=\"screen, print\"/>\n" + 
            "\n" + 
            " </head>\n" + 
            " <body>\n" + 
            " <div id=\"trouble\"><input type=\"submit\" tabindex=\"1\" id=\"trouble_connect\" name=\"trouble_connect\" alt=\"Trouble\" value=\"\" /></div>\n" + 
            "    <div id=\"sbux_iframe\">\n" + 
            "      <iframe src=\"http://www.starbucks.com/coffeehouse/wi-fi-auth/?prid=10253&encrypted=8zw5pif9%2fMVscqcQog6OrnjuxC7JHceIMQsJpxsTbeU%3d&ipaddr=192.168.5.169&vsgid=97360&vsgpid=&tunnellfld=tunnelifldValue&action_string=http://nmd.sbx10253.saratca.wayport.net/add-ins/att/sbx_connect.adp&LegalBaseUrl=secure.sbc.com\" scrolling='yes' id=\"iframe1\" marginheight=\"0\" frameborder=\"0\"></iframe>\n" + 
            "    </div>\n" + 
            "  <div id=\"free_wrap\"> \n" + 
            "   <div id=\"topblock\"> \n" + 
            "      <div id=\"free_sbux_logo\"></div>\n" + 
            "      <div id=\"free_wifi\">Free Wi-Fi<br><a href=\"http://secure.sbc.com/help.adp\">Need Help?</a></div>\n" + 
            "    </div>\n" + 
            "\n" + 
            "    <div id=\"midblock\">\n" + 
            "        <div id=\"siren_free_wifi\"> Free Wi-Fi</div>\n" + 
            "        <div id=\"free_text_line\">Starbucks is pleased to offer Wi-Fi including the premium content of the Starbucks Digital Network to customers who are enjoying our food and beverages.</div>\n" + 
            "      <form method=\"post\" action=\"http://nmd.sbx10253.saratca.wayport.net/connect.adp\" onsubmit=\"return validateAWSform(this);\" id=\"connect_form\">\n" + 
            "<input type=\"hidden\" name=\"NmdId\" value=\"25670\"/>\n" + 
            "<input type=\"hidden\" name=\"ReturnHost\" value=\"nmd.sbx10253.saratca.wayport.net\"/>\n" + 
            "<input type=\"hidden\" name=\"MacAddr\" value=\"B9:F6:B1:18:D8:9B\"/>\n" + 
            "<input type=\"hidden\" name=\"IpAddr\" value=\"192.168.5.169\"/>\n" + 
            "<input type=\"hidden\" name=\"NduMacAddr\" value=\"\"/>\n" + 
            "<input type=\"hidden\" name=\"NduPort\" value=\"\"/>\n" + 
            "<input type=\"hidden\" name=\"PortType\" value=\"Wireless\"/>\n" + 
            "<input type=\"hidden\" name=\"PortDesc\" value=\"\"/>\n" + 
            "<input type=\"hidden\" name=\"UseCount\" value=\"\"/>\n" + 
            "<input type=\"hidden\" name=\"PaymentMethod\" value=\"Passthrough\"/>\n" + 
            "<input type=\"hidden\" name=\"ChargeAmount\" value=\"\"/>\n" + 
            "<input type=\"hidden\" name=\"Style\" value=\"ATT\"/>\n" + 
            "<input type=\"hidden\" name=\"vsgpId\" value=\"\"/>\n" + 
            "<input type=\"hidden\" name=\"pVersion\" value=\"2\"/>\n" + 
            "<input type=\"hidden\" name=\"ValidationHash\" value=\"3e488c3058ad89d6cb9da29d30aab299\"/>\n" + 
            "<input type=\"hidden\" name=\"origDest\" value=\"\"/>\n" + 
            "<input type=\"hidden\" name=\"ProxyHost\" value=\"\"/>\n" + 
            "<input type=\"hidden\" name=\"vsgId\" value=\"97360\"/>\n" + 
            "<input type=\"hidden\" name=\"Ip6Addr\" value=\"\"/>\n" + 
            "<input type=\"hidden\" name=\"VlanId\" value=\"20\"/>\n" + 
            "<input type=\"hidden\" name=\"TunnelIfId\" value=\"349198\"/>\n" + 
            "<input type=\"hidden\" name=\"ts\" value=\"1411772904\"/>\n" + 
            "\n" + 
            "       <input name=\"AUPConfirmed\" value=\"1\" type=\"hidden\">\n" + 
            "    <div id=\"free_submit\">\n" + 
            "        <div id=\"free_submit_btn\">\n" + 
            "         <input type=\"submit\" tabindex=\"5\" id=\"connect\" name=\"connect\" alt=\"Connect\" value=\"\" />\n" + 
            "        </div>\n" + 
            "        </div>\n" + 
            "        <div id=\"free_aup_line\" >\n" + 
            "        <input id=\"aupAgree\" name=\"aupAgree\" value=\"1\" style=\"display:none\" type=\"checkbox\" checked> By clicking the connect button, you agree to abide by the <a href=\"http://secure.sbc.com/tosaup.adp\">AT&amp;T terms and conditions and Acceptable Use Policy</a>\n" + 
            "       </div>\n" + 
            "       </form>\n" + 
            "   <div id=\"free_need_help\">\n" + 
            "         <a href=\"http://secure.sbc.com/help.adp\">Need Help?</a>\n" + 
            "        </div>\n" + 
            "         \n" + 
            "    </div>  \n" + 
            "  <div id=\"botblock\">\n" + 
            "     <div id=\"botblock_left\">\n" + 
            "     <div id=\"free_aws_logo\">\n" + 
            "       <a target=\"_blank\" href=\"http://secure.sbc.com/tosaup.adp\">AT&amp;T Terms and Conditions and Acceptable Use Policy</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<a target=\"_blank\" href=\"http://www.att.com/privacy\">Privacy</a>\n" + 
            "       <br><a href=\"http://www.att.com\">ATT.com</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n" + 
            "       <a href=\"http://www.attwifi.com\">AT&amp;T Wi-Fi</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n" + 
            "       <a href=\"http://www.att.com/attwifi/locations\">AT&amp;T Wi-Fi Locations</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n" + 
            "       <a href=\"http://secure.sbc.com/help.adp\">AT&amp;T Wi-Fi Help</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n" + 
            "     </div>\n" + 
            "      </div>\n" + 
            "   \n" + 
            "      <div id=\"botblock_copyright\">\n" + 
            "       Copyright &copy; 2014 Starbucks Corporation. All Rights Reserved Copyright &copy; 2014 AT&amp;T Intellectual Property. All Rights Reserved. AT&amp;T, the AT&amp;T logo, the AT&amp;T Wi-Fi Hot Spot logo, and all other AT&amp;T marks contained herein are trademarks of AT&amp;T Intellectual Property and/or its affiliates.\n" + 
            "        Starbucks and the Starbucks logo are trademarks of Starbucks Corporation.\n" + 
            "      </div>\n" + 
            "   </div>\n" + 
            "  <div id=\"botblock_ext\">\n" + 
            "\n" + 
            "   </div>\n" + 
            "   </div>\n" + 
            " </body>\n" + 
            "</html> \n" + 
            "\n" + 
            "";
    /**
     * Tests the class against the real Starbucks webpage.
     * 
     * @throws Exception
     */
    @Test
    public void testWithRealHtml() throws Exception
    {
        HtmlForm htmlForm = new HtmlForm(new URL(url), html);

        Assert.assertEquals("http://nmd.sbx10253.saratca.wayport.net/connect.adp", htmlForm.actionUrl.toExternalForm());
        Assert.assertEquals("POST", htmlForm.method);
        
        Map<String, String> params = new HashMap<String, String>();
        
        params.put("NmdId", "25670");
        params.put("ReturnHost", "nmd.sbx10253.saratca.wayport.net");
        params.put("MacAddr", "B9:F6:B1:18:D8:9B");
        params.put("IpAddr", "192.168.5.169");
        params.put("NduMacAddr", "");
        params.put("NduPort", "");
        params.put("PortType", "Wireless");
        params.put("PortDesc", "");
        params.put("UseCount", "");
        params.put("PaymentMethod", "Passthrough");
        params.put("ChargeAmount", "");
        params.put("Style", "ATT");
        params.put("vsgpId", "");
        params.put("pVersion", "2");
        params.put("ValidationHash", "3e488c3058ad89d6cb9da29d30aab299");
        params.put("origDest", "");
        params.put("ProxyHost", "");
        params.put("vsgId", "97360");
        params.put("Ip6Addr", "");
        params.put("VlanId", "20");
        params.put("TunnelIfId", "349198");
        params.put("ts", "1411772904");
        params.put("AUPConfirmed", "1");
        params.put("aupAgree", "1");
        
        Assert.assertEquals(params, htmlForm.parameters);
    }

    /**
     * Tests to make sure it throws the appropriate exceptions at the
     * appropriate times.
     * 
     * @throws Exception
     */
    @Test
    public void testErrors() throws Exception
    {
        URL url = new URL("http://www.example.com");

        // no "form" tag anywhere
        try
        {
            new HtmlForm(url, "<html><body>Hello world!</body></html>");
            Assert.fail();
        } catch(InvalidFormException e)
        {
            // this exception should be thrown
        } catch(MalformedURLException e)
        {
            Assert.fail();
        }

        // no "action" attribute
        try
        {
            new HtmlForm(url, "<form>");
            Assert.fail();
        } catch(InvalidFormException e)
        {
            // this exception should be thrown
        } catch(MalformedURLException e)
        {
            Assert.fail();
        }
    }

    /**
     * Tests other aspects of the class, feeding it specially-crafted input.
     * 
     * @throws Exception
     */
    @Test
    public void testMisc() throws Exception
    {
        URL url = new URL("http://www.example.com/foo/bar/");
        HtmlForm htmlForm;

        // there's no "method" attribute, so it should default to "GET"
        htmlForm = new HtmlForm(url, "<form action=\"index.html\">");
        Assert.assertEquals("http://www.example.com/foo/bar/index.html", htmlForm.actionUrl.toExternalForm());
        Assert.assertEquals("GET", htmlForm.method);
        Assert.assertEquals(0, htmlForm.parameters.size());

        // there is a "method" attribute, it should be parsed as all upper-case
        htmlForm = new HtmlForm(url, "<form action=\"index.html\" method=\"post\">");
        Assert.assertEquals("http://www.example.com/foo/bar/index.html", htmlForm.actionUrl.toExternalForm());
        Assert.assertEquals("POST", htmlForm.method);
        Assert.assertEquals(0, htmlForm.parameters.size());

        // "action" attribute is absolute
        htmlForm = new HtmlForm(url, "<form action=\"http://www.foobar.com/index.html\" method=\"post\">");
        Assert.assertEquals("http://www.foobar.com/index.html", htmlForm.actionUrl.toExternalForm());
        Assert.assertEquals("POST", htmlForm.method);
        Assert.assertEquals(0, htmlForm.parameters.size());

        // "action" attribute uses "../"
        htmlForm = new HtmlForm(url, "<form action=\"../index.html\" method=\"post\">");
        Assert.assertEquals("http://www.example.com/foo/index.html", htmlForm.actionUrl.toExternalForm());
        Assert.assertEquals("POST", htmlForm.method);
        Assert.assertEquals(0, htmlForm.parameters.size());

        // "action" attribute uses "/"
        htmlForm = new HtmlForm(url, "<form action=\"/index.html\" method=\"post\">");
        Assert.assertEquals("http://www.example.com/index.html", htmlForm.actionUrl.toExternalForm());
        Assert.assertEquals("POST", htmlForm.method);
        Assert.assertEquals(0, htmlForm.parameters.size());

        // switch order of attributes
        htmlForm = new HtmlForm(url, "<form method=\"post\" action=\"index.html\">");
        Assert.assertEquals("http://www.example.com/foo/bar/index.html", htmlForm.actionUrl.toExternalForm());
        Assert.assertEquals("POST", htmlForm.method);
        Assert.assertEquals(0, htmlForm.parameters.size());

        // there are attributes in the form tag which can be ignored, along with
        // multiple whitespace characters between attributes
        htmlForm = new HtmlForm(
                url,
                "<form  \t method=\"post\"  \n\n doubleQuotes=\"typical usage\"\t attrWithNoValue  noQuotes=uglyHtml  singleQuotes='an alternative' action=\"index.html\" \n attrWithNoValue2>");
        Assert.assertEquals("http://www.example.com/foo/bar/index.html", htmlForm.actionUrl.toExternalForm());
        Assert.assertEquals("POST", htmlForm.method);
        Assert.assertEquals(0, htmlForm.parameters.size());

        // there some parameters
        htmlForm = new HtmlForm(
                url,
                "<form action=\"index.html\" method=\"post\"><input type=\"hidden\" name=\"foo\" value=\"bar\" /><input type=\"hidden\" name='sq' value='single quotes' /><input type=\"hidden\" name=nq value=no-quotes /><input type=\"hidden\" value=\"noname\" /><input type=\"hidden\" name=\"novalue\" /><input name=\"notype\" value=\"thereisnotypeattribute\" /><input type=\"submit\" name=\"submit\" value=\"button\" />");
        Assert.assertEquals("http://www.example.com/foo/bar/index.html", htmlForm.actionUrl.toExternalForm());
        Assert.assertEquals("POST", htmlForm.method);
        Assert.assertEquals(5, htmlForm.parameters.size());
        Assert.assertEquals("bar", htmlForm.parameters.get("foo"));
        Assert.assertEquals("single quotes", htmlForm.parameters.get("sq"));
        Assert.assertEquals("no-quotes", htmlForm.parameters.get("nq"));
        Assert.assertEquals("", htmlForm.parameters.get("novalue"));
        Assert.assertEquals("thereisnotypeattribute", htmlForm.parameters.get("notype"));
        Assert.assertNull(htmlForm.parameters.get("submit"));

        // there is more than one form...it will only look at the attributes of
        // the first form, but will read all the parameters of all of the forms
        htmlForm = new HtmlForm(
                url,
                "<form action=\"index.html\" method=\"post\"><input type=\"hidden\" name=\"foo\" value=\"bar\" /><input type=\"hidden\" value=\"noname\" /><input type=\"hidden\" name=\"novalue\" /></form><form action=\"http://www.google.com\"><input name=\"param\" value=\"inanotherform\" />");
        Assert.assertEquals("http://www.example.com/foo/bar/index.html", htmlForm.actionUrl.toExternalForm());
        Assert.assertEquals("POST", htmlForm.method);
        Assert.assertEquals(3, htmlForm.parameters.size());
        Assert.assertEquals("bar", htmlForm.parameters.get("foo"));
        Assert.assertEquals("", htmlForm.parameters.get("novalue"));
        Assert.assertEquals("inanotherform", htmlForm.parameters.get("param"));
    }
}
