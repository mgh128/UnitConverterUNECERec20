package org.oliot.unit_converter;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.json.JSONObject;

public class JsonParser {

	private static String input = "e:\\\\v.txt";
	private static String output = "e:\\\\vo.txt";

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new FileReader(input));
		BufferedWriter writer = new BufferedWriter(new FileWriter(output));
		while (true) {
			String line = reader.readLine();
			if (line == null)
				break;
			if (line.length() <= 1)
				continue;
			// {"rec20":"KMQ","name":"kilogram per cubic
			// metre","symbol":"kg/m³","multiplier":1,"offset":0,"type":"density, humidity"}
			line = line.replaceAll("\t", "");
			line = line.replace("[", "");
			line = line.replace("]", "");
			// line = line.substring(1, line.length());
			System.out.println(line);
			JSONObject obj = new JSONObject(line);
			String result = "";
			// KMQ("kilogram per cubic metre", "kg/m³"), _23("gram per cubic centimetre",
			// "g/cm³"),
			result += obj.getString("rec20") + "(\"" + obj.getString("name") + "\",\"" + obj.getString("symbol")
					+ "\"),\r\n";
			writer.write(result);
		}
		writer.write("\r\n");
		reader.close();

		reader = new BufferedReader(new FileReader(input));
		while (true) {
			String line = reader.readLine();
			if (line == null)
				break;
			if (line.length() <= 1)
				continue;
			// {"rec20":"KMQ","name":"kilogram per cubic
			// metre","symbol":"kg/m³","multiplier":1,"offset":0,"type":"density, humidity"}
			line = line.replaceAll("\t", "");
			line = line.replace("[", "");
			line = line.replace("]", "");
			// line = line.substring(1, line.length());
			JSONObject obj = new JSONObject(line);
			writer.write(obj.getDouble("multiplier") + ",");
		}
		writer.write("\r\n");
		reader.close();

		reader = new BufferedReader(new FileReader(input));
		while (true) {
			String line = reader.readLine();
			if (line == null)
				break;
			if (line.length() <= 1)
				continue;
			// {"rec20":"KMQ","name":"kilogram per cubic
			// metre","symbol":"kg/m³","multiplier":1,"offset":0,"type":"density, humidity"}
			line = line.replaceAll("\t", "");
			line = line.replace("[", "");
			line = line.replace("]", "");
			// line = line.substring(1, line.length());
			JSONObject obj = new JSONObject(line);
			writer.write(obj.getDouble("offset") + ",");
		}
		writer.write("\r\n");
		reader.close();

		writer.close();

	}

}
