package PurchaseOrders;

// -----( IS Java Code Template v1.2
// -----( CREATED: 2016-12-06 13:23:03 IST
// -----( ON-HOST: shaik-PC

import com.wm.data.*;
import com.wm.util.Values;
import com.wm.app.b2b.server.Service;
import com.wm.app.b2b.server.ServiceException;
// --- <<IS-START-IMPORTS>> ---
// --- <<IS-END-IMPORTS>> ---

public final class work

{
	// ---( internal utility methods )---

	final static work _instance = new work();

	static work _newInstance() { return new work(); }

	static work _cast(Object o) { return (work)o; }

	// ---( server methods )---




	public static final void endsWith (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(endsWith)>> ---
		// @sigtype java 3.5
		// [i] field:0:required string
		// [i] field:0:required suffix
		// [o] field:0:required value
		
		// pipeline
		IDataCursor pipelineCursor = pipeline.getCursor();
			String	string = IDataUtil.getString( pipelineCursor, "string" );
			String	suffix = IDataUtil.getString( pipelineCursor, "suffix" );
		pipelineCursor.destroy();
		
		String value = "Khadeer Shaik"; 
		// pipeline
		IDataCursor pipelineCursor_1 = pipeline.getCursor();
		IDataUtil.put( pipelineCursor_1, "value", value );
		pipelineCursor_1.destroy();
		// --- <<IS-END>> ---

                
	}
}

