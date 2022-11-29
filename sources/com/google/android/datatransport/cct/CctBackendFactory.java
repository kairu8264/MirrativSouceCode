package com.google.android.datatransport.cct;

import androidx.annotation.Keep;
import dg.d;
import dg.h;
import dg.m;

@Keep
/* loaded from: classes3.dex */
public class CctBackendFactory implements d {
    @Override // dg.d
    public m create(h hVar) {
        return new ag.d(hVar.b(), hVar.e(), hVar.d());
    }
}
