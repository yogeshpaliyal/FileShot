package com.techpaliyal.FileShot.config;

public class AppConfig
{
    public final static int
            SERVER_PORT_COMMUNICATION = 1128,
            SERVER_PORT_SEAMLESS = 58762,
            SERVER_PORT_WEBSHARE = 58732,
            SERVER_PORT_UPDATE_CHANNEL = 58765,
            DEFAULT_SOCKET_TIMEOUT = 5000,
            DEFAULT_SOCKET_TIMEOUT_LARGE = 40000,
            DEFAULT_NOTIFICATION_DELAY = 2000,
            SUPPORTED_MIN_VERSION = 62,
            NICKNAME_LENGTH_MAX = 32,
            BUFFER_LENGTH_DEFAULT = 8096,
            BUFFER_LENGTH_SMALL = 1024,
            DELAY_CHECK_FOR_UPDATES = 21600,
            PHOTO_SCALE_FACTOR = 100,
            WEB_SHARE_CONNECTION_MAX = 20;

    public final static String
            EMAIL_DEVELOPER = "techpaliyal@gmail.com",
            URI_GOOGLE_PLAY = "https://play.google.com/store/apps/details?id=com.techpaliyal.FileShot",
            URI_REPO_APP = "http://github.com/yogeshpaliyal",
            URI_REPO_ORG = "http://github.com/yogeshpaliyal",
            URI_GITHUB_PROFILE = "https://github.com/%s",
            URI_TELEGRAM_CHANNEL = "https://t.me/techpaliyal",
            PREFIX_ACCESS_POINT = "TS_",
            EXT_FILE_PART = "tshare",
            NETWORK_INTERFACE_WIFI = "wlan0",
            NDS_COMM_SERVICE_NAME = "TSComm",
            NDS_COMM_SERVICE_TYPE = "_tscomm._tcp.";

    public final static String[] DEFAULT_DISABLED_INTERFACES = new String[]{"rmnet"};

}
