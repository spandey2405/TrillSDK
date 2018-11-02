package cordova.plugin.trillsdk;

import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CallbackContext;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * This class echoes a string called from JavaScript.
 */
public class TrillSDK extends CordovaPlugin {

    @Override
    public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
        if (action.equals("init")) {
            this.init(args, callbackContext);
            return true;
        }
        return false;
    }

    private void init(JSONArray args, CallbackContext callback) {
        if (args != null) {
            try {
                String KEY = args.getJSONObject(0).getString("KEY");
                String Secret = args.getJSONObject(0).getString("Secret");
                callback.success("51234");
            } catch (Exception e) {
                callback.error("Something went wrong " + e);    
            }
        } else {
            callback.error("Init Function require Key and Secret");
        }
    }
}
