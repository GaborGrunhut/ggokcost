/*
 * Sallai András, 2024-02-19
 * Copyright (c) 2024, Sallai András
 * Licenc: MIT
 * Refakotárlás
 * Szoft II/1/E
 * Grünhut Gábor
 * 2024-04-15
 */

public class Cost {
Double ship;
Double store;
Double repair;
public Cost(String ship, String store, String repair) {
this.ship = Double.parseDouble(ship);
this.store = Double.parseDouble(store);
this.repair = Double.parseDouble(repair);
}
public Double getShip() { return ship; }
public Double getStore() { return store; }
public Double getRepair() { return repair; }
}
