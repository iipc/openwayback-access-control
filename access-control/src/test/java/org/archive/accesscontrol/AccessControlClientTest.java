package org.archive.accesscontrol;

import java.util.Date;

import junit.framework.TestCase;

public class AccessControlClientTest extends TestCase {
    public static final String ORACLE_URL = "http://localhost:6013/oracle";
    private AccessControlClient client;
        
    protected void setUp() throws Exception {
        super.setUp();
        //System.out.println("hello world");
        client = new AccessControlClient(ORACLE_URL);
    }

    protected void tearDown() throws Exception {
        super.tearDown();
        client = null;
    }
    
    public void testBasicOkToShow() throws Exception {
        //String policy = client.getPolicy("http://www.peagreenboat.com/", new Date(1987, 8, 30), new Date(), "blah");
        //System.out.println("Policy=" + policy);
    }
    
//    public void testAllLoad() throws Exception {
//        client = new AccessControlClient(ORACLE_URL, true);
//        client.prepare(null);
//        assertEquals("block", client.getPolicy("http://www.congerclub.org/", new Date(1987, 8, 30), new Date(), "blah"));
//        assertEquals("block", client.getPolicy("http://www.africaknowledgeproject.org/", new Date(), new Date(), "2697"));
//        assertEquals("allow", client.getPolicy("http://www.africaknowledgeproject.org/", new Date(), new Date(), "all"));
//        assertEquals("block-message", client.getPolicy("http://www.google.com/", new Date(), new Date(), "1589"));
//        assertEquals("allow", client.getPolicy("http://www.google.com/", new Date(), new Date(), "all"));
//    }
    
//    public void testModifiedSince() throws Exception {
//    	assertTrue(client.hasNewRulesSince("20130318163743", "1589"));
//    	assertFalse(client.hasNewRulesSince("20130318163843", "1589"));    	
//    }
}
