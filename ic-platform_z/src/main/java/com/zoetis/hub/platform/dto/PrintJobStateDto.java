package com.zoetis.hub.platform.dto;

import java.util.HashSet;
import java.util.Set;

import javax.print.attribute.standard.JobState;
import javax.print.attribute.standard.PrinterState;
import javax.print.attribute.standard.PrinterStateReason;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 
 * @author bag
 */

/**
 * Example JSON string
 * {
 * 		"correlationID": 5481863,
 * 		"processingState": 4, // 4 = PROCESSING
 * 		"printerState": 0, // 0 = UNKNOWN
 * 		"printerStateReasons": [2, 13] // 2 = MEDIA_JAM, 13 = COVER_OPEN
 * }

 *
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PrintJobStateDto
{
	/**
	 * The ID provided by Hub apps to identify a print job.
	 * The ID is used to identify response topic messages. 
	 */
	private int correlationID;
	
	public int jobState; // PrintJobProcessingStates
	public int printerState; // PrinterState
	public Set<Integer> printerStateReasons; // PrinterStateReason
	
	public static void PrintJobStateDto_clear(PrintJobStateDto printJobStateDto)
	{
		printJobStateDto.correlationID = -1; 
		printJobStateDto.jobState = JobState.UNKNOWN.getValue();
		printJobStateDto.printerState = PrinterState.UNKNOWN.getValue();
		printJobStateDto.printerStateReasons = new HashSet<>();
	}

	public static void PrintJobStateDto_init(
			PrintJobStateDto printJobStateDto,
			int correlationID,
			int jobState,
			PrinterState printerState)
	{
		printJobStateDto.correlationID = correlationID; 
		printJobStateDto.jobState = jobState;
		printJobStateDto.printerState = printerState.getValue();
		printJobStateDto.printerStateReasons = new HashSet<>();
	}
	
	public String toString()
	{ 
		String str;
		str = "{\n";
		str += "\t\"correlationID\": " + this.correlationID + ",\n";
		str += "\t\"jobState\": " + String.valueOf(this.jobState) + ",\n";
		str += "\t\"printerState\": " + String.valueOf(printerState) + ",\n";
		str += "\t\"printerStateReasons\":\n";
		str += "\t[\n";		
		if (null != printerStateReasons)
		{
			int iCount = printerStateReasons.size();
	        Set<Integer> reasons = printerStateReasons;
	        for (Integer iReason : reasons)
	        {
	        	String strTemp;
	        	iCount--;
	        	if (0 < iCount)
	        		strTemp = String.format("\t\t%d,\n", iReason);
	        	else
	        		strTemp = String.format("\t\t%d\n", iReason);
	            str += strTemp;
	        }
		}
        str += "\t]\n";
		str += "}";
	    return str;
	}

	public int getCorrelationID() {
		return correlationID;
	}

	public void setCorrelationID(int correlationID) {
		this.correlationID = correlationID;
	}
/*
	public int getJobState() {
		return jobState;
	}

	public void setJobState(JobState processingState) {
		this.jobState = processingState.getValue();
	}
*/	
/*
	public int getPrinterState()
	{
		return printerState;
	}
*/
/*
	public void setPrinterState(PrinterState printerState)
	{
		this.printerState = printerState.getValue();
	}
*/
	public void addPrinterStateReason(PrinterStateReason printerStateReason)
	{
		Integer iVal = printerStateReason.getValue();
		
		if (null == printerStateReasons)
		{
			printerStateReasons = new HashSet<>();
		}
		printerStateReasons.add(iVal);
	}
/*
	public void setPrinterStateReasons(Set<Integer> printerStateReasons)
	{
		this.printerStateReasons = printerStateReasons; 
	}

	public Set<Integer> getPrinterStateReasons()
	{
		return printerStateReasons;
	}
*/
}
