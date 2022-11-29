package com.google.android.play.core.assetpacks;

import ak.i3;
import ak.l0;
import ak.t0;
import ak.t1;
import android.os.Bundle;
import bk.b;

/* loaded from: classes3.dex */
public abstract class AssetPackState {
    public static AssetPackState h(String str, int i10, int i11, long j10, long j11, double d10, int i12, String str2, String str3) {
        return new t0(str, i10, i11, j10, j11, (int) Math.rint(100.0d * d10), i12, str2, str3);
    }

    public static AssetPackState i(Bundle bundle, String str, t1 t1Var, i3 i3Var, l0 l0Var) {
        int a10 = l0Var.a(bundle.getInt(b.a("status", str)), str);
        int i10 = bundle.getInt(b.a("error_code", str));
        long j10 = bundle.getLong(b.a("bytes_downloaded", str));
        long j11 = bundle.getLong(b.a("total_bytes_to_download", str));
        double a11 = t1Var.a(str);
        long j12 = bundle.getLong(b.a("pack_version", str));
        long j13 = bundle.getLong(b.a("pack_base_version", str));
        int i11 = 1;
        int i12 = 4;
        if (a10 != 4) {
            i12 = a10;
        } else if (j13 != 0 && j13 != j12) {
            i11 = 2;
        }
        return h(str, i12, i10, j10, j11, a11, i11, bundle.getString(b.a("pack_version_tag", str), String.valueOf(bundle.getInt("app_version_code"))), i3Var.a(str));
    }

    public abstract long a();

    public abstract int b();

    public abstract String c();

    public abstract int d();

    public abstract long e();

    public abstract int f();

    public abstract int g();

    public abstract String j();

    public abstract String k();
}
