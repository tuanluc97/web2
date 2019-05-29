package com.tuanluc.springdata.common;

import java.util.ArrayList;
import java.util.List;

public class Constant {
    public static final class RSS {
        public static final class VN_EXPRESS {
            final static String TRANG_CHU = "https://vnexpress.net/rss/tin-moi-nhat.rss";
            final static String THOI_SU = "https://vnexpress.net/rss/thoi-su.rss";
            final static String KINH_DOANH = "https://vnexpress.net/rss/kinh-doanh.rss";
            final static String GIAI_TRI = "https://vnexpress.net/rss/giai-tri.rss";
            final static String SO_HOA = "https://vnexpress.net/rss/so-hoa.rss";
        }
        public static final class GAMEK {
            final static String TRANG_CHU = "http://gamek.vn/trang-chu.rss";
            final static String GAME_ONLINE = "http://gamek.vn/game-online.rss";
            final static String THI_TRUONG = "http://gamek.vn/thi-truong.rss";
            final static String ESPORT = "http://gamek.vn/esport.rss";
        }
    }

    public static final List<String> LIST_RSS_VNEXPRESS(){
        List<String> list = new ArrayList<String>();
        list.add(RSS.VN_EXPRESS.TRANG_CHU);
        list.add(RSS.VN_EXPRESS.THOI_SU);
        list.add(RSS.VN_EXPRESS.KINH_DOANH);
        list.add(RSS.VN_EXPRESS.GIAI_TRI);
        list.add(RSS.VN_EXPRESS.SO_HOA);
        return list;
    }
    public static final List<String> LIST_RSS_GAMEK(){
        List<String> list = new ArrayList<String>();
        list.add(RSS.GAMEK.TRANG_CHU);
        list.add(RSS.GAMEK.GAME_ONLINE);
        list.add(RSS.GAMEK.ESPORT);
        list.add(RSS.GAMEK.THI_TRUONG);
        return list;
    }
}
