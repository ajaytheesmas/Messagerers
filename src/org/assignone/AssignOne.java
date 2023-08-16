package org.assignone;

import org.details.EmployeeA;

public class AssignOne extends EmployeeA {
private void EmployeeName() {
	System.out.println ("Employee Name: Ajay");
}
private void EmployeeAge() {
	System.out.println ("Employee Age: 20");
}
public static void main (String [] args) {
	AssignOne A =new AssignOne();
A.EmployeeName ();
A.EmployeeAge ();
EmployeeA v =new EmployeeA();
v.EmployeeAdress ();
v.EmployeeMoblie ();
v.EmployeeAdress ();
v.EmployeeMoblie ();
v.EmployeeGender ();
v.EmployeeGender ();
}
}
