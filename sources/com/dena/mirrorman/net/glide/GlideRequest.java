package com.dena.mirrorman.net.glide;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.bumptech.glide.c;
import com.bumptech.glide.h;
import com.bumptech.glide.j;
import com.bumptech.glide.k;
import e8.a;
import java.io.File;
import java.net.URL;
import java.util.List;
import m7.b;
import m7.e;
import m7.g;
import m7.l;

/* loaded from: classes2.dex */
public class GlideRequest<TranscodeType> extends j<TranscodeType> {
    public GlideRequest(Class<TranscodeType> cls, j<?> jVar) {
        super(cls, jVar);
    }

    @Override // com.bumptech.glide.j, e8.a
    public /* bridge */ /* synthetic */ j apply(a aVar) {
        return apply((a<?>) aVar);
    }

    @Override // e8.a
    public /* bridge */ /* synthetic */ a decode(Class cls) {
        return decode((Class<?>) cls);
    }

    @Override // e8.a
    public /* bridge */ /* synthetic */ a set(g gVar, Object obj) {
        return set((g<g>) gVar, (g) obj);
    }

    @Override // e8.a
    @Deprecated
    public /* bridge */ /* synthetic */ a transforms(l[] lVarArr) {
        return transforms((l<Bitmap>[]) lVarArr);
    }

    public GlideRequest(c cVar, k kVar, Class<TranscodeType> cls, Context context) {
        super(cVar, kVar, cls, context);
    }

    @Override // com.bumptech.glide.j
    public GlideRequest<TranscodeType> addListener(e8.g<TranscodeType> gVar) {
        return (GlideRequest) super.addListener((e8.g) gVar);
    }

    @Override // com.bumptech.glide.j, e8.a
    public /* bridge */ /* synthetic */ a apply(a aVar) {
        return apply((a<?>) aVar);
    }

    @Override // e8.a
    public GlideRequest<TranscodeType> autoClone() {
        return (GlideRequest) super.autoClone();
    }

    @Override // e8.a
    public GlideRequest<TranscodeType> centerCrop() {
        return (GlideRequest) super.centerCrop();
    }

    @Override // e8.a
    public GlideRequest<TranscodeType> centerInside() {
        return (GlideRequest) super.centerInside();
    }

    @Override // e8.a
    public GlideRequest<TranscodeType> circleCrop() {
        return (GlideRequest) super.circleCrop();
    }

    @Override // e8.a
    public GlideRequest<TranscodeType> decode(Class<?> cls) {
        return (GlideRequest) super.decode(cls);
    }

    @Override // e8.a
    public GlideRequest<TranscodeType> disallowHardwareConfig() {
        return (GlideRequest) super.disallowHardwareConfig();
    }

    @Override // e8.a
    public GlideRequest<TranscodeType> diskCacheStrategy(o7.j jVar) {
        return (GlideRequest) super.diskCacheStrategy(jVar);
    }

    @Override // e8.a
    public GlideRequest<TranscodeType> dontAnimate() {
        return (GlideRequest) super.dontAnimate();
    }

    @Override // e8.a
    public GlideRequest<TranscodeType> dontTransform() {
        return (GlideRequest) super.dontTransform();
    }

    @Override // e8.a
    public GlideRequest<TranscodeType> downsample(v7.l lVar) {
        return (GlideRequest) super.downsample(lVar);
    }

    @Override // e8.a
    public GlideRequest<TranscodeType> encodeFormat(Bitmap.CompressFormat compressFormat) {
        return (GlideRequest) super.encodeFormat(compressFormat);
    }

    @Override // e8.a
    public GlideRequest<TranscodeType> encodeQuality(int i10) {
        return (GlideRequest) super.encodeQuality(i10);
    }

    @Override // e8.a
    public GlideRequest<TranscodeType> fitCenter() {
        return (GlideRequest) super.fitCenter();
    }

    @Override // e8.a
    public GlideRequest<TranscodeType> format(b bVar) {
        return (GlideRequest) super.format(bVar);
    }

    @Override // e8.a
    public GlideRequest<TranscodeType> frame(long j10) {
        return (GlideRequest) super.frame(j10);
    }

    @Override // com.bumptech.glide.j
    public GlideRequest<File> getDownloadOnlyRequest() {
        return new GlideRequest(File.class, this).apply((a<?>) j.DOWNLOAD_ONLY_OPTIONS);
    }

    @Override // com.bumptech.glide.j
    public GlideRequest<TranscodeType> listener(e8.g<TranscodeType> gVar) {
        return (GlideRequest) super.listener((e8.g) gVar);
    }

    @Override // e8.a
    public GlideRequest<TranscodeType> lock() {
        return (GlideRequest) super.lock();
    }

    @Override // e8.a
    public GlideRequest<TranscodeType> onlyRetrieveFromCache(boolean z10) {
        return (GlideRequest) super.onlyRetrieveFromCache(z10);
    }

    @Override // e8.a
    public GlideRequest<TranscodeType> optionalCenterCrop() {
        return (GlideRequest) super.optionalCenterCrop();
    }

    @Override // e8.a
    public GlideRequest<TranscodeType> optionalCenterInside() {
        return (GlideRequest) super.optionalCenterInside();
    }

    @Override // e8.a
    public GlideRequest<TranscodeType> optionalCircleCrop() {
        return (GlideRequest) super.optionalCircleCrop();
    }

    @Override // e8.a
    public GlideRequest<TranscodeType> optionalFitCenter() {
        return (GlideRequest) super.optionalFitCenter();
    }

    @Override // e8.a
    public /* bridge */ /* synthetic */ a optionalTransform(l lVar) {
        return optionalTransform((l<Bitmap>) lVar);
    }

    @Override // e8.a
    public GlideRequest<TranscodeType> priority(h hVar) {
        return (GlideRequest) super.priority(hVar);
    }

    @Override // e8.a
    public <Y> GlideRequest<TranscodeType> set(g<Y> gVar, Y y10) {
        return (GlideRequest) super.set((g<g<Y>>) gVar, (g<Y>) y10);
    }

    @Override // e8.a
    public GlideRequest<TranscodeType> signature(e eVar) {
        return (GlideRequest) super.signature(eVar);
    }

    @Override // e8.a
    public GlideRequest<TranscodeType> sizeMultiplier(float f10) {
        return (GlideRequest) super.sizeMultiplier(f10);
    }

    @Override // e8.a
    public GlideRequest<TranscodeType> skipMemoryCache(boolean z10) {
        return (GlideRequest) super.skipMemoryCache(z10);
    }

    @Override // e8.a
    public GlideRequest<TranscodeType> theme(Resources.Theme theme) {
        return (GlideRequest) super.theme(theme);
    }

    @Override // e8.a
    public GlideRequest<TranscodeType> timeout(int i10) {
        return (GlideRequest) super.timeout(i10);
    }

    @Override // e8.a
    public /* bridge */ /* synthetic */ a transform(l lVar) {
        return transform((l<Bitmap>) lVar);
    }

    @Override // e8.a
    @Deprecated
    public GlideRequest<TranscodeType> transforms(l<Bitmap>... lVarArr) {
        return (GlideRequest) super.transforms(lVarArr);
    }

    @Override // com.bumptech.glide.j
    public GlideRequest<TranscodeType> transition(com.bumptech.glide.l<?, ? super TranscodeType> lVar) {
        return (GlideRequest) super.transition((com.bumptech.glide.l) lVar);
    }

    @Override // e8.a
    public GlideRequest<TranscodeType> useAnimationPool(boolean z10) {
        return (GlideRequest) super.useAnimationPool(z10);
    }

    @Override // e8.a
    public GlideRequest<TranscodeType> useUnlimitedSourceGeneratorsPool(boolean z10) {
        return (GlideRequest) super.useUnlimitedSourceGeneratorsPool(z10);
    }

    @Override // com.bumptech.glide.j, e8.a
    public GlideRequest<TranscodeType> apply(a<?> aVar) {
        return (GlideRequest) super.apply(aVar);
    }

    @Override // e8.a
    public GlideRequest<TranscodeType> fallback(Drawable drawable) {
        return (GlideRequest) super.fallback(drawable);
    }

    @Override // e8.a
    public GlideRequest<TranscodeType> optionalTransform(l<Bitmap> lVar) {
        return (GlideRequest) super.optionalTransform(lVar);
    }

    @Override // e8.a
    public GlideRequest<TranscodeType> override(int i10, int i11) {
        return (GlideRequest) super.override(i10, i11);
    }

    @Override // e8.a
    public GlideRequest<TranscodeType> placeholder(Drawable drawable) {
        return (GlideRequest) super.placeholder(drawable);
    }

    @Override // e8.a
    public /* bridge */ /* synthetic */ a transform(l[] lVarArr) {
        return transform((l<Bitmap>[]) lVarArr);
    }

    @Override // com.bumptech.glide.j, e8.a
    public GlideRequest<TranscodeType> clone() {
        return (GlideRequest) super.clone();
    }

    @Override // e8.a
    public GlideRequest<TranscodeType> fallback(int i10) {
        return (GlideRequest) super.fallback(i10);
    }

    @Override // e8.a
    public <Y> GlideRequest<TranscodeType> optionalTransform(Class<Y> cls, l<Y> lVar) {
        return (GlideRequest) super.optionalTransform((Class) cls, (l) lVar);
    }

    @Override // e8.a
    public GlideRequest<TranscodeType> override(int i10) {
        return (GlideRequest) super.override(i10);
    }

    @Override // e8.a
    public GlideRequest<TranscodeType> placeholder(int i10) {
        return (GlideRequest) super.placeholder(i10);
    }

    @Override // e8.a
    public GlideRequest<TranscodeType> transform(l<Bitmap> lVar) {
        return (GlideRequest) super.transform(lVar);
    }

    @Override // e8.a
    public GlideRequest<TranscodeType> error(Drawable drawable) {
        return (GlideRequest) super.error(drawable);
    }

    @Override // com.bumptech.glide.j
    public GlideRequest<TranscodeType> thumbnail(j<TranscodeType> jVar) {
        return (GlideRequest) super.thumbnail((j) jVar);
    }

    @Override // e8.a
    public GlideRequest<TranscodeType> transform(l<Bitmap>... lVarArr) {
        return (GlideRequest) super.transform(lVarArr);
    }

    @Override // e8.a
    public GlideRequest<TranscodeType> error(int i10) {
        return (GlideRequest) super.error(i10);
    }

    @Override // com.bumptech.glide.j
    @SafeVarargs
    public final GlideRequest<TranscodeType> thumbnail(j<TranscodeType>... jVarArr) {
        return (GlideRequest) super.thumbnail((j[]) jVarArr);
    }

    @Override // e8.a
    public <Y> GlideRequest<TranscodeType> transform(Class<Y> cls, l<Y> lVar) {
        return (GlideRequest) super.transform((Class) cls, (l) lVar);
    }

    @Override // com.bumptech.glide.j
    public GlideRequest<TranscodeType> error(j<TranscodeType> jVar) {
        return (GlideRequest) super.error((j) jVar);
    }

    @Override // com.bumptech.glide.j
    public GlideRequest<TranscodeType> thumbnail(List<j<TranscodeType>> list) {
        return (GlideRequest) super.thumbnail((List) list);
    }

    @Override // com.bumptech.glide.j
    public GlideRequest<TranscodeType> error(Object obj) {
        return (GlideRequest) super.error(obj);
    }

    @Override // com.bumptech.glide.j
    public GlideRequest<TranscodeType> thumbnail(float f10) {
        return (GlideRequest) super.thumbnail(f10);
    }

    @Override // com.bumptech.glide.j
    public GlideRequest<TranscodeType> load(Object obj) {
        return (GlideRequest) super.m5load(obj);
    }

    @Override // com.bumptech.glide.j
    public GlideRequest<TranscodeType> load(Bitmap bitmap) {
        return (GlideRequest) super.m0load(bitmap);
    }

    @Override // com.bumptech.glide.j
    public GlideRequest<TranscodeType> load(Drawable drawable) {
        return (GlideRequest) super.m1load(drawable);
    }

    @Override // com.bumptech.glide.j
    public GlideRequest<TranscodeType> load(String str) {
        return (GlideRequest) super.m6load(str);
    }

    @Override // com.bumptech.glide.j
    public GlideRequest<TranscodeType> load(Uri uri) {
        return (GlideRequest) super.m2load(uri);
    }

    @Override // com.bumptech.glide.j
    public GlideRequest<TranscodeType> load(File file) {
        return (GlideRequest) super.m3load(file);
    }

    @Override // com.bumptech.glide.j
    public GlideRequest<TranscodeType> load(Integer num) {
        return (GlideRequest) super.m4load(num);
    }

    @Override // com.bumptech.glide.j
    @Deprecated
    public GlideRequest<TranscodeType> load(URL url) {
        return (GlideRequest) super.m7load(url);
    }

    @Override // com.bumptech.glide.j
    public GlideRequest<TranscodeType> load(byte[] bArr) {
        return (GlideRequest) super.m8load(bArr);
    }
}
