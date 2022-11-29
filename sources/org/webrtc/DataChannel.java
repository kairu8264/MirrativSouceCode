package org.webrtc;

import java.nio.ByteBuffer;

/* loaded from: classes4.dex */
public class DataChannel {
    private long nativeDataChannel;
    private long nativeObserver;

    /* loaded from: classes4.dex */
    public static class Buffer {
        public final boolean binary;
        public final ByteBuffer data;

        @CalledByNative("Buffer")
        public Buffer(ByteBuffer byteBuffer, boolean z10) {
            this.data = byteBuffer;
            this.binary = z10;
        }
    }

    /* loaded from: classes4.dex */
    public static class Init {
        public boolean negotiated;
        public boolean ordered = true;
        public int maxRetransmitTimeMs = -1;
        public int maxRetransmits = -1;
        public String protocol = "";

        /* renamed from: id  reason: collision with root package name */
        public int f45550id = -1;

        @CalledByNative("Init")
        public int getId() {
            return this.f45550id;
        }

        @CalledByNative("Init")
        public int getMaxRetransmitTimeMs() {
            return this.maxRetransmitTimeMs;
        }

        @CalledByNative("Init")
        public int getMaxRetransmits() {
            return this.maxRetransmits;
        }

        @CalledByNative("Init")
        public boolean getNegotiated() {
            return this.negotiated;
        }

        @CalledByNative("Init")
        public boolean getOrdered() {
            return this.ordered;
        }

        @CalledByNative("Init")
        public String getProtocol() {
            return this.protocol;
        }
    }

    /* loaded from: classes4.dex */
    public interface Observer {
        @CalledByNative("Observer")
        void onBufferedAmountChange(long j10);

        @CalledByNative("Observer")
        void onMessage(Buffer buffer);

        @CalledByNative("Observer")
        void onStateChange();
    }

    /* loaded from: classes4.dex */
    public enum State {
        CONNECTING,
        OPEN,
        CLOSING,
        CLOSED;

        @CalledByNative("State")
        public static State fromNativeIndex(int i10) {
            return values()[i10];
        }
    }

    @CalledByNative
    public DataChannel(long j10) {
        this.nativeDataChannel = j10;
    }

    private void checkDataChannelExists() {
        if (this.nativeDataChannel == 0) {
            throw new IllegalStateException("DataChannel has been disposed.");
        }
    }

    private native long nativeBufferedAmount();

    private native void nativeClose();

    private native int nativeId();

    private native String nativeLabel();

    private native long nativeRegisterObserver(Observer observer);

    private native boolean nativeSend(byte[] bArr, boolean z10);

    private native State nativeState();

    private native void nativeUnregisterObserver(long j10);

    public long bufferedAmount() {
        checkDataChannelExists();
        return nativeBufferedAmount();
    }

    public void close() {
        checkDataChannelExists();
        nativeClose();
    }

    public void dispose() {
        checkDataChannelExists();
        JniCommon.nativeReleaseRef(this.nativeDataChannel);
        this.nativeDataChannel = 0L;
    }

    @CalledByNative
    public long getNativeDataChannel() {
        return this.nativeDataChannel;
    }

    public int id() {
        checkDataChannelExists();
        return nativeId();
    }

    public String label() {
        checkDataChannelExists();
        return nativeLabel();
    }

    public void registerObserver(Observer observer) {
        checkDataChannelExists();
        long j10 = this.nativeObserver;
        if (j10 != 0) {
            nativeUnregisterObserver(j10);
        }
        this.nativeObserver = nativeRegisterObserver(observer);
    }

    public boolean send(Buffer buffer) {
        checkDataChannelExists();
        byte[] bArr = new byte[buffer.data.remaining()];
        buffer.data.get(bArr);
        return nativeSend(bArr, buffer.binary);
    }

    public State state() {
        checkDataChannelExists();
        return nativeState();
    }

    public void unregisterObserver() {
        checkDataChannelExists();
        nativeUnregisterObserver(this.nativeObserver);
    }
}
