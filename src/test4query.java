
/*Program to read the already stored database/dataset 
and display the information of parts of the email using rdf model
*/
//import all the classes
import static com.hp.hpl.jena.query.ReadWrite.READ ;
import static com.hp.hpl.jena.query.ReadWrite.WRITE ;
import com.hp.hpl.jena.query.ReadWrite ;
import com.hp.hpl.jena.query.Dataset ;
import com.hp.hpl.jena.query.Query ;
import com.hp.hpl.jena.query.QueryExecution ;
import com.hp.hpl.jena.query.QueryExecutionFactory ;
import com.hp.hpl.jena.query.QueryFactory ;
import com.hp.hpl.jena.query.QuerySolution ;
import com.hp.hpl.jena.query.ResultSet ;
import com.hp.hpl.jena.tdb.TDBFactory ;
import com.hp.hpl.jena.query.ResultSetFormatter;
    
import com.hp.hpl.jena.rdf.model.Model;

import com.hp.hpl.jena.rdf.model.*;
import com.hp.hpl.jena.vocabulary.*;
import java.util.Iterator;
import java.util.Scanner;
import com.hp.hpl.jena.sparql.sse.SSE ;

import com.hp.hpl.jena.update.* ;
import org.apache.jena.atlas.lib.StrUtils ;
import org.apache.jena.atlas.logging.LogCtl ;
import org.apache.jena.query.text.EntityDefinition ;
import org.apache.jena.query.text.TextDatasetFactory ;
import org.apache.jena.query.text.TextQuery ;
import org.apache.jena.riot.RDFDataMgr ;
import org.apache.lucene.store.Directory ;
import org.apache.lucene.store.RAMDirectory ;
import org.slf4j.Logger ;
import org.slf4j.LoggerFactory ;

import com.hp.hpl.jena.query.* ;
import com.hp.hpl.jena.rdf.model.Model ;
import com.hp.hpl.jena.sparql.util.QueryExecUtils ;
import com.hp.hpl.jena.vocabulary.RDFS ;



public class test4query extends Object {
    public static void main (String args[]) {
        String s;
        //load the dataset 
        //String query1; 
        //query1="hjcooljohny75@gmail.com";
        //query1 = (String)(subjectentry.getText());
          //  String s="SELECT ?x WHERE { ?x <TO:> '"+query1+"'}";
  
        String directory = "EMAILADDRESS" ;
        Dataset ds = TDBFactory.createDataset(directory) ;
        Model model = ds.getDefaultModel() ;
        ds.begin(ReadWrite.READ) ;
        Scanner in = new Scanner(System.in);
         System.out.println("Enter a string");
            
            s = in.nextLine();
             Query q =QueryFactory.create(s);
            QueryExecution qExec = QueryExecutionFactory.create(s, ds) ;
             //executeCmd(s) ;
            //UpdateAction.parseExecute(s,model);
            try{
           
            //ResultSet rs = qExec.execSelect() ;
             QueryExecUtils.executeQuery(q, qExec) ;
              } finally
              {qExec.close() ;
              ds.commit();
              ds.end();
             }
         //   try {   
              //      ResultSetFormatter.out(rs) ;
               // } finally { qExec.close() ; }

            // Another query - same view of the data.
           
    }
}









