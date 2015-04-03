package startSelector

class WebserviceCall {
	public yahooApiCurrentprice(def stockName ) {
		 def api = "http://download.finance.yahoo.com/d/quotes.csv?s=" + "GOOG"+ "&f=nsl1op&e=.csv"
     
        def uri_yahoo = new URL(api).getText()
        print uri_yahoo
		
		
	}

}
