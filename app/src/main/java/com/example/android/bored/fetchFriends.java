package com.example.android.bored;

import android.os.AsyncTask;
import android.renderscript.ScriptGroup;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class fetchFriends extends AsyncTask<Void, Void, Void> {
    String data = "";
    String activity = "";
    @Override
    protected Void doInBackground(Void... voids) {
        try {
            URL url = new URL("http://www.boredapi.com/api/activity?participants=4");
            //"http://www.boredapi.com/api/activity?participants=1");

            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            InputStream inputStream = httpURLConnection.getInputStream();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            String line = "";
            while(line != null) {
                line = bufferedReader.readLine();
                data = data + line;
            }
            try {
                JSONObject obj = new JSONObject(data);
                activity = obj.getString("activity") + "!";
            } catch (JSONException e) {
                e.printStackTrace();
                System.out.print(data);
            }

        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    protected void onPostExecute(Void aVoid) {
        super.onPostExecute(aVoid);

        MainActivity.data.setText(this.activity);
    }
}
