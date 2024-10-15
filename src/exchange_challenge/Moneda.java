package exchange_challenge;

import com.google.gson.annotations.SerializedName;
import java.util.List;

public class Moneda{
    
    
    @SerializedName("result") 
   private String result;
   private String documentation;
   private String terms;
   private int time_last_update_unix;
   private int time_last_update_utc;
   private int time_next_update_unix;
   private String time_next_update_utc;
   private String base_code;
   private List conversion_rates;

    public Moneda() {
    }
    
    public String getResult() {
        return result;
    }

    public String getDocumentation() {
        return documentation;
    }

    public String getTerms() {
        return terms;
    }

    public int getTime_last_update_unix() {
        return time_last_update_unix;
    }

    public int getTime_last_update_utc() {
        return time_last_update_utc;
    }

    public int getTime_next_update_unix() {
        return time_next_update_unix;
    }

    public String getTime_next_update_utc() {
        return time_next_update_utc;
    }

    public String getBase_code() {
        return base_code;
    }

    public List getConversion_rates() {
        return conversion_rates;
    }
    
}
