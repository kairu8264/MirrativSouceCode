package com.dena.mirrativ.mirrativapi.core;

import com.dena.mirrorman.clientlog.logs.MRLog;
import jo.p;

/* loaded from: classes2.dex */
public final class MRException extends Exception {
    private final MRError error;

    public MRException(MRError mRError) {
        p.h(mRError, MRLog.PAYLOAD_KEY_ERROR);
        this.error = mRError;
    }

    public static /* synthetic */ MRException copy$default(MRException mRException, MRError mRError, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            mRError = mRException.error;
        }
        return mRException.copy(mRError);
    }

    public final MRError component1() {
        return this.error;
    }

    public final MRException copy(MRError mRError) {
        p.h(mRError, MRLog.PAYLOAD_KEY_ERROR);
        return new MRException(mRError);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MRException) && p.c(this.error, ((MRException) obj).error);
    }

    public final MRError getError() {
        return this.error;
    }

    public int hashCode() {
        return this.error.hashCode();
    }

    @Override // java.lang.Throwable
    public String toString() {
        return "MRException(error=" + this.error + ')';
    }
}
