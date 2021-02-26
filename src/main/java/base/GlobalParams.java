package base;

import context.TestContext;
import enums.Context;

import cucumber.api.DataTable;

public class GlobalParams {

	TestContext tstContext;
	
	public GlobalParams() {
		tstContext=new TestContext();}
	
	// INPUT
		public void setString_A(String _stringA) {
			tstContext.getScenarioContext().setContext(Context.DATA_INFO_A,_stringA);}
		public void setString_B(String _stringB) {
			tstContext.getScenarioContext().setContext(Context.DATA_INFO_B,_stringB);}
		public void setInt_1(int _int1) {
			tstContext.getScenarioContext().setContext(Context.DATA_NUMBER_1,_int1);}
		public void setInt_2(int _int2) {
			tstContext.getScenarioContext().setContext(Context.DATA_NUMBER_2,_int2);}
		public void setDataTable_1(DataTable _dt1) {
			tstContext.getScenarioContext().setContext(Context.DATA_TABLE,_dt1);}
		public void setArray(String[] _arr1) {
			tstContext.getScenarioContext().setContext(Context.DATA_ARRAY,_arr1);}
		public void setArraBid(String[][] _arr2) {
			tstContext.getScenarioContext().setContext(Context.DATA_ARRAY_BID,_arr2);}
		
		// OUTPUT
		public String getString_A() {
			return (String) tstContext.getScenarioContext().getContext(Context.DATA_INFO_A);}
		public String getString_B() {
			return (String) tstContext.getScenarioContext().getContext(Context.DATA_INFO_B);}
		public int getInt_1() {
			return (int) tstContext.getScenarioContext().getContext(Context.DATA_NUMBER_1);}
		public int getInt_2() {
			return (int) tstContext.getScenarioContext().getContext(Context.DATA_NUMBER_2);}
		public DataTable getDataTable_1() {
			return (DataTable) tstContext.getScenarioContext().getContext(Context.DATA_TABLE);}
		public int getArrayLenght() {
			String[] _arr=(String[]) tstContext.getScenarioContext().getContext(Context.DATA_ARRAY);
			return _arr.length;}
		public String getArray(int x) {
			String[] _arr=(String[]) tstContext.getScenarioContext().getContext(Context.DATA_ARRAY);
			return _arr[x];}
		public int getArrBidLenght() {
			String[] _arr=(String[]) tstContext.getScenarioContext().getContext(Context.DATA_ARRAY_BID);
			return _arr.length;}
		public String getArrBid(int x, int z) {
			String[][] _arr=(String[][]) tstContext.getScenarioContext().getContext(Context.DATA_ARRAY_BID);
			return _arr[x][z];}
}
