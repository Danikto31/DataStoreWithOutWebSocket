package my.springproject.datastore.Controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.concurrent.ConcurrentHashMap;

@RestController
@RequestMapping("/sync")
public class ControllerData {
    private static JSOND jsond;
    private ConcurrentHashMap<String,String> dataStore = new ConcurrentHashMap<>();
    private String textData;



    @PostMapping("/update")
    public void updataData(@RequestBody JSOND jsond) {
        dataStore.put(jsond.GetKey(),jsond.GetValue());
    }

    @GetMapping("/data")
    public ConcurrentHashMap<String, String> getData() {
        return dataStore;
    }
    @PostMapping("/saveText")
    public void saveText(@RequestBody String text) {
        this.textData = text;
    }

    @GetMapping
    public String getText() {
        return textData;
    }


}