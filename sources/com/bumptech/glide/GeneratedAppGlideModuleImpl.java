package com.bumptech.glide;

import android.content.Context;
import android.util.Log;
import com.dena.mirrorman.net.glide.MyAppGlideModule;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class GeneratedAppGlideModuleImpl extends GeneratedAppGlideModule {

    /* renamed from: w  reason: collision with root package name */
    public final MyAppGlideModule f20051w = new MyAppGlideModule();

    public GeneratedAppGlideModuleImpl(Context context) {
        if (Log.isLoggable("Glide", 3)) {
            Log.d("Glide", "Discovered AppGlideModule from annotation: com.dena.mirrorman.net.glide.MyAppGlideModule");
            Log.d("Glide", "Discovered LibraryGlideModule from annotation: com.bumptech.glide.integration.okhttp3.OkHttpLibraryGlideModule");
            Log.d("Glide", "Discovered LibraryGlideModule from annotation: com.bumptech.glide.integration.webp.WebpGlideLibraryModule");
        }
    }

    @Override // com.bumptech.glide.GeneratedAppGlideModule
    public Set<Class<?>> a() {
        return Collections.emptySet();
    }

    @Override // c8.a, c8.b
    public void applyOptions(Context context, d dVar) {
        this.f20051w.applyOptions(context, dVar);
    }

    @Override // com.bumptech.glide.GeneratedAppGlideModule
    /* renamed from: c */
    public a b() {
        return new a();
    }

    @Override // c8.a
    public boolean isManifestParsingEnabled() {
        return this.f20051w.isManifestParsingEnabled();
    }

    @Override // c8.d, c8.f
    public void registerComponents(Context context, c cVar, Registry registry) {
        new com.bumptech.glide.integration.okhttp3.a().registerComponents(context, cVar, registry);
        new k7.b().registerComponents(context, cVar, registry);
        this.f20051w.registerComponents(context, cVar, registry);
    }
}
