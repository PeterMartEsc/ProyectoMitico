package es.ies.puerto.util;

import static com.mongodb.client.model.Filters.eq;

import org.bson.Document;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
public class Conection {

    public static void main( String[] args ) {
        /*
        // Replace the placeholder with your MongoDB deployment's connection string
        // (Hecho, la info está en resources/data.txt)
        String uri = "mongodb+srv://petermartesc:J4qyuk2gP6mHttJ8@proyectomitico.0iyfune.mongodb.net/" +
                "?retryWrites=true&w=majority&appName=ProyectoMitico";
        try (MongoClient mongoClient = MongoClients.create(uri)) {
            //Cambiar aquí "sample_mflix" por el nombre de la Database nuestra
            MongoDatabase database = mongoClient.getDatabase("ProyectoMitico");
            //Cambiar aquí la colección por la de la tabla a la que queramos que se conecte
            MongoCollection<Document> collection = database.getCollection("Dios");
            //Esto para buscar específicamente un registro supongo
            Document doc = collection.find(eq("id", 1)).first();
            if (doc != null) {
                System.out.println(doc.toJson());
            } else {
                System.out.println("No matching documents found.");
            }
        }
         */
    }

}
