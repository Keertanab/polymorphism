package polymorphismHomeassignment;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class APIClient {
	public void sendRequest(String endpoint) {
		
		System.out.println(endpoint);
	}

	public void sendRequest (String endpoint , String requestBody , Boolean requestStatus) {
		
		System.out.println (endpoint);
		System.out.println(requestBody);
		System.out.println(requestStatus);
	}
	
	
	public static void main(String[] args) {
		APIClient AP = new APIClient();
		AP.sendRequest("endpoint");
		AP.sendRequest("TestLeaf", "TestData", true);
		
		
	}
}
