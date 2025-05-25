package org.jedi_bachelor;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String url = "https://opt-opt-opt.ru"; // ссылка на сайт (никогда туда не переходите)

        try {
            Document doc = Jsoup.connect(url).maxBodySize(0).get();
            Elements els = doc.select("div .bx_catalog_item");
            els.forEach(el -> System.out.println(
                            el.select(".bx_catalog_item_articul").text() // парсинг артикула
                            + " " +
                            el.select(".bx_catalog_item_price").text() // парсинг цены
                            +
                            el.select("a").first().absUrl("href")) // парсинг ссылки (здесь "а" - тэг HTML-страницы)
                        );
        } catch(IOException ex) {
            ex.printStackTrace();
        }


    }
}