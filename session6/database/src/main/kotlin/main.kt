import java.util.*
import java.sql.*

fun main() {
// Create a driver: the library/class that will create the connection
    Class.forName("com.mysql.cj.jdbc.Driver").getDeclaredConstructor().newInstance()
     // Prepare credentials
    val credentials = Credentials();
    val connectionProps = Properties()
    connectionProps["user"] = credentials.user
    connectionProps["password"] = credentials.password

// Create the connection: this will allow us to run queries on it later
    val connection =  DriverManager.getConnection(
        "jdbc:" + "mysql" + "://" +
                "dt5.ehb.be" +
                ":" + "3306" + "/" + //db_name = username
                credentials.databaseName,
        connectionProps)

// Create the statement
    val statement = connection.prepareStatement("SELECT COUNT * FROM productName")
    val result = statement.executeQuery()
    println(result);
// Create the result
    while(result.next()) {
        result.getString("productName")
    }
}