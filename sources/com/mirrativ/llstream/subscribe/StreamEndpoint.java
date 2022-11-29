package com.mirrativ.llstream.subscribe;

import java.net.URI;
import jo.p;
import so.o;

/* loaded from: classes4.dex */
public final class StreamEndpoint {
    private final String audioURL;
    private final String hlsURL;
    private final String streamKey;
    private final String videoURL;

    /* loaded from: classes4.dex */
    public static final class Builder {
        private String streamKey = "";
        private String host = "";

        /* JADX WARN: Removed duplicated region for block: B:17:0x007d  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x007f  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0082  */
        /* JADX WARN: Removed duplicated region for block: B:39:0x00c5 A[ORIG_RETURN, RETURN] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final com.mirrativ.llstream.subscribe.StreamEndpoint build() {
            /*
                r11 = this;
                java.lang.String r0 = r11.host
                int r0 = r0.length()
                r1 = 1
                r2 = 0
                if (r0 <= 0) goto Lc
                r0 = r1
                goto Ld
            Lc:
                r0 = r2
            Ld:
                java.lang.String r3 = ""
                if (r0 == 0) goto L75
                java.lang.String r0 = r11.streamKey
                int r0 = r0.length()
                if (r0 <= 0) goto L1b
                r0 = r1
                goto L1c
            L1b:
                r0 = r2
            L1c:
                if (r0 == 0) goto L75
                java.lang.String r0 = "ws://"
                java.lang.StringBuilder r3 = com.mirrativ.llstream.decoder.a.a(r0)
                java.lang.String r4 = r11.host
                r3.append(r4)
                java.lang.String r4 = ":1883/ws/"
                r3.append(r4)
                java.lang.String r5 = r11.streamKey
                r3.append(r5)
                java.lang.String r5 = "/video/avc"
                r3.append(r5)
                java.lang.String r3 = r3.toString()
                java.lang.StringBuilder r0 = com.mirrativ.llstream.decoder.a.a(r0)
                java.lang.String r5 = r11.host
                r0.append(r5)
                r0.append(r4)
                java.lang.String r4 = r11.streamKey
                r0.append(r4)
                java.lang.String r4 = "/audio/aac"
                r0.append(r4)
                java.lang.String r0 = r0.toString()
                java.lang.String r4 = "http://"
                java.lang.StringBuilder r4 = com.mirrativ.llstream.decoder.a.a(r4)
                java.lang.String r5 = r11.host
                r4.append(r5)
                java.lang.String r5 = ":1935/liveedge/"
                r4.append(r5)
                java.lang.String r5 = r11.streamKey
                r4.append(r5)
                java.lang.String r5 = "/playlist.m3u8"
                r4.append(r5)
                java.lang.String r4 = r4.toString()
                goto L77
            L75:
                r0 = r3
                r4 = r0
            L77:
                int r5 = r3.length()
                if (r5 != 0) goto L7f
                r5 = r1
                goto L80
            L7f:
                r5 = r2
            L80:
                if (r5 != 0) goto Lc5
                int r5 = r0.length()
                if (r5 != 0) goto L8a
                r5 = r1
                goto L8b
            L8a:
                r5 = r2
            L8b:
                if (r5 != 0) goto Lc5
                int r5 = r4.length()
                if (r5 != 0) goto L95
                r5 = r1
                goto L96
            L95:
                r5 = r2
            L96:
                if (r5 == 0) goto L99
                goto Lc5
            L99:
                java.lang.String r5 = r11.streamKey
                int r5 = r5.length()
                if (r5 != 0) goto La2
                goto La3
            La2:
                r1 = r2
            La3:
                if (r1 == 0) goto Lbd
                java.lang.String r1 = "/"
                java.lang.String[] r6 = new java.lang.String[]{r1}
                r7 = 0
                r8 = 0
                r9 = 6
                r10 = 0
                r5 = r3
                java.util.List r1 = so.o.r0(r5, r6, r7, r8, r9, r10)
                r2 = 4
                java.lang.Object r1 = r1.get(r2)
                java.lang.String r1 = (java.lang.String) r1
                r11.streamKey = r1
            Lbd:
                com.mirrativ.llstream.subscribe.StreamEndpoint r1 = new com.mirrativ.llstream.subscribe.StreamEndpoint
                java.lang.String r2 = r11.streamKey
                r1.<init>(r2, r3, r0, r4)
                return r1
            Lc5:
                r0 = 0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.mirrativ.llstream.subscribe.StreamEndpoint.Builder.build():com.mirrativ.llstream.subscribe.StreamEndpoint");
        }

        public final Builder fromRTMP(URI uri) {
            p.h(uri, "uri");
            String path = uri.getPath();
            p.g(path, "uri.path");
            this.streamKey = (String) o.r0(path, new String[]{"/"}, false, 0, 6, null).get(2);
            String host = uri.getHost();
            p.g(host, "uri.host");
            this.host = host;
            return this;
        }
    }

    public StreamEndpoint(String str, String str2, String str3, String str4) {
        p.h(str, "streamKey");
        p.h(str2, "videoURL");
        p.h(str3, "audioURL");
        p.h(str4, "hlsURL");
        this.streamKey = str;
        this.videoURL = str2;
        this.audioURL = str3;
        this.hlsURL = str4;
    }

    public final String getAudioURL() {
        return this.audioURL;
    }

    public final String getHlsURL() {
        return this.hlsURL;
    }

    public final String getStreamKey() {
        return this.streamKey;
    }

    public final String getVideoURL() {
        return this.videoURL;
    }
}
