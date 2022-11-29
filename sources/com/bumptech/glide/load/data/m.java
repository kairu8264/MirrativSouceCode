package com.bumptech.glide.load.data;

import android.content.res.AssetManager;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes.dex */
public class m extends b<InputStream> {
    public m(AssetManager assetManager, String str) {
        super(assetManager, str);
    }

    @Override // com.bumptech.glide.load.data.d
    public Class<InputStream> a() {
        return InputStream.class;
    }

    @Override // com.bumptech.glide.load.data.b
    /* renamed from: g */
    public void c(InputStream inputStream) throws IOException {
        inputStream.close();
    }

    @Override // com.bumptech.glide.load.data.b
    /* renamed from: h */
    public InputStream e(AssetManager assetManager, String str) throws IOException {
        return assetManager.open(str);
    }
}
