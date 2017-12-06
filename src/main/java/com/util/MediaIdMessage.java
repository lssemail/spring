package com.util;

import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 * Created by lssemail on 2017/12/6.
 */
public class MediaIdMessage {

    @XStreamAlias("MediaId")
    @XStreamCDATA
    private String MediaId;

    public String getMediaId() {
        return MediaId;
    }

    public void setMediaId(String mediaId) {
        MediaId = mediaId;
    }
}
