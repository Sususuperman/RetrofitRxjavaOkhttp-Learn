package com.superman.retrofitrxjavaokhttplearn.beans;

import java.util.List;

/**
 * 作者 Superman
 * 日期 2018/12/6 15:01.
 * 文件 RetrofitRxjavaOkhttpLern
 * 描述
 */

public class InfoItem {

    /**
     * liveInfo : null
     * tcount : 2170
     * picInfo : [{"ref":null,"width":null,"url":"http://cms-bucket.nosdn.127.net/2018/12/06/d72dfc5bbe454e97a224b71309443ae9.png","height":null}]
     * docid : E2BF815R000887BT
     * videoInfo : null
     * channel : auto
     * link : https://3g.163.com/all/article/E2BF815R000887BT.html
     * source : 网易汽车综合
     * title : 每日易乐:小姐姐们如此开心 就知道这车很棒了
     * type : doc
     * imgsrcFrom : null
     * imgsrc3gtype : 1
     * unlikeReason : 重复、旧闻/6,内容质量差/6
     * isTop : null
     * digest : 网易汽车综合12月6日报道每日易乐开通微博和微信啦，欢迎各位
     * typeid :
     * addata : null
     * tag :
     * category : 汽车
     * ptime : 2018-12-06 12:01:51
     */

    private int tcount;
    private String docid;
    private String channel;
    private String link;
    private String source;
    private String title;
    private String type;
    private int imgsrc3gtype;
    private String unlikeReason;
    private String digest;
    private String typeid;
    private String tag;
    private String category;
    private String ptime;
    private List<PicInfoBean> picInfo;


    public int getTcount() {
        return tcount;
    }

    public void setTcount(int tcount) {
        this.tcount = tcount;
    }

    public String getDocid() {
        return docid;
    }

    public void setDocid(String docid) {
        this.docid = docid;
    }


    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }


    public int getImgsrc3gtype() {
        return imgsrc3gtype;
    }

    public void setImgsrc3gtype(int imgsrc3gtype) {
        this.imgsrc3gtype = imgsrc3gtype;
    }

    public String getUnlikeReason() {
        return unlikeReason;
    }

    public void setUnlikeReason(String unlikeReason) {
        this.unlikeReason = unlikeReason;
    }


    public String getDigest() {
        return digest;
    }

    public void setDigest(String digest) {
        this.digest = digest;
    }

    public String getTypeid() {
        return typeid;
    }

    public void setTypeid(String typeid) {
        this.typeid = typeid;
    }


    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getPtime() {
        return ptime;
    }

    public void setPtime(String ptime) {
        this.ptime = ptime;
    }

    public List<PicInfoBean> getPicInfo() {
        return picInfo;
    }

    public void setPicInfo(List<PicInfoBean> picInfo) {
        this.picInfo = picInfo;
    }

    public static class PicInfoBean {
        /**
         * ref : null
         * width : null
         * url : http://cms-bucket.nosdn.127.net/2018/12/06/d72dfc5bbe454e97a224b71309443ae9.png
         * height : null
         */

        private Object ref;
        private Object width;
        private String url;
        private Object height;

        public Object getRef() {
            return ref;
        }

        public void setRef(Object ref) {
            this.ref = ref;
        }

        public Object getWidth() {
            return width;
        }

        public void setWidth(Object width) {
            this.width = width;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public Object getHeight() {
            return height;
        }

        public void setHeight(Object height) {
            this.height = height;
        }
    }
}
