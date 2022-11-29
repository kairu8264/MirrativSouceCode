package com.google.android.gms.ads.identifier;

import android.net.Uri;
import java.util.Map;
import ug.b;

/* loaded from: classes3.dex */
public final class a extends Thread {

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ Map f27149w;

    public a(AdvertisingIdClient advertisingIdClient, Map map) {
        this.f27149w = map;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Map map = this.f27149w;
        Uri.Builder buildUpon = Uri.parse("https://pagead2.googlesyndication.com/pagead/gen_204?id=gmob-apps").buildUpon();
        for (String str : map.keySet()) {
            buildUpon.appendQueryParameter(str, (String) map.get(str));
        }
        b.a(buildUpon.build().toString());
    }
}
