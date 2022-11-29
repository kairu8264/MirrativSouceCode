package com.bumptech.glide;

import com.bumptech.glide.l;

/* loaded from: classes.dex */
public abstract class l<CHILD extends l<CHILD, TranscodeType>, TranscodeType> implements Cloneable {

    /* renamed from: w  reason: collision with root package name */
    public g8.c<? super TranscodeType> f20113w = g8.a.b();

    /* renamed from: b */
    public final CHILD clone() {
        try {
            return (CHILD) super.clone();
        } catch (CloneNotSupportedException e10) {
            throw new RuntimeException(e10);
        }
    }

    public final g8.c<? super TranscodeType> c() {
        return this.f20113w;
    }
}
