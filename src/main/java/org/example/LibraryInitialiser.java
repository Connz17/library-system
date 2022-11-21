package org.example;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class LibraryInitialiser {

    private LibraryDatabase libraryDatabase;


    public LibraryInitialiser(LibraryDatabase libraryDatabase) {
        this.libraryDatabase = libraryDatabase;
    }

//    public LibraryInitialiser() {
//
//    }

    //@SuppressWarnings("unchecked")
    public void LibraryInit() {

        JSONParser jsonParser = new JSONParser();

        try (FileReader reader = new FileReader("src/main/resources/booksdata.json")) {
            //Read JSON file
            Object obj = jsonParser.parse(reader);

            JSONArray booksList = (JSONArray) obj;
            //System.out.println(booksList);


            for (Object book : booksList) {
                JSONObject bookJSON = (JSONObject) book;

                int id = Integer.parseInt((String) bookJSON.get("Number")) ;
                String title = (String)  bookJSON.get("Title");
                String author = (String)  bookJSON.get("Author");
                String genre = (String)  bookJSON.get("Genre");
                String publisher = (String)  bookJSON.get("Publisher");
                String subGenre = (String)  bookJSON.get("SubGenre");

                libraryDatabase.addBook(new Book(id, title, author, genre, publisher, subGenre));
            }
                //Iterate over books array
//            booksList.forEach( book -> parseBooksObject( (JSONObject) book ) );

            } catch(FileNotFoundException e){
                e.printStackTrace();
            } catch(IOException e){
                e.printStackTrace();
            } catch(ParseException e){
                e.printStackTrace();
            }


        }

//    private void parseBooksObject(JSONObject book) {
//        JSONObject bookObject = (JSONObject) book;
//        //System.out.println(bookObject);
//
//        String title = (String) bookObject.get("Title");
//        System.out.println(title);
//
//        String author = (String) bookObject.get("Author");
//        System.out.println(author);
//
//        String genre = (String) bookObject.get("Genre");
//        System.out.println(genre);
//
//        String publisher = (String) bookObject.get("Publisher");
//        System.out.println(publisher);
//
//        String subGenre = (String) bookObject.get("SubGenre");
//        System.out.println(subGenre);
//
//        int id = Integer.parseInt((String) bookObject.get("Number")) ;
//        System.out.println(id);
//
//
//        libraryDatabase.addBook(new Book(id, title, author, genre, publisher, subGenre));
//
//
//    }


    }


//        JSONParser jsonParser = new JSONParser();
//        try (FileReader reader = new FileReader(resourceFile.getFile())) {
//            Object obj = jsonParser.parse(reader);
//
//            JSONArray jsonArray = (JSONArray) obj;
//
//            for (Object book : jsonArray) {
//                JSONObject greetingJSON = (JSONObject) book;
//
//                int id = (int) greetingJSON.get("Number");
//                String title = (String) greetingJSON.get("Title");
//                String author = (String) greetingJSON.get("Author");
//                String genre = (String) greetingJSON.get("Genre");
//                String publisher = (String) greetingJSON.get("Publisher");
//                String subGenre = (String) greetingJSON.get("SubGenre");
//
//                libraryDatabase.addBook(new Book(id, title, author, genre, publisher, subGenre));
//            }
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
