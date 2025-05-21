Statement stmt = conn.createStatement();
stmt.execute("SELECT * FROM users WHERE name = '" + input + "'");
