package com.bumptech.glide.load.data;

import android.content.ContentResolver;
import android.net.Uri;
import android.util.Log;
import com.bumptech.glide.load.data.d;
import java.io.FileNotFoundException;
import java.io.IOException;

/* loaded from: classes.dex */
public abstract class l<T> implements d<T> {

    /* renamed from: w  reason: collision with root package name */
    public final Uri f20145w;

    /* renamed from: x  reason: collision with root package name */
    public final ContentResolver f20146x;

    /* renamed from: y  reason: collision with root package name */
    public T f20147y;

    public l(ContentResolver contentResolver, Uri uri) {
        this.f20146x = contentResolver;
        this.f20145w = uri;
    }

    @Override // com.bumptech.glide.load.data.d
    public void b() {
        T t10 = this.f20147y;
        if (t10 != null) {
            try {
                c(t10);
            } catch (IOException unused) {
            }
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

    public abstract T e(Uri uri, ContentResolver contentResolver) throws FileNotFoundException;

    @Override // com.bumptech.glide.load.data.d
    public final void f(com.bumptech.glide.h hVar, d.a<? super T> aVar) {
        try {
            T e10 = e(this.f20145w, this.f20146x);
            this.f20147y = e10;
            aVar.e(e10);
        } catch (FileNotFoundException e11) {
            if (Log.isLoggable("LocalUriFetcher", 3)) {
                Log.d("LocalUriFetcher", "Failed to open Uri", e11);
            }
            aVar.c(e11);
        }
    }
}
