/*
 * package com.zensar.assignments;
 * 
 * public class Test { int count = 0;
 * 
 * void A() throws Exception { try { count++; try { count++; try { count++;
 * 
 * } catch (Exception ex) { count++; throw new Exception(); } } catch (Exception
 * ex) { count++; } } catch (Exception ex) { count++; } }
 * 
 * void display() { System.out.println(count); }
 * 
 * public static void main(String[] args) throws Exception { Test obj = new
 * Test(); obj.A(); obj.display(); } }
 */

/*
 * class Test
 * 
 * { static void fun() { try { throw new NullPointerException("demo"); }
 * catch(NullPointerException e) { System.out.println("Caught inside fun().");
 * throw e; // rethrowing the exception } } public static void main(String
 * args[]) { try { fun(); } catch(NullPointerException e) {
 * System.out.println("Caught in main."); } } }
 */
