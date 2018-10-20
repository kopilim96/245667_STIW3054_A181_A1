package com.assignment1;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import java.util.ArrayList;
import java.util.List;

public class scrapeWikiData {
    public List<Data> findAll(){
        try {
            System.out.println("");
            String URL = "https://ms.wikipedia.org/wiki/Malaysia";
            Document doc = Jsoup.connect(URL).get();
            //Elements trs = doc.select("#mw-content-text > div > table:nth-child(148) > tbody > tr:nth-child(1) > th");
            String tittle = doc.title();
            System.out.printf("%66s", tittle + "\n");
            System.out.println("-----------------------------------------------------------------------------------------");
            List<Data> result = new ArrayList<Data>();

            for (int i = 1; i <= 24; i++) {
                Elements trs = doc.select("#mw-content-text > div > table:nth-child(148) > tbody > tr:nth-child(" + i + ") > th");
                Elements tds = doc.select("#mw-content-text > div > table:nth-child(148) > tbody > tr:nth-child(" + i + ") > td");
                System.out.printf("%2d", i);
                System.out.print(" : ");
                System.out.printf("%34s", trs.text());
                System.out.print("    ");
                System.out.printf("%5s", tds.text() + "\n");
                result.add(new Data(i,trs.text(), tds.text()));
            }
            return result;

        }catch (Exception e){
            return null;
        }

    }

}
