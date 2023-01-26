package dte.mgmprojects.mobile_asp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.widget.Button;

import com.google.android.material.snackbar.Snackbar;

import java.util.Random;
import java.util.concurrent.Executors;

import org.eclipse.paho.android.service.MqttAndroidClient;
import org.eclipse.paho.client.mqttv3.DisconnectedBufferOptions;
import org.eclipse.paho.client.mqttv3.IMqttActionListener;
import org.eclipse.paho.client.mqttv3.IMqttToken;
import org.eclipse.paho.client.mqttv3.MqttConnectOptions;
import org.eclipse.paho.client.mqttv3.MqttException;

public class MainActivity extends AppCompatActivity {

    Button bPublish;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bPublish = findViewById(R.id.bPublish);
        /*
        // Creation of the MQTT Client and subscription to the topics
        Greenhouse = new MQTTClient(this);
        Random random = new Random();
        Greenhouse.clientId = Greenhouse.clientId + random.nextInt(100000);
        Greenhouse.mqttAndroidClient = new MqttAndroidClient(getApplicationContext(), Greenhouse.serverUri, Greenhouse.clientId);
        MqttConnectOptions mqttConnectOptions = new MqttConnectOptions();
        mqttConnectOptions.setAutomaticReconnect(true);
        mqttConnectOptions.setCleanSession(false);

        //Last Will message
        mqttConnectOptions.setWill(Greenhouse.publishTopic,Greenhouse.LWillmessage.getBytes(),0,false);

        try { //Create and connect the MQTT client. Also, create the subscriptions.
            Greenhouse.mqttAndroidClient.connect(mqttConnectOptions, null, new IMqttActionListener() {
                @Override
                public void onSuccess(IMqttToken asyncActionToken) {
                    DisconnectedBufferOptions disconnectedBufferOptions = new DisconnectedBufferOptions();
                    disconnectedBufferOptions.setBufferEnabled(true);
                    disconnectedBufferOptions.setBufferSize(100);
                    disconnectedBufferOptions.setPersistBuffer(false);
                    disconnectedBufferOptions.setDeleteOldestMessages(false);
                    Greenhouse.mqttAndroidClient.setBufferOpts(disconnectedBufferOptions);
                    Greenhouse.subscriptionTopic = "Tomato/#";
                    Greenhouse.subscribeToTopic();
                    Greenhouse.subscriptionTopic = "Pepper/#";
                    Greenhouse.subscribeToTopic();
                    Greenhouse.subscriptionTopic = "Eggplant/#";
                    Greenhouse.subscribeToTopic();
                    Greenhouse.subscriptionTopic = "GreenBean/#";
                    Greenhouse.subscribeToTopic();
                    Greenhouse.subscriptionTopic = "Cucumber/#";
                    Greenhouse.subscribeToTopic();
                    Greenhouse.subscriptionTopic = "Zucchini/#";
                    Greenhouse.subscribeToTopic();
                    Greenhouse.subscriptionTopic = "Melon/#";
                    Greenhouse.subscribeToTopic();
                    Greenhouse.subscriptionTopic = "Watermelon/#";
                    Greenhouse.subscribeToTopic();
                    Snackbar.make(findViewById(R.id.bNewMeasurement), "Client connected and subscribed", 2000).show();// Inform the user
                }

                @Override
                public void onFailure(IMqttToken asyncActionToken, Throwable exception) {
                }
            });
        } catch (MqttException e) {
            e.printStackTrace();
        }




        es = Executors.newSingleThreadExecutor();
        MQTTSub task = new MQTTSub(handler, Greenhouse);
        es.execute(task);
        */
    }

    /*Handler handler = new Handler(Looper.getMainLooper()) { //Handler for the message received from the background. Depending on the key (topic), the message will be assigned to a specif String variable
        @Override                                   //Then, the attributes (Temperature, Humidity and Light) of each item are updated.
        public void handleMessage(Message inputMessage) {
            this.obtainMessage();
            TomatoLight = inputMessage.getData().getString("Tomato/Light");
            TomatoTemperature = inputMessage.getData().getString("Tomato/Temperature");
            TomatoHumidity = inputMessage.getData().getString("Tomato/Humidity");
            TomatoDate = inputMessage.getData().getString("Tomato/Date");
            recyclerViewAdapter.getItemWithKey(0).setParameters(TomatoLight,TomatoHumidity, TomatoTemperature,TomatoDate);
            if(TomatoTemperature != null) {
                if (Float.parseFloat(TomatoTemperature) > (float)27.0) {//Max temperature for tomato
                    recyclerViewAdapter.getItemWithKey(0).setStatus(false);
                    recyclerViewAdapter.notifyDataSetChanged();
                } else if (Float.parseFloat((TomatoTemperature)) < (float)18.0) {//Min temperature for tomato
                    recyclerViewAdapter.getItemWithKey(0).setStatus(false);
                    recyclerViewAdapter.notifyDataSetChanged();
                } else {
                    recyclerViewAdapter.getItemWithKey(0).setStatus(true);
                    recyclerViewAdapter.notifyDataSetChanged();
                }
            }

        }
    };

     */
}