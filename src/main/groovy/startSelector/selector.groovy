package startSelector

class selector {
    public  static void  main(String[] args ) {
         print "starting stock calculator \n"
		 
		 
		 def finalPrice 
		 def a = [ 'AAPL', 'GOOG', 'XOM']
		 
		 a.each {
        def api = "http://download.finance.yahoo.com/d/quotes.csv?s=" + it + "&f=nsl1op&e=.csv"
     
        def uri_yahoo = new URL(api).getText()
        finalPrice = finalPrice + uri_yahoo
    //    WebserviceCall.yahooApi("GOOG")
        
         }
		 print finalPrice
    } 

}