/*
 * Sallai András, 2024-02-19
 * Copyright (c) 2024, Sallai András
 * Licenc: MIT
 * Refakotárlás
 * Szoft II/1/E
 * Grünhut Gábor
 * 2024-04-15
 */

// A fájl writer import
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Filehandler {

    public void writeCostsToFile(Cost cost) {
        try {
            FileWriter fileWriter = new FileWriter("adat.txt", true);
            PrintWriter printWriter = new PrintWriter(fileWriter);
            printWriter.printf("%.2f:%.2f:%.2f%n", cost.ship, cost.store, cost.repair);
            printWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
}
