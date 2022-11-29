package com.bumptech.glide.load.data;

import android.content.res.AssetManager;
import android.util.Log;
import com.bumptech.glide.load.data.d;
import java.io.IOException;

/* loaded from: classes.dex */
public abstract class b<T> implements d<T> {

    /* renamed from: w  reason: collision with root package name */
    public final String f20125w;

    /* renamed from: x  reason: collision with root package name */
    public final AssetManager f20126x;

    /* renamed from: y  reason: collision with root package name */
    public T f20127y;

    public b(AssetManager assetManager, String str) {
        this.f20126x = assetManager;
        this.f20125w = str;
    }

    @Override // com.bumptech.glide.load.data.d
    public void b() {
        T t10 = this.f20127y;
        if (t10 == null) {
            return;
        }
        try {
            c(t10);
        } catch (IOException unused) {
        }
    }

    public abstract void c(T t10) throws IOException;

    @Override // com.bumptech.glide.load.data.d
    public void cancel() {
    }

    @Override // com.bumptech.glide.load.data.d
    public m7.a d() {
        return m7.a.LOCAL;
    }

    public abstract T e(AssetManager assetManager, String str) throws IOException;

    @Override // com.bumptech.glide.load.data.d
    public void f(com.bumptech.glide.h hVar, d.a<? super T> aVar) {
        try {
            T e10 = e(this.f20126x, this.f20125w);
            this.f20127y = e10;
            aVar.e(e10);
        } catch (IOException e11) {
            if (Log.isLoggable("AssetPathFetcher", 3)) {
                Log.d("AssetPathFetcher", "Failed to load data from asset manager", e11);
            }
            aVar.c(e11);
        }
    }
}
