package func;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class Crawler {
	public String getAText(String url, int episode) throws IOException  {

//		String url = "https://ncode.syosetu.com" + novel;
		String wholetext = "";
		
//		if(!link.getText().equals("")) {
//			url = link.getText();			
//		}
		Document d = Jsoup.connect(url + episode).get().ownerDocument();
		
		
		Element subtitle = d.getElementsByClass("novel_subtitle").first();
		Element text = d.getElementById("novel_honbun");
		
		int lineN = 1;
		String line = "L";
		Element temp = null;
		
		String output="";
//		System.out.println(subtitle.text());
//		System.out.println();
		output += subtitle.text() + "\n\n";
		/*
		for(lineN=1; lineN<3000; lineN++) {
			line= "L" + lineN;
			if((temp = text.getElementById(line)) == null) break;;

//			wholetext += temp.text() ;
			
			output += temp.text() + "\n";
//			System.out.print(temp.text() +"\n");
		}
		*/
		line += lineN++;
		while((temp = text.getElementById(line)) != null) {
			line = "L" + lineN++;
			output += temp.text() + "\n";
		}
			
//		System.out.println(wholetext);
		
//		System.out.println(output);
		
		return output;
	}
	
	public static void main(String [] args) {
		String url = "https://ncode.syosetu.com/n2959bs/";
		
		try {
			System.out.println(new Crawler().getAText(url, 1));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
