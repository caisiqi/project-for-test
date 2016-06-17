package oliver.demo.common.util;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFDataFormat;
import org.apache.poi.hssf.usermodel.HSSFFont;
import org.apache.poi.hssf.usermodel.HSSFPalette;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;

public class ExcelHelper {
	
	public static class HEADER_COLOR {
		// Index of color #dbcfce
		private static short index = 0x3f;
		// Color #dbcfce
		private static byte[] color = {
			(byte) 0xbd,
			(byte) 0xcf, 
			(byte) 0xce
		};
	}
	
	public static class EVEN_ROW_COLOR {
		// Index of color #dfe7e7
		private static short index = 0x3e;
		// Color #dfe7e7
		private static byte[] color = {
			(byte) 0xdf,
			(byte) 0xe7, 
			(byte) 0xe7
		};
	}
	
	public static class ODD_ROW_COLOR {
		// Index of color #fff
		private static short index = 0x3d;
		// Color #fff
		private static byte[] color = {
			(byte) 0xff,
			(byte) 0xff, 
			(byte) 0xff
		};
	}
	
	public static void setHeader(HSSFWorkbook workbook, Sheet sheet, String[] headers){
		
		HSSFFont font = workbook.createFont();    
		font.setFontHeightInPoints((short) 10);
		font.setBold(true);
		
		CellStyle style = workbook.createCellStyle();
		style.setBorderBottom(HSSFCellStyle.BORDER_THIN);
		style.setBorderLeft(HSSFCellStyle.BORDER_THIN);
		style.setBorderRight(HSSFCellStyle.BORDER_THIN);
		style.setBorderTop(HSSFCellStyle.BORDER_THIN);
		style.setAlignment(HSSFCellStyle.ALIGN_CENTER);
		
		HSSFPalette palette = workbook.getCustomPalette();
		palette.setColorAtIndex(HEADER_COLOR.index, 
			HEADER_COLOR.color[0], 
			HEADER_COLOR.color[1],
			HEADER_COLOR.color[2]);
		
		style.setFillForegroundColor(HEADER_COLOR.index);
		style.setFillPattern(HSSFCellStyle.SOLID_FOREGROUND);
		style.setFont(font);
		
		Row row0 = sheet.createRow(0);
		for(int i = 0; i < headers.length; i++){
			Cell cell = row0.createCell(i);
			cell.setCellStyle(style);
			cell.setCellValue(headers[i]);
			// 刷新列宽度
			sheet.setColumnWidth(i, headers[i].length() * 800);
		}
	}
	
	public static void setOddRow(HSSFWorkbook workbook, Sheet sheet, String[] row){
		
		HSSFFont font = workbook.createFont();    
		font.setFontHeightInPoints((short) 10);
		
		CellStyle style = workbook.createCellStyle();
		style.setBorderBottom(HSSFCellStyle.BORDER_THIN);
		style.setBorderLeft(HSSFCellStyle.BORDER_THIN);
		style.setBorderRight(HSSFCellStyle.BORDER_THIN);
		style.setBorderTop(HSSFCellStyle.BORDER_THIN);
		style.setAlignment(HSSFCellStyle.ALIGN_CENTER);
		// 设置自动换行
		style.setWrapText(true);
		
		HSSFPalette palette = workbook.getCustomPalette();
		palette.setColorAtIndex(ODD_ROW_COLOR.index, 
			ODD_ROW_COLOR.color[0], 
			ODD_ROW_COLOR.color[1],
			ODD_ROW_COLOR.color[2]);
		
		style.setFillForegroundColor(ODD_ROW_COLOR.index);
		style.setFillPattern(HSSFCellStyle.SOLID_FOREGROUND);
		style.setFont(font);
		
		Row row0 = sheet.createRow(sheet.getLastRowNum() + 1);
		for(int i = 0; i < row.length; i++){
			Cell cell = row0.createCell(i);
			cell.setCellStyle(style);
			cell.setCellValue(row[i]);
			// 刷新列宽度
			sheet.setColumnWidth(i, row[i].length() * 800);
		}
	}
	
	public static void __setOddRow(HSSFWorkbook workbook, Sheet sheet, Date[] row){
		
		HSSFFont font = workbook.createFont();    
		font.setFontHeightInPoints((short) 10);
		
		CellStyle style = getCommonHSSFCellStyle(workbook);
		
		HSSFPalette palette = workbook.getCustomPalette();
		palette.setColorAtIndex(ODD_ROW_COLOR.index, 
			ODD_ROW_COLOR.color[0], 
			ODD_ROW_COLOR.color[1],
			ODD_ROW_COLOR.color[2]);
		
		style.setFillForegroundColor(ODD_ROW_COLOR.index);
		style.setFillPattern(HSSFCellStyle.SOLID_FOREGROUND);
		style.setFont(font);
		
		Row row0 = sheet.createRow(sheet.getLastRowNum() + 1);
		for(int i = 0; i < row.length; i++){
			Cell cell = row0.createCell(i);
			cell.setCellStyle(style);
			cell.setCellValue(row[i]);
			
			sheet.setColumnWidth(i, 10 * 800);
		}
	}
	
	public static void setEvenRow(HSSFWorkbook workbook, Sheet sheet, String[] row){
		
		HSSFFont font = workbook.createFont();    
		font.setFontHeightInPoints((short) 10);
		
		CellStyle style = workbook.createCellStyle();
		style.setBorderBottom(HSSFCellStyle.BORDER_THIN);
		style.setBorderLeft(HSSFCellStyle.BORDER_THIN);
		style.setBorderRight(HSSFCellStyle.BORDER_THIN);
		style.setBorderTop(HSSFCellStyle.BORDER_THIN);
		style.setAlignment(HSSFCellStyle.ALIGN_CENTER);
		// 设置自动换行
		style.setWrapText(true);
		
		HSSFPalette palette = workbook.getCustomPalette();
		palette.setColorAtIndex(EVEN_ROW_COLOR.index, 
			EVEN_ROW_COLOR.color[0], 
			EVEN_ROW_COLOR.color[1],
			EVEN_ROW_COLOR.color[2]);
		
		style.setFillForegroundColor(EVEN_ROW_COLOR.index);
		style.setFillPattern(HSSFCellStyle.SOLID_FOREGROUND);
		style.setFont(font);
		
		Row row0 = sheet.createRow(sheet.getLastRowNum() + 1);
		for(int i = 0; i < row.length; i++){
			Cell cell = row0.createCell(i);
			cell.setCellStyle(style);
			cell.setCellValue(row[i]);
			// 刷新列宽度
			sheet.setColumnWidth(i, row[i].length() * 800);
		}
	}
	
	public static HSSFCellStyle getCommonHSSFCellStyle(HSSFWorkbook workbook) {
		
		HSSFCellStyle style = workbook.createCellStyle();
		style.setBorderBottom(HSSFCellStyle.BORDER_THIN);
		style.setBorderLeft(HSSFCellStyle.BORDER_THIN);
		style.setBorderRight(HSSFCellStyle.BORDER_THIN);
		style.setBorderTop(HSSFCellStyle.BORDER_THIN);
		style.setAlignment(HSSFCellStyle.ALIGN_CENTER);
		
		// 设置自动换行
		style.setWrapText(true);
		
		// 使用poi呢前格式
		//style.setDataFormat(HSSFDataFormat.getBuiltinFormat("m/d/yy"));
		//style.setDataFormat(HSSFDataFormat.getBuiltinFormat("d-mmm"));
		
		// 使用自定义格式
		style.setDataFormat(workbook.createDataFormat().getFormat("MM/dd"));
		
		return style;
	}
	
	public static void main(String[] args){
		HSSFWorkbook workbook = new HSSFWorkbook();
		Sheet sheet0 = workbook.createSheet();
		
		String[] headers = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J"};
		
		Date date = new Date();
		try {
			date = new SimpleDateFormat("yyyy/MM/dd").parse("1990/02/28");
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		Date[] dates = new Date[10];
		for (int i = 0; i < 10; i++) {
			dates[i] = date;
		}
		
		setHeader(workbook, sheet0, headers);
		for(int i = 0; i < 20; i++){
			if (i % 2 == 0) {
				setEvenRow(workbook, sheet0, headers);
			} else {
				// Commented by oliverc
				//setOddRow(workbook, sheet0, headers);
				__setOddRow(workbook, sheet0, dates);
			}
		}
		
		try {
			OutputStream os = new FileOutputStream("temp.xls");
			workbook.write(os);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (null != workbook) {
				try {
					workbook.close();
				} catch (Exception e2) {
					// TODO: handle exception
					// Ignore
				}
			}
		}
		
	}
	
}
