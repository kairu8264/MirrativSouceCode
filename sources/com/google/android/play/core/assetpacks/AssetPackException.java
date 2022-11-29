package com.google.android.play.core.assetpacks;

import bk.a;
import com.google.android.play.core.tasks.zzj;

/* loaded from: classes3.dex */
public class AssetPackException extends zzj {

    /* renamed from: w  reason: collision with root package name */
    public final int f27922w;

    public AssetPackException(int i10) {
        super(String.format("Asset Pack Download Error(%d): %s", Integer.valueOf(i10), a.a(i10)));
        if (i10 != 0) {
            this.f27922w = i10;
            return;
        }
        throw new IllegalArgumentException("errorCode should not be 0.");
    }
}
