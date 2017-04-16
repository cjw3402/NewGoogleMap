package com.example.cjw.newgooglemap;

import com.google.android.gms.maps.model.LatLng;

public class BasicInfo {

    /**
     * Package Name
     */
    public static final String PACKAGE_NAME = "com.example.cjw.newgooglemap";

    /**
     * URL- Using Internet Connection Check
     */
    public static final String CONNECTION_CONFIRM_CLIENT_URL = "http://clients3.google.com/generate_204";

    /**
     * Database Name
     */
    public static String DATABASE_NAME = "machine.db";

    /**
     * Database Folder Location
     */
    public static String DATABASE_FOLDER_LOCATION = "/data/data/" + PACKAGE_NAME + "/databases";

    /**
     * Database File Location
     */
    public static String DATABASE_FILE_Location = "/data/data/" + PACKAGE_NAME + "/databases/" + DATABASE_NAME;

    /**
    * Default Location - Seoul
    */
    public static final LatLng DEFAULT_LOCATION = new LatLng(37.56, 126.97);

    /**
     * GPS Settings
     */
    public static final int UPDATE_INTERVAL_MS = 1000;  // 1초
    public static final int FASTEST_UPDATE_INTERVAL_MS = 1000; // 1초

    /**
     * Dialog Messages
     */
    public static final String DIALOG_FOR_PERMISSION_MSG = "앱을 실행하려면 위치 권한 요청을 허가해야 합니다.";
    public static final String DIALOG_FOR_PERMISSION_SETTING_MSG = "위치 권한 거부 및 다시 묻지 않음 체크 박스를 설정하셨습니다.\n"
            + "앱을 실행하려면 설정에서 위치 권한을 허가해야 합니다.";
    public static final String DIALOG_FOR_LOCATION_SERVICE_SETTING_MSG = "앱을 정상적으로 사용하기 위해서는 위치 서비스가 필요합니다.\n"
            + "위치 설정을 수정하시겠습니까?";

    //========== 액티비티 요청 코드  ==========//
    public static final int REQUEST_GPS_ENABLE = 2001;
    public static final int REQUEST_PERMISSION_FOR_ACCESS_FINE_LOCATION = 2002;
    public static final int REQUEST_MOVE_FOR_ZOOM = 2003;

}
