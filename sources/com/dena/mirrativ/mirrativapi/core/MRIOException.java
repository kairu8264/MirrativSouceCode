package com.dena.mirrativ.mirrativapi.core;

import com.dena.mirrorman.clientlog.logs.MRLog;
import java.io.IOException;
import jo.p;

/* loaded from: classes2.dex */
public final class MRIOException extends IOException {
    private final MRError error;
    private final String url;

    public MRIOException(String str, MRError mRError) {
        p.h(str, "url");
        p.h(mRError, MRLog.PAYLOAD_KEY_ERROR);
        this.url = str;
        this.error = mRError;
    }

    public static /* synthetic */ MRIOException copy$default(MRIOException mRIOException, String str, MRError mRError, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = mRIOException.url;
        }
        if ((i10 & 2) != 0) {
            mRError = mRIOException.error;
        }
        return mRIOException.copy(str, mRError);
    }

    public final String component1() {
        return this.url;
    }

    public final MRError component2() {
        return this.error;
    }

    public final MRIOException copy(String str, MRError mRError) {
        p.h(str, "url");
        p.h(mRError, MRLog.PAYLOAD_KEY_ERROR);
        return new MRIOException(str, mRError);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof MRIOException) {
            MRIOException mRIOException = (MRIOException) obj;
            return p.c(this.url, mRIOException.url) && p.c(this.error, mRIOException.error);
        }
        return false;
    }

    public final MRError getError() {
        return this.error;
    }

    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        return (this.url.hashCode() * 31) + this.error.hashCode();
    }

    @Override // java.lang.Throwable
    public String toString() {
        return "MRIOException(url=" + this.url + ", error=" + this.error + ')';
    }
}
