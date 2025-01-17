package com.sofkau.integration.mysql;

import java.sql.ResultSet;
import java.sql.SQLException;

public interface DataBase {

    public void configureDataBaseConnection();
    public void executeSqlStatement();
    public ResultSet getResultSet();
    public void close();
    public void printResultSet() throws SQLException;
    public void executeSqlStatementVoid();
}
