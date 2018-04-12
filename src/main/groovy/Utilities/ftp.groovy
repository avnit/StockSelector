package Utilities
import org.apache.commons.net.ftp.FTPClient

class ftp {
	
	def url
	def username 
	def password 
	def port 
	def path
	def filename
	
	
 
new FTPClient().with {
				connect url
enterLocalPassiveMode()
login username, password
changeWorkingDirectory path
ftpClient.fileType = FTPClient.BINARY_FILE_TYPE
def incomingFile = new File(filename)
incomingFile.withOutputStream { ostream -> retrieveFile filename, ostream }
disconnect()
}

}
