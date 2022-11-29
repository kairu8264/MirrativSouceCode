package com.dena.mirrorman.net.glide;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import b8.l;
import b8.q;
import com.bumptech.glide.c;
import com.bumptech.glide.k;
import e8.a;
import e8.g;
import e8.h;
import java.io.File;
import java.net.URL;

/* loaded from: classes2.dex */
public class GlideRequests extends k {
    public GlideRequests(c cVar, l lVar, q qVar, Context context) {
        super(cVar, lVar, qVar, context);
    }

    @Override // com.bumptech.glide.k
    public /* bridge */ /* synthetic */ k addDefaultRequestListener(g gVar) {
        return addDefaultRequestListener((g<Object>) gVar);
    }

    @Override // com.bumptech.glide.k
    public void setRequestOptions(h hVar) {
        if (hVar instanceof GlideOptions) {
            super.setRequestOptions(hVar);
        } else {
            super.setRequestOptions(new GlideOptions().apply((a<?>) hVar));
        }
    }

    @Override // com.bumptech.glide.k
    public GlideRequests addDefaultRequestListener(g<Object> gVar) {
        return (GlideRequests) super.addDefaultRequestListener(gVar);
    }

    @Override // com.bumptech.glide.k
    public synchronized GlideRequests applyDefaultRequestOptions(h hVar) {
        return (GlideRequests) super.applyDefaultRequestOptions(hVar);
    }

    @Override // com.bumptech.glide.k
    public <ResourceType> GlideRequest<ResourceType> as(Class<ResourceType> cls) {
        return new GlideRequest<>(this.glide, this, cls, this.context);
    }

    @Override // com.bumptech.glide.k
    public GlideRequest<Bitmap> asBitmap() {
        return (GlideRequest) super.asBitmap();
    }

    @Override // com.bumptech.glide.k
    public GlideRequest<Drawable> asDrawable() {
        return (GlideRequest) super.asDrawable();
    }

    @Override // com.bumptech.glide.k
    public GlideRequest<File> asFile() {
        return (GlideRequest) super.asFile();
    }

    @Override // com.bumptech.glide.k
    public GlideRequest<z7.c> asGif() {
        return (GlideRequest) super.asGif();
    }

    @Override // com.bumptech.glide.k
    public GlideRequest<File> download(Object obj) {
        return (GlideRequest) super.download(obj);
    }

    @Override // com.bumptech.glide.k
    public GlideRequest<File> downloadOnly() {
        return (GlideRequest) super.downloadOnly();
    }

    @Override // com.bumptech.glide.k
    public synchronized GlideRequests setDefaultRequestOptions(h hVar) {
        return (GlideRequests) super.setDefaultRequestOptions(hVar);
    }

    @Override // com.bumptech.glide.k
    public GlideRequest<Drawable> load(Bitmap bitmap) {
        return (GlideRequest) super.m9load(bitmap);
    }

    @Override // com.bumptech.glide.k
    public GlideRequest<Drawable> load(Drawable drawable) {
        return (GlideRequest) super.m10load(drawable);
    }

    @Override // com.bumptech.glide.k
    public GlideRequest<Drawable> load(String str) {
        return (GlideRequest) super.m15load(str);
    }

    @Override // com.bumptech.glide.k
    public GlideRequest<Drawable> load(Uri uri) {
        return (GlideRequest) super.m11load(uri);
    }

    @Override // com.bumptech.glide.k
    public GlideRequest<Drawable> load(File file) {
        return (GlideRequest) super.m12load(file);
    }

    @Override // com.bumptech.glide.k
    public GlideRequest<Drawable> load(Integer num) {
        return (GlideRequest) super.m13load(num);
    }

    @Override // com.bumptech.glide.k
    @Deprecated
    public GlideRequest<Drawable> load(URL url) {
        return (GlideRequest) super.m16load(url);
    }

    @Override // com.bumptech.glide.k
    public GlideRequest<Drawable> load(byte[] bArr) {
        return (GlideRequest) super.m17load(bArr);
    }

    @Override // com.bumptech.glide.k
    public GlideRequest<Drawable> load(Object obj) {
        return (GlideRequest) super.m14load(obj);
    }
}
