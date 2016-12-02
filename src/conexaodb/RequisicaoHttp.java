/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexaodb;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import entidades.pessoa.Professor;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Type;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 *
 * @author matheush
 */
public class RequisicaoHttp {
    private final String USER_AGENT = "Mozilla/5.0";
    private final String IP = "127.0.0.1";

    public RequisicaoHttp() {
    }
    
    public Professor loginProfessor(String email, String senha) throws Exception {
        String url = "http://" + IP +
                ":8080/web-service/webresources/GamesApp/Professor/login/" +
                email + "/" + senha;
        
        String retornoJson = new RequisicaoHttp().sendGet(url);
        Professor professor;
        
        if (!retornoJson.equals("")) {
            professor = new Professor();
            Gson gson = new Gson();

            Type professorType = new TypeToken<Professor>() {}.getType();

            professor = gson.fromJson(retornoJson, professorType);
            
            return professor;
        } else {
            professor = null;
            
            return professor;
        }        
    } 
    //http://localhost:8080/web-service/webresources/GamesApp/Professor/login/{email}/{senha}
    
    
    
    
    private String sendGet(String url) throws Exception {
 
		//String url = "http://localhost:8080/RestExemplo01/webresources/generic/exemplojson/oi";
 
		URL obj = new URL(url);
		HttpURLConnection con = (HttpURLConnection) obj.openConnection();
 
		// optional default is GET
		con.setRequestMethod("GET");
 
		//add request header
		con.setRequestProperty("User-Agent", USER_AGENT);
 
		int responseCode = con.getResponseCode();
		System.out.println("\nSending 'GET' request to URL : " + url);
		System.out.println("Response Code : " + responseCode);
 
		BufferedReader in = new BufferedReader(
		        new InputStreamReader(con.getInputStream()));
		String inputLine;
		StringBuffer response = new StringBuffer();
 
		while ((inputLine = in.readLine()) != null) {
			response.append(inputLine);
		}
		in.close();
 
		//retorno resultado
		return response.toString();
 
	}
}
