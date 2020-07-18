package com.techpaliyal.FileShot.app;

import android.content.SharedPreferences;

import com.techpaliyal.FileShot.database.AccessDatabase;
import com.techpaliyal.FileShot.util.AppUtils;
import com.techpaliyal.FileShot.util.NotificationUtils;

/**
 * created by: veli
 * date: 31.03.2018 15:23
 */
abstract public class Service extends android.app.Service
{
    private NotificationUtils mNotificationUtils;

    public AccessDatabase getDatabase()
    {
        return AppUtils.getDatabase(this);
    }

    public SharedPreferences getDefaultPreferences()
    {
        return AppUtils.getDefaultPreferences(getApplicationContext());
    }

    public NotificationUtils getNotificationUtils()
    {
        if (mNotificationUtils == null)
            mNotificationUtils = new NotificationUtils(getApplicationContext(), getDatabase(), getDefaultPreferences());

        return mNotificationUtils;
    }
}
