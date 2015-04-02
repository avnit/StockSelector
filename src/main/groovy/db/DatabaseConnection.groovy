package src.main.groovy.db;


import groovy.lang.Closure;
import groovy.lang.GString;

import groovy.sql.GroovyRowResult
import groovy.sql.OutParameter

import groovy.sql.Sql

import java.sql.CallableStatement
import java.sql.ResultSet
import java.sql.ResultSetMetaData
import java.sql.Connection
import java.sql.SQLException

import javax.sql.DataSource
import java.sql.Connection

import java.sql.DriverManager
import javax.sql.DataSource
import groovy.sql.GroovyRowResult


public class DatabaseConnection {

    def servername
    def database
    def instance
    def username
    def password

    public connect() {

        def driver = Class.forName('net.sourceforge.jtds.jdbc.Driver').newInstance();
        Connection conn = DriverManager.getConnection("jdbc:jtds:sqlserver://$servername/$database;instance=$instance;integratedSecurity=true;selectMethod=direct", username, password);
        return conn;
    }

    def Map rowToMap(row) {
        row.columns.collectEntries { [it.name, it.val] }
    }

//	def getSPdata (String query, Closure closure)
//	{
//		def conn = connect()
//		print "inside getSPdata"
//		 try {
//			 
//			
//			def cstmt = conn.prepareCall(query);
//
//		//	setParameters(params, cstmt)
//			def hasResultSet = cstmt.execute()
//
//			//Copy resultSet into groovy resultSet rows
//			List<GroovyRowResult> rows = []
//			def found = false 
//			while (!found) { 
//			
//			
//			if (hasResultSet ) {
//				  ResultSet rs = cstmt.getResultSet()
//                        ResultSetMetaData md = rs.getMetaData()
//                        int columnCount = md.getColumnCount()
//                        while (rs.next()) {
//                            // use case insensitive map
//                            Map row = new TreeMap(String.CASE_INSENSITIVE_ORDER)
//                            for (int i = 0; i < columnCount; ++ i) {
//                                row[md.getColumnName(i+1)] = rs.getObject(i+1)
//                            }
//                            closure.call(row)
//                        }
//						found = true;
//			}else if (cstmt.getUpdateCount() < 0) {
//                        throw new RuntimeException("Sproc ${query} did not return a result set")
//                    }
//			}
//                    hasResultSet =cstmt.getMoreResults()
//			
//			//Set output parameters with rows first
//		
//		} catch (SQLException e) {
//			print "Failed to execute $query" + e.toString()
//			throw e
//		} finally {
//			conn.close()
//		}
//		print "Done with SP data"
//	}
//
//	
//
//	//def   sqls = Sql.newInstance(servername,username , password , 'net.sourceforge.jtds.jdbc.Driver' )
//	//          .eachRow( req as String  ) {
//	//	 /* For each row output detail */
//	//			  $it.each {  }
//	//
//
//
//	public runHYSql(def query , def valuetobind ) {
//		print "Inside run Sql with ${query} , ${servername} , ${database} , ${username} , ${password} , ${instance}"
//		def finalString = ''
//		List rs 
//		try {
//			def conn = connect()
//
//			//	def driver = Class.forName("com.microsoft.jdbc.sqlserver.SQLServerDriver").newInstance();
//			// Connection conn = DriverManager.getConnection("jdbc:microsoft:sqlserver://$servername:$port", username, password);
//
//
//			Sql sql = new Sql(conn)
//			// After options processing the remaining arguments are query files
//			// Go through the query files one at a time for execution
//			//  for (queryfilename in opt.arguments()) {
//
//			
//			//param_count = 0      // Number of placeholders needed for parameters to query
//			//pattern = /\?/ // pattern to look for to find number of parameters
//
//			// number of bind variables to satisfy is obtained by number of ? seen in the query
//			//query.eachMatch(pattern) { param_count++ }
//			println '-.' * 40
//			println "query is ${query}"
//
//			println "Output is:"
//			println '=' * 80
//			def count = 0  // row count
//	//		def internal_map = [:]
//	//		SqlHelper helper = new SqlHelper(sql);
//			
//			
//			
//		
//			  getSPdata(query) { row ->
//				  rs =+ row  + "\n"
//			}
//			
//	
//	  conn.close()
//   } catch(Exception e) {
//	   print e.toString()
//	  // System.exit(-1)
//   }
//   finally {
//	   return rs
//   }
//}
}
//
