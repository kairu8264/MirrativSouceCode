package com.mirrativ.llstream.decoder;

import java.util.Arrays;
import jo.p;

/* loaded from: classes4.dex */
public final class PCMData {
    private final byte[] bytes;
    private final int index;
    private long pts;
    private final int size;

    public PCMData(byte[] bArr, int i10, int i11, long j10) {
        p.h(bArr, "bytes");
        this.bytes = bArr;
        this.index = i10;
        this.size = i11;
        this.pts = j10;
    }

    public static /* synthetic */ PCMData copy$default(PCMData pCMData, byte[] bArr, int i10, int i11, long j10, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            bArr = pCMData.bytes;
        }
        if ((i12 & 2) != 0) {
            i10 = pCMData.index;
        }
        int i13 = i10;
        if ((i12 & 4) != 0) {
            i11 = pCMData.size;
        }
        int i14 = i11;
        if ((i12 & 8) != 0) {
            j10 = pCMData.pts;
        }
        return pCMData.copy(bArr, i13, i14, j10);
    }

    public final byte[] component1() {
        return this.bytes;
    }

    public final int component2() {
        return this.index;
    }

    public final int component3() {
        return this.size;
    }

    public final long component4() {
        return this.pts;
    }

    public final PCMData copy(byte[] bArr, int i10, int i11, long j10) {
        p.h(bArr, "bytes");
        return new PCMData(bArr, i10, i11, j10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof PCMData) {
            PCMData pCMData = (PCMData) obj;
            return p.c(this.bytes, pCMData.bytes) && this.index == pCMData.index && this.size == pCMData.size && this.pts == pCMData.pts;
        }
        return false;
    }

    public final byte[] getBytes() {
        return this.bytes;
    }

    public final int getIndex() {
        return this.index;
    }

    public final long getPts() {
        return this.pts;
    }

    public final int getSize() {
        return this.size;
    }

    public int hashCode() {
        int hashCode = Integer.hashCode(this.index);
        int hashCode2 = Integer.hashCode(this.size);
        return Long.hashCode(this.pts) + ((hashCode2 + ((hashCode + (Arrays.hashCode(this.bytes) * 31)) * 31)) * 31);
    }

    public final void setPts(long j10) {
        this.pts = j10;
    }

    public String toString() {
        StringBuilder a10 = a.a("PCMData(bytes=");
        a10.append(Arrays.toString(this.bytes));
        a10.append(", index=");
        a10.append(this.index);
        a10.append(", size=");
        a10.append(this.size);
        a10.append(", pts=");
        a10.append(this.pts);
        a10.append(')');
        return a10.toString();
    }
}
