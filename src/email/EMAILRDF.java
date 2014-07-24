	
//To define all the properties needed to make the rdf of the email

package email;
import com.hp.hpl.jena.rdf.model.*;


public class EMAILRDF {
	//Create a default model
    private static Model m = ModelFactory.createDefaultModel();
    
    //Subject of the mail
    public static final Property SUBJECT = m.createProperty("SUB:" );
	//Sender of the mail
	public static final Property FROM = m.createProperty("FROM:" );
	//Receiver of the mail
	public static final Property TO  = m.createProperty("TO:" );
	//Return path
	public static final Property RETURN_PATH = m.createProperty("RETURNPATH:" );
	//main contents of the mail
	public static final Property CONTENT = m.createProperty("CONTENT:" );
	//format of the mail
	public static final Property FORMAT = m.createProperty("FORMAT:" );	
	//content type like html etc
	public static final Property CONTENT_TYPE = m.createProperty("CONTENTTYPE:" );
	//encoding in bits
	public static final Property ENCODING = m.createProperty("ENCODING:" );
	//date of the email
	public static final Property DATE = m.createProperty("DATE:" );   	 
	//CC of email	
	public static final Property CC = m.createProperty("CC:" ); 
	//BCC of email	
	public static final Property BCC = m.createProperty("BCC:" ); 
	//NAME OF THE SENDER
	public static final Property ATTACHEMENT_NAME = m.createProperty("ATTACHEMENTNAME:" );
	public static final Property ATTACHEMENT_NO = m.createProperty("ATTACHEMENTNO:" );   
	//SIZE OF MAIL	
	public static final Property MAIL_SIZE = m.createProperty("MAILSIZE:" );   
	//SIZE OF THE ATTACHEMENT of email	
	public static final Property ATTACHEMENT_SIZE = m.createProperty("ATTACHEMENTSIZE:" );   
	//MAIL TO WHICH PARTICULAR MAIL HAVE REPLIED 	
	public static final Property IN_REPLYTO = m.createProperty("REPLIEDTO:" );
	public static final Property IN_REPLYTONAME = m.createProperty("REPLIEDTONAME:" );
	//FOLDER IN WHICH email EXISTS	
	public static final Property FOLDER_NAME = m.createProperty("FOLDERNAME:" );   
	//UID of email	
	public static final Property UID = m.createProperty("UID:" );   
   //name os receiver of email	
	public static final Property REC_NAME = m.createProperty("RECIEVERSNAME:" );   
   //name of sender of email	
	public static final Property SEND_NAME = m.createProperty("SENDERNAME:" );   
   
    



   }
   
