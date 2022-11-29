package com.mirrativ.llstream.protocol.v1.packet;

import com.mirrativ.llstream.decoder.a;
import java.util.Arrays;
import jo.h;
import jo.p;

/* loaded from: classes4.dex */
public final class TopicPacket {
    private byte[] data;
    private String suffix;

    public TopicPacket(String str, byte[] bArr) {
        p.h(str, "suffix");
        p.h(bArr, "data");
        this.suffix = str;
        this.data = bArr;
    }

    public static /* synthetic */ TopicPacket copy$default(TopicPacket topicPacket, String str, byte[] bArr, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = topicPacket.suffix;
        }
        if ((i10 & 2) != 0) {
            bArr = topicPacket.data;
        }
        return topicPacket.copy(str, bArr);
    }

    public final String component1() {
        return this.suffix;
    }

    public final byte[] component2() {
        return this.data;
    }

    public final TopicPacket copy(String str, byte[] bArr) {
        p.h(str, "suffix");
        p.h(bArr, "data");
        return new TopicPacket(str, bArr);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof TopicPacket) {
            TopicPacket topicPacket = (TopicPacket) obj;
            return p.c(this.suffix, topicPacket.suffix) && p.c(this.data, topicPacket.data);
        }
        return false;
    }

    public final byte[] getData() {
        return this.data;
    }

    public final String getSuffix() {
        return this.suffix;
    }

    public int hashCode() {
        return Arrays.hashCode(this.data) + (this.suffix.hashCode() * 31);
    }

    public final void setData(byte[] bArr) {
        p.h(bArr, "<set-?>");
        this.data = bArr;
    }

    public final void setSuffix(String str) {
        p.h(str, "<set-?>");
        this.suffix = str;
    }

    public String toString() {
        StringBuilder a10 = a.a("TopicPacket(suffix=");
        a10.append(this.suffix);
        a10.append(", data=");
        a10.append(Arrays.toString(this.data));
        a10.append(')');
        return a10.toString();
    }

    public /* synthetic */ TopicPacket(String str, byte[] bArr, int i10, h hVar) {
        this((i10 & 1) != 0 ? "" : str, bArr);
    }
}
