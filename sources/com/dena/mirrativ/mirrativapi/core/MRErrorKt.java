package com.dena.mirrativ.mirrativapi.core;

import com.dena.mirrativ.mirrativapi.core.MRError;
import java.io.IOException;
import jo.p;

/* loaded from: classes2.dex */
public final class MRErrorKt {
    public static final MRException convertMRException(Throwable th2) {
        p.h(th2, "<this>");
        return th2 instanceof MRException ? (MRException) th2 : th2 instanceof MRIOException ? new MRException(((MRIOException) th2).getError()) : th2 instanceof IOException ? new MRException(MRError.Network.INSTANCE) : new MRException(MRError.Network.INSTANCE);
    }
}
