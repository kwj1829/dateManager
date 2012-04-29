package com.dm.content.facebook;

import com.dm.content.facebook.lib.DialogError;
import com.dm.content.facebook.lib.FacebookError;
import com.dm.content.facebook.lib.Facebook.DialogListener;


/**
 * Skeleton base class for RequestListeners, providing default error 
 * handling. Applications should handle these error conditions.
 *
 */
public abstract class BaseDialogListener implements DialogListener {

    public void onFacebookError(FacebookError e) {
        e.printStackTrace();
    }

    public void onError(DialogError e) {
        e.printStackTrace();        
    }

    public void onCancel() {        
    }
    
}
