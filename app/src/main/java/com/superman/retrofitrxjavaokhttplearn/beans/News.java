package com.superman.retrofitrxjavaokhttplearn.beans;

import java.io.Serializable;
import java.util.List;

/**
 * 作者 Superman
 * 日期 2018/11/28 18:13.
 * 文件 RetrofitRxjavaOkhttpLern
 * 描述
 */

public class News implements Serializable {



    private String reason;
    private ResultBean result;
    private int error_code;

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public ResultBean getResult() {
        return result;
    }

    public void setResult(ResultBean result) {
        this.result = result;
    }

    public int getError_code() {
        return error_code;
    }

    public void setError_code(int error_code) {
        this.error_code = error_code;
    }

    public static class ResultBean {
        /**
         * stat : 1
         */

        private String stat;
        private List<DataBean> data;

        public String getStat() {
            return stat;
        }

        public void setStat(String stat) {
            this.stat = stat;
        }

        public List<DataBean> getData() {
            return data;
        }

        public void setData(List<DataBean> data) {
            this.data = data;
        }

        public static class DataBean {
            /**
             * uniquekey : da6ef1fc5279dc2305c3b42828055e76
             * title : 想摆脱肌肉腿？尝试一下这两个动作，让你的训练事半功倍
             * date : 2018-11-29 09:30
             * category : 头条
             * author_name :  运动发骚客
             * url : http://mini.eastday.com/mobile/181129093032117.html
             * thumbnail_pic_s : http://04imgmini.eastday.com/mobile/20181129/20181129_502c89c013e226f3ed7e466faefb9f11_cover_mwpm_03200403.jpg
             * thumbnail_pic_s02 : http://04imgmini.eastday.com/mobile/20181129/20181129_2a1734eefb615f471c0480e992fc99ec_cover_mwpm_03200403.jpg
             * thumbnail_pic_s03 : http://04imgmini.eastday.com/mobile/20181129/20181129_6611fb46c31826c5c0ebb3337eaba396_cover_mwpm_03200403.jpg
             */

            private String uniquekey;
            private String title;
            private String date;
            private String category;
            private String author_name;
            private String url;
            private String thumbnail_pic_s;
            private String thumbnail_pic_s02;
            private String thumbnail_pic_s03;

            public String getUniquekey() {
                return uniquekey;
            }

            public void setUniquekey(String uniquekey) {
                this.uniquekey = uniquekey;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public String getDate() {
                return date;
            }

            public void setDate(String date) {
                this.date = date;
            }

            public String getCategory() {
                return category;
            }

            public void setCategory(String category) {
                this.category = category;
            }

            public String getAuthor_name() {
                return author_name;
            }

            public void setAuthor_name(String author_name) {
                this.author_name = author_name;
            }

            public String getUrl() {
                return url;
            }

            public void setUrl(String url) {
                this.url = url;
            }

            public String getThumbnail_pic_s() {
                return thumbnail_pic_s;
            }

            public void setThumbnail_pic_s(String thumbnail_pic_s) {
                this.thumbnail_pic_s = thumbnail_pic_s;
            }

            public String getThumbnail_pic_s02() {
                return thumbnail_pic_s02;
            }

            public void setThumbnail_pic_s02(String thumbnail_pic_s02) {
                this.thumbnail_pic_s02 = thumbnail_pic_s02;
            }

            public String getThumbnail_pic_s03() {
                return thumbnail_pic_s03;
            }

            public void setThumbnail_pic_s03(String thumbnail_pic_s03) {
                this.thumbnail_pic_s03 = thumbnail_pic_s03;
            }
        }
    }
}
