package com.mirrativ.llstream.subscribe;

import com.mirrativ.llstream.decoder.a;
import com.mirrativ.llstream.protocol.v1.topic.TopicConstant;
import java.util.ArrayList;
import java.util.List;
import jo.h;
import jo.p;
import wn.r;

/* loaded from: classes4.dex */
public final class DecodeErrorInfo {
    private final List<r> pps;
    private final List<r> sps;

    public DecodeErrorInfo() {
        this(null, null, 3, null);
    }

    public DecodeErrorInfo(List<r> list, List<r> list2) {
        p.h(list, TopicConstant.EXTEND_AVC_SPS);
        p.h(list2, TopicConstant.EXTEND_AVC_PPS);
        this.sps = list;
        this.pps = list2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DecodeErrorInfo copy$default(DecodeErrorInfo decodeErrorInfo, List list, List list2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = decodeErrorInfo.sps;
        }
        if ((i10 & 2) != 0) {
            list2 = decodeErrorInfo.pps;
        }
        return decodeErrorInfo.copy(list, list2);
    }

    public final List<r> component1() {
        return this.sps;
    }

    public final List<r> component2() {
        return this.pps;
    }

    public final DecodeErrorInfo copy(List<r> list, List<r> list2) {
        p.h(list, TopicConstant.EXTEND_AVC_SPS);
        p.h(list2, TopicConstant.EXTEND_AVC_PPS);
        return new DecodeErrorInfo(list, list2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof DecodeErrorInfo) {
            DecodeErrorInfo decodeErrorInfo = (DecodeErrorInfo) obj;
            return p.c(this.sps, decodeErrorInfo.sps) && p.c(this.pps, decodeErrorInfo.pps);
        }
        return false;
    }

    public final List<r> getPps() {
        return this.pps;
    }

    public final List<r> getSps() {
        return this.sps;
    }

    public int hashCode() {
        return this.pps.hashCode() + (this.sps.hashCode() * 31);
    }

    public String toString() {
        StringBuilder a10 = a.a("DecodeErrorInfo(sps=");
        a10.append(this.sps);
        a10.append(", pps=");
        a10.append(this.pps);
        a10.append(')');
        return a10.toString();
    }

    public /* synthetic */ DecodeErrorInfo(List list, List list2, int i10, h hVar) {
        this((i10 & 1) != 0 ? new ArrayList() : list, (i10 & 2) != 0 ? new ArrayList() : list2);
    }
}
