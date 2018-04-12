package startSelector

class selector {
	public  static void  main(String[] args ) {
		print "starting stock calculator \n"


		def finalPrice = ''
		def a = [
			'AAPL',
			'GOOG',
			'XOM' ,
			'DIS',
			'CMCSA',
			'PG',
			'KO',
			'XOM',
			'CVX',
			'JPM',
			'BRKB',
			'WFC',
			'PFE',
			'JNJ',
			'GE',
			'MMM',
			'DD',
			'DOW',
			'MSFT',
			'VZ',
			'DUK'
		]

		a.each {
			def api = "http://download.finance.yahoo.com/d/quotes.csv?s=" + it + "&f=nsl1op&e=.csv"

			def uri_yahoo = new URL(api).getText()
			def priceofbond = uri_yahoo.split(',')
			finalPrice = finalPrice + priceofbond[0] + "----" + priceofbond[1] + '------' + priceofbond[4] 
			//    WebserviceCall.yahooApi("GOOG")

		}
		print finalPrice
	}
}