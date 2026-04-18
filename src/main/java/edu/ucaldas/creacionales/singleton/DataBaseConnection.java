package edu.ucaldas.creacionales.singleton;

class DatabaseConnection {
    private static DatabaseConnection instance;

   private DatabaseConnection() {}

    public static DatabaseConnection getInstance() {
        if (instance == null) { // 1ª verificación
            synchronized (DatabaseConnection.class) {
                if (instance == null) { // 2ª verificación
                    instance = new DatabaseConnection();
                }
            }
        }
        return instance;
    }
}
