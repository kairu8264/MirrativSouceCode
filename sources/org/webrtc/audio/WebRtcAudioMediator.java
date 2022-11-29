package org.webrtc.audio;

import android.media.AudioRecord;

/* loaded from: classes4.dex */
public class WebRtcAudioMediator {
    private static WebRtcAudioMediator sInstance = new WebRtcAudioMediator();
    private AudioRecord mAudioRecord;
    private boolean mMultiMode;
    private boolean mStartMediation = false;
    private WebRtcAudioRecord mWebRtcAudioRecord;
    private WebRtcAudioTrack mWebRtcAudioTrack;

    public static WebRtcAudioMediator getInstance() {
        return sInstance;
    }

    public AudioRecord getAudioRecord() {
        return this.mAudioRecord;
    }

    public WebRtcAudioRecord getWebRtcAudioRecord() {
        return this.mWebRtcAudioRecord;
    }

    public WebRtcAudioTrack getWebRtcAudioTrack() {
        return this.mWebRtcAudioTrack;
    }

    public boolean isMultiMode() {
        return this.mMultiMode;
    }

    public boolean isStarted() {
        return this.mStartMediation;
    }

    public void setAudioRecord(AudioRecord audioRecord) {
        this.mAudioRecord = audioRecord;
    }

    public void setMultiMode(boolean z10) {
        this.mMultiMode = z10;
    }

    public void setWebRtcAudioRecord(WebRtcAudioRecord webRtcAudioRecord) {
        this.mWebRtcAudioRecord = webRtcAudioRecord;
    }

    public void setWebRtcAudioTrack(WebRtcAudioTrack webRtcAudioTrack) {
        this.mWebRtcAudioTrack = webRtcAudioTrack;
    }

    public void startMediation(AudioRecord audioRecord) {
        this.mStartMediation = true;
        this.mMultiMode = false;
        this.mAudioRecord = audioRecord;
    }

    public void stopMediation() {
        this.mStartMediation = false;
        this.mMultiMode = false;
        this.mWebRtcAudioRecord = null;
        this.mWebRtcAudioTrack = null;
        this.mAudioRecord = null;
    }
}
