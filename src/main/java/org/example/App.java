package org.example;

import org.openjdk.jol.info.ClassLayout;
import org.openjdk.jol.info.GraphLayout;
import org.openjdk.jol.vm.VM;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicReference;
import java.util.stream.Collectors;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws ParseException {
//        String s = new String();
        final String formattedDate = getFormattedDate("10/10/2000");
        System.out.println(formattedDate);
    }

    public static String getFormattedDate(String date) throws ParseException {


        final SimpleDateFormat outputDateFormat = new SimpleDateFormat("yyyy-MM-dd");

        final List<SimpleDateFormat> knownDatePatterns = new ArrayList<>();
        knownDatePatterns.add(new SimpleDateFormat("dd-MM-yyyy"));
        knownDatePatterns.add(new SimpleDateFormat("dd/MM/yyyy"));
        knownDatePatterns.add(new SimpleDateFormat("yyyy"));

        Date formattedDate = null;
        for(SimpleDateFormat dateFormat : knownDatePatterns){

            try {
                formattedDate = dateFormat.parse(date);
                break;
            } catch (ParseException ignored) {
            }
        }
        if(formattedDate != null){
            return outputDateFormat.format(formattedDate);
        } else{
            return date;
        }

    }
}
