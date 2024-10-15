package exchange_challenge;

/**
 *
 * @author lowprioritygarbage
 */
public record Monedas( String result, String documentation, String terms,
   String time_last_update_unix, String time_last_update_utc, String time_next_update_unix,
   String time_next_update_utc, String base_code, String conversion_rates) {
    
}
